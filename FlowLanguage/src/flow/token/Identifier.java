package flow.token;

/**
 * The token for variable names and method names.
 * @author AMACB
 *
 */
public class Identifier extends Token {
	/**
	 * The value of which the Identifier holds.
	 */
	private String data;
	
	public TokenType getType() {
		return TokenType.IDENTIFIER;
	}
	public String getData() {
		return data;
	}
}
