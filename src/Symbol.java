
/**
 * Symbol info.
 */
enum Symbol {

	DOLLAR("Dollar", "d"),

	APPLE("Apple", "a"),

	BANNANA("Bannana", "n"),

	PLUM("Plum", "p"),

	CHERRY("Cherry", "c"),

	GRAPE("Grape", "g"),

	BAR("Bar", "b"),

	SEVEN("Seven", "s"),

	WATERMELON("Watermelon", "m"),

	WILD("Wild", "w");

	/**
	 * Symbol name.
	 */
	private String title;

	/**
	 * Letter used for the symbol.
	 */
	private String letter;

	/**
	 * Title factory function.
	 * 
	 * @param title
	 *            Symbol name.
	 * @return Symbol enumeration.
	 */
	public static Symbol title(String title) {
		for (Symbol value : values()) {
			if (value.name().equals(title)) {
				return value;
			}
		}

		return null;
	}

	/**
	 * Letter factory function.
	 * 
	 * @param letter
	 *            Symbol letter.
	 * @return Symbol enumeration.
	 */
	public static Symbol letter(String letter) {
		for (Symbol value : values()) {
			if (value.letter().equals(letter)) {
				return value;
			}
		}

		return null;
	}

	/**
	 * Constructor with all parameters.
	 * 
	 * @param title
	 *            Symbol name.
	 * @param letter
	 *            Symbol letter.
	 */
	Symbol(String title, String letter) {
		this.title = title;
		this.letter = letter;
	}

	/**
	 * Symbol name getter.
	 * 
	 * @return Symbol name.
	 */
	public String title() {
		return title;
	}

	/**
	 * Symbol letter getter.
	 * 
	 * @return Symbol letter.
	 */
	public String letter() {
		return letter;
	}
}