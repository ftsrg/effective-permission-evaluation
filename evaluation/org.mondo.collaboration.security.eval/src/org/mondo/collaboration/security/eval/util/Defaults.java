package org.mondo.collaboration.security.eval.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.eval.IChange;
import org.mondo.collaboration.security.eval.change.AttributeChange;
import org.mondo.collaboration.security.eval.change.ObjectChange;
import org.mondo.collaboration.security.eval.change.ReferenceChange;
import org.mondo.collaboration.security.query.generated.query0001.Rules_0001_all_in_one;
import org.mondo.collaboration.security.query.generated.query0010.Rules_0010_all_in_one;
import org.mondo.collaboration.security.query.generated.query0020.Rules_0020_all_in_one;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

public class Defaults {

	public static final int[] MODEL_SIZES = { 50, 100, 150, 200, 250, 300, 350 };
	public static final int[] USER_SIZES = { 1, 10, 20 };
	public static final int[] MODIFICATION_SIZES = { 5, 10, 20 };
	public static final int REPEAT = 10;
	public static final int WARMUP = 0;
	
	public static final Collection<IChange> CHANGES = Lists.newArrayList(
															AttributeChange.instance, 
															ObjectChange.instance, 
															ReferenceChange.instance
															);
	
	private static Multimap<Integer, IQuerySpecification<?>> QUERIES = null;
	public static Multimap<Integer, IQuerySpecification<?>> QUERIES() {
		if(QUERIES == null) {
			QUERIES = HashMultimap.create();
			try {
				QUERIES.put(1, Rules_0001_all_in_one.instance().getEffectiveJudgement_attribute());
				QUERIES.put(1, Rules_0001_all_in_one.instance().getEffectiveJudgement_object());
				QUERIES.put(1, Rules_0001_all_in_one.instance().getEffectiveJudgement_reference());
			
				QUERIES.put(10, Rules_0010_all_in_one.instance().getEffectiveJudgement_attribute());
				QUERIES.put(10, Rules_0010_all_in_one.instance().getEffectiveJudgement_object());
				QUERIES.put(10, Rules_0010_all_in_one.instance().getEffectiveJudgement_reference());
			
				QUERIES.put(20, Rules_0020_all_in_one.instance().getEffectiveJudgement_attribute());
				QUERIES.put(20, Rules_0020_all_in_one.instance().getEffectiveJudgement_object());
				QUERIES.put(20, Rules_0020_all_in_one.instance().getEffectiveJudgement_reference());
			} catch (ViatraQueryException e) {
				e.printStackTrace();
			}
		}
		return QUERIES;
	}
	
	
}
