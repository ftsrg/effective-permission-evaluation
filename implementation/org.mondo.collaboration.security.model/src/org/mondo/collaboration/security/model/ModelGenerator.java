package org.mondo.collaboration.security.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.common.collect.Lists;

import wt.Composite;
import wt.Control;
import wt.Cycle;
import wt.Signal;
import wt.WtFactory;
import wt.WtPackage;

public class ModelGenerator {

	public static final WtFactory eFactory = WtFactory.eINSTANCE;
	public static final WtPackage ePackage = WtPackage.eINSTANCE;
	public static final Random rnd = new Random();

	public void generate(int[] MODEL_SIZES, int[] CTRL_TYPE_SIZES, String savePathFormatter) throws Exception {
		for (int size : MODEL_SIZES) {
			for (int ctrlRange : CTRL_TYPE_SIZES) {
				if (size * 4 < ctrlRange)
					continue;
				
				Composite model = generate(size, ctrlRange);
				save(String.format(savePathFormatter, size, ctrlRange), model);
			}
		}
	}

	private Composite generate(int size, int ctrlRange) {
		Composite rootComposite = eFactory.createComposite();
		{
			rootComposite.setProtectedIP(false);
			rootComposite.setVendor("");
		}
		List<Control> controls = Lists.newArrayList();
		for (int id = 0; id < size; id++) {
			Composite pyramidRoot = createPyramid(id, controls);
			rootComposite.getSubmodules().add(pyramidRoot);
		}

		Collections.shuffle(controls);
		int i = 0;
		for (; i < ctrlRange; i++) {
			controls.get(i).setType(String.valueOf(1 + i));
		}
		for (; i < controls.size(); i++) {
			controls.get(i).setType(String.valueOf(1 + rnd.nextInt(ctrlRange)));
		}

		return rootComposite;
	}

	private Composite createPyramid(int id, List<Control> controls) {
		Composite pyramidRoot = eFactory.createComposite();
		{
			pyramidRoot.setProtectedIP(rnd.nextBoolean());
			pyramidRoot.setVendor(String.valueOf(id));
		}

		Composite left = eFactory.createComposite();
		{
			left.setProtectedIP(rnd.nextBoolean());
			left.setVendor(String.valueOf(id));
		}
		Composite right = eFactory.createComposite();
		{
			right.setProtectedIP(rnd.nextBoolean());
			right.setVendor(String.valueOf(id));
		}
		pyramidRoot.getSubmodules().add(left);
		pyramidRoot.getSubmodules().add(right);

		controls.add(createController(left));
		controls.add(createController(left));
		controls.add(createController(right));
		controls.add(createController(right));

		return pyramidRoot;
	}

	private Control createController(Composite parent) {
		Control ctrl = eFactory.createControl();
		{
			parent.getSubmodules().add(ctrl);
			ctrl.setCycle(getRandomCycleEnum());

			createInput(parent, ctrl);
			createOutput(parent, ctrl);
		}

		return ctrl;
	}

	private void createInput(Composite parent, Control ctrl) {
		Signal parentSignalInput = eFactory.createSignal();
		Signal ctrlSignalInput = eFactory.createSignal();
		parent.getProvides().add(parentSignalInput);
		ctrl.getProvides().add(ctrlSignalInput);
		ctrl.getConsumes().add(parentSignalInput);
	}

	private void createOutput(Composite parent, Control ctrl) {
		Signal parentSignalOutput = eFactory.createSignal();
		Signal ctrlSignalOutput = eFactory.createSignal();
		parent.getProvides().add(parentSignalOutput);
		ctrl.getProvides().add(ctrlSignalOutput);
		parent.getConsumes().add(ctrlSignalOutput);
	}

	private Cycle getRandomCycleEnum() {
		List<Cycle> list = Lists.newArrayList(Cycle.VALUES);
		Collections.shuffle(list);
		return list.get(0);
	}

	private void save(String path, Composite model) throws IOException {
		ResourceSet rset = new ResourceSetImpl();
		Resource resource = rset.createResource(URI.createFileURI(path));

		resource.getContents().add(model);
		resource.save(null);
	}

	public static void save(String path, CharSequence sequence) throws Exception {
		try (PrintWriter out = new PrintWriter(path)) {
			out.println(sequence.toString());
		}
	}
}
