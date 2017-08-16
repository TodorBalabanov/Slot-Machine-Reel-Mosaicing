import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Application single entry point class.
 * 
 * @author Todor Balabanov
 */
public class Main {

	/**
	 * Pseudo-random number generator.
	 */
	private static final Random PRNG = new Random();

	/**
	 * Slot machine screen observations.
	 */
	public static final String OBSERVATIONS[] = { "ppllll", "sscccc", "pssssz", "sspppp", "ppgggg", "cssssp", "ppppss",
			"pppccc", "ppcccc", "ggllll", "ppppss", "ccdddd", "gccccz", "ssslll", "lggggc", "ppssss", "lllggg",
			"ppppdd", "lllddd", "lllppp", "ssllll", "zpppps", "ssslll", "ddpppp", "czpppp", "7777pp", "ssssll",
			"lllldd", "ppppgg", "77777p", "ppppll", "pllllc", "ccssss", "ddpppp", "pppggg", "llllpp", "pppccc",
			"sssppp", "ggggcc", "zpppps", "ccccss", "sssccc", "pssssl", "ggcccc", "ppppll", "ggggll", "dddppp",
			"cccczp", "77pppp", "dppppg", "glllld", "sssppp", "ccccss", "glllld", "pddddl", "pggggl", "lllccc",
			"sllllg", "pssssc", "sssppp", "cccddd", "dddppp", "zpppps", "ssslll", "zpppps", "pppsss", "ppgggg",
			"g7777p", "ddpppp", "lggggp", "sllll7", "pppsss", "slllld", "lccccs", "pssssz", "ppppll", "ddddpp",
			"lccccs", "ppssss", "llgggg", "cccsss", "ppdddd", "pssssl", "czpppp", "7777pp", "lldddd", "llllcc",
			"ppppgg", "77777p", "dllllg", "ppppll", "sppppg", "ppdddd", "ddpppp", "lllddd", "gggccc", "gccccz",
			"lccccs", "ccccss", "llllcc", "ppllll", "cccsss", "ppppss", "ppppss", "dppppl", "ddddpp", "dddppp",
			"cddddp", "ddllll", "pllllc", "llllcc", "pppsss", "ppllll", "ppgggg", "ggcccc", "ssssll", "ccdddd",
			"llllgg", "gpppps", "cczppp", "ddddpp", "llcccc", "lllggg", "ggggcc", "llll77", "ggggcc", "ppppcc",
			"cssssl", "ppgggg", "ppssss", "ppplll", "ccczpp", "sllll7", "sssppp", "ggggll", "ccdddd", "gpppps",
			"dppppl", "ggggpp", "ppgggg", "ddddll", "ddpppp", "ggggll", "cccsss", "dppppl", "ppppcc", "pggggl",
			"llcccc", "cccsss", "ccccdd", "ggpppp", "gggppp", "ddpppp", "slllld", "ggcccc", "lgggg7", "ddddpp",
			"ccssss", "llcccc", "ssszcc", "dddlll", "glllld", "ggpppp", "pllllc", "sssppp", "ccccss", "llgggg",
			"lllggg", "lllggg", "sspppp", "sssccc", "ccccdd", "pppsss", "dppppg", "ggllll", "llllpp", "ccczpp",
			"ggggll", "pssssl", "ddddll", "ccccss", "ppgggg", "ssllll", "pppsss", "pppccc", "cczppp", "cccsss",
			"ggpppp", "ssslll", "gggppp", "ppgggg", "ggg777", "llgggg", "lllggg", "ssslll", "cddddp", "lllggg",
			"pllllc", "7777pp", "pppggg", "lldddd", "czpppp", "ppppss", "cccddd", "sppppc", "sppppc", "lggggc",
			"gggppp", "cccddd", "ppcccc", "ggpppp", "ppssss", "ppppcc", "ppppgg", "pppggg", "ppppss", "pppggg",
			"ppssss", "ppssss", "lggggp", "ggpppp", "pppsss", "gccccz", "ssslll", "sppppg", "pllllc", "ccczpp",
			"ppssss", "ppppll", "ccssss", "sssscc", "pssssz", "dddppp", "gccccz", "ppllll", "ccssss", "sssscc",
			"lllddd", "sssscc", "ssssll", "gpppps", "gccccz", "lllldd", "ccssss", "sssspp", "ggpppp", "cssssp",
			"pppsss", "pccccs", "l7777p", "pppsss", "ccccss", "lldddd", "sspppp", "pppggg", "ppplll", "pppddd",
			"lllggg", "pppccc", "sspppp", "sspppp", "ssssll", "llllcc", "ccdddd", "ssssll", "cssssp", "dddppp",
			"dppppg", "ssssll", "ddddpp", "cczppp", "pggggc", "ccdddd", "ppdddd", "sssscc", "ppppss", "cccddd",
			"ccczpp", "ddllll", "ddpppp", "ccccdd", "sscccc", "ccssss", "ccccss", "pppsss", "pppggg", "ccdddd",
			"lll777", "szcccc", "gg7777", "ssllll", "lllggg", "llgggg", "77pppp", "77777p", "ppppcc", "cssssl",
			"cssssl", "ppcccc", "gggg77", "ddddpp", "dddlll", "ddddll", "lllccc", "ddddpp", "llgggg", "lggggc",
			"szcccc", "sssspp", "ppppgg", "sspppp", "ggggpp", "77777p", "ppppss", "gggccc", "ppppss", "pppsss",
			"pccccs", "lllppp", "lccccs", "ddddpp", "dllllg", "lccccs", "ddddll", "ccczpp", "ssssll", "ppppss",
			"ccccdd", "lggggc", "lllppp", "ssslll", "llgggg", "cddddp", "ccssss", "ccssss", "cccddd", "ggggll",
			"ggcccc", "llllgg", "pddddl", "lllggg", "ccssss", "ssllll", "ppgggg", "ssssll", "ccccdd", "ppppss",
			"cccsss", "lpppps", "dddlll", "cccczp", "ssssll", "ppppdd", "ddddll", "ppppll", "llcccc", "ggggpp",
			"llllcc", "lllggg", "dddppp", "pllllc", "lpppps", "dddppp", "ggggpp", "dddppp", "ppplll", "ssllll",
			"ppdddd", "llll77", "lpppps", "ppgggg", "ggggcc", "7ppppd", "ccccss", "lddddp", "ggggll", "lllppp",
			"ll7777", "lllddd", "ddddpp", "ddpppp", "sssscc", "pssssz", "ppssss", "dppppl", "cddddp", "ccccdd",
			"dppppg", "ccssss", "ccccdd", "lldddd", "llcccc", "pggggl", "cccsss", "zccccd", "dddlll", "ppgggg",
			"czpppp", "ppppdd", "ggggll", "ppllll", "dppppg", "ggglll", "gggppp", "ggllll", "lldddd", "ccccdd",
			"ddddpp", "ppcccc", "cssssp", "ccccss", "77pppp", "llgggg", "lllldd", "sssscc", "ddddpp", "sscccc",
			"sppppc", "pddddl", "pppddd", "ssslll", "lllddd", "lggggc", "dddppp", "ssssll", "ssslll", "ppgggg",
			"llgggg", "ddllll", "dppppg", "lll777", "ssslll", "pppggg", "lddddp", "pddddl", "sssszc", "ddddpp",
			"pppggg", "dllllg", "lllppp", "ggggcc", "sssppp", "sspppp", "ppgggg", "cccddd", "ppplll", "cccddd",
			"lddddp", "pggggc", "sssscc", "sssppp", "ssssll", "cddddp", "llllgg", "pggggl", "777ppp", "ccccdd",
			/* "lsssll", */ "ppllll", "ppcccc", "lgggpp", "ppppll", "szcccc", "ppppgg", "ppcccc", "ggggll", "pddddl",
			"ppppcc", "ssslll", "zpppps", "lggggc", "plllcc", "dddppp", "sspppp", "ssllll", "ggpppp", "gpppps",
			"llgggg", "gggppp", "zpppps", "ppllll", "ddllll", "lllddd", "pppggg", "szcccc", "ppppss", "lll777",
			"ssslll", "czpppp", "ggglll", "pssssz", "llgggg", "ddddpp", "ppppll", "pppccc", "llgggg", "llgggg",
			"lllldd", "plllld", "ggggll", "ccdddd", "pppggg", "dppppg", "ddllll", "llgggg", "gpppps", "ppppgg",
			"ccssss", "ddpppp", "dddlll", "ssllll", "pssssl", "ccccss", "ppppgg", "llcccc", "ddddpp", "gggppp",
			"lllldd", "pllllc", "ccdddd", "ggllll", "lldddd", "ppgggg", "cssssl", "ddpppp", "dddppp", "pllllc",
			"pppsss", "szcccc", "lldddd", "lccccs", "lccccs", "ppdddd", "ccccss", "ppplll", "cccsss", "llpppp",
			"gggccc", "dllllg", "ssslll", "scccss", "ccccss", "lllccc", "cccsss", "sspppp", "cddddp", "dllllg",
			"lllppp", "dddlll", "llgggg", "dppppg", "sssspp", "sspppp", "lllccc", "sppppg", "sppppc", "lggggp",
			"ddddll", "llllgg", "szcccc", "cssssl", "ggggpp", "ddddpp", "cccsss", "sllllg", "ddpppp", "ppppgg",
			"ssslll", "dppppl", "dddlll", "llcccc", "sssppp", "pggggl", "ggggcc", "lll777", "glllld", "ccssss",
			"dllllg", "pppggg", "zccccd", "ddddll", "cssssl", "ppplll", "ppppdd", "sssscc", "ccczpp", "ssslll",
			"cccsss", "ppssss", "sllllp", "ppllll", "pllllc", "ppppcc", "ccczpp", "sssscc", "gpppps", "cccsss",
			"lddddp", "ggllll", "glllld", "llllgg", "ppssss", "ggllll", "cddddl", "llcccc", "ddddpp", "ppssss",
			"ppllll", "ccccdd", "ppppss", "gccccz", "gggccc", "ccdddd", "7777pp", "lllddd", "ssllll", "lllddd",
			"ggggpp", "glllld", "cssssp", "pppddd", "cccddd", "ddddll", "ccdddd", "sscccc", "lllggg", "dppppl",
			"ssslll", "dppppg", "ggglll", "ssslll", "pppggg", "gggppp", "pppggg", "gccccz", "gg7777", "sspppp",
			"sssppp", "ppdddd", "sccccd", "ppplll", "ggpppp", "ggggll", "lllldd", "pccccd", "cccsss", "dddlll",
			"gggppp", "czpppp", "g7777p", "ccccss", "cczppp", "gggg77", "ppppcc", "ssslll", "llgggg", "llcccc",
			"pppsss", "sllll7", "ggggpp", "ddllll", "ssslll", "llgggg", "ggggpp", "lldddd", "llgggg", "ccccss",
			"ppllll", "pccccs", "sllllp", "pccccs", "dppppl", "ppppdd", "7777pp", "sssppp", "sspppp", "llllpp",
			"cccddd", "ppplll", "777ppp", "dppppl", "llgggg", "ddpppp", "ddddll", "lllggg", "cczppp", "dllllg",
			"pssssc", "lllggg", "ssslll", "lllggg", "lllldd", "lpppps", "llllpp", "sssscc", "cddddp", "dddppp",
			"ggpppp", "ppdddd", "ppgggg", "sssspp", "gpppps", "ppcccc", "ggpppp", "lllggg", "ppcccc", "czpppp",
			"ppcccc", "cddddp", "ggllll", "ccssss", "lldddd", "ccssss", "gggg77", "ssslll", "cccsss", "sllllp",
			"llgggg", "777ppp", "dddppp", "pppggg", "llpppp", "ssssll", "llcccc", "ssssll", "lllggg", "lllddd",
			"ggggpp", "llcccc", "gccccs", "dddppp", "77pppp", "sppppc", "lccccs", "ggpppp", "llllcc", "lggggp",
			"sssspp", "ggggcc", "cczppp", "cccsss", "ggg777", "pppsss", "ppssss", "ggcccc", "ppssss", "7777pp",
			"ccssss", "lllccc", "ccllll", "ppppll", "ssslll", "ppppgg", "pccccs", "dppppg", "cddddl", "lgggg7",
			"dppppl", "lllccc", "ppppss", "lccccs", "cccsss", "ddddpp", "cddddp", "777ppp", "ccccdd", "lccccs",
			"dllllg", "ssslll", "llllcc", /* "c7777p", */ "ppcccc", "ppplll", "gggppp", "cssssp", "sssspp", "ppppll",
			"ll7777", "cccsss", "pppsss", "ppppss", "ssslll", "sllllg", "pppsss", "llcccc", "ggggcc", "ssszcc",
			"ssszcc", "ppppss", "ccccdd", "pppggg", "ddllll", "dppppg", "g7777p", "ssslll", "gggccc", "llgggg",
			"lddddp", "cddddp", "ccdddd", "llllcc", "sssscc", "ccczpp", "ppcccc", "ddpppp", "dddppp", "gccccz",
			"ppplll", "dddppp", "gggppp", "cccsss", "cddddp", "ggggpp", "sppppc", "lllggg", "ppllll", "llllcc",
			"ppppll", "ppllll", "pssssc", "ddpppp", "ddpppp", "lllggg", "777ppp", "lllggg", "lddddp", "llllgg",
			"pppsss", "ssssll", "gpppps", "llllgg", "ppppgg", "pllllc", "ddddpp", "zpppps", "ccssss", "ddddll",
			"ssslll", "cczppp", "gggppp", "ssslll", "sscccc", "gccccs", "pggggl", "ggggll", "slllld", "pssssc",
			"pggggl", "ccssss", "sssspp", "ggggcc", "sssspp", "lllccc", "ccccdd", "cccczp", "lldddd", "g7777p",
			"ggcccc", "cccddd", "gccccs", "pppccc", "ssssll", "dddppp", "ppgggg", "lllldd", "dppppl", "slllld",
			"sszccc", "ppppss", "77777p", "cccsss", "lllggg", "cssssp", "77pppp", "pccccs", "ppssss", "pssssl",
			"sszccc", "7ppppd", "llcccc", "dppppl", "clllld", "cllllg", "cllllp", "c77777", "plllld", "pllllc",
			"plllld", "pllllg", };

	/**
	 * Slot machine screen observations.
	 */
	public static final Map<Character, Double> SYMBOLS_FREQUENCIES = new HashMap<Character, Double>();

	/**
	 * Reel start combination.
	 */
	private static final String REEL_START = "zccccdddd";

	/**
	 * Reel end combination.
	 */
	private static final String REEL_END = "ppppssssz";

	/**
	 * Combinations used as controls of the reel correctness.
	 */
	private static final String CONTROLS[] = { REEL_START, "ggggcccczppppssss", "llllgggg7777ppppdddd",
			"sssllll7777ppppdddd", REEL_END };

	/**
	 * Minimal generated reel length.
	 */
	private static final int MIN_REEL_LENGTH = 80;

	/**
	 * Maximum generated reel length.
	 */
	private static final int MAX_REEL_LENGTH = 280;

	/**
	 * Combinations which are neighbors.
	 */
	private static final Map<String, Set<String>> NEIGHBORS = new HashMap<String, Set<String>>();

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
			NEIGHBORS.put(observation, new HashSet<String>());
			for (String neighbor : OBSERVATIONS) {
				/*
				 * Combination is not counted as neighbor if itself.
				 */
				if (observation.equals(neighbor) == true) {
					continue;
				}

				// TODO Different criteria for neighbor can speed up
				// calculations.

				if (observation.endsWith(neighbor.substring(0, 5)) == true
						&& NEIGHBORS.get(observation).contains(neighbor) == false) {
					NEIGHBORS.get(observation).add(neighbor);
				}
			}
		}

		/*
		 * TODO Add 3 special pieces from the controls.
		 */

		/*
		 * Calculate symbols frequencies.
		 */
		int total = 0;
		int counters[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		for (String observation : OBSERVATIONS) {
			for (int i = 0; i < observation.length(); i++) {
				counters[observation.charAt(i) - '7']++;
				total++;
			}
		}
		for (int i = 0; i < counters.length; i++) {
			if (counters[i] > 0) {
				SYMBOLS_FREQUENCIES.put(Character.valueOf((char) ('7' + i)), (double) counters[i] / (double) total);
			}
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
		 * Check control pieces to be presented.
		 */
		for (String control : CONTROLS) {
			if (reel.contains(control) == false) {
				return false;
			}
		}

		/*
		 * Check all observed pieces to be presented.
		 */
		for (String piece : OBSERVATIONS) {
			if (reel.contains(piece.substring(1, piece.length() - 1)) == false) {
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
				String result = reel + neighbor.substring(l);

				/*
				 * Build reels only with valid pieces inside.
				 */
				if (NEIGHBORS.containsKey(reel.substring(reel.length() - 6)) == true) {
					return result;
				} else {
					return reel;
				}
			}
		}

		return "";
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
				System.out.println("INVALID:\t" + reel);
			}

			return;
		}

		/*
		 * If the reel is too big it is more like to be incorrect - finish
		 * generation process.
		 */
		if (reel.length() > MAX_REEL_LENGTH) {
			System.err.println("TOO LONG:\t" + reel);
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
	 * Generate reel on a stair based approach.
	 * 
	 * @param reel
	 *            Current reel.
	 */
	private static void stairs(String reel) {
		/*
		 * Check for reel length.
		 */
		if (reel.endsWith(REEL_END) == true) {
			if (valid(reel) == true) {
				System.out.print("VALID:\t");
			} else {
				System.out.print("INVALID:\t");
			}
			System.out.println(reel);

			return;
		}

		/*
		 * Limit reel size.
		 */
		if (reel.length() > MAX_REEL_LENGTH) {
			// System.err.println(reel);
			return;
		}

		/*
		 * Process ahead.
		 */
		for (String neighbor : NEIGHBORS.get(reel.substring(reel.length() - 6))) {
			stairs(merge(reel, neighbor));
		}
	}

	/**
	 * Generate reel on a stair based approach.
	 * 
	 * @param reel
	 *            Current reel.
	 * @return Generated reel of empty string if it is not a valid reel.
	 */
	private static String monteCarloStairs(String reel) {
		do {
			/*
			 * End with positive result.
			 */
			if (reel.endsWith(REEL_END) == true && reel.length() > MIN_REEL_LENGTH) {
				if (valid(reel) == true) {
					return reel;
				}

				// System.out.println(reel);
				return "";
			}

			/*
			 * List next possibilities.
			 */
			Object next[] = NEIGHBORS.get(reel.substring(reel.length() - 6)).toArray();

			/*
			 * There is no step ahead.
			 */
			if (next == null || next.length == 0) {
				break;
			}

			/*
			 * Step ahead in the generation process.
			 */
			String merged = merge(reel, (String) next[PRNG.nextInt(next.length)]);
			if (merged.equals(reel) || merged.equals("")) {
				break;
			} else {
				reel = merged;
			}
		} while (reel.length() < MAX_REEL_LENGTH);
		// System.err.println(reel);

		return "";
	}

	/**
	 * Euclidean distance between reel symbols frequencies and observation
	 * symbols frequencies.
	 * 
	 * @param reel
	 *            Generated reel.
	 * @return Euclidean distance.
	 */
	private static double distance(String reel) {
		int total = 0;
		int counters[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		for (int i = 0; i < reel.length(); i++) {
			counters[reel.charAt(i) - '7']++;
			total++;
		}

		Map<Character, Double> frequencies = new HashMap<Character, Double>();
		for (int i = 0; i < counters.length; i++) {
			if (counters[i] > 0) {
				frequencies.put(Character.valueOf((char) ('7' + i)), (double) counters[i] / (double) total);
			}
		}

		/*
		 * Euclidean distance
		 */
		double distance = 0;
		for (Character symbol : frequencies.keySet()) {
			double value = frequencies.get(symbol) - SYMBOLS_FREQUENCIES.get(symbol);
			distance += value * value;
		}

		return Math.sqrt(distance);
	}

	/**
	 * Monte-Carlo Search based reel reconstruction.
	 */
	private static void monte() {
		final long INTERVAL = 10000L;
		final long EXPERIMENTS = 1000000L;

		System.out.println(NEIGHBORS);

		/*
		 * Solutions generation.
		 */
		Set<String> solutions = new HashSet<String>();
		for (long g = 0L, interval = (EXPERIMENTS / INTERVAL) <= 0 ? 1
				: (EXPERIMENTS / INTERVAL); g < EXPERIMENTS; g++) {
			if (g % interval == 0) {
				System.err.println(String.format("%5.2f", (100D * g / EXPERIMENTS)) + "%");
			}

			solutions.add(monteCarloStairs(REEL_START));
		}

		/*
		 * Print solutions with frequencies distance.
		 */
		for (String solution : solutions) {
			System.out.println(distance(solution) + "\t" + solution.length() + "\t" + solution);
		}
	}

	/**
	 * Application single entry point method.
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("START");

		// recursiveLevel = 1;
		// generate(REEL_START);

		// stairs(REEL_START);

		monte();

		System.out.println("FINISH");
	}

}
