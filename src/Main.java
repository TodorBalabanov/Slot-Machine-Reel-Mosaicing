import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
	public static final String OBSERVATIONS[] = { "7777pp", "7777pp", "7777pp", "777ppp", "777ppp", "777ppp", "777ppp",
			"777ppp", "777ppp", "777ppp", "777ppp", "777ppp", "77pppp", "77pppp", "77pppp", "77pppp", "7ppppc",
			"7ppppc", "7ppppc", "7ppppc", "7ppppc", "7ppppc", "7ppppc", "ggggzl", "ggggzp", "ggggzp", "ggggzp",
			"ggggzp", "ggggzp", "ggggzp", "ggggpp", "ggggpp", "ggggcc", "ggggcc", "ggggcc", "ggggcc", "gggzpp",
			"gggzpp", "gggzpp", "gggzpp", "gggppp", "gggppp", "gggppp", "gggccc", "gggccc", "gggccc", "gggccc",
			"gggccc", "ggzppp", "ggzppp", "ggzppp", "ggzppp", "ggzppp", "ggpppp", "ggcccc", "ggcccc", "ggcccc",
			"ggcccc", "ggcccc", "gzpppp", "gzpppp", "gllllg", "gppppz", "gppppz", "gppppz", "gppppz", "gppppz",
			"gppppz", "gppppz", "gccccs", "gccccs", "gccccs", "gccccs", "gccccs", "ddddll", "ddddll", "ddddll",
			"ddddll", "ddddll", "ddddll", "ddddll", "ddddll", "ddddll", "ddddll", "ddddll", "ddddll", "dddlll",
			"dddlll", "dddlll", "dddlll", "dddlll", "dddlll", "dddlll", "dddlll", "dddlll", "dddlll", "dddlll",
			"dddlll", "dddlll", "dddlll", "dddlll", "ddllll", "ddllll", "ddllll", "ddllll", "ddllll", "ddllll",
			"ddllll", "ddllll", "ddllll", "ddllll", "ddllll", "ddllll", "ddllll", "ddllll", "dllllg", "dllllg",
			"dllllg", "dllllg", "dllllg", "dllllg", "dllllp", "dllllp", "dllllp", "dllllp", "dllllp", "dllllp",
			"dllllp", "dllllp", "dlllls", "dlllls", "dlllls", "dlllls", "dlllls", "dlllls", "dlllls", "dlllls",
			"zddddl", "zddddl", "zddddl", "zddddl", "zddddl", "zddddl", "zddddl", "zddddl", "zddddl", "zppppg",
			"zppppg", "zppppg", "zppppg", "zppppg", "zppppg", "l7777p", "l7777p", "l7777p", "l7777p", "l7777p",
			"l7777p", "l7777p", "l7777p", "lggggz", "lggggz", "lggggz", "lggggz", "lggggz", "lggggz", "lggggp",
			"lggggp", "lggggp", "lggggp", "lggggp", "ll7777", "ll7777", "ll7777", "ll7777", "ll7777", "ll7777",
			"ll7777", "ll7777", "llgggg", "llgggg", "llgggg", "llgggg", "llgggg", "llgggg", "lll777", "lll777",
			"lll777", "lll777", "lll777", "lll777", "lll777", "lll777", "lll777", "lll777", "lll777", "lll777",
			"lllggg", "lllggg", "lllggg", "lllggg", "lllggg", "lllggg", "lllggg", "lllggg", "lllggg", "lllggg",
			"lllggg", "lllggg", "lllggg", "llll77", "llll77", "llll77", "llll77", "llll77", "llll77", "llllgg",
			"llllgg", "llllgg", "llllgg", "llllgg", "llllgg", "llllgg", "llllgg", "llllgg", "llllgg", "llllgg",
			"llllgg", "llllgg", "llllpp", "llllpp", "llllpp", "llllpp", "llllpp", "llllpp", "llllpp", "llllpp",
			"llllpp", "llllpp", "llllpp", "llllpp", "llllpp", "llllpp", "llllpp", "llllss", "llllss", "llllss",
			"llllss", "llllss", "llllss", "llllss", "lllppp", "lllppp", "lllppp", "lllppp", "lllppp", "lllppp",
			"lllppp", "lllppp", "lllppp", "lllppp", "lllsss", "lllsss", "lllsss", "lllsss", "lllsss", "lllsss",
			"lllsss", "lllsss", "lllsss", "lllsss", "llpppp", "llpppp", "llpppp", "llpppp", "llpppp", "llpppp",
			"llpppp", "llpppp", "llpppp", "llpppp", "llpppp", "llpppp", "llpppp", "llpppp", "llpppp", "llssss",
			"llssss", "llssss", "llssss", "llssss", "llssss", "lppppl", "lppppl", "lppppl", "lppppl", "lppppl",
			"lpppps", "lpppps", "lpppps", "lpppps", "lpppps", "lpppps", "lpppps", "lssssl", "lssssl", "lssssl",
			"lssssl", "lssssl", "pggggc", "pggggc", "pggggc", "pggggc", "pggggc", "pggggc", "pggggc", "pggggc",
			"pzdddd", "pzdddd", "pzdddd", "pzdddd", "pzdddd", "pzdddd", "pzdddd", "pllll7", "pllll7", "pllll7",
			"ppgggg", "ppgggg", "ppgggg", "ppgggg", "ppgggg", "ppzddd", "ppzddd", "ppzddd", "ppzddd", "ppzddd",
			"ppzddd", "ppzddd", "ppllll", "ppllll", "ppllll", "ppllll", "ppllll", "pppggg", "pppggg", "pppggg",
			"pppggg", "pppggg", "pppzdd", "pppzdd", "pppzdd", "pppzdd", "pppzdd", "pppzdd", "pppzdd", "pppzdd",
			"ppplll", "ppplll", "ppplll", "ppplll", "ppplll", "ppppgg", "ppppgg", "ppppgg", "ppppzd", "ppppzd",
			"ppppzd", "ppppzd", "ppppll", "ppppll", "ppppll", "ppppll", "ppppll", "ppppll", "ppppll", "ppppll",
			"ppppss", "ppppss", "ppppss", "ppppss", "ppppcc", "ppppcc", "ppppcc", "ppppcc", "pppsss", "pppsss",
			"pppsss", "pppsss", "pppsss", "pppsss", "pppsss", "pppsss", "pppccc", "pppccc", "pppccc", "pppccc",
			"pppccc", "pppccc", "pppccc", "ppssss", "ppssss", "ppssss", "ppssss", "ppssss", "ppssss", "ppssss",
			"ppssss", "ppssss", "ppssss", "ppssss", "ppssss", "ppssss", "ppssss", "ppcccc", "ppcccc", "ppcccc",
			"ppcccc", "ppcccc", "ppcccc", "pssssc", "pssssc", "pccccs", "pccccs", "pccccs", "pccccs", "pccccs",
			"pccccs", "pccccs", "pccccs", "pccccs", "sddddl", "sddddl", "sddddl", "sddddl", "sddddl", "sddddl",
			"sddddl", "sddddl", "sddddl", "sddddl", "sddddl", "sddddl", "sddddl", "sddddl", "sllllp", "sllllp",
			"sllllp", "sllllp", "sllllp", "sllllp", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd",
			"ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssdddd", "ssllll",
			"ssllll", "ssllll", "ssllll", "ssllll", "ssllll", "ssllll", "ssllll", "ssllll", "ssllll", "sssddd",
			"sssddd", "sssddd", "sssddd", "sssddd", "sssddd", "sssddd", "sssddd", "sssddd", "sssddd", "sssddd",
			"sssddd", "ssslll", "ssslll", "ssslll", "ssslll", "ssslll", "ssssdd", "ssssdd", "ssssdd", "ssssdd",
			"ssssdd", "ssssdd", "ssssdd", "ssssdd", "ssssdd", "ssssdd", "ssssdd", "ssssdd", "ssssdd", "ssssdd",
			"ssssdd", "ssssdd", "ssssdd", "ssssll", "ssssll", "ssssll", "ssssll", "ssssll", "ssssll", "ssssll",
			"sssscc", "sssscc", "sssscc", "sssscc", "sssccc", "sssccc", "sssccc", "sssccc", "sssccc", "sssccc",
			"sssccc", "sssccc", "sssccc", "sscccc", "sccccl", "sccccl", "sccccl", "sccccl", "cllllg", "cllllg",
			"cllllg", "cllllg", "cllllg", "cssssd", "cssssd", "cssssd", "cssssd", "cssssd", "cssssd", "cssssd",
			"cssssd", "cssssd", "cssssd", "cssssd", "cssssd", "cssssd", "ccllll", "ccllll", "ccllll", "ccssss",
			"ccssss", "ccssss", "ccssss", "ccssss", "ccssss", "ccssss", "ccssss", "ccssss", "ccssss", "ccssss",
			"ccssss", "ccssss", "ccclll", "ccclll", "ccclll", "ccclll", "cccsss", "cccsss", "cccsss", "cccsss",
			"cccsss", "cccsss", "cccsss", "cccsss", "cccsss", "cccsss", "cccsss", "cccsss", "cccsss", "ccccll",
			"ccccll", "ccccll", "ccccll", "ccccll", "ccccll", "ccccll", "ccccll", "ccccll", "ccccll", "ccccll",
			"ccccll", "ccccss", "ccccss", "ccccss", "ccccss", "ccccss", "ccccss", "ccccss", "ccccss", "ccccss",
			"ccccss", "ccccss", "ccccss", "ccccss", "ccccss", };

	/**
	 * Combinations used as controls of the reel correctness.
	 */
	private static final String CONTROLS[] = { "llllggggzppppggggccccssssddddllll", "7777ppppccccssssddddllll",
			"llllggggppppzddddllll", "llllppppllll7777", };

	/**
	 * Reel start combination.
	 */
	private static final String REEL_START = "7777ppppccccssssddddllll";

	/**
	 * Reel end combination.
	 */
	private static final String REEL_END = "llllppppllll7777";

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
	 */
	private static void monteCarloStairs(String reel) {
		do {
			/*
			 * End with positive result.
			 */
			if (reel.endsWith(REEL_END) == true) {
				if (valid(reel) == true) {
					System.out.print("  VALID:");
					System.out.print("\t");
					System.out.println(reel);
				} else {
					// System.out.print("INVALID:");
					// System.out.print("\t");
					// System.out.println(reel);
				}

				return;
			}

			/*
			 * List next possibilities.
			 */
			Object next[] = NEIGHBORS.get(reel.substring(reel.length() - 6)).toArray();

			/*
			 * There is no step ahead.
			 */
			if (next == null || next.length == 0) {
				continue;
			}

			/*
			 * Step ahead in the generation process.
			 */
			reel = merge(reel, (String) next[PRNG.nextInt(next.length)]);
		} while (reel.length() < MAX_REEL_LENGTH);
		// System.err.println(reel);
	}

	/**
	 * Connect two pieces in a single piece.
	 * 
	 * @param left
	 *            Piece from the left side.
	 * @param right
	 *            Piece from the right side.
	 * @return Single connected piece.
	 */
	private static String connect(String left, String right) {
		return "";
	}

	/**
	 * Array with pieces which should be connected between each other.
	 * 
	 * @param pieces
	 *            Array of pieces.
	 * @return Single connected string.
	 */
	private static String reconnect(String[] pieces) {
		String result = "";

		for (int i = 0; i < pieces.length - 1; i++) {
			connect(pieces[i], pieces[i + 1]);
		}

		return result;
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

		final long EXPERIMENTS = 10000000000L;
		final long INTERVAL = 10000L;
		for (long g = 0L, interval = (EXPERIMENTS / INTERVAL) <= 0 ? 1
				: (EXPERIMENTS / INTERVAL); g < EXPERIMENTS; g++) {
			if (g % interval == 0) {
				System.err.println(String.format("%5.2f", (100D * g / EXPERIMENTS)) + "%");
			}

			monteCarloStairs(REEL_START);
		}

		// reconnect(new String[] { "7777ppppccccssssdddd", "llllggggppppzdddd",
		// "llllggggzppppggggccccssssdddd",
		// "llllppppllll7777" });
		// reconnect(new String[] { "7777ppppccccssssddddllll",
		// "ggggzppppggggccccssssdddd", "llllggggppppzddddllll",
		// "ppppllll7777" });

		System.out.println("FINISH");
	}

}
