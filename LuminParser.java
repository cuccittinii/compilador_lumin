// Generated from Lumin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LuminParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLARUS=1, FLUX=2, VERITAS=3, VERUM=4, FALSUM=5, SE=6, SENAO=7, ENQUANTO=8, 
		ECO=9, CAPTURA=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, SEMI=15, 
		ASSIGN=16, PLUS=17, MINUS=18, MUL=19, DIV=20, GT=21, LT=22, EQ=23, NEQ=24, 
		NUM_INT=25, NUM_REAL=26, ID=27, STRING=28, WS=29;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_declaracao = 2, RULE_tipo = 3, 
		RULE_atribuicao = 4, RULE_condicional = 5, RULE_repeticao = 6, RULE_leitura = 7, 
		RULE_escrita = 8, RULE_bloco = 9, RULE_expressao = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "declaracao", "tipo", "atribuicao", "condicional", 
			"repeticao", "leitura", "escrita", "bloco", "expressao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'clarus'", "'flux'", "'veritas'", "'verum'", "'falsum'", "'se'", 
			"'senao'", "'enquanto'", "'eco'", "'captura'", "'('", "')'", "'{'", "'}'", 
			"';'", "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLARUS", "FLUX", "VERITAS", "VERUM", "FALSUM", "SE", "SENAO", 
			"ENQUANTO", "ECO", "CAPTURA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"SEMI", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "GT", "LT", "EQ", "NEQ", 
			"NUM_INT", "NUM_REAL", "ID", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lumin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuminParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LuminParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134219598L) != 0)) {
				{
				{
				setState(22);
				comando();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLARUS:
			case FLUX:
			case VERITAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				declaracao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				atribuicao();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				condicional();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				repeticao();
				}
				break;
			case CAPTURA:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				leitura();
				}
				break;
			case ECO:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				escrita();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LuminParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(LuminParser.SEMI, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			tipo();
			setState(39);
			match(ID);
			setState(40);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode CLARUS() { return getToken(LuminParser.CLARUS, 0); }
		public TerminalNode FLUX() { return getToken(LuminParser.FLUX, 0); }
		public TerminalNode VERITAS() { return getToken(LuminParser.VERITAS, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LuminParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LuminParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LuminParser.SEMI, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			setState(45);
			match(ASSIGN);
			setState(46);
			expressao(0);
			setState(47);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LuminParser.SE, 0); }
		public TerminalNode LPAREN() { return getToken(LuminParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuminParser.RPAREN, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(LuminParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SE);
			setState(50);
			match(LPAREN);
			setState(51);
			expressao(0);
			setState(52);
			match(RPAREN);
			setState(53);
			bloco();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(54);
				match(SENAO);
				setState(55);
				bloco();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(LuminParser.ENQUANTO, 0); }
		public TerminalNode LPAREN() { return getToken(LuminParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuminParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ENQUANTO);
			setState(59);
			match(LPAREN);
			setState(60);
			expressao(0);
			setState(61);
			match(RPAREN);
			setState(62);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode CAPTURA() { return getToken(LuminParser.CAPTURA, 0); }
		public TerminalNode LPAREN() { return getToken(LuminParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(LuminParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(LuminParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LuminParser.SEMI, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CAPTURA);
			setState(65);
			match(LPAREN);
			setState(66);
			match(ID);
			setState(67);
			match(RPAREN);
			setState(68);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
	 
		public EscritaContext() { }
		public void copyFrom(EscritaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscritaIDContext extends EscritaContext {
		public TerminalNode ECO() { return getToken(LuminParser.ECO, 0); }
		public TerminalNode LPAREN() { return getToken(LuminParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(LuminParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(LuminParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LuminParser.SEMI, 0); }
		public EscritaIDContext(EscritaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitEscritaID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscritaStringContext extends EscritaContext {
		public TerminalNode ECO() { return getToken(LuminParser.ECO, 0); }
		public TerminalNode LPAREN() { return getToken(LuminParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(LuminParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(LuminParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LuminParser.SEMI, 0); }
		public EscritaStringContext(EscritaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitEscritaString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escrita);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EscritaIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(ECO);
				setState(71);
				match(LPAREN);
				setState(72);
				match(ID);
				setState(73);
				match(RPAREN);
				setState(74);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new EscritaStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ECO);
				setState(76);
				match(LPAREN);
				setState(77);
				match(STRING);
				setState(78);
				match(RPAREN);
				setState(79);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LuminParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LuminParser.RBRACE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LBRACE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134219598L) != 0)) {
				{
				{
				setState(83);
				comando();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelacionalContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode GT() { return getToken(LuminParser.GT, 0); }
		public TerminalNode LT() { return getToken(LuminParser.LT, 0); }
		public TerminalNode EQ() { return getToken(LuminParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LuminParser.NEQ, 0); }
		public ExprRelacionalContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LuminParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LuminParser.DIV, 0); }
		public ExprMulDivContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFalseContext extends ExpressaoContext {
		public TerminalNode FALSUM() { return getToken(LuminParser.FALSUM, 0); }
		public ExprFalseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntContext extends ExpressaoContext {
		public TerminalNode NUM_INT() { return getToken(LuminParser.NUM_INT, 0); }
		public ExprIntContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTrueContext extends ExpressaoContext {
		public TerminalNode VERUM() { return getToken(LuminParser.VERUM, 0); }
		public ExprTrueContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRealContext extends ExpressaoContext {
		public TerminalNode NUM_REAL() { return getToken(LuminParser.NUM_REAL, 0); }
		public ExprRealContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentesesContext extends ExpressaoContext {
		public TerminalNode LPAREN() { return getToken(LuminParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuminParser.RPAREN, 0); }
		public ExprParentesesContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(LuminParser.ID, 0); }
		public ExprIDContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSomaSubContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LuminParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LuminParser.MINUS, 0); }
		public ExprSomaSubContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuminVisitor ) return ((LuminVisitor<? extends T>)visitor).visitExprSomaSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ExprParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92);
				match(LPAREN);
				setState(93);
				expressao(0);
				setState(94);
				match(RPAREN);
				}
				break;
			case NUM_INT:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				{
				_localctx = new ExprRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(NUM_REAL);
				}
				break;
			case VERUM:
				{
				_localctx = new ExprTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(VERUM);
				}
				break;
			case FALSUM:
				{
				_localctx = new ExprFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(FALSUM);
				}
				break;
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(103);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(104);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expressao(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprSomaSubContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(106);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(107);
						((ExprSomaSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprSomaSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expressao(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelacionalContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(109);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(110);
						((ExprRelacionalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
							((ExprRelacionalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expressao(8);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001dv\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u00059\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bQ\b\b\u0001\t\u0001"+
		"\t\u0005\tU\b\t\n\t\f\tX\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nf\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\nq\b\n\n\n\f\nt\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0001\u0003"+
		"\u0001\u0000\u0013\u0014\u0001\u0000\u0011\u0012\u0001\u0000\u0015\u0018"+
		"{\u0000\u0019\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000"+
		"\u0000\u0000\n1\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000\u000e"+
		"@\u0001\u0000\u0000\u0000\u0010P\u0001\u0000\u0000\u0000\u0012R\u0001"+
		"\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000"+
		"\u0000\u0000\u001e%\u0003\u0004\u0002\u0000\u001f%\u0003\b\u0004\u0000"+
		" %\u0003\n\u0005\u0000!%\u0003\f\u0006\u0000\"%\u0003\u000e\u0007\u0000"+
		"#%\u0003\u0010\b\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000"+
		"\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000"+
		"\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u001b\u0000\u0000()\u0005\u000f"+
		"\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0007\u0000\u0000\u0000"+
		"+\u0007\u0001\u0000\u0000\u0000,-\u0005\u001b\u0000\u0000-.\u0005\u0010"+
		"\u0000\u0000./\u0003\u0014\n\u0000/0\u0005\u000f\u0000\u00000\t\u0001"+
		"\u0000\u0000\u000012\u0005\u0006\u0000\u000023\u0005\u000b\u0000\u0000"+
		"34\u0003\u0014\n\u000045\u0005\f\u0000\u000058\u0003\u0012\t\u000067\u0005"+
		"\u0007\u0000\u000079\u0003\u0012\t\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009\u000b\u0001\u0000\u0000\u0000:;\u0005\b\u0000\u0000"+
		";<\u0005\u000b\u0000\u0000<=\u0003\u0014\n\u0000=>\u0005\f\u0000\u0000"+
		">?\u0003\u0012\t\u0000?\r\u0001\u0000\u0000\u0000@A\u0005\n\u0000\u0000"+
		"AB\u0005\u000b\u0000\u0000BC\u0005\u001b\u0000\u0000CD\u0005\f\u0000\u0000"+
		"DE\u0005\u000f\u0000\u0000E\u000f\u0001\u0000\u0000\u0000FG\u0005\t\u0000"+
		"\u0000GH\u0005\u000b\u0000\u0000HI\u0005\u001b\u0000\u0000IJ\u0005\f\u0000"+
		"\u0000JQ\u0005\u000f\u0000\u0000KL\u0005\t\u0000\u0000LM\u0005\u000b\u0000"+
		"\u0000MN\u0005\u001c\u0000\u0000NO\u0005\f\u0000\u0000OQ\u0005\u000f\u0000"+
		"\u0000PF\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000Q\u0011\u0001"+
		"\u0000\u0000\u0000RV\u0005\r\u0000\u0000SU\u0003\u0002\u0001\u0000TS\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u000e\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[\\\u0006"+
		"\n\uffff\uffff\u0000\\]\u0005\u000b\u0000\u0000]^\u0003\u0014\n\u0000"+
		"^_\u0005\f\u0000\u0000_f\u0001\u0000\u0000\u0000`f\u0005\u0019\u0000\u0000"+
		"af\u0005\u001a\u0000\u0000bf\u0005\u0004\u0000\u0000cf\u0005\u0005\u0000"+
		"\u0000df\u0005\u001b\u0000\u0000e[\u0001\u0000\u0000\u0000e`\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fr\u0001\u0000\u0000\u0000"+
		"gh\n\t\u0000\u0000hi\u0007\u0001\u0000\u0000iq\u0003\u0014\n\njk\n\b\u0000"+
		"\u0000kl\u0007\u0002\u0000\u0000lq\u0003\u0014\n\tmn\n\u0007\u0000\u0000"+
		"no\u0007\u0003\u0000\u0000oq\u0003\u0014\n\bpg\u0001\u0000\u0000\u0000"+
		"pj\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0015\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000\b\u0019$8PVepr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}