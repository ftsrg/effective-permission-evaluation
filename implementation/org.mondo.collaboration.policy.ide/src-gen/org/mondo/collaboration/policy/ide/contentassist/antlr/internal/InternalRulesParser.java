package org.mondo.collaboration.policy.ide.contentassist.antlr.internal;

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
import org.mondo.collaboration.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'obfuscate'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'import'", "'user'", "'group'", "'{'", "'}'", "','", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'to'", "'from'", "'query'", "'select'", "'priority'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'"
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

    	public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAccessControlModel"
    // InternalRules.g:53:1: entryRuleAccessControlModel : ruleAccessControlModel EOF ;
    public final void entryRuleAccessControlModel() throws RecognitionException {
        try {
            // InternalRules.g:54:1: ( ruleAccessControlModel EOF )
            // InternalRules.g:55:1: ruleAccessControlModel EOF
            {
             before(grammarAccess.getAccessControlModelRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessControlModel();

            state._fsp--;

             after(grammarAccess.getAccessControlModelRule()); 
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
    // $ANTLR end "entryRuleAccessControlModel"


    // $ANTLR start "ruleAccessControlModel"
    // InternalRules.g:62:1: ruleAccessControlModel : ( ( rule__AccessControlModel__Group__0 ) ) ;
    public final void ruleAccessControlModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:66:2: ( ( ( rule__AccessControlModel__Group__0 ) ) )
            // InternalRules.g:67:2: ( ( rule__AccessControlModel__Group__0 ) )
            {
            // InternalRules.g:67:2: ( ( rule__AccessControlModel__Group__0 ) )
            // InternalRules.g:68:3: ( rule__AccessControlModel__Group__0 )
            {
             before(grammarAccess.getAccessControlModelAccess().getGroup()); 
            // InternalRules.g:69:3: ( rule__AccessControlModel__Group__0 )
            // InternalRules.g:69:4: rule__AccessControlModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessControlModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessControlModelAccess().getGroup()); 

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
    // $ANTLR end "ruleAccessControlModel"


    // $ANTLR start "entryRuleImport"
    // InternalRules.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRules.g:79:1: ( ruleImport EOF )
            // InternalRules.g:80:1: ruleImport EOF
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
    // InternalRules.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRules.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRules.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalRules.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRules.g:94:3: ( rule__Import__Group__0 )
            // InternalRules.g:94:4: rule__Import__Group__0
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
    // InternalRules.g:103:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalRules.g:104:1: ( ruleRole EOF )
            // InternalRules.g:105:1: ruleRole EOF
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
    // InternalRules.g:112:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:116:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalRules.g:117:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalRules.g:117:2: ( ( rule__Role__Alternatives ) )
            // InternalRules.g:118:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalRules.g:119:3: ( rule__Role__Alternatives )
            // InternalRules.g:119:4: rule__Role__Alternatives
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
    // InternalRules.g:128:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalRules.g:129:1: ( ruleUser EOF )
            // InternalRules.g:130:1: ruleUser EOF
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
    // InternalRules.g:137:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:141:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalRules.g:142:2: ( ( rule__User__Group__0 ) )
            {
            // InternalRules.g:142:2: ( ( rule__User__Group__0 ) )
            // InternalRules.g:143:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalRules.g:144:3: ( rule__User__Group__0 )
            // InternalRules.g:144:4: rule__User__Group__0
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
    // InternalRules.g:153:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalRules.g:154:1: ( ruleGroup EOF )
            // InternalRules.g:155:1: ruleGroup EOF
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
    // InternalRules.g:162:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:166:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalRules.g:167:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalRules.g:167:2: ( ( rule__Group__Group__0 ) )
            // InternalRules.g:168:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalRules.g:169:3: ( rule__Group__Group__0 )
            // InternalRules.g:169:4: rule__Group__Group__0
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


    // $ANTLR start "entryRulePolicy"
    // InternalRules.g:178:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalRules.g:179:1: ( rulePolicy EOF )
            // InternalRules.g:180:1: rulePolicy EOF
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
    // InternalRules.g:187:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:191:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalRules.g:192:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalRules.g:192:2: ( ( rule__Policy__Group__0 ) )
            // InternalRules.g:193:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalRules.g:194:3: ( rule__Policy__Group__0 )
            // InternalRules.g:194:4: rule__Policy__Group__0
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
    // InternalRules.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRules.g:204:1: ( ruleRule EOF )
            // InternalRules.g:205:1: ruleRule EOF
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
    // InternalRules.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRules.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRules.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalRules.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRules.g:219:3: ( rule__Rule__Group__0 )
            // InternalRules.g:219:4: rule__Rule__Group__0
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


    // $ANTLR start "entryRuleModelFact"
    // InternalRules.g:228:1: entryRuleModelFact : ruleModelFact EOF ;
    public final void entryRuleModelFact() throws RecognitionException {
        try {
            // InternalRules.g:229:1: ( ruleModelFact EOF )
            // InternalRules.g:230:1: ruleModelFact EOF
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
    // InternalRules.g:237:1: ruleModelFact : ( ( rule__ModelFact__Alternatives ) ) ;
    public final void ruleModelFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:241:2: ( ( ( rule__ModelFact__Alternatives ) ) )
            // InternalRules.g:242:2: ( ( rule__ModelFact__Alternatives ) )
            {
            // InternalRules.g:242:2: ( ( rule__ModelFact__Alternatives ) )
            // InternalRules.g:243:3: ( rule__ModelFact__Alternatives )
            {
             before(grammarAccess.getModelFactAccess().getAlternatives()); 
            // InternalRules.g:244:3: ( rule__ModelFact__Alternatives )
            // InternalRules.g:244:4: rule__ModelFact__Alternatives
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
    // InternalRules.g:253:1: entryRuleObjectFact : ruleObjectFact EOF ;
    public final void entryRuleObjectFact() throws RecognitionException {
        try {
            // InternalRules.g:254:1: ( ruleObjectFact EOF )
            // InternalRules.g:255:1: ruleObjectFact EOF
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
    // InternalRules.g:262:1: ruleObjectFact : ( ( rule__ObjectFact__Group__0 ) ) ;
    public final void ruleObjectFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:266:2: ( ( ( rule__ObjectFact__Group__0 ) ) )
            // InternalRules.g:267:2: ( ( rule__ObjectFact__Group__0 ) )
            {
            // InternalRules.g:267:2: ( ( rule__ObjectFact__Group__0 ) )
            // InternalRules.g:268:3: ( rule__ObjectFact__Group__0 )
            {
             before(grammarAccess.getObjectFactAccess().getGroup()); 
            // InternalRules.g:269:3: ( rule__ObjectFact__Group__0 )
            // InternalRules.g:269:4: rule__ObjectFact__Group__0
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
    // InternalRules.g:278:1: entryRuleReferenceFact : ruleReferenceFact EOF ;
    public final void entryRuleReferenceFact() throws RecognitionException {
        try {
            // InternalRules.g:279:1: ( ruleReferenceFact EOF )
            // InternalRules.g:280:1: ruleReferenceFact EOF
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
    // InternalRules.g:287:1: ruleReferenceFact : ( ( rule__ReferenceFact__Group__0 ) ) ;
    public final void ruleReferenceFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:291:2: ( ( ( rule__ReferenceFact__Group__0 ) ) )
            // InternalRules.g:292:2: ( ( rule__ReferenceFact__Group__0 ) )
            {
            // InternalRules.g:292:2: ( ( rule__ReferenceFact__Group__0 ) )
            // InternalRules.g:293:3: ( rule__ReferenceFact__Group__0 )
            {
             before(grammarAccess.getReferenceFactAccess().getGroup()); 
            // InternalRules.g:294:3: ( rule__ReferenceFact__Group__0 )
            // InternalRules.g:294:4: rule__ReferenceFact__Group__0
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
    // InternalRules.g:303:1: entryRuleAttributeFact : ruleAttributeFact EOF ;
    public final void entryRuleAttributeFact() throws RecognitionException {
        try {
            // InternalRules.g:304:1: ( ruleAttributeFact EOF )
            // InternalRules.g:305:1: ruleAttributeFact EOF
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
    // InternalRules.g:312:1: ruleAttributeFact : ( ( rule__AttributeFact__Group__0 ) ) ;
    public final void ruleAttributeFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:316:2: ( ( ( rule__AttributeFact__Group__0 ) ) )
            // InternalRules.g:317:2: ( ( rule__AttributeFact__Group__0 ) )
            {
            // InternalRules.g:317:2: ( ( rule__AttributeFact__Group__0 ) )
            // InternalRules.g:318:3: ( rule__AttributeFact__Group__0 )
            {
             before(grammarAccess.getAttributeFactAccess().getGroup()); 
            // InternalRules.g:319:3: ( rule__AttributeFact__Group__0 )
            // InternalRules.g:319:4: rule__AttributeFact__Group__0
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
    // InternalRules.g:328:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalRules.g:329:1: ( ruleBinding EOF )
            // InternalRules.g:330:1: ruleBinding EOF
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
    // InternalRules.g:337:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:341:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalRules.g:342:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalRules.g:342:2: ( ( rule__Binding__Group__0 ) )
            // InternalRules.g:343:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalRules.g:344:3: ( rule__Binding__Group__0 )
            // InternalRules.g:344:4: rule__Binding__Group__0
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
    // InternalRules.g:353:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalRules.g:354:1: ( ruleBind EOF )
            // InternalRules.g:355:1: ruleBind EOF
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
    // InternalRules.g:362:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:366:2: ( ( ( rule__Bind__Alternatives ) ) )
            // InternalRules.g:367:2: ( ( rule__Bind__Alternatives ) )
            {
            // InternalRules.g:367:2: ( ( rule__Bind__Alternatives ) )
            // InternalRules.g:368:3: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // InternalRules.g:369:3: ( rule__Bind__Alternatives )
            // InternalRules.g:369:4: rule__Bind__Alternatives
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
    // InternalRules.g:378:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:382:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:383:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:383:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:384:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:385:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:385:4: rule__AccessibilityLevel__Alternatives
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
    // InternalRules.g:394:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:398:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:399:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:399:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:400:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:401:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:401:4: rule__OperationType__Alternatives
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
    // InternalRules.g:410:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:414:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:415:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:415:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:416:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:417:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:417:4: rule__ResolutionType__Alternatives
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
    // InternalRules.g:425:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:429:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:430:2: ( ruleUser )
                    {
                    // InternalRules.g:430:2: ( ruleUser )
                    // InternalRules.g:431:3: ruleUser
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
                    // InternalRules.g:436:2: ( ruleGroup )
                    {
                    // InternalRules.g:436:2: ( ruleGroup )
                    // InternalRules.g:437:3: ruleGroup
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
    // InternalRules.g:446:1: rule__ModelFact__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) );
    public final void rule__ModelFact__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:450:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 43:
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
                    // InternalRules.g:451:2: ( ruleObjectFact )
                    {
                    // InternalRules.g:451:2: ( ruleObjectFact )
                    // InternalRules.g:452:3: ruleObjectFact
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
                    // InternalRules.g:457:2: ( ruleReferenceFact )
                    {
                    // InternalRules.g:457:2: ( ruleReferenceFact )
                    // InternalRules.g:458:3: ruleReferenceFact
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
                    // InternalRules.g:463:2: ( ruleAttributeFact )
                    {
                    // InternalRules.g:463:2: ( ruleAttributeFact )
                    // InternalRules.g:464:3: ruleAttributeFact
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
    // InternalRules.g:473:1: rule__Bind__Alternatives : ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:477:1: ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) )
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
                    // InternalRules.g:478:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    {
                    // InternalRules.g:478:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    // InternalRules.g:479:3: ( rule__Bind__ValueStringAssignment_0 )
                    {
                     before(grammarAccess.getBindAccess().getValueStringAssignment_0()); 
                    // InternalRules.g:480:3: ( rule__Bind__ValueStringAssignment_0 )
                    // InternalRules.g:480:4: rule__Bind__ValueStringAssignment_0
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
                    // InternalRules.g:484:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    {
                    // InternalRules.g:484:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    // InternalRules.g:485:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    {
                     before(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 
                    // InternalRules.g:486:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    // InternalRules.g:486:4: rule__Bind__ValueIntegerAssignment_1
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
    // InternalRules.g:494:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'deny' ) ) | ( ( 'obfuscate' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:498:1: ( ( ( 'allow' ) ) | ( ( 'deny' ) ) | ( ( 'obfuscate' ) ) )
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
                    // InternalRules.g:499:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:499:2: ( ( 'allow' ) )
                    // InternalRules.g:500:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:501:3: ( 'allow' )
                    // InternalRules.g:501:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:505:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:505:2: ( ( 'deny' ) )
                    // InternalRules.g:506:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 
                    // InternalRules.g:507:3: ( 'deny' )
                    // InternalRules.g:507:4: 'deny'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:511:2: ( ( 'obfuscate' ) )
                    {
                    // InternalRules.g:511:2: ( ( 'obfuscate' ) )
                    // InternalRules.g:512:3: ( 'obfuscate' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:513:3: ( 'obfuscate' )
                    // InternalRules.g:513:4: 'obfuscate'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2()); 

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
    // InternalRules.g:521:1: rule__OperationType__Alternatives : ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:525:1: ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
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
                    // InternalRules.g:526:2: ( ( 'unset' ) )
                    {
                    // InternalRules.g:526:2: ( ( 'unset' ) )
                    // InternalRules.g:527:3: ( 'unset' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 
                    // InternalRules.g:528:3: ( 'unset' )
                    // InternalRules.g:528:4: 'unset'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:532:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:532:2: ( ( 'R' ) )
                    // InternalRules.g:533:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 
                    // InternalRules.g:534:3: ( 'R' )
                    // InternalRules.g:534:4: 'R'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:538:2: ( ( 'W' ) )
                    {
                    // InternalRules.g:538:2: ( ( 'W' ) )
                    // InternalRules.g:539:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:540:3: ( 'W' )
                    // InternalRules.g:540:4: 'W'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRules.g:544:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:544:2: ( ( 'RW' ) )
                    // InternalRules.g:545:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 
                    // InternalRules.g:546:3: ( 'RW' )
                    // InternalRules.g:546:4: 'RW'
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
    // InternalRules.g:554:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:558:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
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
                    // InternalRules.g:559:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:559:2: ( ( 'restrictive' ) )
                    // InternalRules.g:560:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:561:3: ( 'restrictive' )
                    // InternalRules.g:561:4: 'restrictive'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:565:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:565:2: ( ( 'permissive' ) )
                    // InternalRules.g:566:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:567:3: ( 'permissive' )
                    // InternalRules.g:567:4: 'permissive'
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


    // $ANTLR start "rule__AccessControlModel__Group__0"
    // InternalRules.g:575:1: rule__AccessControlModel__Group__0 : rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1 ;
    public final void rule__AccessControlModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:579:1: ( rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1 )
            // InternalRules.g:580:2: rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessControlModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessControlModel__Group__1();

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
    // $ANTLR end "rule__AccessControlModel__Group__0"


    // $ANTLR start "rule__AccessControlModel__Group__0__Impl"
    // InternalRules.g:587:1: rule__AccessControlModel__Group__0__Impl : ( ( rule__AccessControlModel__ImportsAssignment_0 )* ) ;
    public final void rule__AccessControlModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:591:1: ( ( ( rule__AccessControlModel__ImportsAssignment_0 )* ) )
            // InternalRules.g:592:1: ( ( rule__AccessControlModel__ImportsAssignment_0 )* )
            {
            // InternalRules.g:592:1: ( ( rule__AccessControlModel__ImportsAssignment_0 )* )
            // InternalRules.g:593:2: ( rule__AccessControlModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getAccessControlModelAccess().getImportsAssignment_0()); 
            // InternalRules.g:594:2: ( rule__AccessControlModel__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:594:3: rule__AccessControlModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__AccessControlModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAccessControlModelAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__AccessControlModel__Group__0__Impl"


    // $ANTLR start "rule__AccessControlModel__Group__1"
    // InternalRules.g:602:1: rule__AccessControlModel__Group__1 : rule__AccessControlModel__Group__1__Impl rule__AccessControlModel__Group__2 ;
    public final void rule__AccessControlModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:606:1: ( rule__AccessControlModel__Group__1__Impl rule__AccessControlModel__Group__2 )
            // InternalRules.g:607:2: rule__AccessControlModel__Group__1__Impl rule__AccessControlModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AccessControlModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessControlModel__Group__2();

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
    // $ANTLR end "rule__AccessControlModel__Group__1"


    // $ANTLR start "rule__AccessControlModel__Group__1__Impl"
    // InternalRules.g:614:1: rule__AccessControlModel__Group__1__Impl : ( ( rule__AccessControlModel__RolesAssignment_1 )* ) ;
    public final void rule__AccessControlModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:618:1: ( ( ( rule__AccessControlModel__RolesAssignment_1 )* ) )
            // InternalRules.g:619:1: ( ( rule__AccessControlModel__RolesAssignment_1 )* )
            {
            // InternalRules.g:619:1: ( ( rule__AccessControlModel__RolesAssignment_1 )* )
            // InternalRules.g:620:2: ( rule__AccessControlModel__RolesAssignment_1 )*
            {
             before(grammarAccess.getAccessControlModelAccess().getRolesAssignment_1()); 
            // InternalRules.g:621:2: ( rule__AccessControlModel__RolesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:621:3: rule__AccessControlModel__RolesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AccessControlModel__RolesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAccessControlModelAccess().getRolesAssignment_1()); 

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
    // $ANTLR end "rule__AccessControlModel__Group__1__Impl"


    // $ANTLR start "rule__AccessControlModel__Group__2"
    // InternalRules.g:629:1: rule__AccessControlModel__Group__2 : rule__AccessControlModel__Group__2__Impl ;
    public final void rule__AccessControlModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:633:1: ( rule__AccessControlModel__Group__2__Impl )
            // InternalRules.g:634:2: rule__AccessControlModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessControlModel__Group__2__Impl();

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
    // $ANTLR end "rule__AccessControlModel__Group__2"


    // $ANTLR start "rule__AccessControlModel__Group__2__Impl"
    // InternalRules.g:640:1: rule__AccessControlModel__Group__2__Impl : ( ( rule__AccessControlModel__PolicyAssignment_2 ) ) ;
    public final void rule__AccessControlModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:644:1: ( ( ( rule__AccessControlModel__PolicyAssignment_2 ) ) )
            // InternalRules.g:645:1: ( ( rule__AccessControlModel__PolicyAssignment_2 ) )
            {
            // InternalRules.g:645:1: ( ( rule__AccessControlModel__PolicyAssignment_2 ) )
            // InternalRules.g:646:2: ( rule__AccessControlModel__PolicyAssignment_2 )
            {
             before(grammarAccess.getAccessControlModelAccess().getPolicyAssignment_2()); 
            // InternalRules.g:647:2: ( rule__AccessControlModel__PolicyAssignment_2 )
            // InternalRules.g:647:3: rule__AccessControlModel__PolicyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessControlModel__PolicyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessControlModelAccess().getPolicyAssignment_2()); 

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
    // $ANTLR end "rule__AccessControlModel__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalRules.g:656:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:660:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRules.g:661:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRules.g:668:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:672:1: ( ( 'import' ) )
            // InternalRules.g:673:1: ( 'import' )
            {
            // InternalRules.g:673:1: ( 'import' )
            // InternalRules.g:674:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRules.g:683:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:687:1: ( rule__Import__Group__1__Impl )
            // InternalRules.g:688:2: rule__Import__Group__1__Impl
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
    // InternalRules.g:694:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:698:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalRules.g:699:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalRules.g:699:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalRules.g:700:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalRules.g:701:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalRules.g:701:3: rule__Import__ImportURIAssignment_1
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
    // InternalRules.g:710:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:714:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalRules.g:715:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:722:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:726:1: ( ( 'user' ) )
            // InternalRules.g:727:1: ( 'user' )
            {
            // InternalRules.g:727:1: ( 'user' )
            // InternalRules.g:728:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRules.g:737:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:741:1: ( rule__User__Group__1__Impl )
            // InternalRules.g:742:2: rule__User__Group__1__Impl
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
    // InternalRules.g:748:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:752:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalRules.g:753:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalRules.g:753:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalRules.g:754:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalRules.g:755:2: ( rule__User__NameAssignment_1 )
            // InternalRules.g:755:3: rule__User__NameAssignment_1
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
    // InternalRules.g:764:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:768:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalRules.g:769:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:776:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:780:1: ( ( 'group' ) )
            // InternalRules.g:781:1: ( 'group' )
            {
            // InternalRules.g:781:1: ( 'group' )
            // InternalRules.g:782:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:791:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:795:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalRules.g:796:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRules.g:803:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:807:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalRules.g:808:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalRules.g:808:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalRules.g:809:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalRules.g:810:2: ( rule__Group__NameAssignment_1 )
            // InternalRules.g:810:3: rule__Group__NameAssignment_1
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
    // InternalRules.g:818:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:822:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalRules.g:823:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:830:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:834:1: ( ( '{' ) )
            // InternalRules.g:835:1: ( '{' )
            {
            // InternalRules.g:835:1: ( '{' )
            // InternalRules.g:836:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:845:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:849:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalRules.g:850:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalRules.g:857:1: rule__Group__Group__3__Impl : ( ( rule__Group__RolesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:861:1: ( ( ( rule__Group__RolesAssignment_3 ) ) )
            // InternalRules.g:862:1: ( ( rule__Group__RolesAssignment_3 ) )
            {
            // InternalRules.g:862:1: ( ( rule__Group__RolesAssignment_3 ) )
            // InternalRules.g:863:2: ( rule__Group__RolesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_3()); 
            // InternalRules.g:864:2: ( rule__Group__RolesAssignment_3 )
            // InternalRules.g:864:3: rule__Group__RolesAssignment_3
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
    // InternalRules.g:872:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:876:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalRules.g:877:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalRules.g:884:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:888:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalRules.g:889:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalRules.g:889:1: ( ( rule__Group__Group_4__0 )* )
            // InternalRules.g:890:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalRules.g:891:2: ( rule__Group__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRules.g:891:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRules.g:899:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:903:1: ( rule__Group__Group__5__Impl )
            // InternalRules.g:904:2: rule__Group__Group__5__Impl
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
    // InternalRules.g:910:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:914:1: ( ( '}' ) )
            // InternalRules.g:915:1: ( '}' )
            {
            // InternalRules.g:915:1: ( '}' )
            // InternalRules.g:916:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:926:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:930:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalRules.g:931:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:938:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:942:1: ( ( ',' ) )
            // InternalRules.g:943:1: ( ',' )
            {
            // InternalRules.g:943:1: ( ',' )
            // InternalRules.g:944:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRules.g:953:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:957:1: ( rule__Group__Group_4__1__Impl )
            // InternalRules.g:958:2: rule__Group__Group_4__1__Impl
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
    // InternalRules.g:964:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__RolesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:968:1: ( ( ( rule__Group__RolesAssignment_4_1 ) ) )
            // InternalRules.g:969:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            {
            // InternalRules.g:969:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            // InternalRules.g:970:2: ( rule__Group__RolesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 
            // InternalRules.g:971:2: ( rule__Group__RolesAssignment_4_1 )
            // InternalRules.g:971:3: rule__Group__RolesAssignment_4_1
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


    // $ANTLR start "rule__Policy__Group__0"
    // InternalRules.g:980:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:984:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalRules.g:985:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:992:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:996:1: ( ( 'policy' ) )
            // InternalRules.g:997:1: ( 'policy' )
            {
            // InternalRules.g:997:1: ( 'policy' )
            // InternalRules.g:998:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRules.g:1007:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1011:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalRules.g:1012:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRules.g:1019:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1023:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalRules.g:1024:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalRules.g:1024:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalRules.g:1025:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalRules.g:1026:2: ( rule__Policy__NameAssignment_1 )
            // InternalRules.g:1026:3: rule__Policy__NameAssignment_1
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
    // InternalRules.g:1034:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1038:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalRules.g:1039:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRules.g:1046:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__AccessAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1050:1: ( ( ( rule__Policy__AccessAssignment_2 ) ) )
            // InternalRules.g:1051:1: ( ( rule__Policy__AccessAssignment_2 ) )
            {
            // InternalRules.g:1051:1: ( ( rule__Policy__AccessAssignment_2 ) )
            // InternalRules.g:1052:2: ( rule__Policy__AccessAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 
            // InternalRules.g:1053:2: ( rule__Policy__AccessAssignment_2 )
            // InternalRules.g:1053:3: rule__Policy__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Policy__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 

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
    // InternalRules.g:1061:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1065:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalRules.g:1066:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRules.g:1073:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__OperationAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1077:1: ( ( ( rule__Policy__OperationAssignment_3 ) ) )
            // InternalRules.g:1078:1: ( ( rule__Policy__OperationAssignment_3 ) )
            {
            // InternalRules.g:1078:1: ( ( rule__Policy__OperationAssignment_3 ) )
            // InternalRules.g:1079:2: ( rule__Policy__OperationAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 
            // InternalRules.g:1080:2: ( rule__Policy__OperationAssignment_3 )
            // InternalRules.g:1080:3: rule__Policy__OperationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Policy__OperationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 

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
    // InternalRules.g:1088:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1092:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalRules.g:1093:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRules.g:1100:1: rule__Policy__Group__4__Impl : ( 'by' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1104:1: ( ( 'by' ) )
            // InternalRules.g:1105:1: ( 'by' )
            {
            // InternalRules.g:1105:1: ( 'by' )
            // InternalRules.g:1106:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getByKeyword_4()); 

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
    // InternalRules.g:1115:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1119:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalRules.g:1120:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalRules.g:1127:1: rule__Policy__Group__5__Impl : ( 'default' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1131:1: ( ( 'default' ) )
            // InternalRules.g:1132:1: ( 'default' )
            {
            // InternalRules.g:1132:1: ( 'default' )
            // InternalRules.g:1133:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 

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
    // InternalRules.g:1142:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1146:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalRules.g:1147:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalRules.g:1154:1: rule__Policy__Group__6__Impl : ( '{' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1158:1: ( ( '{' ) )
            // InternalRules.g:1159:1: ( '{' )
            {
            // InternalRules.g:1159:1: ( '{' )
            // InternalRules.g:1160:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalRules.g:1169:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1173:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalRules.g:1174:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Policy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__8();

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
    // InternalRules.g:1181:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__RulesAssignment_7 )* ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1185:1: ( ( ( rule__Policy__RulesAssignment_7 )* ) )
            // InternalRules.g:1186:1: ( ( rule__Policy__RulesAssignment_7 )* )
            {
            // InternalRules.g:1186:1: ( ( rule__Policy__RulesAssignment_7 )* )
            // InternalRules.g:1187:2: ( rule__Policy__RulesAssignment_7 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 
            // InternalRules.g:1188:2: ( rule__Policy__RulesAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRules.g:1188:3: rule__Policy__RulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Policy__RulesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 

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


    // $ANTLR start "rule__Policy__Group__8"
    // InternalRules.g:1196:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1200:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalRules.g:1201:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Policy__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__9();

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
    // $ANTLR end "rule__Policy__Group__8"


    // $ANTLR start "rule__Policy__Group__8__Impl"
    // InternalRules.g:1208:1: rule__Policy__Group__8__Impl : ( '}' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1212:1: ( ( '}' ) )
            // InternalRules.g:1213:1: ( '}' )
            {
            // InternalRules.g:1213:1: ( '}' )
            // InternalRules.g:1214:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Policy__Group__8__Impl"


    // $ANTLR start "rule__Policy__Group__9"
    // InternalRules.g:1223:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1227:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalRules.g:1228:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Policy__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__10();

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
    // $ANTLR end "rule__Policy__Group__9"


    // $ANTLR start "rule__Policy__Group__9__Impl"
    // InternalRules.g:1235:1: rule__Policy__Group__9__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1239:1: ( ( 'with' ) )
            // InternalRules.g:1240:1: ( 'with' )
            {
            // InternalRules.g:1240:1: ( 'with' )
            // InternalRules.g:1241:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWithKeyword_9()); 

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
    // $ANTLR end "rule__Policy__Group__9__Impl"


    // $ANTLR start "rule__Policy__Group__10"
    // InternalRules.g:1250:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl rule__Policy__Group__11 ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1254:1: ( rule__Policy__Group__10__Impl rule__Policy__Group__11 )
            // InternalRules.g:1255:2: rule__Policy__Group__10__Impl rule__Policy__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Policy__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__11();

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
    // $ANTLR end "rule__Policy__Group__10"


    // $ANTLR start "rule__Policy__Group__10__Impl"
    // InternalRules.g:1262:1: rule__Policy__Group__10__Impl : ( ( rule__Policy__ResolutionAssignment_10 ) ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1266:1: ( ( ( rule__Policy__ResolutionAssignment_10 ) ) )
            // InternalRules.g:1267:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            {
            // InternalRules.g:1267:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            // InternalRules.g:1268:2: ( rule__Policy__ResolutionAssignment_10 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 
            // InternalRules.g:1269:2: ( rule__Policy__ResolutionAssignment_10 )
            // InternalRules.g:1269:3: rule__Policy__ResolutionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ResolutionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 

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
    // $ANTLR end "rule__Policy__Group__10__Impl"


    // $ANTLR start "rule__Policy__Group__11"
    // InternalRules.g:1277:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1281:1: ( rule__Policy__Group__11__Impl )
            // InternalRules.g:1282:2: rule__Policy__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__11__Impl();

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
    // $ANTLR end "rule__Policy__Group__11"


    // $ANTLR start "rule__Policy__Group__11__Impl"
    // InternalRules.g:1288:1: rule__Policy__Group__11__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1292:1: ( ( 'resolution' ) )
            // InternalRules.g:1293:1: ( 'resolution' )
            {
            // InternalRules.g:1293:1: ( 'resolution' )
            // InternalRules.g:1294:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 

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
    // $ANTLR end "rule__Policy__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRules.g:1304:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1308:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRules.g:1309:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:1316:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1320:1: ( ( 'rule' ) )
            // InternalRules.g:1321:1: ( 'rule' )
            {
            // InternalRules.g:1321:1: ( 'rule' )
            // InternalRules.g:1322:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRules.g:1331:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1335:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRules.g:1336:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalRules.g:1343:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1347:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalRules.g:1348:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalRules.g:1348:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalRules.g:1349:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalRules.g:1350:2: ( rule__Rule__NameAssignment_1 )
            // InternalRules.g:1350:3: rule__Rule__NameAssignment_1
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
    // InternalRules.g:1358:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1362:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRules.g:1363:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalRules.g:1370:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AccessAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1374:1: ( ( ( rule__Rule__AccessAssignment_2 ) ) )
            // InternalRules.g:1375:1: ( ( rule__Rule__AccessAssignment_2 ) )
            {
            // InternalRules.g:1375:1: ( ( rule__Rule__AccessAssignment_2 ) )
            // InternalRules.g:1376:2: ( rule__Rule__AccessAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAccessAssignment_2()); 
            // InternalRules.g:1377:2: ( rule__Rule__AccessAssignment_2 )
            // InternalRules.g:1377:3: rule__Rule__AccessAssignment_2
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
    // InternalRules.g:1385:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1389:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRules.g:1390:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalRules.g:1397:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperationAssignment_3 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1401:1: ( ( ( rule__Rule__OperationAssignment_3 )? ) )
            // InternalRules.g:1402:1: ( ( rule__Rule__OperationAssignment_3 )? )
            {
            // InternalRules.g:1402:1: ( ( rule__Rule__OperationAssignment_3 )? )
            // InternalRules.g:1403:2: ( rule__Rule__OperationAssignment_3 )?
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_3()); 
            // InternalRules.g:1404:2: ( rule__Rule__OperationAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=14 && LA11_0<=17)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRules.g:1404:3: rule__Rule__OperationAssignment_3
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
    // InternalRules.g:1412:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1416:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRules.g:1417:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:1424:1: rule__Rule__Group__4__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1428:1: ( ( 'to' ) )
            // InternalRules.g:1429:1: ( 'to' )
            {
            // InternalRules.g:1429:1: ( 'to' )
            // InternalRules.g:1430:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_4()); 

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
    // InternalRules.g:1439:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1443:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRules.g:1444:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRules.g:1451:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__RolesAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1455:1: ( ( ( rule__Rule__RolesAssignment_5 ) ) )
            // InternalRules.g:1456:1: ( ( rule__Rule__RolesAssignment_5 ) )
            {
            // InternalRules.g:1456:1: ( ( rule__Rule__RolesAssignment_5 ) )
            // InternalRules.g:1457:2: ( rule__Rule__RolesAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5()); 
            // InternalRules.g:1458:2: ( rule__Rule__RolesAssignment_5 )
            // InternalRules.g:1458:3: rule__Rule__RolesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_5()); 

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
    // InternalRules.g:1466:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1470:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRules.g:1471:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalRules.g:1478:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1482:1: ( ( ( rule__Rule__Group_6__0 )* ) )
            // InternalRules.g:1483:1: ( ( rule__Rule__Group_6__0 )* )
            {
            // InternalRules.g:1483:1: ( ( rule__Rule__Group_6__0 )* )
            // InternalRules.g:1484:2: ( rule__Rule__Group_6__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalRules.g:1485:2: ( rule__Rule__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRules.g:1485:3: rule__Rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_6()); 

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
    // InternalRules.g:1493:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1497:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRules.g:1498:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalRules.g:1505:1: rule__Rule__Group__7__Impl : ( '{' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1509:1: ( ( '{' ) )
            // InternalRules.g:1510:1: ( '{' )
            {
            // InternalRules.g:1510:1: ( '{' )
            // InternalRules.g:1511:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 

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
    // InternalRules.g:1520:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1524:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalRules.g:1525:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalRules.g:1532:1: rule__Rule__Group__8__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1536:1: ( ( 'from' ) )
            // InternalRules.g:1537:1: ( 'from' )
            {
            // InternalRules.g:1537:1: ( 'from' )
            // InternalRules.g:1538:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_8()); 

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
    // InternalRules.g:1547:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1551:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalRules.g:1552:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalRules.g:1559:1: rule__Rule__Group__9__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1563:1: ( ( 'query' ) )
            // InternalRules.g:1564:1: ( 'query' )
            {
            // InternalRules.g:1564:1: ( 'query' )
            // InternalRules.g:1565:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_9()); 

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
    // InternalRules.g:1574:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1578:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalRules.g:1579:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalRules.g:1586:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__PatternAssignment_10 ) ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1590:1: ( ( ( rule__Rule__PatternAssignment_10 ) ) )
            // InternalRules.g:1591:1: ( ( rule__Rule__PatternAssignment_10 ) )
            {
            // InternalRules.g:1591:1: ( ( rule__Rule__PatternAssignment_10 ) )
            // InternalRules.g:1592:2: ( rule__Rule__PatternAssignment_10 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_10()); 
            // InternalRules.g:1593:2: ( rule__Rule__PatternAssignment_10 )
            // InternalRules.g:1593:3: rule__Rule__PatternAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PatternAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_10()); 

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
    // InternalRules.g:1601:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1605:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalRules.g:1606:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_25);
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
    // InternalRules.g:1613:1: rule__Rule__Group__11__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1617:1: ( ( 'select' ) )
            // InternalRules.g:1618:1: ( 'select' )
            {
            // InternalRules.g:1618:1: ( 'select' )
            // InternalRules.g:1619:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_11()); 

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
    // InternalRules.g:1628:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1632:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalRules.g:1633:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_26);
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
    // InternalRules.g:1640:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__AssetAssignment_12 ) ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1644:1: ( ( ( rule__Rule__AssetAssignment_12 ) ) )
            // InternalRules.g:1645:1: ( ( rule__Rule__AssetAssignment_12 ) )
            {
            // InternalRules.g:1645:1: ( ( rule__Rule__AssetAssignment_12 ) )
            // InternalRules.g:1646:2: ( rule__Rule__AssetAssignment_12 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_12()); 
            // InternalRules.g:1647:2: ( rule__Rule__AssetAssignment_12 )
            // InternalRules.g:1647:3: rule__Rule__AssetAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_12()); 

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
    // InternalRules.g:1655:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1659:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalRules.g:1660:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_26);
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
    // InternalRules.g:1667:1: rule__Rule__Group__13__Impl : ( ( rule__Rule__BindingsAssignment_13 )* ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1671:1: ( ( ( rule__Rule__BindingsAssignment_13 )* ) )
            // InternalRules.g:1672:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            {
            // InternalRules.g:1672:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            // InternalRules.g:1673:2: ( rule__Rule__BindingsAssignment_13 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 
            // InternalRules.g:1674:2: ( rule__Rule__BindingsAssignment_13 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRules.g:1674:3: rule__Rule__BindingsAssignment_13
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Rule__BindingsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 

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
    // InternalRules.g:1682:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl rule__Rule__Group__15 ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1686:1: ( rule__Rule__Group__14__Impl rule__Rule__Group__15 )
            // InternalRules.g:1687:2: rule__Rule__Group__14__Impl rule__Rule__Group__15
            {
            pushFollow(FOLLOW_17);
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
    // InternalRules.g:1694:1: rule__Rule__Group__14__Impl : ( '}' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1698:1: ( ( '}' ) )
            // InternalRules.g:1699:1: ( '}' )
            {
            // InternalRules.g:1699:1: ( '}' )
            // InternalRules.g:1700:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 

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
    // InternalRules.g:1709:1: rule__Rule__Group__15 : rule__Rule__Group__15__Impl ;
    public final void rule__Rule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1713:1: ( rule__Rule__Group__15__Impl )
            // InternalRules.g:1714:2: rule__Rule__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__15__Impl();

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
    // InternalRules.g:1720:1: rule__Rule__Group__15__Impl : ( ( rule__Rule__Group_15__0 )? ) ;
    public final void rule__Rule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1724:1: ( ( ( rule__Rule__Group_15__0 )? ) )
            // InternalRules.g:1725:1: ( ( rule__Rule__Group_15__0 )? )
            {
            // InternalRules.g:1725:1: ( ( rule__Rule__Group_15__0 )? )
            // InternalRules.g:1726:2: ( rule__Rule__Group_15__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_15()); 
            // InternalRules.g:1727:2: ( rule__Rule__Group_15__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRules.g:1727:3: rule__Rule__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_15()); 

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


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalRules.g:1736:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1740:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalRules.g:1741:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

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
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalRules.g:1748:1: rule__Rule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1752:1: ( ( ',' ) )
            // InternalRules.g:1753:1: ( ',' )
            {
            // InternalRules.g:1753:1: ( ',' )
            // InternalRules.g:1754:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalRules.g:1763:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1767:1: ( rule__Rule__Group_6__1__Impl )
            // InternalRules.g:1768:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalRules.g:1774:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__RolesAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1778:1: ( ( ( rule__Rule__RolesAssignment_6_1 ) ) )
            // InternalRules.g:1779:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            {
            // InternalRules.g:1779:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            // InternalRules.g:1780:2: ( rule__Rule__RolesAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 
            // InternalRules.g:1781:2: ( rule__Rule__RolesAssignment_6_1 )
            // InternalRules.g:1781:3: rule__Rule__RolesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RolesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 

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
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Rule__Group_15__0"
    // InternalRules.g:1790:1: rule__Rule__Group_15__0 : rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 ;
    public final void rule__Rule__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1794:1: ( rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 )
            // InternalRules.g:1795:2: rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__1();

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
    // $ANTLR end "rule__Rule__Group_15__0"


    // $ANTLR start "rule__Rule__Group_15__0__Impl"
    // InternalRules.g:1802:1: rule__Rule__Group_15__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1806:1: ( ( 'with' ) )
            // InternalRules.g:1807:1: ( 'with' )
            {
            // InternalRules.g:1807:1: ( 'with' )
            // InternalRules.g:1808:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 

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
    // $ANTLR end "rule__Rule__Group_15__0__Impl"


    // $ANTLR start "rule__Rule__Group_15__1"
    // InternalRules.g:1817:1: rule__Rule__Group_15__1 : rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 ;
    public final void rule__Rule__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1821:1: ( rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 )
            // InternalRules.g:1822:2: rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__2();

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
    // $ANTLR end "rule__Rule__Group_15__1"


    // $ANTLR start "rule__Rule__Group_15__1__Impl"
    // InternalRules.g:1829:1: rule__Rule__Group_15__1__Impl : ( ( rule__Rule__PriorityAssignment_15_1 ) ) ;
    public final void rule__Rule__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1833:1: ( ( ( rule__Rule__PriorityAssignment_15_1 ) ) )
            // InternalRules.g:1834:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            {
            // InternalRules.g:1834:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            // InternalRules.g:1835:2: ( rule__Rule__PriorityAssignment_15_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 
            // InternalRules.g:1836:2: ( rule__Rule__PriorityAssignment_15_1 )
            // InternalRules.g:1836:3: rule__Rule__PriorityAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PriorityAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 

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
    // $ANTLR end "rule__Rule__Group_15__1__Impl"


    // $ANTLR start "rule__Rule__Group_15__2"
    // InternalRules.g:1844:1: rule__Rule__Group_15__2 : rule__Rule__Group_15__2__Impl ;
    public final void rule__Rule__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1848:1: ( rule__Rule__Group_15__2__Impl )
            // InternalRules.g:1849:2: rule__Rule__Group_15__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_15__2"


    // $ANTLR start "rule__Rule__Group_15__2__Impl"
    // InternalRules.g:1855:1: rule__Rule__Group_15__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1859:1: ( ( 'priority' ) )
            // InternalRules.g:1860:1: ( 'priority' )
            {
            // InternalRules.g:1860:1: ( 'priority' )
            // InternalRules.g:1861:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 

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
    // $ANTLR end "rule__Rule__Group_15__2__Impl"


    // $ANTLR start "rule__ObjectFact__Group__0"
    // InternalRules.g:1871:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1875:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalRules.g:1876:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRules.g:1883:1: rule__ObjectFact__Group__0__Impl : ( 'obj' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1887:1: ( ( 'obj' ) )
            // InternalRules.g:1888:1: ( 'obj' )
            {
            // InternalRules.g:1888:1: ( 'obj' )
            // InternalRules.g:1889:2: 'obj'
            {
             before(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRules.g:1898:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1902:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalRules.g:1903:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:1910:1: rule__ObjectFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1914:1: ( ( '(' ) )
            // InternalRules.g:1915:1: ( '(' )
            {
            // InternalRules.g:1915:1: ( '(' )
            // InternalRules.g:1916:2: '('
            {
             before(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRules.g:1925:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1929:1: ( rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 )
            // InternalRules.g:1930:2: rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalRules.g:1937:1: rule__ObjectFact__Group__2__Impl : ( ( rule__ObjectFact__VariableAssignment_2 ) ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1941:1: ( ( ( rule__ObjectFact__VariableAssignment_2 ) ) )
            // InternalRules.g:1942:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            {
            // InternalRules.g:1942:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            // InternalRules.g:1943:2: ( rule__ObjectFact__VariableAssignment_2 )
            {
             before(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 
            // InternalRules.g:1944:2: ( rule__ObjectFact__VariableAssignment_2 )
            // InternalRules.g:1944:3: rule__ObjectFact__VariableAssignment_2
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
    // InternalRules.g:1952:1: rule__ObjectFact__Group__3 : rule__ObjectFact__Group__3__Impl ;
    public final void rule__ObjectFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1956:1: ( rule__ObjectFact__Group__3__Impl )
            // InternalRules.g:1957:2: rule__ObjectFact__Group__3__Impl
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
    // InternalRules.g:1963:1: rule__ObjectFact__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1967:1: ( ( ')' ) )
            // InternalRules.g:1968:1: ( ')' )
            {
            // InternalRules.g:1968:1: ( ')' )
            // InternalRules.g:1969:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRules.g:1979:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1983:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalRules.g:1984:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRules.g:1991:1: rule__ReferenceFact__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1995:1: ( ( 'ref' ) )
            // InternalRules.g:1996:1: ( 'ref' )
            {
            // InternalRules.g:1996:1: ( 'ref' )
            // InternalRules.g:1997:2: 'ref'
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRules.g:2006:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2010:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalRules.g:2011:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:2018:1: rule__ReferenceFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2022:1: ( ( '(' ) )
            // InternalRules.g:2023:1: ( '(' )
            {
            // InternalRules.g:2023:1: ( '(' )
            // InternalRules.g:2024:2: '('
            {
             before(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRules.g:2033:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2037:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalRules.g:2038:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalRules.g:2045:1: rule__ReferenceFact__Group__2__Impl : ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2049:1: ( ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) )
            // InternalRules.g:2050:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            {
            // InternalRules.g:2050:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            // InternalRules.g:2051:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 
            // InternalRules.g:2052:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            // InternalRules.g:2052:3: rule__ReferenceFact__SourceVarAssignment_2
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
    // InternalRules.g:2060:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2064:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalRules.g:2065:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:2072:1: rule__ReferenceFact__Group__3__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2076:1: ( ( '->' ) )
            // InternalRules.g:2077:1: ( '->' )
            {
            // InternalRules.g:2077:1: ( '->' )
            // InternalRules.g:2078:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRules.g:2087:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2091:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalRules.g:2092:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalRules.g:2099:1: rule__ReferenceFact__Group__4__Impl : ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2103:1: ( ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) )
            // InternalRules.g:2104:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            {
            // InternalRules.g:2104:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            // InternalRules.g:2105:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 
            // InternalRules.g:2106:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            // InternalRules.g:2106:3: rule__ReferenceFact__TargetVarAssignment_4
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
    // InternalRules.g:2114:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2118:1: ( rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 )
            // InternalRules.g:2119:2: rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:2126:1: rule__ReferenceFact__Group__5__Impl : ( ':' ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2130:1: ( ( ':' ) )
            // InternalRules.g:2131:1: ( ':' )
            {
            // InternalRules.g:2131:1: ( ':' )
            // InternalRules.g:2132:2: ':'
            {
             before(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRules.g:2141:1: rule__ReferenceFact__Group__6 : rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 ;
    public final void rule__ReferenceFact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2145:1: ( rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 )
            // InternalRules.g:2146:2: rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalRules.g:2153:1: rule__ReferenceFact__Group__6__Impl : ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) ;
    public final void rule__ReferenceFact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2157:1: ( ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) )
            // InternalRules.g:2158:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            {
            // InternalRules.g:2158:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            // InternalRules.g:2159:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 
            // InternalRules.g:2160:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            // InternalRules.g:2160:3: rule__ReferenceFact__ReferenceAssignment_6
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
    // InternalRules.g:2168:1: rule__ReferenceFact__Group__7 : rule__ReferenceFact__Group__7__Impl ;
    public final void rule__ReferenceFact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2172:1: ( rule__ReferenceFact__Group__7__Impl )
            // InternalRules.g:2173:2: rule__ReferenceFact__Group__7__Impl
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
    // InternalRules.g:2179:1: rule__ReferenceFact__Group__7__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2183:1: ( ( ')' ) )
            // InternalRules.g:2184:1: ( ')' )
            {
            // InternalRules.g:2184:1: ( ')' )
            // InternalRules.g:2185:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRules.g:2195:1: rule__AttributeFact__Group__0 : rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 ;
    public final void rule__AttributeFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2199:1: ( rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 )
            // InternalRules.g:2200:2: rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRules.g:2207:1: rule__AttributeFact__Group__0__Impl : ( 'attr' ) ;
    public final void rule__AttributeFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2211:1: ( ( 'attr' ) )
            // InternalRules.g:2212:1: ( 'attr' )
            {
            // InternalRules.g:2212:1: ( 'attr' )
            // InternalRules.g:2213:2: 'attr'
            {
             before(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRules.g:2222:1: rule__AttributeFact__Group__1 : rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 ;
    public final void rule__AttributeFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2226:1: ( rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 )
            // InternalRules.g:2227:2: rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:2234:1: rule__AttributeFact__Group__1__Impl : ( '(' ) ;
    public final void rule__AttributeFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2238:1: ( ( '(' ) )
            // InternalRules.g:2239:1: ( '(' )
            {
            // InternalRules.g:2239:1: ( '(' )
            // InternalRules.g:2240:2: '('
            {
             before(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRules.g:2249:1: rule__AttributeFact__Group__2 : rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 ;
    public final void rule__AttributeFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2253:1: ( rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 )
            // InternalRules.g:2254:2: rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalRules.g:2261:1: rule__AttributeFact__Group__2__Impl : ( ( rule__AttributeFact__VariableAssignment_2 ) ) ;
    public final void rule__AttributeFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2265:1: ( ( ( rule__AttributeFact__VariableAssignment_2 ) ) )
            // InternalRules.g:2266:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            {
            // InternalRules.g:2266:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            // InternalRules.g:2267:2: ( rule__AttributeFact__VariableAssignment_2 )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 
            // InternalRules.g:2268:2: ( rule__AttributeFact__VariableAssignment_2 )
            // InternalRules.g:2268:3: rule__AttributeFact__VariableAssignment_2
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
    // InternalRules.g:2276:1: rule__AttributeFact__Group__3 : rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 ;
    public final void rule__AttributeFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2280:1: ( rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 )
            // InternalRules.g:2281:2: rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:2288:1: rule__AttributeFact__Group__3__Impl : ( ':' ) ;
    public final void rule__AttributeFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2292:1: ( ( ':' ) )
            // InternalRules.g:2293:1: ( ':' )
            {
            // InternalRules.g:2293:1: ( ':' )
            // InternalRules.g:2294:2: ':'
            {
             before(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRules.g:2303:1: rule__AttributeFact__Group__4 : rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 ;
    public final void rule__AttributeFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2307:1: ( rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 )
            // InternalRules.g:2308:2: rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalRules.g:2315:1: rule__AttributeFact__Group__4__Impl : ( ( rule__AttributeFact__AttributeAssignment_4 ) ) ;
    public final void rule__AttributeFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2319:1: ( ( ( rule__AttributeFact__AttributeAssignment_4 ) ) )
            // InternalRules.g:2320:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            {
            // InternalRules.g:2320:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            // InternalRules.g:2321:2: ( rule__AttributeFact__AttributeAssignment_4 )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 
            // InternalRules.g:2322:2: ( rule__AttributeFact__AttributeAssignment_4 )
            // InternalRules.g:2322:3: rule__AttributeFact__AttributeAssignment_4
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
    // InternalRules.g:2330:1: rule__AttributeFact__Group__5 : rule__AttributeFact__Group__5__Impl ;
    public final void rule__AttributeFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2334:1: ( rule__AttributeFact__Group__5__Impl )
            // InternalRules.g:2335:2: rule__AttributeFact__Group__5__Impl
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
    // InternalRules.g:2341:1: rule__AttributeFact__Group__5__Impl : ( ')' ) ;
    public final void rule__AttributeFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2345:1: ( ( ')' ) )
            // InternalRules.g:2346:1: ( ')' )
            {
            // InternalRules.g:2346:1: ( ')' )
            // InternalRules.g:2347:2: ')'
            {
             before(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRules.g:2357:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2361:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalRules.g:2362:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:2369:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2373:1: ( ( 'where' ) )
            // InternalRules.g:2374:1: ( 'where' )
            {
            // InternalRules.g:2374:1: ( 'where' )
            // InternalRules.g:2375:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalRules.g:2384:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2388:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalRules.g:2389:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalRules.g:2396:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__VariableAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2400:1: ( ( ( rule__Binding__VariableAssignment_1 ) ) )
            // InternalRules.g:2401:1: ( ( rule__Binding__VariableAssignment_1 ) )
            {
            // InternalRules.g:2401:1: ( ( rule__Binding__VariableAssignment_1 ) )
            // InternalRules.g:2402:2: ( rule__Binding__VariableAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getVariableAssignment_1()); 
            // InternalRules.g:2403:2: ( rule__Binding__VariableAssignment_1 )
            // InternalRules.g:2403:3: rule__Binding__VariableAssignment_1
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
    // InternalRules.g:2411:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2415:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalRules.g:2416:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalRules.g:2423:1: rule__Binding__Group__2__Impl : ( 'is' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2427:1: ( ( 'is' ) )
            // InternalRules.g:2428:1: ( 'is' )
            {
            // InternalRules.g:2428:1: ( 'is' )
            // InternalRules.g:2429:2: 'is'
            {
             before(grammarAccess.getBindingAccess().getIsKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRules.g:2438:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2442:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalRules.g:2443:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalRules.g:2450:1: rule__Binding__Group__3__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2454:1: ( ( 'bound' ) )
            // InternalRules.g:2455:1: ( 'bound' )
            {
            // InternalRules.g:2455:1: ( 'bound' )
            // InternalRules.g:2456:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRules.g:2465:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2469:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalRules.g:2470:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalRules.g:2477:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2481:1: ( ( 'to' ) )
            // InternalRules.g:2482:1: ( 'to' )
            {
            // InternalRules.g:2482:1: ( 'to' )
            // InternalRules.g:2483:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRules.g:2492:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2496:1: ( rule__Binding__Group__5__Impl )
            // InternalRules.g:2497:2: rule__Binding__Group__5__Impl
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
    // InternalRules.g:2503:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__BindAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2507:1: ( ( ( rule__Binding__BindAssignment_5 ) ) )
            // InternalRules.g:2508:1: ( ( rule__Binding__BindAssignment_5 ) )
            {
            // InternalRules.g:2508:1: ( ( rule__Binding__BindAssignment_5 ) )
            // InternalRules.g:2509:2: ( rule__Binding__BindAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_5()); 
            // InternalRules.g:2510:2: ( rule__Binding__BindAssignment_5 )
            // InternalRules.g:2510:3: rule__Binding__BindAssignment_5
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


    // $ANTLR start "rule__AccessControlModel__ImportsAssignment_0"
    // InternalRules.g:2519:1: rule__AccessControlModel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__AccessControlModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2523:1: ( ( ruleImport ) )
            // InternalRules.g:2524:2: ( ruleImport )
            {
            // InternalRules.g:2524:2: ( ruleImport )
            // InternalRules.g:2525:3: ruleImport
            {
             before(grammarAccess.getAccessControlModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getAccessControlModelAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AccessControlModel__ImportsAssignment_0"


    // $ANTLR start "rule__AccessControlModel__RolesAssignment_1"
    // InternalRules.g:2534:1: rule__AccessControlModel__RolesAssignment_1 : ( ruleRole ) ;
    public final void rule__AccessControlModel__RolesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2538:1: ( ( ruleRole ) )
            // InternalRules.g:2539:2: ( ruleRole )
            {
            // InternalRules.g:2539:2: ( ruleRole )
            // InternalRules.g:2540:3: ruleRole
            {
             before(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AccessControlModel__RolesAssignment_1"


    // $ANTLR start "rule__AccessControlModel__PolicyAssignment_2"
    // InternalRules.g:2549:1: rule__AccessControlModel__PolicyAssignment_2 : ( rulePolicy ) ;
    public final void rule__AccessControlModel__PolicyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2553:1: ( ( rulePolicy ) )
            // InternalRules.g:2554:2: ( rulePolicy )
            {
            // InternalRules.g:2554:2: ( rulePolicy )
            // InternalRules.g:2555:3: rulePolicy
            {
             before(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AccessControlModel__PolicyAssignment_2"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalRules.g:2564:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2568:1: ( ( RULE_STRING ) )
            // InternalRules.g:2569:2: ( RULE_STRING )
            {
            // InternalRules.g:2569:2: ( RULE_STRING )
            // InternalRules.g:2570:3: RULE_STRING
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
    // InternalRules.g:2579:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2583:1: ( ( RULE_ID ) )
            // InternalRules.g:2584:2: ( RULE_ID )
            {
            // InternalRules.g:2584:2: ( RULE_ID )
            // InternalRules.g:2585:3: RULE_ID
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
    // InternalRules.g:2594:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2598:1: ( ( RULE_ID ) )
            // InternalRules.g:2599:2: ( RULE_ID )
            {
            // InternalRules.g:2599:2: ( RULE_ID )
            // InternalRules.g:2600:3: RULE_ID
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
    // InternalRules.g:2609:1: rule__Group__RolesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2613:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2614:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2614:2: ( ( RULE_ID ) )
            // InternalRules.g:2615:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 
            // InternalRules.g:2616:3: ( RULE_ID )
            // InternalRules.g:2617:4: RULE_ID
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
    // InternalRules.g:2628:1: rule__Group__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2632:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2633:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2633:2: ( ( RULE_ID ) )
            // InternalRules.g:2634:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalRules.g:2635:3: ( RULE_ID )
            // InternalRules.g:2636:4: RULE_ID
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


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalRules.g:2647:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2651:1: ( ( RULE_ID ) )
            // InternalRules.g:2652:2: ( RULE_ID )
            {
            // InternalRules.g:2652:2: ( RULE_ID )
            // InternalRules.g:2653:3: RULE_ID
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


    // $ANTLR start "rule__Policy__AccessAssignment_2"
    // InternalRules.g:2662:1: rule__Policy__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2666:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2667:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2667:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2668:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Policy__AccessAssignment_2"


    // $ANTLR start "rule__Policy__OperationAssignment_3"
    // InternalRules.g:2677:1: rule__Policy__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2681:1: ( ( ruleOperationType ) )
            // InternalRules.g:2682:2: ( ruleOperationType )
            {
            // InternalRules.g:2682:2: ( ruleOperationType )
            // InternalRules.g:2683:3: ruleOperationType
            {
             before(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Policy__OperationAssignment_3"


    // $ANTLR start "rule__Policy__RulesAssignment_7"
    // InternalRules.g:2692:1: rule__Policy__RulesAssignment_7 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2696:1: ( ( ruleRule ) )
            // InternalRules.g:2697:2: ( ruleRule )
            {
            // InternalRules.g:2697:2: ( ruleRule )
            // InternalRules.g:2698:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Policy__RulesAssignment_7"


    // $ANTLR start "rule__Policy__ResolutionAssignment_10"
    // InternalRules.g:2707:1: rule__Policy__ResolutionAssignment_10 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2711:1: ( ( ruleResolutionType ) )
            // InternalRules.g:2712:2: ( ruleResolutionType )
            {
            // InternalRules.g:2712:2: ( ruleResolutionType )
            // InternalRules.g:2713:3: ruleResolutionType
            {
             before(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleResolutionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__Policy__ResolutionAssignment_10"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalRules.g:2722:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2726:1: ( ( RULE_ID ) )
            // InternalRules.g:2727:2: ( RULE_ID )
            {
            // InternalRules.g:2727:2: ( RULE_ID )
            // InternalRules.g:2728:3: RULE_ID
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
    // InternalRules.g:2737:1: rule__Rule__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2741:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2742:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2742:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2743:3: ruleAccessibilityLevel
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
    // InternalRules.g:2752:1: rule__Rule__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2756:1: ( ( ruleOperationType ) )
            // InternalRules.g:2757:2: ( ruleOperationType )
            {
            // InternalRules.g:2757:2: ( ruleOperationType )
            // InternalRules.g:2758:3: ruleOperationType
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


    // $ANTLR start "rule__Rule__RolesAssignment_5"
    // InternalRules.g:2767:1: rule__Rule__RolesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2771:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2772:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2772:2: ( ( RULE_ID ) )
            // InternalRules.g:2773:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 
            // InternalRules.g:2774:3: ( RULE_ID )
            // InternalRules.g:2775:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 

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
    // $ANTLR end "rule__Rule__RolesAssignment_5"


    // $ANTLR start "rule__Rule__RolesAssignment_6_1"
    // InternalRules.g:2786:1: rule__Rule__RolesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2790:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2791:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2791:2: ( ( RULE_ID ) )
            // InternalRules.g:2792:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 
            // InternalRules.g:2793:3: ( RULE_ID )
            // InternalRules.g:2794:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Rule__RolesAssignment_6_1"


    // $ANTLR start "rule__Rule__PatternAssignment_10"
    // InternalRules.g:2805:1: rule__Rule__PatternAssignment_10 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2809:1: ( ( ( RULE_STRING ) ) )
            // InternalRules.g:2810:2: ( ( RULE_STRING ) )
            {
            // InternalRules.g:2810:2: ( ( RULE_STRING ) )
            // InternalRules.g:2811:3: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 
            // InternalRules.g:2812:3: ( RULE_STRING )
            // InternalRules.g:2813:4: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_10_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 

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
    // $ANTLR end "rule__Rule__PatternAssignment_10"


    // $ANTLR start "rule__Rule__AssetAssignment_12"
    // InternalRules.g:2824:1: rule__Rule__AssetAssignment_12 : ( ruleModelFact ) ;
    public final void rule__Rule__AssetAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2828:1: ( ( ruleModelFact ) )
            // InternalRules.g:2829:2: ( ruleModelFact )
            {
            // InternalRules.g:2829:2: ( ruleModelFact )
            // InternalRules.g:2830:3: ruleModelFact
            {
             before(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Rule__AssetAssignment_12"


    // $ANTLR start "rule__Rule__BindingsAssignment_13"
    // InternalRules.g:2839:1: rule__Rule__BindingsAssignment_13 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2843:1: ( ( ruleBinding ) )
            // InternalRules.g:2844:2: ( ruleBinding )
            {
            // InternalRules.g:2844:2: ( ruleBinding )
            // InternalRules.g:2845:3: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Rule__BindingsAssignment_13"


    // $ANTLR start "rule__Rule__PriorityAssignment_15_1"
    // InternalRules.g:2854:1: rule__Rule__PriorityAssignment_15_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2858:1: ( ( RULE_INT ) )
            // InternalRules.g:2859:2: ( RULE_INT )
            {
            // InternalRules.g:2859:2: ( RULE_INT )
            // InternalRules.g:2860:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0()); 

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
    // $ANTLR end "rule__Rule__PriorityAssignment_15_1"


    // $ANTLR start "rule__ObjectFact__VariableAssignment_2"
    // InternalRules.g:2869:1: rule__ObjectFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2873:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2874:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2874:2: ( ( RULE_ID ) )
            // InternalRules.g:2875:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalRules.g:2876:3: ( RULE_ID )
            // InternalRules.g:2877:4: RULE_ID
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
    // InternalRules.g:2888:1: rule__ReferenceFact__SourceVarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__SourceVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2892:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2893:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2893:2: ( ( RULE_ID ) )
            // InternalRules.g:2894:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 
            // InternalRules.g:2895:3: ( RULE_ID )
            // InternalRules.g:2896:4: RULE_ID
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
    // InternalRules.g:2907:1: rule__ReferenceFact__TargetVarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__TargetVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2911:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2912:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2912:2: ( ( RULE_ID ) )
            // InternalRules.g:2913:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 
            // InternalRules.g:2914:3: ( RULE_ID )
            // InternalRules.g:2915:4: RULE_ID
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
    // InternalRules.g:2926:1: rule__ReferenceFact__ReferenceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2930:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2931:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2931:2: ( ( RULE_ID ) )
            // InternalRules.g:2932:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 
            // InternalRules.g:2933:3: ( RULE_ID )
            // InternalRules.g:2934:4: RULE_ID
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
    // InternalRules.g:2945:1: rule__AttributeFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2949:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2950:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2950:2: ( ( RULE_ID ) )
            // InternalRules.g:2951:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalRules.g:2952:3: ( RULE_ID )
            // InternalRules.g:2953:4: RULE_ID
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
    // InternalRules.g:2964:1: rule__AttributeFact__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2968:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2969:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2969:2: ( ( RULE_ID ) )
            // InternalRules.g:2970:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 
            // InternalRules.g:2971:3: ( RULE_ID )
            // InternalRules.g:2972:4: RULE_ID
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
    // InternalRules.g:2983:1: rule__Binding__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2987:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2988:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2988:2: ( ( RULE_ID ) )
            // InternalRules.g:2989:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 
            // InternalRules.g:2990:3: ( RULE_ID )
            // InternalRules.g:2991:4: RULE_ID
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
    // InternalRules.g:3002:1: rule__Binding__BindAssignment_5 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:3006:1: ( ( ruleBind ) )
            // InternalRules.g:3007:2: ( ruleBind )
            {
            // InternalRules.g:3007:2: ( ruleBind )
            // InternalRules.g:3008:3: ruleBind
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
    // InternalRules.g:3017:1: rule__Bind__ValueStringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Bind__ValueStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:3021:1: ( ( RULE_STRING ) )
            // InternalRules.g:3022:2: ( RULE_STRING )
            {
            // InternalRules.g:3022:2: ( RULE_STRING )
            // InternalRules.g:3023:3: RULE_STRING
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
    // InternalRules.g:3032:1: rule__Bind__ValueIntegerAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bind__ValueIntegerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:3036:1: ( ( RULE_INT ) )
            // InternalRules.g:3037:2: ( RULE_INT )
            {
            // InternalRules.g:3037:2: ( RULE_INT )
            // InternalRules.g:3038:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004600000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000010003C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000092000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000050L});

}