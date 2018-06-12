package org.mondo.collaboration.policy.delegation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mondo.collaboration.policy.delegation.services.DelegationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDelegationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'delegated'", "'from'", "'to'", "','", "'query'", "'select'", "'import'", "'user'", "'group'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'", "'allow'", "'obfuscate'", "'deny'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDelegationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDelegationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDelegationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDelegation.g"; }



     	private DelegationGrammarAccess grammarAccess;

        public InternalDelegationParser(TokenStream input, DelegationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DelegationModel";
       	}

       	@Override
       	protected DelegationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDelegationModel"
    // InternalDelegation.g:65:1: entryRuleDelegationModel returns [EObject current=null] : iv_ruleDelegationModel= ruleDelegationModel EOF ;
    public final EObject entryRuleDelegationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationModel = null;


        try {
            // InternalDelegation.g:65:56: (iv_ruleDelegationModel= ruleDelegationModel EOF )
            // InternalDelegation.g:66:2: iv_ruleDelegationModel= ruleDelegationModel EOF
            {
             newCompositeNode(grammarAccess.getDelegationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationModel=ruleDelegationModel();

            state._fsp--;

             current =iv_ruleDelegationModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegationModel"


    // $ANTLR start "ruleDelegationModel"
    // InternalDelegation.g:72:1: ruleDelegationModel returns [EObject current=null] : ( ( (lv_import_0_0= ruleImport ) ) ( (lv_policy_1_0= rulePolicy ) ) ) ;
    public final EObject ruleDelegationModel() throws RecognitionException {
        EObject current = null;

        EObject lv_import_0_0 = null;

        EObject lv_policy_1_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:78:2: ( ( ( (lv_import_0_0= ruleImport ) ) ( (lv_policy_1_0= rulePolicy ) ) ) )
            // InternalDelegation.g:79:2: ( ( (lv_import_0_0= ruleImport ) ) ( (lv_policy_1_0= rulePolicy ) ) )
            {
            // InternalDelegation.g:79:2: ( ( (lv_import_0_0= ruleImport ) ) ( (lv_policy_1_0= rulePolicy ) ) )
            // InternalDelegation.g:80:3: ( (lv_import_0_0= ruleImport ) ) ( (lv_policy_1_0= rulePolicy ) )
            {
            // InternalDelegation.g:80:3: ( (lv_import_0_0= ruleImport ) )
            // InternalDelegation.g:81:4: (lv_import_0_0= ruleImport )
            {
            // InternalDelegation.g:81:4: (lv_import_0_0= ruleImport )
            // InternalDelegation.g:82:5: lv_import_0_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getDelegationModelAccess().getImportImportParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_import_0_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationModelRule());
            					}
            					set(
            						current,
            						"import",
            						lv_import_0_0,
            						"org.mondo.collaboration.policy.Rules.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDelegation.g:99:3: ( (lv_policy_1_0= rulePolicy ) )
            // InternalDelegation.g:100:4: (lv_policy_1_0= rulePolicy )
            {
            // InternalDelegation.g:100:4: (lv_policy_1_0= rulePolicy )
            // InternalDelegation.g:101:5: lv_policy_1_0= rulePolicy
            {

            					newCompositeNode(grammarAccess.getDelegationModelAccess().getPolicyPolicyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_policy_1_0=rulePolicy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationModelRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_1_0,
            						"org.mondo.collaboration.policy.delegation.Delegation.Policy");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegationModel"


    // $ANTLR start "entryRulePolicy"
    // InternalDelegation.g:122:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalDelegation.g:122:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalDelegation.g:123:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalDelegation.g:129:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' otherlv_5= 'with' ( (lv_resolution_6_0= ruleResolutionType ) ) otherlv_7= 'resolution' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rules_3_0 = null;

        Enumerator lv_resolution_6_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:135:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' otherlv_5= 'with' ( (lv_resolution_6_0= ruleResolutionType ) ) otherlv_7= 'resolution' ) )
            // InternalDelegation.g:136:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' otherlv_5= 'with' ( (lv_resolution_6_0= ruleResolutionType ) ) otherlv_7= 'resolution' )
            {
            // InternalDelegation.g:136:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' otherlv_5= 'with' ( (lv_resolution_6_0= ruleResolutionType ) ) otherlv_7= 'resolution' )
            // InternalDelegation.g:137:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' otherlv_5= 'with' ( (lv_resolution_6_0= ruleResolutionType ) ) otherlv_7= 'resolution'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalDelegation.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDelegation.g:163:3: ( (lv_rules_3_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDelegation.g:164:4: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalDelegation.g:164:4: (lv_rules_3_0= ruleRule )
            	    // InternalDelegation.g:165:5: lv_rules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"org.mondo.collaboration.policy.delegation.Delegation.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getWithKeyword_5());
            		
            // InternalDelegation.g:190:3: ( (lv_resolution_6_0= ruleResolutionType ) )
            // InternalDelegation.g:191:4: (lv_resolution_6_0= ruleResolutionType )
            {
            // InternalDelegation.g:191:4: (lv_resolution_6_0= ruleResolutionType )
            // InternalDelegation.g:192:5: lv_resolution_6_0= ruleResolutionType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_resolution_6_0=ruleResolutionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"resolution",
            						lv_resolution_6_0,
            						"org.mondo.collaboration.policy.Rules.ResolutionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getResolutionKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // InternalDelegation.g:217:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDelegation.g:217:45: (iv_ruleRule= ruleRule EOF )
            // InternalDelegation.g:218:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDelegation.g:224:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'delegated' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '{' otherlv_12= 'from' otherlv_13= 'query' ( (otherlv_14= RULE_STRING ) ) otherlv_15= 'select' ( (lv_asset_16_0= ruleModelFact ) ) ( (lv_bindings_17_0= ruleBinding ) )* otherlv_18= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Enumerator lv_access_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_asset_16_0 = null;

        EObject lv_bindings_17_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:230:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'delegated' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '{' otherlv_12= 'from' otherlv_13= 'query' ( (otherlv_14= RULE_STRING ) ) otherlv_15= 'select' ( (lv_asset_16_0= ruleModelFact ) ) ( (lv_bindings_17_0= ruleBinding ) )* otherlv_18= '}' ) )
            // InternalDelegation.g:231:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'delegated' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '{' otherlv_12= 'from' otherlv_13= 'query' ( (otherlv_14= RULE_STRING ) ) otherlv_15= 'select' ( (lv_asset_16_0= ruleModelFact ) ) ( (lv_bindings_17_0= ruleBinding ) )* otherlv_18= '}' )
            {
            // InternalDelegation.g:231:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'delegated' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '{' otherlv_12= 'from' otherlv_13= 'query' ( (otherlv_14= RULE_STRING ) ) otherlv_15= 'select' ( (lv_asset_16_0= ruleModelFact ) ) ( (lv_bindings_17_0= ruleBinding ) )* otherlv_18= '}' )
            // InternalDelegation.g:232:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'delegated' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '{' otherlv_12= 'from' otherlv_13= 'query' ( (otherlv_14= RULE_STRING ) ) otherlv_15= 'select' ( (lv_asset_16_0= ruleModelFact ) ) ( (lv_bindings_17_0= ruleBinding ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalDelegation.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDelegation.g:254:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalDelegation.g:255:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalDelegation.g:255:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalDelegation.g:256:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_access_2_0=ruleAccessibilityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_2_0,
            						"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDelegation.g:273:3: ( (lv_operation_3_0= ruleOperationType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=39 && LA2_0<=42)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDelegation.g:274:4: (lv_operation_3_0= ruleOperationType )
                    {
                    // InternalDelegation.g:274:4: (lv_operation_3_0= ruleOperationType )
                    // InternalDelegation.g:275:5: lv_operation_3_0= ruleOperationType
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_operation_3_0=ruleOperationType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_3_0,
                    						"org.mondo.collaboration.policy.Rules.OperationType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getDelegatedKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getFromKeyword_5());
            		
            // InternalDelegation.g:300:3: ( (otherlv_6= RULE_ID ) )
            // InternalDelegation.g:301:4: (otherlv_6= RULE_ID )
            {
            // InternalDelegation.g:301:4: (otherlv_6= RULE_ID )
            // InternalDelegation.g:302:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getSourceRoleCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getToKeyword_7());
            		
            // InternalDelegation.g:317:3: ( (otherlv_8= RULE_ID ) )
            // InternalDelegation.g:318:4: (otherlv_8= RULE_ID )
            {
            // InternalDelegation.g:318:4: (otherlv_8= RULE_ID )
            // InternalDelegation.g:319:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getTargetsRoleCrossReference_8_0());
            				

            }


            }

            // InternalDelegation.g:330:3: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDelegation.g:331:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalDelegation.g:335:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalDelegation.g:336:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDelegation.g:336:5: (otherlv_10= RULE_ID )
            	    // InternalDelegation.g:337:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getTargetsRoleCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getFromKeyword_11());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getRuleAccess().getQueryKeyword_12());
            		
            // InternalDelegation.g:361:3: ( (otherlv_14= RULE_STRING ) )
            // InternalDelegation.g:362:4: (otherlv_14= RULE_STRING )
            {
            // InternalDelegation.g:362:4: (otherlv_14= RULE_STRING )
            // InternalDelegation.g:363:5: otherlv_14= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(otherlv_14, grammarAccess.getRuleAccess().getPatternPatternCrossReference_13_0());
            				

            }


            }

            otherlv_15=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getSelectKeyword_14());
            		
            // InternalDelegation.g:378:3: ( (lv_asset_16_0= ruleModelFact ) )
            // InternalDelegation.g:379:4: (lv_asset_16_0= ruleModelFact )
            {
            // InternalDelegation.g:379:4: (lv_asset_16_0= ruleModelFact )
            // InternalDelegation.g:380:5: lv_asset_16_0= ruleModelFact
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_20);
            lv_asset_16_0=ruleModelFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"asset",
            						lv_asset_16_0,
            						"org.mondo.collaboration.policy.Rules.ModelFact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDelegation.g:397:3: ( (lv_bindings_17_0= ruleBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDelegation.g:398:4: (lv_bindings_17_0= ruleBinding )
            	    {
            	    // InternalDelegation.g:398:4: (lv_bindings_17_0= ruleBinding )
            	    // InternalDelegation.g:399:5: lv_bindings_17_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_bindings_17_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bindings",
            	    						lv_bindings_17_0,
            	    						"org.mondo.collaboration.policy.Rules.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleImport"
    // InternalDelegation.g:424:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDelegation.g:424:47: (iv_ruleImport= ruleImport EOF )
            // InternalDelegation.g:425:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDelegation.g:431:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalDelegation.g:437:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalDelegation.g:438:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalDelegation.g:438:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalDelegation.g:439:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDelegation.g:443:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDelegation.g:444:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDelegation.g:444:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDelegation.g:445:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRole"
    // InternalDelegation.g:465:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDelegation.g:465:45: (iv_ruleRole= ruleRole EOF )
            // InternalDelegation.g:466:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDelegation.g:472:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalDelegation.g:478:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalDelegation.g:479:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalDelegation.g:479:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDelegation.g:480:3: this_User_0= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getUserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_0=ruleUser();

                    state._fsp--;


                    			current = this_User_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDelegation.g:489:3: this_Group_1= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    			current = this_Group_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // InternalDelegation.g:501:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalDelegation.g:501:45: (iv_ruleUser= ruleUser EOF )
            // InternalDelegation.g:502:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalDelegation.g:508:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDelegation.g:514:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDelegation.g:515:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDelegation.g:515:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDelegation.g:516:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalDelegation.g:520:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:521:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:521:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:522:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // InternalDelegation.g:542:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalDelegation.g:542:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalDelegation.g:543:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalDelegation.g:549:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDelegation.g:555:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalDelegation.g:556:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalDelegation.g:556:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalDelegation.g:557:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalDelegation.g:561:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:562:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:562:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:563:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDelegation.g:583:3: ( (otherlv_3= RULE_ID ) )
            // InternalDelegation.g:584:4: (otherlv_3= RULE_ID )
            {
            // InternalDelegation.g:584:4: (otherlv_3= RULE_ID )
            // InternalDelegation.g:585:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0());
            				

            }


            }

            // InternalDelegation.g:596:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDelegation.g:597:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDelegation.g:601:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalDelegation.g:602:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalDelegation.g:602:5: (otherlv_5= RULE_ID )
            	    // InternalDelegation.g:603:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleModelFact"
    // InternalDelegation.g:623:1: entryRuleModelFact returns [EObject current=null] : iv_ruleModelFact= ruleModelFact EOF ;
    public final EObject entryRuleModelFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFact = null;


        try {
            // InternalDelegation.g:623:50: (iv_ruleModelFact= ruleModelFact EOF )
            // InternalDelegation.g:624:2: iv_ruleModelFact= ruleModelFact EOF
            {
             newCompositeNode(grammarAccess.getModelFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFact=ruleModelFact();

            state._fsp--;

             current =iv_ruleModelFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelFact"


    // $ANTLR start "ruleModelFact"
    // InternalDelegation.g:630:1: ruleModelFact returns [EObject current=null] : (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) ;
    public final EObject ruleModelFact() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectFact_0 = null;

        EObject this_ReferenceFact_1 = null;

        EObject this_AttributeFact_2 = null;



        	enterRule();

        try {
            // InternalDelegation.g:636:2: ( (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) )
            // InternalDelegation.g:637:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            {
            // InternalDelegation.g:637:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDelegation.g:638:3: this_ObjectFact_0= ruleObjectFact
                    {

                    			newCompositeNode(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectFact_0=ruleObjectFact();

                    state._fsp--;


                    			current = this_ObjectFact_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDelegation.g:647:3: this_ReferenceFact_1= ruleReferenceFact
                    {

                    			newCompositeNode(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceFact_1=ruleReferenceFact();

                    state._fsp--;


                    			current = this_ReferenceFact_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDelegation.g:656:3: this_AttributeFact_2= ruleAttributeFact
                    {

                    			newCompositeNode(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeFact_2=ruleAttributeFact();

                    state._fsp--;


                    			current = this_AttributeFact_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelFact"


    // $ANTLR start "entryRuleObjectFact"
    // InternalDelegation.g:668:1: entryRuleObjectFact returns [EObject current=null] : iv_ruleObjectFact= ruleObjectFact EOF ;
    public final EObject entryRuleObjectFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectFact = null;


        try {
            // InternalDelegation.g:668:51: (iv_ruleObjectFact= ruleObjectFact EOF )
            // InternalDelegation.g:669:2: iv_ruleObjectFact= ruleObjectFact EOF
            {
             newCompositeNode(grammarAccess.getObjectFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectFact=ruleObjectFact();

            state._fsp--;

             current =iv_ruleObjectFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectFact"


    // $ANTLR start "ruleObjectFact"
    // InternalDelegation.g:675:1: ruleObjectFact returns [EObject current=null] : (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDelegation.g:681:2: ( (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalDelegation.g:682:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalDelegation.g:682:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalDelegation.g:683:3: otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectFactAccess().getObjKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDelegation.g:691:3: ( (otherlv_2= RULE_ID ) )
            // InternalDelegation.g:692:4: (otherlv_2= RULE_ID )
            {
            // InternalDelegation.g:692:4: (otherlv_2= RULE_ID )
            // InternalDelegation.g:693:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectFact"


    // $ANTLR start "entryRuleReferenceFact"
    // InternalDelegation.g:712:1: entryRuleReferenceFact returns [EObject current=null] : iv_ruleReferenceFact= ruleReferenceFact EOF ;
    public final EObject entryRuleReferenceFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFact = null;


        try {
            // InternalDelegation.g:712:54: (iv_ruleReferenceFact= ruleReferenceFact EOF )
            // InternalDelegation.g:713:2: iv_ruleReferenceFact= ruleReferenceFact EOF
            {
             newCompositeNode(grammarAccess.getReferenceFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceFact=ruleReferenceFact();

            state._fsp--;

             current =iv_ruleReferenceFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceFact"


    // $ANTLR start "ruleReferenceFact"
    // InternalDelegation.g:719:1: ruleReferenceFact returns [EObject current=null] : (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleReferenceFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDelegation.g:725:2: ( (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalDelegation.g:726:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalDelegation.g:726:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalDelegation.g:727:3: otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceFactAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDelegation.g:735:3: ( (otherlv_2= RULE_ID ) )
            // InternalDelegation.g:736:4: (otherlv_2= RULE_ID )
            {
            // InternalDelegation.g:736:4: (otherlv_2= RULE_ID )
            // InternalDelegation.g:737:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalDelegation.g:752:3: ( (otherlv_4= RULE_ID ) )
            // InternalDelegation.g:753:4: (otherlv_4= RULE_ID )
            {
            // InternalDelegation.g:753:4: (otherlv_4= RULE_ID )
            // InternalDelegation.g:754:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_4, grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceFactAccess().getColonKeyword_5());
            		
            // InternalDelegation.g:769:3: ( (otherlv_6= RULE_ID ) )
            // InternalDelegation.g:770:4: (otherlv_6= RULE_ID )
            {
            // InternalDelegation.g:770:4: (otherlv_6= RULE_ID )
            // InternalDelegation.g:771:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_6, grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceFact"


    // $ANTLR start "entryRuleAttributeFact"
    // InternalDelegation.g:790:1: entryRuleAttributeFact returns [EObject current=null] : iv_ruleAttributeFact= ruleAttributeFact EOF ;
    public final EObject entryRuleAttributeFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFact = null;


        try {
            // InternalDelegation.g:790:54: (iv_ruleAttributeFact= ruleAttributeFact EOF )
            // InternalDelegation.g:791:2: iv_ruleAttributeFact= ruleAttributeFact EOF
            {
             newCompositeNode(grammarAccess.getAttributeFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeFact=ruleAttributeFact();

            state._fsp--;

             current =iv_ruleAttributeFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeFact"


    // $ANTLR start "ruleAttributeFact"
    // InternalDelegation.g:797:1: ruleAttributeFact returns [EObject current=null] : (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleAttributeFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDelegation.g:803:2: ( (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalDelegation.g:804:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalDelegation.g:804:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalDelegation.g:805:3: otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeFactAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDelegation.g:813:3: ( (otherlv_2= RULE_ID ) )
            // InternalDelegation.g:814:4: (otherlv_2= RULE_ID )
            {
            // InternalDelegation.g:814:4: (otherlv_2= RULE_ID )
            // InternalDelegation.g:815:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeFactAccess().getColonKeyword_3());
            		
            // InternalDelegation.g:830:3: ( (otherlv_4= RULE_ID ) )
            // InternalDelegation.g:831:4: (otherlv_4= RULE_ID )
            {
            // InternalDelegation.g:831:4: (otherlv_4= RULE_ID )
            // InternalDelegation.g:832:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_4, grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeFact"


    // $ANTLR start "entryRuleBinding"
    // InternalDelegation.g:851:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalDelegation.g:851:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalDelegation.g:852:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalDelegation.g:858:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_bind_5_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:864:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) )
            // InternalDelegation.g:865:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            {
            // InternalDelegation.g:865:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            // InternalDelegation.g:866:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getWhereKeyword_0());
            		
            // InternalDelegation.g:870:3: ( (otherlv_1= RULE_ID ) )
            // InternalDelegation.g:871:4: (otherlv_1= RULE_ID )
            {
            // InternalDelegation.g:871:4: (otherlv_1= RULE_ID )
            // InternalDelegation.g:872:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getBoundKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getToKeyword_4());
            		
            // InternalDelegation.g:895:3: ( (lv_bind_5_0= ruleBind ) )
            // InternalDelegation.g:896:4: (lv_bind_5_0= ruleBind )
            {
            // InternalDelegation.g:896:4: (lv_bind_5_0= ruleBind )
            // InternalDelegation.g:897:5: lv_bind_5_0= ruleBind
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_bind_5_0=ruleBind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"bind",
            						lv_bind_5_0,
            						"org.mondo.collaboration.policy.Rules.Bind");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBind"
    // InternalDelegation.g:918:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalDelegation.g:918:45: (iv_ruleBind= ruleBind EOF )
            // InternalDelegation.g:919:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalDelegation.g:925:1: ruleBind returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token lv_valueInteger_1_0=null;


        	enterRule();

        try {
            // InternalDelegation.g:931:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) )
            // InternalDelegation.g:932:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            {
            // InternalDelegation.g:932:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDelegation.g:933:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalDelegation.g:933:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalDelegation.g:934:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalDelegation.g:934:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalDelegation.g:935:5: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_valueString_0_0, grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueString",
                    						lv_valueString_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:952:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    {
                    // InternalDelegation.g:952:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    // InternalDelegation.g:953:4: (lv_valueInteger_1_0= RULE_INT )
                    {
                    // InternalDelegation.g:953:4: (lv_valueInteger_1_0= RULE_INT )
                    // InternalDelegation.g:954:5: lv_valueInteger_1_0= RULE_INT
                    {
                    lv_valueInteger_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valueInteger_1_0, grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueInteger",
                    						lv_valueInteger_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalDelegation.g:974:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDelegation.g:980:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) ) )
            // InternalDelegation.g:981:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) )
            {
            // InternalDelegation.g:981:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDelegation.g:982:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalDelegation.g:982:3: (enumLiteral_0= 'allow' )
                    // InternalDelegation.g:983:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:990:3: (enumLiteral_1= 'obfuscate' )
                    {
                    // InternalDelegation.g:990:3: (enumLiteral_1= 'obfuscate' )
                    // InternalDelegation.g:991:4: enumLiteral_1= 'obfuscate'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:998:3: (enumLiteral_2= 'deny' )
                    {
                    // InternalDelegation.g:998:3: (enumLiteral_2= 'deny' )
                    // InternalDelegation.g:999:4: enumLiteral_2= 'deny'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalDelegation.g:1009:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDelegation.g:1015:2: ( ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) )
            // InternalDelegation.g:1016:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            {
            // InternalDelegation.g:1016:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDelegation.g:1017:3: (enumLiteral_0= 'unset' )
                    {
                    // InternalDelegation.g:1017:3: (enumLiteral_0= 'unset' )
                    // InternalDelegation.g:1018:4: enumLiteral_0= 'unset'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:1025:3: (enumLiteral_1= 'R' )
                    {
                    // InternalDelegation.g:1025:3: (enumLiteral_1= 'R' )
                    // InternalDelegation.g:1026:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:1033:3: (enumLiteral_2= 'W' )
                    {
                    // InternalDelegation.g:1033:3: (enumLiteral_2= 'W' )
                    // InternalDelegation.g:1034:4: enumLiteral_2= 'W'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDelegation.g:1041:3: (enumLiteral_3= 'RW' )
                    {
                    // InternalDelegation.g:1041:3: (enumLiteral_3= 'RW' )
                    // InternalDelegation.g:1042:4: enumLiteral_3= 'RW'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleResolutionType"
    // InternalDelegation.g:1052:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDelegation.g:1058:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalDelegation.g:1059:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalDelegation.g:1059:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDelegation.g:1060:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalDelegation.g:1060:3: (enumLiteral_0= 'restrictive' )
                    // InternalDelegation.g:1061:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:1068:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalDelegation.g:1068:3: (enumLiteral_1= 'permissive' )
                    // InternalDelegation.g:1069:4: enumLiteral_1= 'permissive'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResolutionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000078000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000124000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});

}