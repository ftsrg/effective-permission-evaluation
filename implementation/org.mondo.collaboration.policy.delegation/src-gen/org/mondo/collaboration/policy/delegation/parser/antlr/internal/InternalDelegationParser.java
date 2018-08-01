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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'delegation'", "'from'", "'to'", "','", "'{'", "'query'", "'select'", "'}'", "'import'", "'user'", "'group'", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'priority'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'", "'allow'", "'obfuscate'", "'deny'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'"
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
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalDelegation.g:72:1: ruleDelegationModel returns [EObject current=null] : ( ( (lv_import_0_0= ruleImport ) ) ( (lv_delegations_1_0= ruleDelegation ) )* ) ;
    public final EObject ruleDelegationModel() throws RecognitionException {
        EObject current = null;

        EObject lv_import_0_0 = null;

        EObject lv_delegations_1_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:78:2: ( ( ( (lv_import_0_0= ruleImport ) ) ( (lv_delegations_1_0= ruleDelegation ) )* ) )
            // InternalDelegation.g:79:2: ( ( (lv_import_0_0= ruleImport ) ) ( (lv_delegations_1_0= ruleDelegation ) )* )
            {
            // InternalDelegation.g:79:2: ( ( (lv_import_0_0= ruleImport ) ) ( (lv_delegations_1_0= ruleDelegation ) )* )
            // InternalDelegation.g:80:3: ( (lv_import_0_0= ruleImport ) ) ( (lv_delegations_1_0= ruleDelegation ) )*
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

            // InternalDelegation.g:99:3: ( (lv_delegations_1_0= ruleDelegation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDelegation.g:100:4: (lv_delegations_1_0= ruleDelegation )
            	    {
            	    // InternalDelegation.g:100:4: (lv_delegations_1_0= ruleDelegation )
            	    // InternalDelegation.g:101:5: lv_delegations_1_0= ruleDelegation
            	    {

            	    					newCompositeNode(grammarAccess.getDelegationModelAccess().getDelegationsDelegationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_delegations_1_0=ruleDelegation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDelegationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"delegations",
            	    						lv_delegations_1_0,
            	    						"org.mondo.collaboration.policy.delegation.Delegation.Delegation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleDelegation"
    // InternalDelegation.g:122:1: entryRuleDelegation returns [EObject current=null] : iv_ruleDelegation= ruleDelegation EOF ;
    public final EObject entryRuleDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegation = null;


        try {
            // InternalDelegation.g:122:51: (iv_ruleDelegation= ruleDelegation EOF )
            // InternalDelegation.g:123:2: iv_ruleDelegation= ruleDelegation EOF
            {
             newCompositeNode(grammarAccess.getDelegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegation=ruleDelegation();

            state._fsp--;

             current =iv_ruleDelegation; 
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
    // $ANTLR end "entryRuleDelegation"


    // $ANTLR start "ruleDelegation"
    // InternalDelegation.g:129:1: ruleDelegation returns [EObject current=null] : (otherlv_0= 'delegation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ( (lv_access_4_0= ruleAccessibilityLevel ) ) ( (lv_operation_5_0= ruleOperationType ) )? otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '{' otherlv_11= 'from' otherlv_12= 'query' ( (otherlv_13= RULE_STRING ) ) otherlv_14= 'select' ( (lv_asset_15_0= ruleModelFact ) ) ( (lv_bindings_16_0= ruleBinding ) )* otherlv_17= '}' ) ;
    public final EObject ruleDelegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Enumerator lv_access_4_0 = null;

        Enumerator lv_operation_5_0 = null;

        EObject lv_asset_15_0 = null;

        EObject lv_bindings_16_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:135:2: ( (otherlv_0= 'delegation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ( (lv_access_4_0= ruleAccessibilityLevel ) ) ( (lv_operation_5_0= ruleOperationType ) )? otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '{' otherlv_11= 'from' otherlv_12= 'query' ( (otherlv_13= RULE_STRING ) ) otherlv_14= 'select' ( (lv_asset_15_0= ruleModelFact ) ) ( (lv_bindings_16_0= ruleBinding ) )* otherlv_17= '}' ) )
            // InternalDelegation.g:136:2: (otherlv_0= 'delegation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ( (lv_access_4_0= ruleAccessibilityLevel ) ) ( (lv_operation_5_0= ruleOperationType ) )? otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '{' otherlv_11= 'from' otherlv_12= 'query' ( (otherlv_13= RULE_STRING ) ) otherlv_14= 'select' ( (lv_asset_15_0= ruleModelFact ) ) ( (lv_bindings_16_0= ruleBinding ) )* otherlv_17= '}' )
            {
            // InternalDelegation.g:136:2: (otherlv_0= 'delegation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ( (lv_access_4_0= ruleAccessibilityLevel ) ) ( (lv_operation_5_0= ruleOperationType ) )? otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '{' otherlv_11= 'from' otherlv_12= 'query' ( (otherlv_13= RULE_STRING ) ) otherlv_14= 'select' ( (lv_asset_15_0= ruleModelFact ) ) ( (lv_bindings_16_0= ruleBinding ) )* otherlv_17= '}' )
            // InternalDelegation.g:137:3: otherlv_0= 'delegation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ( (lv_access_4_0= ruleAccessibilityLevel ) ) ( (lv_operation_5_0= ruleOperationType ) )? otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '{' otherlv_11= 'from' otherlv_12= 'query' ( (otherlv_13= RULE_STRING ) ) otherlv_14= 'select' ( (lv_asset_15_0= ruleModelFact ) ) ( (lv_bindings_16_0= ruleBinding ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationAccess().getDelegationKeyword_0());
            		
            // InternalDelegation.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDelegationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationAccess().getFromKeyword_2());
            		
            // InternalDelegation.g:163:3: ( (otherlv_3= RULE_ID ) )
            // InternalDelegation.g:164:4: (otherlv_3= RULE_ID )
            {
            // InternalDelegation.g:164:4: (otherlv_3= RULE_ID )
            // InternalDelegation.g:165:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getDelegationAccess().getSourceUserCrossReference_3_0());
            				

            }


            }

            // InternalDelegation.g:176:3: ( (lv_access_4_0= ruleAccessibilityLevel ) )
            // InternalDelegation.g:177:4: (lv_access_4_0= ruleAccessibilityLevel )
            {
            // InternalDelegation.g:177:4: (lv_access_4_0= ruleAccessibilityLevel )
            // InternalDelegation.g:178:5: lv_access_4_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getDelegationAccess().getAccessAccessibilityLevelEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_access_4_0=ruleAccessibilityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_4_0,
            						"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDelegation.g:195:3: ( (lv_operation_5_0= ruleOperationType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=42 && LA2_0<=45)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDelegation.g:196:4: (lv_operation_5_0= ruleOperationType )
                    {
                    // InternalDelegation.g:196:4: (lv_operation_5_0= ruleOperationType )
                    // InternalDelegation.g:197:5: lv_operation_5_0= ruleOperationType
                    {

                    					newCompositeNode(grammarAccess.getDelegationAccess().getOperationOperationTypeEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_operation_5_0=ruleOperationType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDelegationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_5_0,
                    						"org.mondo.collaboration.policy.Rules.OperationType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDelegationAccess().getToKeyword_6());
            		
            // InternalDelegation.g:218:3: ( (otherlv_7= RULE_ID ) )
            // InternalDelegation.g:219:4: (otherlv_7= RULE_ID )
            {
            // InternalDelegation.g:219:4: (otherlv_7= RULE_ID )
            // InternalDelegation.g:220:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_7, grammarAccess.getDelegationAccess().getTargetsRoleCrossReference_7_0());
            				

            }


            }

            // InternalDelegation.g:231:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDelegation.g:232:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDelegationAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalDelegation.g:236:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalDelegation.g:237:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalDelegation.g:237:5: (otherlv_9= RULE_ID )
            	    // InternalDelegation.g:238:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDelegationRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_9, grammarAccess.getDelegationAccess().getTargetsRoleCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getDelegationAccess().getLeftCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getDelegationAccess().getFromKeyword_10());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getDelegationAccess().getQueryKeyword_11());
            		
            // InternalDelegation.g:262:3: ( (otherlv_13= RULE_STRING ) )
            // InternalDelegation.g:263:4: (otherlv_13= RULE_STRING )
            {
            // InternalDelegation.g:263:4: (otherlv_13= RULE_STRING )
            // InternalDelegation.g:264:5: otherlv_13= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(otherlv_13, grammarAccess.getDelegationAccess().getPatternPatternCrossReference_12_0());
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getDelegationAccess().getSelectKeyword_13());
            		
            // InternalDelegation.g:279:3: ( (lv_asset_15_0= ruleModelFact ) )
            // InternalDelegation.g:280:4: (lv_asset_15_0= ruleModelFact )
            {
            // InternalDelegation.g:280:4: (lv_asset_15_0= ruleModelFact )
            // InternalDelegation.g:281:5: lv_asset_15_0= ruleModelFact
            {

            					newCompositeNode(grammarAccess.getDelegationAccess().getAssetModelFactParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
            lv_asset_15_0=ruleModelFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationRule());
            					}
            					set(
            						current,
            						"asset",
            						lv_asset_15_0,
            						"org.mondo.collaboration.policy.Rules.ModelFact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDelegation.g:298:3: ( (lv_bindings_16_0= ruleBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDelegation.g:299:4: (lv_bindings_16_0= ruleBinding )
            	    {
            	    // InternalDelegation.g:299:4: (lv_bindings_16_0= ruleBinding )
            	    // InternalDelegation.g:300:5: lv_bindings_16_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getDelegationAccess().getBindingsBindingParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_bindings_16_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDelegationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bindings",
            	    						lv_bindings_16_0,
            	    						"org.mondo.collaboration.policy.Rules.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getDelegationAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleDelegation"


    // $ANTLR start "entryRuleImport"
    // InternalDelegation.g:325:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDelegation.g:325:47: (iv_ruleImport= ruleImport EOF )
            // InternalDelegation.g:326:2: iv_ruleImport= ruleImport EOF
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
    // InternalDelegation.g:332:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalDelegation.g:338:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalDelegation.g:339:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalDelegation.g:339:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalDelegation.g:340:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDelegation.g:344:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDelegation.g:345:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDelegation.g:345:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDelegation.g:346:5: lv_importURI_1_0= RULE_STRING
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
    // InternalDelegation.g:366:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDelegation.g:366:45: (iv_ruleRole= ruleRole EOF )
            // InternalDelegation.g:367:2: iv_ruleRole= ruleRole EOF
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
    // InternalDelegation.g:373:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalDelegation.g:379:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalDelegation.g:380:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalDelegation.g:380:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDelegation.g:381:3: this_User_0= ruleUser
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
                    // InternalDelegation.g:390:3: this_Group_1= ruleGroup
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
    // InternalDelegation.g:402:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalDelegation.g:402:45: (iv_ruleUser= ruleUser EOF )
            // InternalDelegation.g:403:2: iv_ruleUser= ruleUser EOF
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
    // InternalDelegation.g:409:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDelegation.g:415:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDelegation.g:416:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDelegation.g:416:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDelegation.g:417:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalDelegation.g:421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:422:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:423:5: lv_name_1_0= RULE_ID
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
    // InternalDelegation.g:443:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalDelegation.g:443:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalDelegation.g:444:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalDelegation.g:450:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
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
            // InternalDelegation.g:456:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalDelegation.g:457:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalDelegation.g:457:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalDelegation.g:458:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalDelegation.g:462:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:463:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:463:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:464:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDelegation.g:484:3: ( (otherlv_3= RULE_ID ) )
            // InternalDelegation.g:485:4: (otherlv_3= RULE_ID )
            {
            // InternalDelegation.g:485:4: (otherlv_3= RULE_ID )
            // InternalDelegation.g:486:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0());
            				

            }


            }

            // InternalDelegation.g:497:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDelegation.g:498:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDelegation.g:502:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalDelegation.g:503:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalDelegation.g:503:5: (otherlv_5= RULE_ID )
            	    // InternalDelegation.g:504:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRulePolicy"
    // InternalDelegation.g:524:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalDelegation.g:524:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalDelegation.g:525:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalDelegation.g:531:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) otherlv_3= 'by' otherlv_4= 'default' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' otherlv_8= 'with' ( (lv_resolution_9_0= ruleResolutionType ) ) otherlv_10= 'resolution' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_access_2_0 = null;

        EObject lv_rules_6_0 = null;

        Enumerator lv_resolution_9_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:537:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) otherlv_3= 'by' otherlv_4= 'default' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' otherlv_8= 'with' ( (lv_resolution_9_0= ruleResolutionType ) ) otherlv_10= 'resolution' ) )
            // InternalDelegation.g:538:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) otherlv_3= 'by' otherlv_4= 'default' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' otherlv_8= 'with' ( (lv_resolution_9_0= ruleResolutionType ) ) otherlv_10= 'resolution' )
            {
            // InternalDelegation.g:538:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) otherlv_3= 'by' otherlv_4= 'default' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' otherlv_8= 'with' ( (lv_resolution_9_0= ruleResolutionType ) ) otherlv_10= 'resolution' )
            // InternalDelegation.g:539:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) otherlv_3= 'by' otherlv_4= 'default' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' otherlv_8= 'with' ( (lv_resolution_9_0= ruleResolutionType ) ) otherlv_10= 'resolution'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalDelegation.g:543:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:544:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:544:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:545:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalDelegation.g:561:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalDelegation.g:562:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalDelegation.g:562:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalDelegation.g:563:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_access_2_0=ruleAccessibilityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_2_0,
            						"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPolicyAccess().getByKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getDefaultKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDelegation.g:592:3: ( (lv_rules_6_0= ruleRule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDelegation.g:593:4: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalDelegation.g:593:4: (lv_rules_6_0= ruleRule )
            	    // InternalDelegation.g:594:5: lv_rules_6_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_6_0,
            	    						"org.mondo.collaboration.policy.Rules.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getPolicyAccess().getWithKeyword_8());
            		
            // InternalDelegation.g:619:3: ( (lv_resolution_9_0= ruleResolutionType ) )
            // InternalDelegation.g:620:4: (lv_resolution_9_0= ruleResolutionType )
            {
            // InternalDelegation.g:620:4: (lv_resolution_9_0= ruleResolutionType )
            // InternalDelegation.g:621:5: lv_resolution_9_0= ruleResolutionType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_22);
            lv_resolution_9_0=ruleResolutionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"resolution",
            						lv_resolution_9_0,
            						"org.mondo.collaboration.policy.Rules.ResolutionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPolicyAccess().getResolutionKeyword_10());
            		

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
    // InternalDelegation.g:646:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDelegation.g:646:45: (iv_ruleRule= ruleRule EOF )
            // InternalDelegation.g:647:2: iv_ruleRule= ruleRule EOF
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
    // InternalDelegation.g:653:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_priority_17_0=null;
        Token otherlv_18=null;
        Enumerator lv_access_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_asset_13_0 = null;

        EObject lv_bindings_14_0 = null;



        	enterRule();

        try {
            // InternalDelegation.g:659:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) )
            // InternalDelegation.g:660:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            {
            // InternalDelegation.g:660:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            // InternalDelegation.g:661:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalDelegation.g:665:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDelegation.g:666:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDelegation.g:666:4: (lv_name_1_0= RULE_ID )
            // InternalDelegation.g:667:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalDelegation.g:683:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalDelegation.g:684:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalDelegation.g:684:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalDelegation.g:685:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalDelegation.g:702:3: ( (lv_operation_3_0= ruleOperationType ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=42 && LA8_0<=45)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDelegation.g:703:4: (lv_operation_3_0= ruleOperationType )
                    {
                    // InternalDelegation.g:703:4: (lv_operation_3_0= ruleOperationType )
                    // InternalDelegation.g:704:5: lv_operation_3_0= ruleOperationType
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getToKeyword_4());
            		
            // InternalDelegation.g:725:3: ( (otherlv_5= RULE_ID ) )
            // InternalDelegation.g:726:4: (otherlv_5= RULE_ID )
            {
            // InternalDelegation.g:726:4: (otherlv_5= RULE_ID )
            // InternalDelegation.g:727:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0());
            				

            }


            }

            // InternalDelegation.g:738:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDelegation.g:739:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDelegation.g:743:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalDelegation.g:744:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalDelegation.g:744:5: (otherlv_7= RULE_ID )
            	    // InternalDelegation.g:745:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getFromKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getQueryKeyword_9());
            		
            // InternalDelegation.g:769:3: ( (otherlv_11= RULE_STRING ) )
            // InternalDelegation.g:770:4: (otherlv_11= RULE_STRING )
            {
            // InternalDelegation.g:770:4: (otherlv_11= RULE_STRING )
            // InternalDelegation.g:771:5: otherlv_11= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0());
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getSelectKeyword_11());
            		
            // InternalDelegation.g:786:3: ( (lv_asset_13_0= ruleModelFact ) )
            // InternalDelegation.g:787:4: (lv_asset_13_0= ruleModelFact )
            {
            // InternalDelegation.g:787:4: (lv_asset_13_0= ruleModelFact )
            // InternalDelegation.g:788:5: lv_asset_13_0= ruleModelFact
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_asset_13_0=ruleModelFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"asset",
            						lv_asset_13_0,
            						"org.mondo.collaboration.policy.Rules.ModelFact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDelegation.g:805:3: ( (lv_bindings_14_0= ruleBinding ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDelegation.g:806:4: (lv_bindings_14_0= ruleBinding )
            	    {
            	    // InternalDelegation.g:806:4: (lv_bindings_14_0= ruleBinding )
            	    // InternalDelegation.g:807:5: lv_bindings_14_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_bindings_14_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bindings",
            	    						lv_bindings_14_0,
            	    						"org.mondo.collaboration.policy.Rules.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalDelegation.g:828:3: (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDelegation.g:829:4: otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getWithKeyword_15_0());
                    			
                    // InternalDelegation.g:833:4: ( (lv_priority_17_0= RULE_INT ) )
                    // InternalDelegation.g:834:5: (lv_priority_17_0= RULE_INT )
                    {
                    // InternalDelegation.g:834:5: (lv_priority_17_0= RULE_INT )
                    // InternalDelegation.g:835:6: lv_priority_17_0= RULE_INT
                    {
                    lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_priority_17_0, grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getRuleAccess().getPriorityKeyword_15_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleModelFact"
    // InternalDelegation.g:860:1: entryRuleModelFact returns [EObject current=null] : iv_ruleModelFact= ruleModelFact EOF ;
    public final EObject entryRuleModelFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFact = null;


        try {
            // InternalDelegation.g:860:50: (iv_ruleModelFact= ruleModelFact EOF )
            // InternalDelegation.g:861:2: iv_ruleModelFact= ruleModelFact EOF
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
    // InternalDelegation.g:867:1: ruleModelFact returns [EObject current=null] : (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) ;
    public final EObject ruleModelFact() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectFact_0 = null;

        EObject this_ReferenceFact_1 = null;

        EObject this_AttributeFact_2 = null;



        	enterRule();

        try {
            // InternalDelegation.g:873:2: ( (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) )
            // InternalDelegation.g:874:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            {
            // InternalDelegation.g:874:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDelegation.g:875:3: this_ObjectFact_0= ruleObjectFact
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
                    // InternalDelegation.g:884:3: this_ReferenceFact_1= ruleReferenceFact
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
                    // InternalDelegation.g:893:3: this_AttributeFact_2= ruleAttributeFact
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
    // InternalDelegation.g:905:1: entryRuleObjectFact returns [EObject current=null] : iv_ruleObjectFact= ruleObjectFact EOF ;
    public final EObject entryRuleObjectFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectFact = null;


        try {
            // InternalDelegation.g:905:51: (iv_ruleObjectFact= ruleObjectFact EOF )
            // InternalDelegation.g:906:2: iv_ruleObjectFact= ruleObjectFact EOF
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
    // InternalDelegation.g:912:1: ruleObjectFact returns [EObject current=null] : (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDelegation.g:918:2: ( (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalDelegation.g:919:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalDelegation.g:919:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalDelegation.g:920:3: otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectFactAccess().getObjKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDelegation.g:928:3: ( (otherlv_2= RULE_ID ) )
            // InternalDelegation.g:929:4: (otherlv_2= RULE_ID )
            {
            // InternalDelegation.g:929:4: (otherlv_2= RULE_ID )
            // InternalDelegation.g:930:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDelegation.g:949:1: entryRuleReferenceFact returns [EObject current=null] : iv_ruleReferenceFact= ruleReferenceFact EOF ;
    public final EObject entryRuleReferenceFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFact = null;


        try {
            // InternalDelegation.g:949:54: (iv_ruleReferenceFact= ruleReferenceFact EOF )
            // InternalDelegation.g:950:2: iv_ruleReferenceFact= ruleReferenceFact EOF
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
    // InternalDelegation.g:956:1: ruleReferenceFact returns [EObject current=null] : (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
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
            // InternalDelegation.g:962:2: ( (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalDelegation.g:963:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalDelegation.g:963:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalDelegation.g:964:3: otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceFactAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDelegation.g:972:3: ( (otherlv_2= RULE_ID ) )
            // InternalDelegation.g:973:4: (otherlv_2= RULE_ID )
            {
            // InternalDelegation.g:973:4: (otherlv_2= RULE_ID )
            // InternalDelegation.g:974:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalDelegation.g:989:3: ( (otherlv_4= RULE_ID ) )
            // InternalDelegation.g:990:4: (otherlv_4= RULE_ID )
            {
            // InternalDelegation.g:990:4: (otherlv_4= RULE_ID )
            // InternalDelegation.g:991:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_4, grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceFactAccess().getColonKeyword_5());
            		
            // InternalDelegation.g:1006:3: ( (otherlv_6= RULE_ID ) )
            // InternalDelegation.g:1007:4: (otherlv_6= RULE_ID )
            {
            // InternalDelegation.g:1007:4: (otherlv_6= RULE_ID )
            // InternalDelegation.g:1008:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_6, grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDelegation.g:1027:1: entryRuleAttributeFact returns [EObject current=null] : iv_ruleAttributeFact= ruleAttributeFact EOF ;
    public final EObject entryRuleAttributeFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFact = null;


        try {
            // InternalDelegation.g:1027:54: (iv_ruleAttributeFact= ruleAttributeFact EOF )
            // InternalDelegation.g:1028:2: iv_ruleAttributeFact= ruleAttributeFact EOF
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
    // InternalDelegation.g:1034:1: ruleAttributeFact returns [EObject current=null] : (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalDelegation.g:1040:2: ( (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalDelegation.g:1041:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalDelegation.g:1041:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalDelegation.g:1042:3: otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeFactAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDelegation.g:1050:3: ( (otherlv_2= RULE_ID ) )
            // InternalDelegation.g:1051:4: (otherlv_2= RULE_ID )
            {
            // InternalDelegation.g:1051:4: (otherlv_2= RULE_ID )
            // InternalDelegation.g:1052:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeFactAccess().getColonKeyword_3());
            		
            // InternalDelegation.g:1067:3: ( (otherlv_4= RULE_ID ) )
            // InternalDelegation.g:1068:4: (otherlv_4= RULE_ID )
            {
            // InternalDelegation.g:1068:4: (otherlv_4= RULE_ID )
            // InternalDelegation.g:1069:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_4, grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDelegation.g:1088:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalDelegation.g:1088:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalDelegation.g:1089:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalDelegation.g:1095:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) ;
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
            // InternalDelegation.g:1101:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) )
            // InternalDelegation.g:1102:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            {
            // InternalDelegation.g:1102:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            // InternalDelegation.g:1103:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getWhereKeyword_0());
            		
            // InternalDelegation.g:1107:3: ( (otherlv_1= RULE_ID ) )
            // InternalDelegation.g:1108:4: (otherlv_1= RULE_ID )
            {
            // InternalDelegation.g:1108:4: (otherlv_1= RULE_ID )
            // InternalDelegation.g:1109:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getBoundKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getToKeyword_4());
            		
            // InternalDelegation.g:1132:3: ( (lv_bind_5_0= ruleBind ) )
            // InternalDelegation.g:1133:4: (lv_bind_5_0= ruleBind )
            {
            // InternalDelegation.g:1133:4: (lv_bind_5_0= ruleBind )
            // InternalDelegation.g:1134:5: lv_bind_5_0= ruleBind
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
    // InternalDelegation.g:1155:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalDelegation.g:1155:45: (iv_ruleBind= ruleBind EOF )
            // InternalDelegation.g:1156:2: iv_ruleBind= ruleBind EOF
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
    // InternalDelegation.g:1162:1: ruleBind returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token lv_valueInteger_1_0=null;


        	enterRule();

        try {
            // InternalDelegation.g:1168:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) )
            // InternalDelegation.g:1169:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            {
            // InternalDelegation.g:1169:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDelegation.g:1170:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalDelegation.g:1170:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalDelegation.g:1171:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalDelegation.g:1171:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalDelegation.g:1172:5: lv_valueString_0_0= RULE_STRING
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
                    // InternalDelegation.g:1189:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    {
                    // InternalDelegation.g:1189:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    // InternalDelegation.g:1190:4: (lv_valueInteger_1_0= RULE_INT )
                    {
                    // InternalDelegation.g:1190:4: (lv_valueInteger_1_0= RULE_INT )
                    // InternalDelegation.g:1191:5: lv_valueInteger_1_0= RULE_INT
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
    // InternalDelegation.g:1211:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDelegation.g:1217:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) ) )
            // InternalDelegation.g:1218:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) )
            {
            // InternalDelegation.g:1218:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDelegation.g:1219:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalDelegation.g:1219:3: (enumLiteral_0= 'allow' )
                    // InternalDelegation.g:1220:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:1227:3: (enumLiteral_1= 'obfuscate' )
                    {
                    // InternalDelegation.g:1227:3: (enumLiteral_1= 'obfuscate' )
                    // InternalDelegation.g:1228:4: enumLiteral_1= 'obfuscate'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:1235:3: (enumLiteral_2= 'deny' )
                    {
                    // InternalDelegation.g:1235:3: (enumLiteral_2= 'deny' )
                    // InternalDelegation.g:1236:4: enumLiteral_2= 'deny'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDelegation.g:1246:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDelegation.g:1252:2: ( ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) )
            // InternalDelegation.g:1253:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            {
            // InternalDelegation.g:1253:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt15=1;
                }
                break;
            case 43:
                {
                alt15=2;
                }
                break;
            case 44:
                {
                alt15=3;
                }
                break;
            case 45:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDelegation.g:1254:3: (enumLiteral_0= 'unset' )
                    {
                    // InternalDelegation.g:1254:3: (enumLiteral_0= 'unset' )
                    // InternalDelegation.g:1255:4: enumLiteral_0= 'unset'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:1262:3: (enumLiteral_1= 'R' )
                    {
                    // InternalDelegation.g:1262:3: (enumLiteral_1= 'R' )
                    // InternalDelegation.g:1263:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:1270:3: (enumLiteral_2= 'W' )
                    {
                    // InternalDelegation.g:1270:3: (enumLiteral_2= 'W' )
                    // InternalDelegation.g:1271:4: enumLiteral_2= 'W'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDelegation.g:1278:3: (enumLiteral_3= 'RW' )
                    {
                    // InternalDelegation.g:1278:3: (enumLiteral_3= 'RW' )
                    // InternalDelegation.g:1279:4: enumLiteral_3= 'RW'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalDelegation.g:1289:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDelegation.g:1295:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalDelegation.g:1296:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalDelegation.g:1296:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            else if ( (LA16_0==47) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDelegation.g:1297:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalDelegation.g:1297:3: (enumLiteral_0= 'restrictive' )
                    // InternalDelegation.g:1298:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:1305:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalDelegation.g:1305:3: (enumLiteral_1= 'permissive' )
                    // InternalDelegation.g:1306:4: enumLiteral_1= 'permissive'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00003C0000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000920000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000060L});

}