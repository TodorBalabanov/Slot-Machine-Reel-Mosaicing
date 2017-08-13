import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Application single entry point class.
 * 
 * @author Todor Balabanov
 */
public class Main {

	/**
	 * Slot machine screen observations.
	 */
	public static final String OBSERVATIONS[] = { "7777пп", "7777пп", "7777пп", "777ппп", "777ппп", "777ппп", "777ппп",
			"777ппп", "777ппп", "777ппп", "777ппп", "777ппп", "77пппп", "77пппп", "77пппп", "77пппп", "7ппппч",
			"7ппппч", "7ппппч", "7ппппч", "7ппппч", "7ппппч", "7ппппч", "ггггзл", "ггггзп", "ггггзп", "ггггзп",
			"ггггзп", "ггггзп", "ггггзп", "ггггпп", "ггггпп", "ггггчч", "ггггчч", "ггггчч", "ггггчч", "гггзпп",
			"гггзпп", "гггзпп", "гггзпп", "гггппп", "гггппп", "гггппп", "гггччч", "гггччч", "гггччч", "гггччч",
			"гггччч", "ггзппп", "ггзппп", "ггзппп", "ггзппп", "ггзппп", "ггпппп", "ггчччч", "ггчччч", "ггчччч",
			"ггчччч", "ггчччч", "гзпппп", "гзпппп", "гллллг", "гппппз", "гппппз", "гппппз", "гппппз", "гппппз",
			"гппппз", "гппппз", "гччччс", "гччччс", "гччччс", "гччччс", "гччччс", "ддддлл", "ддддлл", "ддддлл",
			"ддддлл", "ддддлл", "ддддлл", "ддддлл", "ддддлл", "ддддлл", "ддддлл", "ддддлл", "ддддлл", "дддллл",
			"дддллл", "дддллл", "дддллл", "дддллл", "дддллл", "дддллл", "дддллл", "дддллл", "дддллл", "дддллл",
			"дддллл", "дддллл", "дддллл", "дддллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл",
			"ддлллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл", "ддлллл", "дллллг", "дллллг",
			"дллллг", "дллллг", "дллллг", "дллллг", "дллллп", "дллллп", "дллллп", "дллллп", "дллллп", "дллллп",
			"дллллп", "дллллп", "дллллс", "дллллс", "дллллс", "дллллс", "дллллс", "дллллс", "дллллс", "дллллс",
			"зддддл", "зддддл", "зддддл", "зддддл", "зддддл", "зддддл", "зддддл", "зддддл", "зддддл", "зппппг",
			"зппппг", "зппппг", "зппппг", "зппппг", "зппппг", "л7777п", "л7777п", "л7777п", "л7777п", "л7777п",
			"л7777п", "л7777п", "л7777п", "лггггз", "лггггз", "лггггз", "лггггз", "лггггз", "лггггз", "лггггп",
			"лггггп", "лггггп", "лггггп", "лггггп", "лл7777", "лл7777", "лл7777", "лл7777", "лл7777", "лл7777",
			"лл7777", "лл7777", "ллгггг", "ллгггг", "ллгггг", "ллгггг", "ллгггг", "ллгггг", "ллл777", "ллл777",
			"ллл777", "ллл777", "ллл777", "ллл777", "ллл777", "ллл777", "ллл777", "ллл777", "ллл777", "ллл777",
			"лллггг", "лллггг", "лллггг", "лллггг", "лллггг", "лллггг", "лллггг", "лллггг", "лллггг", "лллггг",
			"лллггг", "лллггг", "лллггг", "лллл77", "лллл77", "лллл77", "лллл77", "лллл77", "лллл77", "ллллгг",
			"ллллгг", "ллллгг", "ллллгг", "ллллгг", "ллллгг", "ллллгг", "ллллгг", "ллллгг", "ллллгг", "ллллгг",
			"ллллгг", "ллллгг", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп",
			"ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллпп", "ллллсс", "ллллсс", "ллллсс",
			"ллллсс", "ллллсс", "ллллсс", "ллллсс", "лллппп", "лллппп", "лллппп", "лллппп", "лллппп", "лллппп",
			"лллппп", "лллппп", "лллппп", "лллппп", "лллссс", "лллссс", "лллссс", "лллссс", "лллссс", "лллссс",
			"лллссс", "лллссс", "лллссс", "лллссс", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп",
			"ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллпппп", "ллсссс",
			"ллсссс", "ллсссс", "ллсссс", "ллсссс", "ллсссс", "лппппл", "лппппл", "лппппл", "лппппл", "лппппл",
			"лппппс", "лппппс", "лппппс", "лппппс", "лппппс", "лппппс", "лппппс", "лссссл", "лссссл", "лссссл",
			"лссссл", "лссссл", "пггггч", "пггггч", "пггггч", "пггггч", "пггггч", "пггггч", "пггггч", "пггггч",
			"пздддд", "пздддд", "пздддд", "пздддд", "пздддд", "пздддд", "пздддд", "плллл7", "плллл7", "плллл7",
			"ппгггг", "ппгггг", "ппгггг", "ппгггг", "ппгггг", "ппзддд", "ппзддд", "ппзддд", "ппзддд", "ппзддд",
			"ппзддд", "ппзддд", "пплллл", "пплллл", "пплллл", "пплллл", "пплллл", "пппггг", "пппггг", "пппггг",
			"пппггг", "пппггг", "пппздд", "пппздд", "пппздд", "пппздд", "пппздд", "пппздд", "пппздд", "пппздд",
			"пппллл", "пппллл", "пппллл", "пппллл", "пппллл", "ппппгг", "ппппгг", "ппппгг", "ппппзд", "ппппзд",
			"ппппзд", "ппппзд", "пппплл", "пппплл", "пппплл", "пппплл", "пппплл", "пппплл", "пппплл", "пппплл",
			"ппппсс", "ппппсс", "ппппсс", "ппппсс", "ппппчч", "ппппчч", "ппппчч", "ппппчч", "пппссс", "пппссс",
			"пппссс", "пппссс", "пппссс", "пппссс", "пппссс", "пппссс", "пппччч", "пппччч", "пппччч", "пппччч",
			"пппччч", "пппччч", "пппччч", "ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппсссс",
			"ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппсссс", "ппчччч", "ппчччч", "ппчччч",
			"ппчччч", "ппчччч", "ппчччч", "пссссч", "пссссч", "пччччс", "пччччс", "пччччс", "пччччс", "пччччс",
			"пччччс", "пччччс", "пччччс", "пччччс", "сддддл", "сддддл", "сддддл", "сддддл", "сддддл", "сддддл",
			"сддддл", "сддддл", "сддддл", "сддддл", "сддддл", "сддддл", "сддддл", "сддддл", "сллллп", "сллллп",
			"сллллп", "сллллп", "сллллп", "сллллп", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд",
			"ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "ссдддд", "сслллл",
			"сслллл", "сслллл", "сслллл", "сслллл", "сслллл", "сслллл", "сслллл", "сслллл", "сслллл", "сссддд",
			"сссддд", "сссддд", "сссддд", "сссддд", "сссддд", "сссддд", "сссддд", "сссддд", "сссддд", "сссддд",
			"сссддд", "сссллл", "сссллл", "сссллл", "сссллл", "сссллл", "ссссдд", "ссссдд", "ссссдд", "ссссдд",
			"ссссдд", "ссссдд", "ссссдд", "ссссдд", "ссссдд", "ссссдд", "ссссдд", "ссссдд", "ссссдд", "ссссдд",
			"ссссдд", "ссссдд", "ссссдд", "сссслл", "сссслл", "сссслл", "сссслл", "сссслл", "сссслл", "сссслл",
			"ссссчч", "ссссчч", "ссссчч", "ссссчч", "сссччч", "сссччч", "сссччч", "сссччч", "сссччч", "сссччч",
			"сссччч", "сссччч", "сссччч", "ссчччч", "сччччл", "сччччл", "сччччл", "сччччл", "чллллг", "чллллг",
			"чллллг", "чллллг", "чллллг", "чссссд", "чссссд", "чссссд", "чссссд", "чссссд", "чссссд", "чссссд",
			"чссссд", "чссссд", "чссссд", "чссссд", "чссссд", "чссссд", "ччлллл", "ччлллл", "ччлллл", "ччсссс",
			"ччсссс", "ччсссс", "ччсссс", "ччсссс", "ччсссс", "ччсссс", "ччсссс", "ччсссс", "ччсссс", "ччсссс",
			"ччсссс", "ччсссс", "чччллл", "чччллл", "чччллл", "чччллл", "чччссс", "чччссс", "чччссс", "чччссс",
			"чччссс", "чччссс", "чччссс", "чччссс", "чччссс", "чччссс", "чччссс", "чччссс", "чччссс", "ччччлл",
			"ччччлл", "ччччлл", "ччччлл", "ччччлл", "ччччлл", "ччччлл", "ччччлл", "ччччлл", "ччччлл", "ччччлл",
			"ччччлл", "ччччсс", "ччччсс", "ччччсс", "ччччсс", "ччччсс", "ччччсс", "ччччсс", "ччччсс", "ччччсс",
			"ччччсс", "ччччсс", "ччччсс", "ччччсс", "ччччсс", };

	/**
	 * Combinations used as controls of the reel correctness.
	 */
	private static final String CONTROLS[] = { "ллллггггзппппггггччччссссддддлллл", "7777ппппччччссссддддлллл",
			"ллллггггппппзддддлллл", "ллллпппплллл7777", };

	/**
	 * Reel start combination.
	 */
	private static final String REEL_START = "7777ппппччччссссддддлллл";

	/**
	 * Reel end combination.
	 */
	private static final String REEL_END = "ллллпппплллл7777";

	/**
	 * Do not use pieces with some symbols.
	 */
	private static final String ESCAPE_PIECES_WITH[] = { "7" };

	/**
	 * Minimal generated reel length.
	 */
	private static final int MIN_REEL_LENGTH = 80;

	/**
	 * Maximum generated reel length.
	 */
	private static final int MAX_REEL_LENGTH = 130;

	/**
	 * Combinations which are neighbors.
	 */
	private static final Map<String, List<String>> NEIGHBORS = new HashMap<String, List<String>>();

	/**
	 * Keep track of recursive levels.
	 */
	private static int recursiveLevel = 0;

	/*
	 * Initialization of the static variables.
	 */
	static {
		for (String observation : OBSERVATIONS) {
			/*
			 * Each combination should be presented only once in the neighbor
			 * matrix.
			 */
			if (NEIGHBORS.containsKey(observation)) {
				continue;
			}

			/*
			 * All neighbors of a combination are presented as list.
			 */
			NEIGHBORS.put(observation, new ArrayList<String>());
			for (String neighbor : OBSERVATIONS) {
				/*
				 * Combination is not counted as neighbor if itself.
				 */
				if (observation.equals(neighbor) == true) {
					continue;
				}

				/*
				 * Escape some pieces, because it is known that they are already
				 * presented.
				 */
				if (escape(neighbor) == true) {
					continue;
				}

				// TODO Different criteria for neighbor can seep up
				// calculations.

				/*
				 * First check is for combination with an element less, because
				 * combination should not be neighbor of itself.
				 */
				for (int l = neighbor.length() - 2; l > 0; l--) {
					if (observation.endsWith(neighbor.substring(0, l)) == true
							&& NEIGHBORS.get(observation).contains(neighbor) == false) {
						NEIGHBORS.get(observation).add(neighbor);
						break;
					}
				}
			}

			/*
			 * Sorted list are faster for calculations.
			 */
			Collections.sort(NEIGHBORS.get(observation));
		}
	}

	/**
	 * Check reel for having controlling combinations.
	 * 
	 * @param reel
	 *            Generate reel.
	 * @return True if it is a valid reel, false otherwise.
	 */
	private static boolean valid(String reel) {
		/*
		 * Check ends of the reel.
		 */
		if (reel.startsWith(REEL_START) == false || reel.endsWith(REEL_END) == false) {
			return false;
		}

		/*
		 * Check observed pieces to be presented.
		 */
		for (String control : CONTROLS) {
			/*
			 * Some of the pieces are sure to be presented.
			 */
			if (escape(control) == true) {
				continue;
			}

			/*
			 * All other pieces should be checked.
			 */
			if (reel.contains(control) == false) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Merge reel with neighbor at the end.
	 * 
	 * @param reel
	 *            Current reel.
	 * @param neighbor
	 *            One of the neighbors.
	 * @return Reel merged with the neighbor or empty string if there is a
	 *         problem.
	 */
	private static String merge(String reel, String neighbor) {
		for (int l = neighbor.length() - 1; l > 0; l--) {
			/*
			 * Merge end with part of the neighbor.
			 */
			if (reel.endsWith(neighbor.substring(0, l)) == true) {
				return reel + neighbor.substring(l);
			}
		}

		return "";
	}

	/**
	 * Escape some pieces, because it is known that they are already presented.
	 * 
	 * @param neighbor
	 *            Neighbor to check.
	 * @return True if it should be skipped, false otherwise.
	 */
	private static boolean escape(String neighbor) {
		for (String e : ESCAPE_PIECES_WITH) {
			if (neighbor.contains(e) == true) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Recursive function for reel generation.
	 * 
	 * @param reel
	 *            Current state of the reel.
	 */
	private static void generate(String reel) {
		/*
		 * If the reel has desired end - finish generation process.
		 */
		if (reel.endsWith(REEL_END) == true) {
			/*
			 * Print only reels which are valid.
			 */
			if (valid(reel) == true) {
				System.out.println("VALID:\t" + reel);
			} else {
				// System.out.println("INVALID:\t" + reel);
			}

			return;
		}

		/*
		 * If the reel is too big it is more like to be incorrect - finish
		 * generation process.
		 */
		if (reel.length() > MAX_REEL_LENGTH) {
			// System.out.println("INVALID:\t" + reel);
			return;
		}

		/*
		 * List all neighbors and add it at the end.
		 */
		for (String neighbor : NEIGHBORS.get(reel.substring(reel.length() - 6))) {
			/*
			 * Some kind of calculation progress printing.
			 */
			if (recursiveLevel <= 9) {
				System.err
						.println("L" + recursiveLevel + "\t" + NEIGHBORS.get(reel.substring(reel.length() - 6)).size());
			}

			recursiveLevel++;
			generate(merge(reel, neighbor));
			recursiveLevel--;
		}
	}

	/**
	 * Application single entry point method.
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String[] args) {
		recursiveLevel = 1;
		generate(REEL_START);
	}

}
