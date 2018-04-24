## Evaluation of deriving effective permissions for modeling artifacts

### Requirements

To ease the setup, you can download a new [Eclipse Oxygen](http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/oxygen2) for Java and DSL Developers which contains [Xtext](https://www.eclipse.org/Xtext/) and install the latest version of [Viatra](https://www.eclipse.org/viatra/) from the Eclipse Marketplace. 

* Xtext  (at least version 2.12) - [update-site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/)
* Viatra  (at least version 1.7.1) - [update-site](http://download.eclipse.org/viatra/updates/release/1.7.2)

### Environment Setup

* Create `src-gen` folders in the projects
* Execute the MWE2 workflow in project ```org.mondo.collaboration.policy``` 
   * Exact location: (```org.mondo.collaboration.policy/src/org.mondo.collaboration.policy/GenerateRules.mwe2```)
* Generate code for the metamodel in project ```org.mondo.collaboration.security.meta```
   * Open the *.genmodel file (```org.mondo.collaboration.security.meta/model/wt.genmodel```)
   * Right click on the root element and click on the ```Generate Model Code``` entry
* (Optional) Rebuild the ```queries.vql``` file to eliminate the error in project ```org.mondo.collaboration.security.rule`
   * Open the file ```org.mondo.collaboration.security.rule/src/org.mondo.collaboration.security.query/queries.vql```
   * Force the rebuild by add a ```space``` character anywhere in the file, then delete it and save the file
   * This is not a required step because the code generated from ```queries.vql``` will not be used during the evaluation.
   
### Execute the Measurement

* Generate instance models and rules
 * Execute the ```Generator.main()``` in project ```org.mondo.collaboration.security.eval```
   * It requires exactly one parameter which is the system path to ```org.mondo.collaboration.security.rule/src/org.mondo.collaboration.security.query/queries.vql```
   * For instance, ```C:\org.mondo.collaboration.security.rule\src\org\mondo\collaboration\security\query\queries.vql```
 * The generated artifacts can be found under project ```org.mondo.collaboration.security.eval.generated.artifacts```

* Evaluate the derivation of effective permissions
  * Both types of evaluation requires several parameter for the executions
    * ```-model-size [int]``` describes the size of model
    * ```-limit-user [int]``` describes the maximum number of collaborators that can work on the model
    * ```-user-size [int]``` describes the number of collaborats actually working on the model
    * ```-repeat [int]``` describes how many times the evaluation will be executed
  * To execute the batch evaluation, start ```BatchEvaluation.main()``` as Java Application
  * To execute the incremental evaluation, start ```IncrementalEvaluation.main()``` as Java Application
