package flow.token;

/**
 * The token for literal values: true, false, null, numbers, and strings
 * @author AMACB
 *
 */
public class Literal extends Token {
	/**
	 * The value of which the Literal holds.
	 */
	private String data;
	
	public Literal(String data) {
		this.data = data;
	}
	
	public TokenType getType() {
		return TokenType.LITERAL;
	}
	public String getData() {
		return data;
	}
}
