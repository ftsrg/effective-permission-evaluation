package org.mondo.collaboration.policy.delegation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mondo.collaboration.policy.delegation.services.DelegationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDelegationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'obfuscate'", "'deny'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'policy'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'delegated'", "'from'", "'to'", "'query'", "'select'", "','", "'import'", "'user'", "'group'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'"
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

    	public void setGrammarAccess(DelegationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDelegationModel"
    // InternalDelegation.g:53:1: entryRuleDelegationModel : ruleDelegationModel EOF ;
    public final void entryRuleDelegationModel() throws RecognitionException {
        try {
            // InternalDelegation.g:54:1: ( ruleDelegationModel EOF )
            // InternalDelegation.g:55:1: ruleDelegationModel EOF
            {
             before(grammarAccess.getDelegationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDelegationModel();

            state._fsp--;

             after(grammarAccess.getDelegationModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelegationModel"


    // $ANTLR start "ruleDelegationModel"
    // InternalDelegation.g:62:1: ruleDelegationModel : ( ( rule__DelegationModel__Group__0 ) ) ;
    public final void ruleDelegationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:66:2: ( ( ( rule__DelegationModel__Group__0 ) ) )
            // InternalDelegation.g:67:2: ( ( rule__DelegationModel__Group__0 ) )
            {
            // InternalDelegation.g:67:2: ( ( rule__DelegationModel__Group__0 ) )
            // InternalDelegation.g:68:3: ( rule__DelegationModel__Group__0 )
            {
             before(grammarAccess.getDelegationModelAccess().getGroup()); 
            // InternalDelegation.g:69:3: ( rule__DelegationModel__Group__0 )
            // InternalDelegation.g:69:4: rule__DelegationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegationModel"


    // $ANTLR start "entryRulePolicy"
    // InternalDelegation.g:78:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalDelegation.g:79:1: ( rulePolicy EOF )
            // InternalDelegation.g:80:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalDelegation.g:87:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:91:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalDelegation.g:92:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalDelegation.g:92:2: ( ( rule__Policy__Group__0 ) )
            // InternalDelegation.g:93:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalDelegation.g:94:3: ( rule__Policy__Group__0 )
            // InternalDelegation.g:94:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // InternalDelegation.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDelegation.g:104:1: ( ruleRule EOF )
            // InternalDelegation.g:105:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDelegation.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDelegation.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDelegation.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalDelegation.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDelegation.g:119:3: ( rule__Rule__Group__0 )
            // InternalDelegation.g:119:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleImport"
    // InternalDelegation.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDelegation.g:129:1: ( ruleImport EOF )
            // InternalDelegation.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDelegation.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDelegation.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDelegation.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalDelegation.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDelegation.g:144:3: ( rule__Import__Group__0 )
            // InternalDelegation.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRole"
    // InternalDelegation.g:153:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalDelegation.g:154:1: ( ruleRole EOF )
            // InternalDelegation.g:155:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDelegation.g:162:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:166:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalDelegation.g:167:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalDelegation.g:167:2: ( ( rule__Role__Alternatives ) )
            // InternalDelegation.g:168:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalDelegation.g:169:3: ( rule__Role__Alternatives )
            // InternalDelegation.g:169:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // InternalDelegation.g:178:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalDelegation.g:179:1: ( ruleUser EOF )
            // InternalDelegation.g:180:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalDelegation.g:187:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:191:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalDelegation.g:192:2: ( ( rule__User__Group__0 ) )
            {
            // InternalDelegation.g:192:2: ( ( rule__User__Group__0 ) )
            // InternalDelegation.g:193:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalDelegation.g:194:3: ( rule__User__Group__0 )
            // InternalDelegation.g:194:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // InternalDelegation.g:203:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalDelegation.g:204:1: ( ruleGroup EOF )
            // InternalDelegation.g:205:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalDelegation.g:212:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:216:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalDelegation.g:217:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalDelegation.g:217:2: ( ( rule__Group__Group__0 ) )
            // InternalDelegation.g:218:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalDelegation.g:219:3: ( rule__Group__Group__0 )
            // InternalDelegation.g:219:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleModelFact"
    // InternalDelegation.g:228:1: entryRuleModelFact : ruleModelFact EOF ;
    public final void entryRuleModelFact() throws RecognitionException {
        try {
            // InternalDelegation.g:229:1: ( ruleModelFact EOF )
            // InternalDelegation.g:230:1: ruleModelFact EOF
            {
             before(grammarAccess.getModelFactRule()); 
            pushFollow(FOLLOW_1);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getModelFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelFact"


    // $ANTLR start "ruleModelFact"
    // InternalDelegation.g:237:1: ruleModelFact : ( ( rule__ModelFact__Alternatives ) ) ;
    public final void ruleModelFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:241:2: ( ( ( rule__ModelFact__Alternatives ) ) )
            // InternalDelegation.g:242:2: ( ( rule__ModelFact__Alternatives ) )
            {
            // InternalDelegation.g:242:2: ( ( rule__ModelFact__Alternatives ) )
            // InternalDelegation.g:243:3: ( rule__ModelFact__Alternatives )
            {
             before(grammarAccess.getModelFactAccess().getAlternatives()); 
            // InternalDelegation.g:244:3: ( rule__ModelFact__Alternatives )
            // InternalDelegation.g:244:4: rule__ModelFact__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelFact__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelFactAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelFact"


    // $ANTLR start "entryRuleObjectFact"
    // InternalDelegation.g:253:1: entryRuleObjectFact : ruleObjectFact EOF ;
    public final void entryRuleObjectFact() throws RecognitionException {
        try {
            // InternalDelegation.g:254:1: ( ruleObjectFact EOF )
            // InternalDelegation.g:255:1: ruleObjectFact EOF
            {
             before(grammarAccess.getObjectFactRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectFact();

            state._fsp--;

             after(grammarAccess.getObjectFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectFact"


    // $ANTLR start "ruleObjectFact"
    // InternalDelegation.g:262:1: ruleObjectFact : ( ( rule__ObjectFact__Group__0 ) ) ;
    public final void ruleObjectFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:266:2: ( ( ( rule__ObjectFact__Group__0 ) ) )
            // InternalDelegation.g:267:2: ( ( rule__ObjectFact__Group__0 ) )
            {
            // InternalDelegation.g:267:2: ( ( rule__ObjectFact__Group__0 ) )
            // InternalDelegation.g:268:3: ( rule__ObjectFact__Group__0 )
            {
             before(grammarAccess.getObjectFactAccess().getGroup()); 
            // InternalDelegation.g:269:3: ( rule__ObjectFact__Group__0 )
            // InternalDelegation.g:269:4: rule__ObjectFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectFact"


    // $ANTLR start "entryRuleReferenceFact"
    // InternalDelegation.g:278:1: entryRuleReferenceFact : ruleReferenceFact EOF ;
    public final void entryRuleReferenceFact() throws RecognitionException {
        try {
            // InternalDelegation.g:279:1: ( ruleReferenceFact EOF )
            // InternalDelegation.g:280:1: ruleReferenceFact EOF
            {
             before(grammarAccess.getReferenceFactRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceFact();

            state._fsp--;

             after(grammarAccess.getReferenceFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceFact"


    // $ANTLR start "ruleReferenceFact"
    // InternalDelegation.g:287:1: ruleReferenceFact : ( ( rule__ReferenceFact__Group__0 ) ) ;
    public final void ruleReferenceFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:291:2: ( ( ( rule__ReferenceFact__Group__0 ) ) )
            // InternalDelegation.g:292:2: ( ( rule__ReferenceFact__Group__0 ) )
            {
            // InternalDelegation.g:292:2: ( ( rule__ReferenceFact__Group__0 ) )
            // InternalDelegation.g:293:3: ( rule__ReferenceFact__Group__0 )
            {
             before(grammarAccess.getReferenceFactAccess().getGroup()); 
            // InternalDelegation.g:294:3: ( rule__ReferenceFact__Group__0 )
            // InternalDelegation.g:294:4: rule__ReferenceFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceFact"


    // $ANTLR start "entryRuleAttributeFact"
    // InternalDelegation.g:303:1: entryRuleAttributeFact : ruleAttributeFact EOF ;
    public final void entryRuleAttributeFact() throws RecognitionException {
        try {
            // InternalDelegation.g:304:1: ( ruleAttributeFact EOF )
            // InternalDelegation.g:305:1: ruleAttributeFact EOF
            {
             before(grammarAccess.getAttributeFactRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeFact();

            state._fsp--;

             after(grammarAccess.getAttributeFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeFact"


    // $ANTLR start "ruleAttributeFact"
    // InternalDelegation.g:312:1: ruleAttributeFact : ( ( rule__AttributeFact__Group__0 ) ) ;
    public final void ruleAttributeFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:316:2: ( ( ( rule__AttributeFact__Group__0 ) ) )
            // InternalDelegation.g:317:2: ( ( rule__AttributeFact__Group__0 ) )
            {
            // InternalDelegation.g:317:2: ( ( rule__AttributeFact__Group__0 ) )
            // InternalDelegation.g:318:3: ( rule__AttributeFact__Group__0 )
            {
             before(grammarAccess.getAttributeFactAccess().getGroup()); 
            // InternalDelegation.g:319:3: ( rule__AttributeFact__Group__0 )
            // InternalDelegation.g:319:4: rule__AttributeFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeFact"


    // $ANTLR start "entryRuleBinding"
    // InternalDelegation.g:328:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalDelegation.g:329:1: ( ruleBinding EOF )
            // InternalDelegation.g:330:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalDelegation.g:337:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:341:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalDelegation.g:342:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalDelegation.g:342:2: ( ( rule__Binding__Group__0 ) )
            // InternalDelegation.g:343:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalDelegation.g:344:3: ( rule__Binding__Group__0 )
            // InternalDelegation.g:344:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBind"
    // InternalDelegation.g:353:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalDelegation.g:354:1: ( ruleBind EOF )
            // InternalDelegation.g:355:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalDelegation.g:362:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:366:2: ( ( ( rule__Bind__Alternatives ) ) )
            // InternalDelegation.g:367:2: ( ( rule__Bind__Alternatives ) )
            {
            // InternalDelegation.g:367:2: ( ( rule__Bind__Alternatives ) )
            // InternalDelegation.g:368:3: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // InternalDelegation.g:369:3: ( rule__Bind__Alternatives )
            // InternalDelegation.g:369:4: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalDelegation.g:378:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:382:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalDelegation.g:383:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalDelegation.g:383:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalDelegation.g:384:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalDelegation.g:385:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalDelegation.g:385:4: rule__AccessibilityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessibilityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalDelegation.g:394:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:398:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalDelegation.g:399:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalDelegation.g:399:2: ( ( rule__OperationType__Alternatives ) )
            // InternalDelegation.g:400:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalDelegation.g:401:3: ( rule__OperationType__Alternatives )
            // InternalDelegation.g:401:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleResolutionType"
    // InternalDelegation.g:410:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:414:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalDelegation.g:415:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalDelegation.g:415:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalDelegation.g:416:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalDelegation.g:417:3: ( rule__ResolutionType__Alternatives )
            // InternalDelegation.g:417:4: rule__ResolutionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResolutionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResolutionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResolutionType"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalDelegation.g:425:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:429:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDelegation.g:430:2: ( ruleUser )
                    {
                    // InternalDelegation.g:430:2: ( ruleUser )
                    // InternalDelegation.g:431:3: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:436:2: ( ruleGroup )
                    {
                    // InternalDelegation.g:436:2: ( ruleGroup )
                    // InternalDelegation.g:437:3: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__ModelFact__Alternatives"
    // InternalDelegation.g:446:1: rule__ModelFact__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) );
    public final void rule__ModelFact__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:450:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDelegation.g:451:2: ( ruleObjectFact )
                    {
                    // InternalDelegation.g:451:2: ( ruleObjectFact )
                    // InternalDelegation.g:452:3: ruleObjectFact
                    {
                     before(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:457:2: ( ruleReferenceFact )
                    {
                    // InternalDelegation.g:457:2: ( ruleReferenceFact )
                    // InternalDelegation.g:458:3: ruleReferenceFact
                    {
                     before(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:463:2: ( ruleAttributeFact )
                    {
                    // InternalDelegation.g:463:2: ( ruleAttributeFact )
                    // InternalDelegation.g:464:3: ruleAttributeFact
                    {
                     before(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFact__Alternatives"


    // $ANTLR start "rule__Bind__Alternatives"
    // InternalDelegation.g:473:1: rule__Bind__Alternatives : ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:477:1: ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDelegation.g:478:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    {
                    // InternalDelegation.g:478:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    // InternalDelegation.g:479:3: ( rule__Bind__ValueStringAssignment_0 )
                    {
                     before(grammarAccess.getBindAccess().getValueStringAssignment_0()); 
                    // InternalDelegation.g:480:3: ( rule__Bind__ValueStringAssignment_0 )
                    // InternalDelegation.g:480:4: rule__Bind__ValueStringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueStringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:484:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    {
                    // InternalDelegation.g:484:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    // InternalDelegation.g:485:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    {
                     before(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 
                    // InternalDelegation.g:486:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    // InternalDelegation.g:486:4: rule__Bind__ValueIntegerAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueIntegerAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Alternatives"


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalDelegation.g:494:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'obfuscate' ) ) | ( ( 'deny' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:498:1: ( ( ( 'allow' ) ) | ( ( 'obfuscate' ) ) | ( ( 'deny' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDelegation.g:499:2: ( ( 'allow' ) )
                    {
                    // InternalDelegation.g:499:2: ( ( 'allow' ) )
                    // InternalDelegation.g:500:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalDelegation.g:501:3: ( 'allow' )
                    // InternalDelegation.g:501:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:505:2: ( ( 'obfuscate' ) )
                    {
                    // InternalDelegation.g:505:2: ( ( 'obfuscate' ) )
                    // InternalDelegation.g:506:3: ( 'obfuscate' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 
                    // InternalDelegation.g:507:3: ( 'obfuscate' )
                    // InternalDelegation.g:507:4: 'obfuscate'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:511:2: ( ( 'deny' ) )
                    {
                    // InternalDelegation.g:511:2: ( ( 'deny' ) )
                    // InternalDelegation.g:512:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2()); 
                    // InternalDelegation.g:513:3: ( 'deny' )
                    // InternalDelegation.g:513:4: 'deny'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessibilityLevel__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalDelegation.g:521:1: rule__OperationType__Alternatives : ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:525:1: ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDelegation.g:526:2: ( ( 'unset' ) )
                    {
                    // InternalDelegation.g:526:2: ( ( 'unset' ) )
                    // InternalDelegation.g:527:3: ( 'unset' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 
                    // InternalDelegation.g:528:3: ( 'unset' )
                    // InternalDelegation.g:528:4: 'unset'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:532:2: ( ( 'R' ) )
                    {
                    // InternalDelegation.g:532:2: ( ( 'R' ) )
                    // InternalDelegation.g:533:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 
                    // InternalDelegation.g:534:3: ( 'R' )
                    // InternalDelegation.g:534:4: 'R'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDelegation.g:538:2: ( ( 'W' ) )
                    {
                    // InternalDelegation.g:538:2: ( ( 'W' ) )
                    // InternalDelegation.g:539:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 
                    // InternalDelegation.g:540:3: ( 'W' )
                    // InternalDelegation.g:540:4: 'W'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDelegation.g:544:2: ( ( 'RW' ) )
                    {
                    // InternalDelegation.g:544:2: ( ( 'RW' ) )
                    // InternalDelegation.g:545:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 
                    // InternalDelegation.g:546:3: ( 'RW' )
                    // InternalDelegation.g:546:4: 'RW'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__ResolutionType__Alternatives"
    // InternalDelegation.g:554:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:558:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDelegation.g:559:2: ( ( 'restrictive' ) )
                    {
                    // InternalDelegation.g:559:2: ( ( 'restrictive' ) )
                    // InternalDelegation.g:560:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalDelegation.g:561:3: ( 'restrictive' )
                    // InternalDelegation.g:561:4: 'restrictive'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDelegation.g:565:2: ( ( 'permissive' ) )
                    {
                    // InternalDelegation.g:565:2: ( ( 'permissive' ) )
                    // InternalDelegation.g:566:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalDelegation.g:567:3: ( 'permissive' )
                    // InternalDelegation.g:567:4: 'permissive'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResolutionType__Alternatives"


    // $ANTLR start "rule__DelegationModel__Group__0"
    // InternalDelegation.g:575:1: rule__DelegationModel__Group__0 : rule__DelegationModel__Group__0__Impl rule__DelegationModel__Group__1 ;
    public final void rule__DelegationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:579:1: ( rule__DelegationModel__Group__0__Impl rule__DelegationModel__Group__1 )
            // InternalDelegation.g:580:2: rule__DelegationModel__Group__0__Impl rule__DelegationModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DelegationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__0"


    // $ANTLR start "rule__DelegationModel__Group__0__Impl"
    // InternalDelegation.g:587:1: rule__DelegationModel__Group__0__Impl : ( ( rule__DelegationModel__ImportAssignment_0 ) ) ;
    public final void rule__DelegationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:591:1: ( ( ( rule__DelegationModel__ImportAssignment_0 ) ) )
            // InternalDelegation.g:592:1: ( ( rule__DelegationModel__ImportAssignment_0 ) )
            {
            // InternalDelegation.g:592:1: ( ( rule__DelegationModel__ImportAssignment_0 ) )
            // InternalDelegation.g:593:2: ( rule__DelegationModel__ImportAssignment_0 )
            {
             before(grammarAccess.getDelegationModelAccess().getImportAssignment_0()); 
            // InternalDelegation.g:594:2: ( rule__DelegationModel__ImportAssignment_0 )
            // InternalDelegation.g:594:3: rule__DelegationModel__ImportAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__ImportAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationModelAccess().getImportAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__0__Impl"


    // $ANTLR start "rule__DelegationModel__Group__1"
    // InternalDelegation.g:602:1: rule__DelegationModel__Group__1 : rule__DelegationModel__Group__1__Impl ;
    public final void rule__DelegationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:606:1: ( rule__DelegationModel__Group__1__Impl )
            // InternalDelegation.g:607:2: rule__DelegationModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__1"


    // $ANTLR start "rule__DelegationModel__Group__1__Impl"
    // InternalDelegation.g:613:1: rule__DelegationModel__Group__1__Impl : ( ( rule__DelegationModel__PolicyAssignment_1 ) ) ;
    public final void rule__DelegationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:617:1: ( ( ( rule__DelegationModel__PolicyAssignment_1 ) ) )
            // InternalDelegation.g:618:1: ( ( rule__DelegationModel__PolicyAssignment_1 ) )
            {
            // InternalDelegation.g:618:1: ( ( rule__DelegationModel__PolicyAssignment_1 ) )
            // InternalDelegation.g:619:2: ( rule__DelegationModel__PolicyAssignment_1 )
            {
             before(grammarAccess.getDelegationModelAccess().getPolicyAssignment_1()); 
            // InternalDelegation.g:620:2: ( rule__DelegationModel__PolicyAssignment_1 )
            // InternalDelegation.g:620:3: rule__DelegationModel__PolicyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DelegationModel__PolicyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationModelAccess().getPolicyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalDelegation.g:629:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:633:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalDelegation.g:634:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalDelegation.g:641:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:645:1: ( ( 'policy' ) )
            // InternalDelegation.g:646:1: ( 'policy' )
            {
            // InternalDelegation.g:646:1: ( 'policy' )
            // InternalDelegation.g:647:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalDelegation.g:656:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:660:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalDelegation.g:661:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalDelegation.g:668:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:672:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalDelegation.g:673:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalDelegation.g:673:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalDelegation.g:674:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalDelegation.g:675:2: ( rule__Policy__NameAssignment_1 )
            // InternalDelegation.g:675:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalDelegation.g:683:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:687:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalDelegation.g:688:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalDelegation.g:695:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:699:1: ( ( '{' ) )
            // InternalDelegation.g:700:1: ( '{' )
            {
            // InternalDelegation.g:700:1: ( '{' )
            // InternalDelegation.g:701:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalDelegation.g:710:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:714:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalDelegation.g:715:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalDelegation.g:722:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__RulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:726:1: ( ( ( rule__Policy__RulesAssignment_3 )* ) )
            // InternalDelegation.g:727:1: ( ( rule__Policy__RulesAssignment_3 )* )
            {
            // InternalDelegation.g:727:1: ( ( rule__Policy__RulesAssignment_3 )* )
            // InternalDelegation.g:728:2: ( rule__Policy__RulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_3()); 
            // InternalDelegation.g:729:2: ( rule__Policy__RulesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDelegation.g:729:3: rule__Policy__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Policy__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalDelegation.g:737:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:741:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalDelegation.g:742:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalDelegation.g:749:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:753:1: ( ( '}' ) )
            // InternalDelegation.g:754:1: ( '}' )
            {
            // InternalDelegation.g:754:1: ( '}' )
            // InternalDelegation.g:755:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // InternalDelegation.g:764:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:768:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalDelegation.g:769:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // InternalDelegation.g:776:1: rule__Policy__Group__5__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:780:1: ( ( 'with' ) )
            // InternalDelegation.g:781:1: ( 'with' )
            {
            // InternalDelegation.g:781:1: ( 'with' )
            // InternalDelegation.g:782:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWithKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // InternalDelegation.g:791:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:795:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalDelegation.g:796:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // InternalDelegation.g:803:1: rule__Policy__Group__6__Impl : ( ( rule__Policy__ResolutionAssignment_6 ) ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:807:1: ( ( ( rule__Policy__ResolutionAssignment_6 ) ) )
            // InternalDelegation.g:808:1: ( ( rule__Policy__ResolutionAssignment_6 ) )
            {
            // InternalDelegation.g:808:1: ( ( rule__Policy__ResolutionAssignment_6 ) )
            // InternalDelegation.g:809:2: ( rule__Policy__ResolutionAssignment_6 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_6()); 
            // InternalDelegation.g:810:2: ( rule__Policy__ResolutionAssignment_6 )
            // InternalDelegation.g:810:3: rule__Policy__ResolutionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ResolutionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getResolutionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Policy__Group__7"
    // InternalDelegation.g:818:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:822:1: ( rule__Policy__Group__7__Impl )
            // InternalDelegation.g:823:2: rule__Policy__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7"


    // $ANTLR start "rule__Policy__Group__7__Impl"
    // InternalDelegation.g:829:1: rule__Policy__Group__7__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:833:1: ( ( 'resolution' ) )
            // InternalDelegation.g:834:1: ( 'resolution' )
            {
            // InternalDelegation.g:834:1: ( 'resolution' )
            // InternalDelegation.g:835:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getResolutionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDelegation.g:845:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:849:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDelegation.g:850:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDelegation.g:857:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:861:1: ( ( 'rule' ) )
            // InternalDelegation.g:862:1: ( 'rule' )
            {
            // InternalDelegation.g:862:1: ( 'rule' )
            // InternalDelegation.g:863:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDelegation.g:872:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:876:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDelegation.g:877:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDelegation.g:884:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:888:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalDelegation.g:889:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalDelegation.g:889:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalDelegation.g:890:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalDelegation.g:891:2: ( rule__Rule__NameAssignment_1 )
            // InternalDelegation.g:891:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDelegation.g:899:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:903:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDelegation.g:904:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDelegation.g:911:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AccessAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:915:1: ( ( ( rule__Rule__AccessAssignment_2 ) ) )
            // InternalDelegation.g:916:1: ( ( rule__Rule__AccessAssignment_2 ) )
            {
            // InternalDelegation.g:916:1: ( ( rule__Rule__AccessAssignment_2 ) )
            // InternalDelegation.g:917:2: ( rule__Rule__AccessAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAccessAssignment_2()); 
            // InternalDelegation.g:918:2: ( rule__Rule__AccessAssignment_2 )
            // InternalDelegation.g:918:3: rule__Rule__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAccessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalDelegation.g:926:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:930:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDelegation.g:931:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalDelegation.g:938:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperationAssignment_3 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:942:1: ( ( ( rule__Rule__OperationAssignment_3 )? ) )
            // InternalDelegation.g:943:1: ( ( rule__Rule__OperationAssignment_3 )? )
            {
            // InternalDelegation.g:943:1: ( ( rule__Rule__OperationAssignment_3 )? )
            // InternalDelegation.g:944:2: ( rule__Rule__OperationAssignment_3 )?
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_3()); 
            // InternalDelegation.g:945:2: ( rule__Rule__OperationAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDelegation.g:945:3: rule__Rule__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__OperationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getOperationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalDelegation.g:953:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:957:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalDelegation.g:958:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalDelegation.g:965:1: rule__Rule__Group__4__Impl : ( 'delegated' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:969:1: ( ( 'delegated' ) )
            // InternalDelegation.g:970:1: ( 'delegated' )
            {
            // InternalDelegation.g:970:1: ( 'delegated' )
            // InternalDelegation.g:971:2: 'delegated'
            {
             before(grammarAccess.getRuleAccess().getDelegatedKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getDelegatedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalDelegation.g:980:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:984:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalDelegation.g:985:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalDelegation.g:992:1: rule__Rule__Group__5__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:996:1: ( ( 'from' ) )
            // InternalDelegation.g:997:1: ( 'from' )
            {
            // InternalDelegation.g:997:1: ( 'from' )
            // InternalDelegation.g:998:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalDelegation.g:1007:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1011:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalDelegation.g:1012:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalDelegation.g:1019:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__SourceAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1023:1: ( ( ( rule__Rule__SourceAssignment_6 ) ) )
            // InternalDelegation.g:1024:1: ( ( rule__Rule__SourceAssignment_6 ) )
            {
            // InternalDelegation.g:1024:1: ( ( rule__Rule__SourceAssignment_6 ) )
            // InternalDelegation.g:1025:2: ( rule__Rule__SourceAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getSourceAssignment_6()); 
            // InternalDelegation.g:1026:2: ( rule__Rule__SourceAssignment_6 )
            // InternalDelegation.g:1026:3: rule__Rule__SourceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalDelegation.g:1034:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1038:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalDelegation.g:1039:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalDelegation.g:1046:1: rule__Rule__Group__7__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1050:1: ( ( 'to' ) )
            // InternalDelegation.g:1051:1: ( 'to' )
            {
            // InternalDelegation.g:1051:1: ( 'to' )
            // InternalDelegation.g:1052:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalDelegation.g:1061:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1065:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalDelegation.g:1066:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalDelegation.g:1073:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__TargetsAssignment_8 ) ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1077:1: ( ( ( rule__Rule__TargetsAssignment_8 ) ) )
            // InternalDelegation.g:1078:1: ( ( rule__Rule__TargetsAssignment_8 ) )
            {
            // InternalDelegation.g:1078:1: ( ( rule__Rule__TargetsAssignment_8 ) )
            // InternalDelegation.g:1079:2: ( rule__Rule__TargetsAssignment_8 )
            {
             before(grammarAccess.getRuleAccess().getTargetsAssignment_8()); 
            // InternalDelegation.g:1080:2: ( rule__Rule__TargetsAssignment_8 )
            // InternalDelegation.g:1080:3: rule__Rule__TargetsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalDelegation.g:1088:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1092:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalDelegation.g:1093:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalDelegation.g:1100:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__Group_9__0 )* ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1104:1: ( ( ( rule__Rule__Group_9__0 )* ) )
            // InternalDelegation.g:1105:1: ( ( rule__Rule__Group_9__0 )* )
            {
            // InternalDelegation.g:1105:1: ( ( rule__Rule__Group_9__0 )* )
            // InternalDelegation.g:1106:2: ( rule__Rule__Group_9__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_9()); 
            // InternalDelegation.g:1107:2: ( rule__Rule__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDelegation.g:1107:3: rule__Rule__Group_9__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Rule__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalDelegation.g:1115:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1119:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalDelegation.g:1120:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalDelegation.g:1127:1: rule__Rule__Group__10__Impl : ( '{' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1131:1: ( ( '{' ) )
            // InternalDelegation.g:1132:1: ( '{' )
            {
            // InternalDelegation.g:1132:1: ( '{' )
            // InternalDelegation.g:1133:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__11"
    // InternalDelegation.g:1142:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1146:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalDelegation.g:1147:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__11"


    // $ANTLR start "rule__Rule__Group__11__Impl"
    // InternalDelegation.g:1154:1: rule__Rule__Group__11__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1158:1: ( ( 'from' ) )
            // InternalDelegation.g:1159:1: ( 'from' )
            {
            // InternalDelegation.g:1159:1: ( 'from' )
            // InternalDelegation.g:1160:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__12"
    // InternalDelegation.g:1169:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1173:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalDelegation.g:1174:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__12"


    // $ANTLR start "rule__Rule__Group__12__Impl"
    // InternalDelegation.g:1181:1: rule__Rule__Group__12__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1185:1: ( ( 'query' ) )
            // InternalDelegation.g:1186:1: ( 'query' )
            {
            // InternalDelegation.g:1186:1: ( 'query' )
            // InternalDelegation.g:1187:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_12()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__12__Impl"


    // $ANTLR start "rule__Rule__Group__13"
    // InternalDelegation.g:1196:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1200:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalDelegation.g:1201:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__13"


    // $ANTLR start "rule__Rule__Group__13__Impl"
    // InternalDelegation.g:1208:1: rule__Rule__Group__13__Impl : ( ( rule__Rule__PatternAssignment_13 ) ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1212:1: ( ( ( rule__Rule__PatternAssignment_13 ) ) )
            // InternalDelegation.g:1213:1: ( ( rule__Rule__PatternAssignment_13 ) )
            {
            // InternalDelegation.g:1213:1: ( ( rule__Rule__PatternAssignment_13 ) )
            // InternalDelegation.g:1214:2: ( rule__Rule__PatternAssignment_13 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_13()); 
            // InternalDelegation.g:1215:2: ( rule__Rule__PatternAssignment_13 )
            // InternalDelegation.g:1215:3: rule__Rule__PatternAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PatternAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__13__Impl"


    // $ANTLR start "rule__Rule__Group__14"
    // InternalDelegation.g:1223:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl rule__Rule__Group__15 ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1227:1: ( rule__Rule__Group__14__Impl rule__Rule__Group__15 )
            // InternalDelegation.g:1228:2: rule__Rule__Group__14__Impl rule__Rule__Group__15
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__14"


    // $ANTLR start "rule__Rule__Group__14__Impl"
    // InternalDelegation.g:1235:1: rule__Rule__Group__14__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1239:1: ( ( 'select' ) )
            // InternalDelegation.g:1240:1: ( 'select' )
            {
            // InternalDelegation.g:1240:1: ( 'select' )
            // InternalDelegation.g:1241:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_14()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__14__Impl"


    // $ANTLR start "rule__Rule__Group__15"
    // InternalDelegation.g:1250:1: rule__Rule__Group__15 : rule__Rule__Group__15__Impl rule__Rule__Group__16 ;
    public final void rule__Rule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1254:1: ( rule__Rule__Group__15__Impl rule__Rule__Group__16 )
            // InternalDelegation.g:1255:2: rule__Rule__Group__15__Impl rule__Rule__Group__16
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__15"


    // $ANTLR start "rule__Rule__Group__15__Impl"
    // InternalDelegation.g:1262:1: rule__Rule__Group__15__Impl : ( ( rule__Rule__AssetAssignment_15 ) ) ;
    public final void rule__Rule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1266:1: ( ( ( rule__Rule__AssetAssignment_15 ) ) )
            // InternalDelegation.g:1267:1: ( ( rule__Rule__AssetAssignment_15 ) )
            {
            // InternalDelegation.g:1267:1: ( ( rule__Rule__AssetAssignment_15 ) )
            // InternalDelegation.g:1268:2: ( rule__Rule__AssetAssignment_15 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_15()); 
            // InternalDelegation.g:1269:2: ( rule__Rule__AssetAssignment_15 )
            // InternalDelegation.g:1269:3: rule__Rule__AssetAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__15__Impl"


    // $ANTLR start "rule__Rule__Group__16"
    // InternalDelegation.g:1277:1: rule__Rule__Group__16 : rule__Rule__Group__16__Impl rule__Rule__Group__17 ;
    public final void rule__Rule__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1281:1: ( rule__Rule__Group__16__Impl rule__Rule__Group__17 )
            // InternalDelegation.g:1282:2: rule__Rule__Group__16__Impl rule__Rule__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__16"


    // $ANTLR start "rule__Rule__Group__16__Impl"
    // InternalDelegation.g:1289:1: rule__Rule__Group__16__Impl : ( ( rule__Rule__BindingsAssignment_16 )* ) ;
    public final void rule__Rule__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1293:1: ( ( ( rule__Rule__BindingsAssignment_16 )* ) )
            // InternalDelegation.g:1294:1: ( ( rule__Rule__BindingsAssignment_16 )* )
            {
            // InternalDelegation.g:1294:1: ( ( rule__Rule__BindingsAssignment_16 )* )
            // InternalDelegation.g:1295:2: ( rule__Rule__BindingsAssignment_16 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_16()); 
            // InternalDelegation.g:1296:2: ( rule__Rule__BindingsAssignment_16 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDelegation.g:1296:3: rule__Rule__BindingsAssignment_16
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__BindingsAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__16__Impl"


    // $ANTLR start "rule__Rule__Group__17"
    // InternalDelegation.g:1304:1: rule__Rule__Group__17 : rule__Rule__Group__17__Impl ;
    public final void rule__Rule__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1308:1: ( rule__Rule__Group__17__Impl )
            // InternalDelegation.g:1309:2: rule__Rule__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__17"


    // $ANTLR start "rule__Rule__Group__17__Impl"
    // InternalDelegation.g:1315:1: rule__Rule__Group__17__Impl : ( '}' ) ;
    public final void rule__Rule__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1319:1: ( ( '}' ) )
            // InternalDelegation.g:1320:1: ( '}' )
            {
            // InternalDelegation.g:1320:1: ( '}' )
            // InternalDelegation.g:1321:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_17()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__17__Impl"


    // $ANTLR start "rule__Rule__Group_9__0"
    // InternalDelegation.g:1331:1: rule__Rule__Group_9__0 : rule__Rule__Group_9__0__Impl rule__Rule__Group_9__1 ;
    public final void rule__Rule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1335:1: ( rule__Rule__Group_9__0__Impl rule__Rule__Group_9__1 )
            // InternalDelegation.g:1336:2: rule__Rule__Group_9__0__Impl rule__Rule__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_9__0"


    // $ANTLR start "rule__Rule__Group_9__0__Impl"
    // InternalDelegation.g:1343:1: rule__Rule__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1347:1: ( ( ',' ) )
            // InternalDelegation.g:1348:1: ( ',' )
            {
            // InternalDelegation.g:1348:1: ( ',' )
            // InternalDelegation.g:1349:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_9__0__Impl"


    // $ANTLR start "rule__Rule__Group_9__1"
    // InternalDelegation.g:1358:1: rule__Rule__Group_9__1 : rule__Rule__Group_9__1__Impl ;
    public final void rule__Rule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1362:1: ( rule__Rule__Group_9__1__Impl )
            // InternalDelegation.g:1363:2: rule__Rule__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_9__1"


    // $ANTLR start "rule__Rule__Group_9__1__Impl"
    // InternalDelegation.g:1369:1: rule__Rule__Group_9__1__Impl : ( ( rule__Rule__TargetsAssignment_9_1 ) ) ;
    public final void rule__Rule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1373:1: ( ( ( rule__Rule__TargetsAssignment_9_1 ) ) )
            // InternalDelegation.g:1374:1: ( ( rule__Rule__TargetsAssignment_9_1 ) )
            {
            // InternalDelegation.g:1374:1: ( ( rule__Rule__TargetsAssignment_9_1 ) )
            // InternalDelegation.g:1375:2: ( rule__Rule__TargetsAssignment_9_1 )
            {
             before(grammarAccess.getRuleAccess().getTargetsAssignment_9_1()); 
            // InternalDelegation.g:1376:2: ( rule__Rule__TargetsAssignment_9_1 )
            // InternalDelegation.g:1376:3: rule__Rule__TargetsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_9__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDelegation.g:1385:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1389:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDelegation.g:1390:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDelegation.g:1397:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1401:1: ( ( 'import' ) )
            // InternalDelegation.g:1402:1: ( 'import' )
            {
            // InternalDelegation.g:1402:1: ( 'import' )
            // InternalDelegation.g:1403:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDelegation.g:1412:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1416:1: ( rule__Import__Group__1__Impl )
            // InternalDelegation.g:1417:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDelegation.g:1423:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1427:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalDelegation.g:1428:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalDelegation.g:1428:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalDelegation.g:1429:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalDelegation.g:1430:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalDelegation.g:1430:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalDelegation.g:1439:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1443:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalDelegation.g:1444:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalDelegation.g:1451:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1455:1: ( ( 'user' ) )
            // InternalDelegation.g:1456:1: ( 'user' )
            {
            // InternalDelegation.g:1456:1: ( 'user' )
            // InternalDelegation.g:1457:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalDelegation.g:1466:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1470:1: ( rule__User__Group__1__Impl )
            // InternalDelegation.g:1471:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalDelegation.g:1477:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1481:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalDelegation.g:1482:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalDelegation.g:1482:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalDelegation.g:1483:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalDelegation.g:1484:2: ( rule__User__NameAssignment_1 )
            // InternalDelegation.g:1484:3: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalDelegation.g:1493:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1497:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalDelegation.g:1498:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalDelegation.g:1505:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1509:1: ( ( 'group' ) )
            // InternalDelegation.g:1510:1: ( 'group' )
            {
            // InternalDelegation.g:1510:1: ( 'group' )
            // InternalDelegation.g:1511:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalDelegation.g:1520:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1524:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalDelegation.g:1525:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalDelegation.g:1532:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1536:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalDelegation.g:1537:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalDelegation.g:1537:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalDelegation.g:1538:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalDelegation.g:1539:2: ( rule__Group__NameAssignment_1 )
            // InternalDelegation.g:1539:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalDelegation.g:1547:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1551:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalDelegation.g:1552:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalDelegation.g:1559:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1563:1: ( ( '{' ) )
            // InternalDelegation.g:1564:1: ( '{' )
            {
            // InternalDelegation.g:1564:1: ( '{' )
            // InternalDelegation.g:1565:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalDelegation.g:1574:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1578:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalDelegation.g:1579:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalDelegation.g:1586:1: rule__Group__Group__3__Impl : ( ( rule__Group__RolesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1590:1: ( ( ( rule__Group__RolesAssignment_3 ) ) )
            // InternalDelegation.g:1591:1: ( ( rule__Group__RolesAssignment_3 ) )
            {
            // InternalDelegation.g:1591:1: ( ( rule__Group__RolesAssignment_3 ) )
            // InternalDelegation.g:1592:2: ( rule__Group__RolesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_3()); 
            // InternalDelegation.g:1593:2: ( rule__Group__RolesAssignment_3 )
            // InternalDelegation.g:1593:3: rule__Group__RolesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Group__RolesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRolesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalDelegation.g:1601:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1605:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalDelegation.g:1606:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalDelegation.g:1613:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1617:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalDelegation.g:1618:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalDelegation.g:1618:1: ( ( rule__Group__Group_4__0 )* )
            // InternalDelegation.g:1619:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalDelegation.g:1620:2: ( rule__Group__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDelegation.g:1620:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalDelegation.g:1628:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1632:1: ( rule__Group__Group__5__Impl )
            // InternalDelegation.g:1633:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalDelegation.g:1639:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1643:1: ( ( '}' ) )
            // InternalDelegation.g:1644:1: ( '}' )
            {
            // InternalDelegation.g:1644:1: ( '}' )
            // InternalDelegation.g:1645:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // InternalDelegation.g:1655:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1659:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalDelegation.g:1660:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // InternalDelegation.g:1667:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1671:1: ( ( ',' ) )
            // InternalDelegation.g:1672:1: ( ',' )
            {
            // InternalDelegation.g:1672:1: ( ',' )
            // InternalDelegation.g:1673:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // InternalDelegation.g:1682:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1686:1: ( rule__Group__Group_4__1__Impl )
            // InternalDelegation.g:1687:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // InternalDelegation.g:1693:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__RolesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1697:1: ( ( ( rule__Group__RolesAssignment_4_1 ) ) )
            // InternalDelegation.g:1698:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            {
            // InternalDelegation.g:1698:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            // InternalDelegation.g:1699:2: ( rule__Group__RolesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 
            // InternalDelegation.g:1700:2: ( rule__Group__RolesAssignment_4_1 )
            // InternalDelegation.g:1700:3: rule__Group__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__0"
    // InternalDelegation.g:1709:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1713:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalDelegation.g:1714:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ObjectFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__0"


    // $ANTLR start "rule__ObjectFact__Group__0__Impl"
    // InternalDelegation.g:1721:1: rule__ObjectFact__Group__0__Impl : ( 'obj' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1725:1: ( ( 'obj' ) )
            // InternalDelegation.g:1726:1: ( 'obj' )
            {
            // InternalDelegation.g:1726:1: ( 'obj' )
            // InternalDelegation.g:1727:2: 'obj'
            {
             before(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__0__Impl"


    // $ANTLR start "rule__ObjectFact__Group__1"
    // InternalDelegation.g:1736:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1740:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalDelegation.g:1741:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ObjectFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__1"


    // $ANTLR start "rule__ObjectFact__Group__1__Impl"
    // InternalDelegation.g:1748:1: rule__ObjectFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1752:1: ( ( '(' ) )
            // InternalDelegation.g:1753:1: ( '(' )
            {
            // InternalDelegation.g:1753:1: ( '(' )
            // InternalDelegation.g:1754:2: '('
            {
             before(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__2"
    // InternalDelegation.g:1763:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1767:1: ( rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 )
            // InternalDelegation.g:1768:2: rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ObjectFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__2"


    // $ANTLR start "rule__ObjectFact__Group__2__Impl"
    // InternalDelegation.g:1775:1: rule__ObjectFact__Group__2__Impl : ( ( rule__ObjectFact__VariableAssignment_2 ) ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1779:1: ( ( ( rule__ObjectFact__VariableAssignment_2 ) ) )
            // InternalDelegation.g:1780:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            {
            // InternalDelegation.g:1780:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            // InternalDelegation.g:1781:2: ( rule__ObjectFact__VariableAssignment_2 )
            {
             before(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 
            // InternalDelegation.g:1782:2: ( rule__ObjectFact__VariableAssignment_2 )
            // InternalDelegation.g:1782:3: rule__ObjectFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__2__Impl"


    // $ANTLR start "rule__ObjectFact__Group__3"
    // InternalDelegation.g:1790:1: rule__ObjectFact__Group__3 : rule__ObjectFact__Group__3__Impl ;
    public final void rule__ObjectFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1794:1: ( rule__ObjectFact__Group__3__Impl )
            // InternalDelegation.g:1795:2: rule__ObjectFact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__3"


    // $ANTLR start "rule__ObjectFact__Group__3__Impl"
    // InternalDelegation.g:1801:1: rule__ObjectFact__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1805:1: ( ( ')' ) )
            // InternalDelegation.g:1806:1: ( ')' )
            {
            // InternalDelegation.g:1806:1: ( ')' )
            // InternalDelegation.g:1807:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__0"
    // InternalDelegation.g:1817:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1821:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalDelegation.g:1822:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ReferenceFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__0"


    // $ANTLR start "rule__ReferenceFact__Group__0__Impl"
    // InternalDelegation.g:1829:1: rule__ReferenceFact__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1833:1: ( ( 'ref' ) )
            // InternalDelegation.g:1834:1: ( 'ref' )
            {
            // InternalDelegation.g:1834:1: ( 'ref' )
            // InternalDelegation.g:1835:2: 'ref'
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__0__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__1"
    // InternalDelegation.g:1844:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1848:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalDelegation.g:1849:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__1"


    // $ANTLR start "rule__ReferenceFact__Group__1__Impl"
    // InternalDelegation.g:1856:1: rule__ReferenceFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1860:1: ( ( '(' ) )
            // InternalDelegation.g:1861:1: ( '(' )
            {
            // InternalDelegation.g:1861:1: ( '(' )
            // InternalDelegation.g:1862:2: '('
            {
             before(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__1__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__2"
    // InternalDelegation.g:1871:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1875:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalDelegation.g:1876:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ReferenceFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__2"


    // $ANTLR start "rule__ReferenceFact__Group__2__Impl"
    // InternalDelegation.g:1883:1: rule__ReferenceFact__Group__2__Impl : ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1887:1: ( ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) )
            // InternalDelegation.g:1888:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            {
            // InternalDelegation.g:1888:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            // InternalDelegation.g:1889:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 
            // InternalDelegation.g:1890:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            // InternalDelegation.g:1890:3: rule__ReferenceFact__SourceVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__SourceVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__2__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__3"
    // InternalDelegation.g:1898:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1902:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalDelegation.g:1903:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__3"


    // $ANTLR start "rule__ReferenceFact__Group__3__Impl"
    // InternalDelegation.g:1910:1: rule__ReferenceFact__Group__3__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1914:1: ( ( '->' ) )
            // InternalDelegation.g:1915:1: ( '->' )
            {
            // InternalDelegation.g:1915:1: ( '->' )
            // InternalDelegation.g:1916:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__4"
    // InternalDelegation.g:1925:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1929:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalDelegation.g:1930:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__ReferenceFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__4"


    // $ANTLR start "rule__ReferenceFact__Group__4__Impl"
    // InternalDelegation.g:1937:1: rule__ReferenceFact__Group__4__Impl : ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1941:1: ( ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) )
            // InternalDelegation.g:1942:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            {
            // InternalDelegation.g:1942:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            // InternalDelegation.g:1943:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 
            // InternalDelegation.g:1944:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            // InternalDelegation.g:1944:3: rule__ReferenceFact__TargetVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__TargetVarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__4__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__5"
    // InternalDelegation.g:1952:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1956:1: ( rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 )
            // InternalDelegation.g:1957:2: rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceFact__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__5"


    // $ANTLR start "rule__ReferenceFact__Group__5__Impl"
    // InternalDelegation.g:1964:1: rule__ReferenceFact__Group__5__Impl : ( ':' ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1968:1: ( ( ':' ) )
            // InternalDelegation.g:1969:1: ( ':' )
            {
            // InternalDelegation.g:1969:1: ( ':' )
            // InternalDelegation.g:1970:2: ':'
            {
             before(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__5__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__6"
    // InternalDelegation.g:1979:1: rule__ReferenceFact__Group__6 : rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 ;
    public final void rule__ReferenceFact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1983:1: ( rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 )
            // InternalDelegation.g:1984:2: rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ReferenceFact__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__6"


    // $ANTLR start "rule__ReferenceFact__Group__6__Impl"
    // InternalDelegation.g:1991:1: rule__ReferenceFact__Group__6__Impl : ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) ;
    public final void rule__ReferenceFact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:1995:1: ( ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) )
            // InternalDelegation.g:1996:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            {
            // InternalDelegation.g:1996:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            // InternalDelegation.g:1997:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 
            // InternalDelegation.g:1998:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            // InternalDelegation.g:1998:3: rule__ReferenceFact__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__ReferenceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__6__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__7"
    // InternalDelegation.g:2006:1: rule__ReferenceFact__Group__7 : rule__ReferenceFact__Group__7__Impl ;
    public final void rule__ReferenceFact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2010:1: ( rule__ReferenceFact__Group__7__Impl )
            // InternalDelegation.g:2011:2: rule__ReferenceFact__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__7"


    // $ANTLR start "rule__ReferenceFact__Group__7__Impl"
    // InternalDelegation.g:2017:1: rule__ReferenceFact__Group__7__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2021:1: ( ( ')' ) )
            // InternalDelegation.g:2022:1: ( ')' )
            {
            // InternalDelegation.g:2022:1: ( ')' )
            // InternalDelegation.g:2023:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__7__Impl"


    // $ANTLR start "rule__AttributeFact__Group__0"
    // InternalDelegation.g:2033:1: rule__AttributeFact__Group__0 : rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 ;
    public final void rule__AttributeFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2037:1: ( rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 )
            // InternalDelegation.g:2038:2: rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AttributeFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__0"


    // $ANTLR start "rule__AttributeFact__Group__0__Impl"
    // InternalDelegation.g:2045:1: rule__AttributeFact__Group__0__Impl : ( 'attr' ) ;
    public final void rule__AttributeFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2049:1: ( ( 'attr' ) )
            // InternalDelegation.g:2050:1: ( 'attr' )
            {
            // InternalDelegation.g:2050:1: ( 'attr' )
            // InternalDelegation.g:2051:2: 'attr'
            {
             before(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__0__Impl"


    // $ANTLR start "rule__AttributeFact__Group__1"
    // InternalDelegation.g:2060:1: rule__AttributeFact__Group__1 : rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 ;
    public final void rule__AttributeFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2064:1: ( rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 )
            // InternalDelegation.g:2065:2: rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AttributeFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__1"


    // $ANTLR start "rule__AttributeFact__Group__1__Impl"
    // InternalDelegation.g:2072:1: rule__AttributeFact__Group__1__Impl : ( '(' ) ;
    public final void rule__AttributeFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2076:1: ( ( '(' ) )
            // InternalDelegation.g:2077:1: ( '(' )
            {
            // InternalDelegation.g:2077:1: ( '(' )
            // InternalDelegation.g:2078:2: '('
            {
             before(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__1__Impl"


    // $ANTLR start "rule__AttributeFact__Group__2"
    // InternalDelegation.g:2087:1: rule__AttributeFact__Group__2 : rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 ;
    public final void rule__AttributeFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2091:1: ( rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 )
            // InternalDelegation.g:2092:2: rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AttributeFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__2"


    // $ANTLR start "rule__AttributeFact__Group__2__Impl"
    // InternalDelegation.g:2099:1: rule__AttributeFact__Group__2__Impl : ( ( rule__AttributeFact__VariableAssignment_2 ) ) ;
    public final void rule__AttributeFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2103:1: ( ( ( rule__AttributeFact__VariableAssignment_2 ) ) )
            // InternalDelegation.g:2104:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            {
            // InternalDelegation.g:2104:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            // InternalDelegation.g:2105:2: ( rule__AttributeFact__VariableAssignment_2 )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 
            // InternalDelegation.g:2106:2: ( rule__AttributeFact__VariableAssignment_2 )
            // InternalDelegation.g:2106:3: rule__AttributeFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__2__Impl"


    // $ANTLR start "rule__AttributeFact__Group__3"
    // InternalDelegation.g:2114:1: rule__AttributeFact__Group__3 : rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 ;
    public final void rule__AttributeFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2118:1: ( rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 )
            // InternalDelegation.g:2119:2: rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AttributeFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__3"


    // $ANTLR start "rule__AttributeFact__Group__3__Impl"
    // InternalDelegation.g:2126:1: rule__AttributeFact__Group__3__Impl : ( ':' ) ;
    public final void rule__AttributeFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2130:1: ( ( ':' ) )
            // InternalDelegation.g:2131:1: ( ':' )
            {
            // InternalDelegation.g:2131:1: ( ':' )
            // InternalDelegation.g:2132:2: ':'
            {
             before(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__3__Impl"


    // $ANTLR start "rule__AttributeFact__Group__4"
    // InternalDelegation.g:2141:1: rule__AttributeFact__Group__4 : rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 ;
    public final void rule__AttributeFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2145:1: ( rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 )
            // InternalDelegation.g:2146:2: rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__AttributeFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__4"


    // $ANTLR start "rule__AttributeFact__Group__4__Impl"
    // InternalDelegation.g:2153:1: rule__AttributeFact__Group__4__Impl : ( ( rule__AttributeFact__AttributeAssignment_4 ) ) ;
    public final void rule__AttributeFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2157:1: ( ( ( rule__AttributeFact__AttributeAssignment_4 ) ) )
            // InternalDelegation.g:2158:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            {
            // InternalDelegation.g:2158:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            // InternalDelegation.g:2159:2: ( rule__AttributeFact__AttributeAssignment_4 )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 
            // InternalDelegation.g:2160:2: ( rule__AttributeFact__AttributeAssignment_4 )
            // InternalDelegation.g:2160:3: rule__AttributeFact__AttributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__AttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__4__Impl"


    // $ANTLR start "rule__AttributeFact__Group__5"
    // InternalDelegation.g:2168:1: rule__AttributeFact__Group__5 : rule__AttributeFact__Group__5__Impl ;
    public final void rule__AttributeFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2172:1: ( rule__AttributeFact__Group__5__Impl )
            // InternalDelegation.g:2173:2: rule__AttributeFact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__5"


    // $ANTLR start "rule__AttributeFact__Group__5__Impl"
    // InternalDelegation.g:2179:1: rule__AttributeFact__Group__5__Impl : ( ')' ) ;
    public final void rule__AttributeFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2183:1: ( ( ')' ) )
            // InternalDelegation.g:2184:1: ( ')' )
            {
            // InternalDelegation.g:2184:1: ( ')' )
            // InternalDelegation.g:2185:2: ')'
            {
             before(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalDelegation.g:2195:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2199:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalDelegation.g:2200:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalDelegation.g:2207:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2211:1: ( ( 'where' ) )
            // InternalDelegation.g:2212:1: ( 'where' )
            {
            // InternalDelegation.g:2212:1: ( 'where' )
            // InternalDelegation.g:2213:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalDelegation.g:2222:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2226:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalDelegation.g:2227:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalDelegation.g:2234:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__VariableAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2238:1: ( ( ( rule__Binding__VariableAssignment_1 ) ) )
            // InternalDelegation.g:2239:1: ( ( rule__Binding__VariableAssignment_1 ) )
            {
            // InternalDelegation.g:2239:1: ( ( rule__Binding__VariableAssignment_1 ) )
            // InternalDelegation.g:2240:2: ( rule__Binding__VariableAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getVariableAssignment_1()); 
            // InternalDelegation.g:2241:2: ( rule__Binding__VariableAssignment_1 )
            // InternalDelegation.g:2241:3: rule__Binding__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalDelegation.g:2249:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2253:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalDelegation.g:2254:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalDelegation.g:2261:1: rule__Binding__Group__2__Impl : ( 'is' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2265:1: ( ( 'is' ) )
            // InternalDelegation.g:2266:1: ( 'is' )
            {
            // InternalDelegation.g:2266:1: ( 'is' )
            // InternalDelegation.g:2267:2: 'is'
            {
             before(grammarAccess.getBindingAccess().getIsKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalDelegation.g:2276:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2280:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalDelegation.g:2281:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalDelegation.g:2288:1: rule__Binding__Group__3__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2292:1: ( ( 'bound' ) )
            // InternalDelegation.g:2293:1: ( 'bound' )
            {
            // InternalDelegation.g:2293:1: ( 'bound' )
            // InternalDelegation.g:2294:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBoundKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalDelegation.g:2303:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2307:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalDelegation.g:2308:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalDelegation.g:2315:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2319:1: ( ( 'to' ) )
            // InternalDelegation.g:2320:1: ( 'to' )
            {
            // InternalDelegation.g:2320:1: ( 'to' )
            // InternalDelegation.g:2321:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // InternalDelegation.g:2330:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2334:1: ( rule__Binding__Group__5__Impl )
            // InternalDelegation.g:2335:2: rule__Binding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalDelegation.g:2341:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__BindAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2345:1: ( ( ( rule__Binding__BindAssignment_5 ) ) )
            // InternalDelegation.g:2346:1: ( ( rule__Binding__BindAssignment_5 ) )
            {
            // InternalDelegation.g:2346:1: ( ( rule__Binding__BindAssignment_5 ) )
            // InternalDelegation.g:2347:2: ( rule__Binding__BindAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_5()); 
            // InternalDelegation.g:2348:2: ( rule__Binding__BindAssignment_5 )
            // InternalDelegation.g:2348:3: rule__Binding__BindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__DelegationModel__ImportAssignment_0"
    // InternalDelegation.g:2357:1: rule__DelegationModel__ImportAssignment_0 : ( ruleImport ) ;
    public final void rule__DelegationModel__ImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2361:1: ( ( ruleImport ) )
            // InternalDelegation.g:2362:2: ( ruleImport )
            {
            // InternalDelegation.g:2362:2: ( ruleImport )
            // InternalDelegation.g:2363:3: ruleImport
            {
             before(grammarAccess.getDelegationModelAccess().getImportImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDelegationModelAccess().getImportImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__ImportAssignment_0"


    // $ANTLR start "rule__DelegationModel__PolicyAssignment_1"
    // InternalDelegation.g:2372:1: rule__DelegationModel__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__DelegationModel__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2376:1: ( ( rulePolicy ) )
            // InternalDelegation.g:2377:2: ( rulePolicy )
            {
            // InternalDelegation.g:2377:2: ( rulePolicy )
            // InternalDelegation.g:2378:3: rulePolicy
            {
             before(grammarAccess.getDelegationModelAccess().getPolicyPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getDelegationModelAccess().getPolicyPolicyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationModel__PolicyAssignment_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalDelegation.g:2387:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2391:1: ( ( RULE_ID ) )
            // InternalDelegation.g:2392:2: ( RULE_ID )
            {
            // InternalDelegation.g:2392:2: ( RULE_ID )
            // InternalDelegation.g:2393:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__RulesAssignment_3"
    // InternalDelegation.g:2402:1: rule__Policy__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2406:1: ( ( ruleRule ) )
            // InternalDelegation.g:2407:2: ( ruleRule )
            {
            // InternalDelegation.g:2407:2: ( ruleRule )
            // InternalDelegation.g:2408:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RulesAssignment_3"


    // $ANTLR start "rule__Policy__ResolutionAssignment_6"
    // InternalDelegation.g:2417:1: rule__Policy__ResolutionAssignment_6 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2421:1: ( ( ruleResolutionType ) )
            // InternalDelegation.g:2422:2: ( ruleResolutionType )
            {
            // InternalDelegation.g:2422:2: ( ruleResolutionType )
            // InternalDelegation.g:2423:3: ruleResolutionType
            {
             before(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleResolutionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ResolutionAssignment_6"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalDelegation.g:2432:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2436:1: ( ( RULE_ID ) )
            // InternalDelegation.g:2437:2: ( RULE_ID )
            {
            // InternalDelegation.g:2437:2: ( RULE_ID )
            // InternalDelegation.g:2438:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__AccessAssignment_2"
    // InternalDelegation.g:2447:1: rule__Rule__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2451:1: ( ( ruleAccessibilityLevel ) )
            // InternalDelegation.g:2452:2: ( ruleAccessibilityLevel )
            {
            // InternalDelegation.g:2452:2: ( ruleAccessibilityLevel )
            // InternalDelegation.g:2453:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AccessAssignment_2"


    // $ANTLR start "rule__Rule__OperationAssignment_3"
    // InternalDelegation.g:2462:1: rule__Rule__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2466:1: ( ( ruleOperationType ) )
            // InternalDelegation.g:2467:2: ( ruleOperationType )
            {
            // InternalDelegation.g:2467:2: ( ruleOperationType )
            // InternalDelegation.g:2468:3: ruleOperationType
            {
             before(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OperationAssignment_3"


    // $ANTLR start "rule__Rule__SourceAssignment_6"
    // InternalDelegation.g:2477:1: rule__Rule__SourceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2481:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2482:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2482:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2483:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSourceRoleCrossReference_6_0()); 
            // InternalDelegation.g:2484:3: ( RULE_ID )
            // InternalDelegation.g:2485:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getSourceRoleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSourceRoleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSourceRoleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SourceAssignment_6"


    // $ANTLR start "rule__Rule__TargetsAssignment_8"
    // InternalDelegation.g:2496:1: rule__Rule__TargetsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__TargetsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2500:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2501:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2501:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2502:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getTargetsRoleCrossReference_8_0()); 
            // InternalDelegation.g:2503:3: ( RULE_ID )
            // InternalDelegation.g:2504:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTargetsRoleIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetsRoleIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getTargetsRoleCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetsAssignment_8"


    // $ANTLR start "rule__Rule__TargetsAssignment_9_1"
    // InternalDelegation.g:2515:1: rule__Rule__TargetsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__TargetsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2519:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2520:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2520:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2521:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getTargetsRoleCrossReference_9_1_0()); 
            // InternalDelegation.g:2522:3: ( RULE_ID )
            // InternalDelegation.g:2523:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTargetsRoleIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetsRoleIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getTargetsRoleCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetsAssignment_9_1"


    // $ANTLR start "rule__Rule__PatternAssignment_13"
    // InternalDelegation.g:2534:1: rule__Rule__PatternAssignment_13 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2538:1: ( ( ( RULE_STRING ) ) )
            // InternalDelegation.g:2539:2: ( ( RULE_STRING ) )
            {
            // InternalDelegation.g:2539:2: ( ( RULE_STRING ) )
            // InternalDelegation.g:2540:3: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_13_0()); 
            // InternalDelegation.g:2541:3: ( RULE_STRING )
            // InternalDelegation.g:2542:4: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_13_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_13_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PatternAssignment_13"


    // $ANTLR start "rule__Rule__AssetAssignment_15"
    // InternalDelegation.g:2553:1: rule__Rule__AssetAssignment_15 : ( ruleModelFact ) ;
    public final void rule__Rule__AssetAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2557:1: ( ( ruleModelFact ) )
            // InternalDelegation.g:2558:2: ( ruleModelFact )
            {
            // InternalDelegation.g:2558:2: ( ruleModelFact )
            // InternalDelegation.g:2559:3: ruleModelFact
            {
             before(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AssetAssignment_15"


    // $ANTLR start "rule__Rule__BindingsAssignment_16"
    // InternalDelegation.g:2568:1: rule__Rule__BindingsAssignment_16 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2572:1: ( ( ruleBinding ) )
            // InternalDelegation.g:2573:2: ( ruleBinding )
            {
            // InternalDelegation.g:2573:2: ( ruleBinding )
            // InternalDelegation.g:2574:3: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BindingsAssignment_16"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalDelegation.g:2583:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2587:1: ( ( RULE_STRING ) )
            // InternalDelegation.g:2588:2: ( RULE_STRING )
            {
            // InternalDelegation.g:2588:2: ( RULE_STRING )
            // InternalDelegation.g:2589:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalDelegation.g:2598:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2602:1: ( ( RULE_ID ) )
            // InternalDelegation.g:2603:2: ( RULE_ID )
            {
            // InternalDelegation.g:2603:2: ( RULE_ID )
            // InternalDelegation.g:2604:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // InternalDelegation.g:2613:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2617:1: ( ( RULE_ID ) )
            // InternalDelegation.g:2618:2: ( RULE_ID )
            {
            // InternalDelegation.g:2618:2: ( RULE_ID )
            // InternalDelegation.g:2619:3: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__RolesAssignment_3"
    // InternalDelegation.g:2628:1: rule__Group__RolesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2632:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2633:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2633:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2634:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 
            // InternalDelegation.g:2635:3: ( RULE_ID )
            // InternalDelegation.g:2636:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RolesAssignment_3"


    // $ANTLR start "rule__Group__RolesAssignment_4_1"
    // InternalDelegation.g:2647:1: rule__Group__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2651:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2652:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2652:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2653:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalDelegation.g:2654:3: ( RULE_ID )
            // InternalDelegation.g:2655:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RolesAssignment_4_1"


    // $ANTLR start "rule__ObjectFact__VariableAssignment_2"
    // InternalDelegation.g:2666:1: rule__ObjectFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2670:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2671:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2671:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2672:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalDelegation.g:2673:3: ( RULE_ID )
            // InternalDelegation.g:2674:4: RULE_ID
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__VariableAssignment_2"


    // $ANTLR start "rule__ReferenceFact__SourceVarAssignment_2"
    // InternalDelegation.g:2685:1: rule__ReferenceFact__SourceVarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__SourceVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2689:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2690:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2690:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2691:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 
            // InternalDelegation.g:2692:3: ( RULE_ID )
            // InternalDelegation.g:2693:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__SourceVarAssignment_2"


    // $ANTLR start "rule__ReferenceFact__TargetVarAssignment_4"
    // InternalDelegation.g:2704:1: rule__ReferenceFact__TargetVarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__TargetVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2708:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2709:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2709:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2710:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 
            // InternalDelegation.g:2711:3: ( RULE_ID )
            // InternalDelegation.g:2712:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__TargetVarAssignment_4"


    // $ANTLR start "rule__ReferenceFact__ReferenceAssignment_6"
    // InternalDelegation.g:2723:1: rule__ReferenceFact__ReferenceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2727:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2728:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2728:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2729:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 
            // InternalDelegation.g:2730:3: ( RULE_ID )
            // InternalDelegation.g:2731:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__ReferenceAssignment_6"


    // $ANTLR start "rule__AttributeFact__VariableAssignment_2"
    // InternalDelegation.g:2742:1: rule__AttributeFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2746:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2747:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2747:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2748:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalDelegation.g:2749:3: ( RULE_ID )
            // InternalDelegation.g:2750:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__VariableAssignment_2"


    // $ANTLR start "rule__AttributeFact__AttributeAssignment_4"
    // InternalDelegation.g:2761:1: rule__AttributeFact__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2765:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2766:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2766:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2767:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 
            // InternalDelegation.g:2768:3: ( RULE_ID )
            // InternalDelegation.g:2769:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__AttributeAssignment_4"


    // $ANTLR start "rule__Binding__VariableAssignment_1"
    // InternalDelegation.g:2780:1: rule__Binding__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2784:1: ( ( ( RULE_ID ) ) )
            // InternalDelegation.g:2785:2: ( ( RULE_ID ) )
            {
            // InternalDelegation.g:2785:2: ( ( RULE_ID ) )
            // InternalDelegation.g:2786:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 
            // InternalDelegation.g:2787:3: ( RULE_ID )
            // InternalDelegation.g:2788:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__VariableAssignment_1"


    // $ANTLR start "rule__Binding__BindAssignment_5"
    // InternalDelegation.g:2799:1: rule__Binding__BindAssignment_5 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2803:1: ( ( ruleBind ) )
            // InternalDelegation.g:2804:2: ( ruleBind )
            {
            // InternalDelegation.g:2804:2: ( ruleBind )
            // InternalDelegation.g:2805:3: ruleBind
            {
             before(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__BindAssignment_5"


    // $ANTLR start "rule__Bind__ValueStringAssignment_0"
    // InternalDelegation.g:2814:1: rule__Bind__ValueStringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Bind__ValueStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2818:1: ( ( RULE_STRING ) )
            // InternalDelegation.g:2819:2: ( RULE_STRING )
            {
            // InternalDelegation.g:2819:2: ( RULE_STRING )
            // InternalDelegation.g:2820:3: RULE_STRING
            {
             before(grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueStringAssignment_0"


    // $ANTLR start "rule__Bind__ValueIntegerAssignment_1"
    // InternalDelegation.g:2829:1: rule__Bind__ValueIntegerAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bind__ValueIntegerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDelegation.g:2833:1: ( ( RULE_INT ) )
            // InternalDelegation.g:2834:2: ( RULE_INT )
            {
            // InternalDelegation.g:2834:2: ( RULE_INT )
            // InternalDelegation.g:2835:3: RULE_INT
            {
             before(grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueIntegerAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000403C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000024800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000060L});

}