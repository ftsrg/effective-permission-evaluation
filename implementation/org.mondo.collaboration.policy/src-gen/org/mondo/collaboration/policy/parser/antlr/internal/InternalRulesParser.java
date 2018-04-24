package org.mondo.collaboration.policy.parser.antlr.internal;

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
import org.mondo.collaboration.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'user'", "'group'", "'{'", "','", "'}'", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'to'", "'from'", "'query'", "'select'", "'priority'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'", "'allow'", "'deny'", "'obfuscate'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRules.g"; }



     	private RulesGrammarAccess grammarAccess;

        public InternalRulesParser(TokenStream input, RulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AccessControlModel";
       	}

       	@Override
       	protected RulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAccessControlModel"
    // InternalRules.g:65:1: entryRuleAccessControlModel returns [EObject current=null] : iv_ruleAccessControlModel= ruleAccessControlModel EOF ;
    public final EObject entryRuleAccessControlModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControlModel = null;


        try {
            // InternalRules.g:65:59: (iv_ruleAccessControlModel= ruleAccessControlModel EOF )
            // InternalRules.g:66:2: iv_ruleAccessControlModel= ruleAccessControlModel EOF
            {
             newCompositeNode(grammarAccess.getAccessControlModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessControlModel=ruleAccessControlModel();

            state._fsp--;

             current =iv_ruleAccessControlModel; 
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
    // $ANTLR end "entryRuleAccessControlModel"


    // $ANTLR start "ruleAccessControlModel"
    // InternalRules.g:72:1: ruleAccessControlModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_roles_1_0= ruleRole ) )* ( (lv_policy_2_0= rulePolicy ) ) ) ;
    public final EObject ruleAccessControlModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_roles_1_0 = null;

        EObject lv_policy_2_0 = null;



        	enterRule();

        try {
            // InternalRules.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_roles_1_0= ruleRole ) )* ( (lv_policy_2_0= rulePolicy ) ) ) )
            // InternalRules.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_roles_1_0= ruleRole ) )* ( (lv_policy_2_0= rulePolicy ) ) )
            {
            // InternalRules.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_roles_1_0= ruleRole ) )* ( (lv_policy_2_0= rulePolicy ) ) )
            // InternalRules.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_roles_1_0= ruleRole ) )* ( (lv_policy_2_0= rulePolicy ) )
            {
            // InternalRules.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRules.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalRules.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalRules.g:82:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getAccessControlModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAccessControlModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.mondo.collaboration.policy.Rules.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRules.g:99:3: ( (lv_roles_1_0= ruleRole ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRules.g:100:4: (lv_roles_1_0= ruleRole )
            	    {
            	    // InternalRules.g:100:4: (lv_roles_1_0= ruleRole )
            	    // InternalRules.g:101:5: lv_roles_1_0= ruleRole
            	    {

            	    					newCompositeNode(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_roles_1_0=ruleRole();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAccessControlModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roles",
            	    						lv_roles_1_0,
            	    						"org.mondo.collaboration.policy.Rules.Role");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalRules.g:118:3: ( (lv_policy_2_0= rulePolicy ) )
            // InternalRules.g:119:4: (lv_policy_2_0= rulePolicy )
            {
            // InternalRules.g:119:4: (lv_policy_2_0= rulePolicy )
            // InternalRules.g:120:5: lv_policy_2_0= rulePolicy
            {

            					newCompositeNode(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_policy_2_0=rulePolicy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessControlModelRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_2_0,
            						"org.mondo.collaboration.policy.Rules.Policy");
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
    // $ANTLR end "ruleAccessControlModel"


    // $ANTLR start "entryRuleImport"
    // InternalRules.g:141:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRules.g:141:47: (iv_ruleImport= ruleImport EOF )
            // InternalRules.g:142:2: iv_ruleImport= ruleImport EOF
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
    // InternalRules.g:148:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:154:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalRules.g:155:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalRules.g:155:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalRules.g:156:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRules.g:160:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalRules.g:161:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalRules.g:161:4: (lv_importURI_1_0= RULE_STRING )
            // InternalRules.g:162:5: lv_importURI_1_0= RULE_STRING
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
    // InternalRules.g:182:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalRules.g:182:45: (iv_ruleRole= ruleRole EOF )
            // InternalRules.g:183:2: iv_ruleRole= ruleRole EOF
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
    // InternalRules.g:189:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalRules.g:195:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalRules.g:196:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalRules.g:196:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRules.g:197:3: this_User_0= ruleUser
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
                    // InternalRules.g:206:3: this_Group_1= ruleGroup
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
    // InternalRules.g:218:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalRules.g:218:45: (iv_ruleUser= ruleUser EOF )
            // InternalRules.g:219:2: iv_ruleUser= ruleUser EOF
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
    // InternalRules.g:225:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:231:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRules.g:232:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRules.g:232:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRules.g:233:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalRules.g:237:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:238:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:238:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:239:5: lv_name_1_0= RULE_ID
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
    // InternalRules.g:259:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalRules.g:259:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalRules.g:260:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalRules.g:266:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
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
            // InternalRules.g:272:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalRules.g:273:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalRules.g:273:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalRules.g:274:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalRules.g:278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:279:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRules.g:300:3: ( (otherlv_3= RULE_ID ) )
            // InternalRules.g:301:4: (otherlv_3= RULE_ID )
            {
            // InternalRules.g:301:4: (otherlv_3= RULE_ID )
            // InternalRules.g:302:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0());
            				

            }


            }

            // InternalRules.g:313:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRules.g:314:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRules.g:318:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalRules.g:319:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalRules.g:319:5: (otherlv_5= RULE_ID )
            	    // InternalRules.g:320:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRules.g:340:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalRules.g:340:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalRules.g:341:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalRules.g:347:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_access_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_rules_7_0 = null;

        Enumerator lv_resolution_10_0 = null;



        	enterRule();

        try {
            // InternalRules.g:353:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' ) )
            // InternalRules.g:354:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' )
            {
            // InternalRules.g:354:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' )
            // InternalRules.g:355:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalRules.g:359:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:360:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:360:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:361:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalRules.g:377:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalRules.g:378:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalRules.g:378:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalRules.g:379:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalRules.g:396:3: ( (lv_operation_3_0= ruleOperationType ) )
            // InternalRules.g:397:4: (lv_operation_3_0= ruleOperationType )
            {
            // InternalRules.g:397:4: (lv_operation_3_0= ruleOperationType )
            // InternalRules.g:398:5: lv_operation_3_0= ruleOperationType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_operation_3_0=ruleOperationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_3_0,
            						"org.mondo.collaboration.policy.Rules.OperationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getByKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getDefaultKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalRules.g:427:3: ( (lv_rules_7_0= ruleRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRules.g:428:4: (lv_rules_7_0= ruleRule )
            	    {
            	    // InternalRules.g:428:4: (lv_rules_7_0= ruleRule )
            	    // InternalRules.g:429:5: lv_rules_7_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_rules_7_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_7_0,
            	    						"org.mondo.collaboration.policy.Rules.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getWithKeyword_9());
            		
            // InternalRules.g:454:3: ( (lv_resolution_10_0= ruleResolutionType ) )
            // InternalRules.g:455:4: (lv_resolution_10_0= ruleResolutionType )
            {
            // InternalRules.g:455:4: (lv_resolution_10_0= ruleResolutionType )
            // InternalRules.g:456:5: lv_resolution_10_0= ruleResolutionType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_16);
            lv_resolution_10_0=ruleResolutionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"resolution",
            						lv_resolution_10_0,
            						"org.mondo.collaboration.policy.Rules.ResolutionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getResolutionKeyword_11());
            		

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
    // InternalRules.g:481:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRules.g:481:45: (iv_ruleRule= ruleRule EOF )
            // InternalRules.g:482:2: iv_ruleRule= ruleRule EOF
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
    // InternalRules.g:488:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) ;
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
            // InternalRules.g:494:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) )
            // InternalRules.g:495:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            {
            // InternalRules.g:495:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            // InternalRules.g:496:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalRules.g:500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:501:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:502:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalRules.g:518:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalRules.g:519:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalRules.g:519:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalRules.g:520:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalRules.g:537:3: ( (lv_operation_3_0= ruleOperationType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=41 && LA6_0<=44)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRules.g:538:4: (lv_operation_3_0= ruleOperationType )
                    {
                    // InternalRules.g:538:4: (lv_operation_3_0= ruleOperationType )
                    // InternalRules.g:539:5: lv_operation_3_0= ruleOperationType
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getToKeyword_4());
            		
            // InternalRules.g:560:3: ( (otherlv_5= RULE_ID ) )
            // InternalRules.g:561:4: (otherlv_5= RULE_ID )
            {
            // InternalRules.g:561:4: (otherlv_5= RULE_ID )
            // InternalRules.g:562:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0());
            				

            }


            }

            // InternalRules.g:573:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:574:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRules.g:578:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalRules.g:579:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalRules.g:579:5: (otherlv_7= RULE_ID )
            	    // InternalRules.g:580:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getFromKeyword_8());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getQueryKeyword_9());
            		
            // InternalRules.g:604:3: ( (otherlv_11= RULE_STRING ) )
            // InternalRules.g:605:4: (otherlv_11= RULE_STRING )
            {
            // InternalRules.g:605:4: (otherlv_11= RULE_STRING )
            // InternalRules.g:606:5: otherlv_11= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0());
            				

            }


            }

            otherlv_12=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getSelectKeyword_11());
            		
            // InternalRules.g:621:3: ( (lv_asset_13_0= ruleModelFact ) )
            // InternalRules.g:622:4: (lv_asset_13_0= ruleModelFact )
            {
            // InternalRules.g:622:4: (lv_asset_13_0= ruleModelFact )
            // InternalRules.g:623:5: lv_asset_13_0= ruleModelFact
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalRules.g:640:3: ( (lv_bindings_14_0= ruleBinding ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:641:4: (lv_bindings_14_0= ruleBinding )
            	    {
            	    // InternalRules.g:641:4: (lv_bindings_14_0= ruleBinding )
            	    // InternalRules.g:642:5: lv_bindings_14_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop8;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalRules.g:663:3: (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRules.g:664:4: otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getWithKeyword_15_0());
                    			
                    // InternalRules.g:668:4: ( (lv_priority_17_0= RULE_INT ) )
                    // InternalRules.g:669:5: (lv_priority_17_0= RULE_INT )
                    {
                    // InternalRules.g:669:5: (lv_priority_17_0= RULE_INT )
                    // InternalRules.g:670:6: lv_priority_17_0= RULE_INT
                    {
                    lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

                    otherlv_18=(Token)match(input,27,FOLLOW_2); 

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
    // InternalRules.g:695:1: entryRuleModelFact returns [EObject current=null] : iv_ruleModelFact= ruleModelFact EOF ;
    public final EObject entryRuleModelFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFact = null;


        try {
            // InternalRules.g:695:50: (iv_ruleModelFact= ruleModelFact EOF )
            // InternalRules.g:696:2: iv_ruleModelFact= ruleModelFact EOF
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
    // InternalRules.g:702:1: ruleModelFact returns [EObject current=null] : (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) ;
    public final EObject ruleModelFact() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectFact_0 = null;

        EObject this_ReferenceFact_1 = null;

        EObject this_AttributeFact_2 = null;



        	enterRule();

        try {
            // InternalRules.g:708:2: ( (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) )
            // InternalRules.g:709:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            {
            // InternalRules.g:709:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRules.g:710:3: this_ObjectFact_0= ruleObjectFact
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
                    // InternalRules.g:719:3: this_ReferenceFact_1= ruleReferenceFact
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
                    // InternalRules.g:728:3: this_AttributeFact_2= ruleAttributeFact
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
    // InternalRules.g:740:1: entryRuleObjectFact returns [EObject current=null] : iv_ruleObjectFact= ruleObjectFact EOF ;
    public final EObject entryRuleObjectFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectFact = null;


        try {
            // InternalRules.g:740:51: (iv_ruleObjectFact= ruleObjectFact EOF )
            // InternalRules.g:741:2: iv_ruleObjectFact= ruleObjectFact EOF
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
    // InternalRules.g:747:1: ruleObjectFact returns [EObject current=null] : (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRules.g:753:2: ( (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRules.g:754:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRules.g:754:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRules.g:755:3: otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectFactAccess().getObjKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRules.g:763:3: ( (otherlv_2= RULE_ID ) )
            // InternalRules.g:764:4: (otherlv_2= RULE_ID )
            {
            // InternalRules.g:764:4: (otherlv_2= RULE_ID )
            // InternalRules.g:765:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRules.g:784:1: entryRuleReferenceFact returns [EObject current=null] : iv_ruleReferenceFact= ruleReferenceFact EOF ;
    public final EObject entryRuleReferenceFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFact = null;


        try {
            // InternalRules.g:784:54: (iv_ruleReferenceFact= ruleReferenceFact EOF )
            // InternalRules.g:785:2: iv_ruleReferenceFact= ruleReferenceFact EOF
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
    // InternalRules.g:791:1: ruleReferenceFact returns [EObject current=null] : (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
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
            // InternalRules.g:797:2: ( (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalRules.g:798:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalRules.g:798:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalRules.g:799:3: otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceFactAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRules.g:807:3: ( (otherlv_2= RULE_ID ) )
            // InternalRules.g:808:4: (otherlv_2= RULE_ID )
            {
            // InternalRules.g:808:4: (otherlv_2= RULE_ID )
            // InternalRules.g:809:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalRules.g:824:3: ( (otherlv_4= RULE_ID ) )
            // InternalRules.g:825:4: (otherlv_4= RULE_ID )
            {
            // InternalRules.g:825:4: (otherlv_4= RULE_ID )
            // InternalRules.g:826:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_4, grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceFactAccess().getColonKeyword_5());
            		
            // InternalRules.g:841:3: ( (otherlv_6= RULE_ID ) )
            // InternalRules.g:842:4: (otherlv_6= RULE_ID )
            {
            // InternalRules.g:842:4: (otherlv_6= RULE_ID )
            // InternalRules.g:843:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_6, grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRules.g:862:1: entryRuleAttributeFact returns [EObject current=null] : iv_ruleAttributeFact= ruleAttributeFact EOF ;
    public final EObject entryRuleAttributeFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFact = null;


        try {
            // InternalRules.g:862:54: (iv_ruleAttributeFact= ruleAttributeFact EOF )
            // InternalRules.g:863:2: iv_ruleAttributeFact= ruleAttributeFact EOF
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
    // InternalRules.g:869:1: ruleAttributeFact returns [EObject current=null] : (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalRules.g:875:2: ( (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalRules.g:876:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalRules.g:876:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalRules.g:877:3: otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeFactAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRules.g:885:3: ( (otherlv_2= RULE_ID ) )
            // InternalRules.g:886:4: (otherlv_2= RULE_ID )
            {
            // InternalRules.g:886:4: (otherlv_2= RULE_ID )
            // InternalRules.g:887:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeFactAccess().getColonKeyword_3());
            		
            // InternalRules.g:902:3: ( (otherlv_4= RULE_ID ) )
            // InternalRules.g:903:4: (otherlv_4= RULE_ID )
            {
            // InternalRules.g:903:4: (otherlv_4= RULE_ID )
            // InternalRules.g:904:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_4, grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRules.g:923:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalRules.g:923:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalRules.g:924:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalRules.g:930:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) ;
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
            // InternalRules.g:936:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) )
            // InternalRules.g:937:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            {
            // InternalRules.g:937:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            // InternalRules.g:938:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getWhereKeyword_0());
            		
            // InternalRules.g:942:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:943:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:943:4: (otherlv_1= RULE_ID )
            // InternalRules.g:944:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getBoundKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getToKeyword_4());
            		
            // InternalRules.g:967:3: ( (lv_bind_5_0= ruleBind ) )
            // InternalRules.g:968:4: (lv_bind_5_0= ruleBind )
            {
            // InternalRules.g:968:4: (lv_bind_5_0= ruleBind )
            // InternalRules.g:969:5: lv_bind_5_0= ruleBind
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
    // InternalRules.g:990:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalRules.g:990:45: (iv_ruleBind= ruleBind EOF )
            // InternalRules.g:991:2: iv_ruleBind= ruleBind EOF
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
    // InternalRules.g:997:1: ruleBind returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token lv_valueInteger_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:1003:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) )
            // InternalRules.g:1004:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            {
            // InternalRules.g:1004:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRules.g:1005:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalRules.g:1005:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalRules.g:1006:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalRules.g:1006:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalRules.g:1007:5: lv_valueString_0_0= RULE_STRING
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
                    // InternalRules.g:1024:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    {
                    // InternalRules.g:1024:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    // InternalRules.g:1025:4: (lv_valueInteger_1_0= RULE_INT )
                    {
                    // InternalRules.g:1025:4: (lv_valueInteger_1_0= RULE_INT )
                    // InternalRules.g:1026:5: lv_valueInteger_1_0= RULE_INT
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
    // InternalRules.g:1046:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRules.g:1052:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) ) )
            // InternalRules.g:1053:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) )
            {
            // InternalRules.g:1053:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
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
                    // InternalRules.g:1054:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalRules.g:1054:3: (enumLiteral_0= 'allow' )
                    // InternalRules.g:1055:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1062:3: (enumLiteral_1= 'deny' )
                    {
                    // InternalRules.g:1062:3: (enumLiteral_1= 'deny' )
                    // InternalRules.g:1063:4: enumLiteral_1= 'deny'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1070:3: (enumLiteral_2= 'obfuscate' )
                    {
                    // InternalRules.g:1070:3: (enumLiteral_2= 'obfuscate' )
                    // InternalRules.g:1071:4: enumLiteral_2= 'obfuscate'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2());
                    			

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
    // InternalRules.g:1081:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRules.g:1087:2: ( ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) )
            // InternalRules.g:1088:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            {
            // InternalRules.g:1088:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            case 44:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRules.g:1089:3: (enumLiteral_0= 'unset' )
                    {
                    // InternalRules.g:1089:3: (enumLiteral_0= 'unset' )
                    // InternalRules.g:1090:4: enumLiteral_0= 'unset'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1097:3: (enumLiteral_1= 'R' )
                    {
                    // InternalRules.g:1097:3: (enumLiteral_1= 'R' )
                    // InternalRules.g:1098:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1105:3: (enumLiteral_2= 'W' )
                    {
                    // InternalRules.g:1105:3: (enumLiteral_2= 'W' )
                    // InternalRules.g:1106:4: enumLiteral_2= 'W'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRules.g:1113:3: (enumLiteral_3= 'RW' )
                    {
                    // InternalRules.g:1113:3: (enumLiteral_3= 'RW' )
                    // InternalRules.g:1114:4: enumLiteral_3= 'RW'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

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
    // InternalRules.g:1124:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:1130:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalRules.g:1131:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalRules.g:1131:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            else if ( (LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRules.g:1132:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalRules.g:1132:3: (enumLiteral_0= 'restrictive' )
                    // InternalRules.g:1133:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1140:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalRules.g:1140:3: (enumLiteral_1= 'permissive' )
                    // InternalRules.g:1141:4: enumLiteral_1= 'permissive'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000023800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00001E0000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000490000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000050L});

}