import java.util.Arrays;
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
	 * Size of the observed reel.
	 */
	private static final int OBSERVATION_SIZE = 4;

	/**
	 * Slot machine screen observations.
	 */
	public static final String OBSERVATIONS[] = { "plll", "sccc", "ssss", "sppp", "pggg", "ssss", "ppps", "ppcc",
			"pccc", "glll", "ppps", "cddd", "cccc", "ssll", "gggg", "psss", "llgg", "pppd", "lldd", "llpp", "slll",
			"pppp", "ssll", "dppp", "zppp", "777p", "sssl", "llld", "pppg", "7777", "pppl", "llll", "csss", "dppp",
			"ppgg", "lllp", "ppcc", "sspp", "gggc", "pppp", "cccs", "sscc", "ssss", "gccc", "pppl", "gggl", "ddpp",
			"cccz", "7ppp", "pppp", "llll", "sspp", "cccs", "llll", "dddd", "gggg", "llcc", "llll", "ssss", "sspp",
			"ccdd", "ddpp", "pppp", "ssll", "pppp", "ppss", "pggg", "7777", "dppp", "gggg", "llll", "ppss", "llll",
			"cccc", "ssss", "pppl", "dddp", "cccc", "psss", "lggg", "ccss", "pddd", "ssss", "zppp", "777p", "lddd",
			"lllc", "pppg", "7777", "llll", "pppl", "pppp", "pddd", "dppp", "lldd", "ggcc", "cccc", "cccc", "cccs",
			"lllc", "plll", "ccss", "ppps", "ppps", "pppp", "dddp", "ddpp", "dddd", "dlll", "llll", "lllc", "ppss",
			"plll", "pggg", "gccc", "sssl", "cddd", "lllg", "pppp", "czpp", "dddp", "lccc", "llgg", "gggc", "lll7",
			"gggc", "pppc", "ssss", "pggg", "psss", "ppll", "cczp", "llll", "sspp", "gggl", "cddd", "pppp", "pppp",
			"gggp", "pggg", "dddl", "dppp", "gggl", "ccss", "pppp", "pppc", "gggg", "lccc", "ccss", "cccd", "gppp",
			"ggpp", "dppp", "llll", "gccc", "gggg", "dddp", "csss", "lccc", "sszc", "ddll", "llll", "gppp", "llll",
			"sspp", "cccs", "lggg", "llgg", "llgg", "sppp", "sscc", "cccd", "ppss", "pppp", "glll", "lllp", "cczp",
			"gggl", "ssss", "dddl", "cccs", "pggg", "slll", "ppss", "ppcc", "czpp", "ccss", "gppp", "ssll", "ggpp",
			"pggg", "gg77", "lggg", "llgg", "ssll", "dddd", "llgg", "llll", "777p", "ppgg", "lddd", "zppp", "ppps",
			"ccdd", "pppp", "pppp", "gggg", "ggpp", "ccdd", "pccc", "gppp", "psss", "pppc", "pppg", "ppgg", "ppps",
			"ppgg", "psss", "psss", "gggg", "gppp", "ppss", "cccc", "ssll", "pppp", "llll", "cczp", "psss", "pppl",
			"csss", "sssc", "ssss", "ddpp", "cccc", "plll", "csss", "sssc", "lldd", "sssc", "sssl", "pppp", "cccc",
			"llld", "csss", "sssp", "gppp", "ssss", "ppss", "cccc", "7777", "ppss", "cccs", "lddd", "sppp", "ppgg",
			"ppll", "ppdd", "llgg", "ppcc", "sppp", "sppp", "sssl", "lllc", "cddd", "sssl", "ssss", "ddpp", "pppp",
			"sssl", "dddp", "czpp", "gggg", "cddd", "pddd", "sssc", "ppps", "ccdd", "cczp", "dlll", "dppp", "cccd",
			"sccc", "csss", "cccs", "ppss", "ppgg", "cddd", "ll77", "zccc", "g777", "slll", "llgg", "lggg", "7ppp",
			"7777", "pppc", "ssss", "ssss", "pccc", "ggg7", "dddp", "ddll", "dddl", "llcc", "dddp", "lggg", "gggg",
			"zccc", "sssp", "pppg", "sppp", "gggp", "7777", "ppps", "ggcc", "ppps", "ppss", "cccc", "llpp", "cccc",
			"dddp", "llll", "cccc", "dddl", "cczp", "sssl", "ppps", "cccd", "gggg", "llpp", "ssll", "lggg", "dddd",
			"csss", "csss", "ccdd", "gggl", "gccc", "lllg", "dddd", "llgg", "csss", "slll", "pggg", "sssl", "cccd",
			"ppps", "ccss", "pppp", "ddll", "cccz", "sssl", "pppd", "dddl", "pppl", "lccc", "gggp", "lllc", "llgg",
			"ddpp", "llll", "pppp", "ddpp", "gggp", "ddpp", "ppll", "slll", "pddd", "lll7", "pppp", "pggg", "gggc",
			"pppp", "cccs", "dddd", "gggl", "llpp", "l777", "lldd", "dddp", "dppp", "sssc", "ssss", "psss", "pppp",
			"dddd", "cccd", "pppp", "csss", "cccd", "lddd", "lccc", "gggg", "ccss", "cccc", "ddll", "pggg", "zppp",
			"pppd", "gggl", "plll", "pppp", "ggll", "ggpp", "glll", "lddd", "cccd", "dddp", "pccc", "ssss", "cccs",
			"7ppp", "lggg", "llld", "sssc", "dddp", "sccc", "pppp", "dddd", "ppdd", "ssll", "lldd", "gggg", "ddpp",
			"sssl", "ssll", "pggg", "lggg", "dlll", "pppp", "ll77", "ssll", "ppgg", "dddd", "dddd", "sssz", "dddp",
			"ppgg", "llll", "llpp", "gggc", "sspp", "sppp", "pggg", "ccdd", "ppll", "ccdd", "dddd", "gggg", "sssc",
			"sspp", "sssl", "dddd", "lllg", "gggg", "77pp", "cccd", "sssl", "plll", "pccc", "gggp", "pppl", "zccc",
			"pppg", "pccc", "gggl", "dddd", "pppc", "ssll", "pppp", "gggg", "lllc", "ddpp", "sppp", "slll", "gppp",
			"pppp", "lggg", "ggpp", "pppp", "plll", "dlll", "lldd", "ppgg", "zccc", "ppps", "ll77", "ssll", "zppp",
			"ggll", "ssss", "lggg", "dddp", "pppl", "ppcc", "lggg", "lggg", "llld", "llll", "gggl", "cddd", "ppgg",
			"pppp", "dlll", "lggg", "pppp", "pppg", "csss", "dppp", "ddll", "slll", "ssss", "cccs", "pppg", "lccc",
			"dddp", "ggpp", "llld", "llll", "cddd", "glll", "lddd", "pggg", "ssss", "dppp", "ddpp", "llll", "ppss",
			"zccc", "lddd", "cccc", "cccc", "pddd", "cccs", "ppll", "ccss", "lppp", "ggcc", "llll", "ssll", "cccs",
			"cccs", "llcc", "ccss", "sppp", "dddd", "llll", "llpp", "ddll", "lggg", "pppp", "sssp", "sppp", "llcc",
			"pppp", "pppp", "gggg", "dddl", "lllg", "zccc", "ssss", "gggp", "dddp", "ccss", "llll", "dppp", "pppg",
			"ssll", "pppp", "ddll", "lccc", "sspp", "gggg", "gggc", "ll77", "llll", "csss", "llll", "ppgg", "cccc",
			"dddl", "ssss", "ppll", "pppd", "sssc", "cczp", "ssll", "ccss", "psss", "llll", "plll", "llll", "pppc",
			"cczp", "sssc", "pppp", "ccss", "dddd", "glll", "llll", "lllg", "psss", "glll", "dddd", "lccc", "dddp",
			"psss", "plll", "cccd", "ppps", "cccc", "ggcc", "cddd", "777p", "lldd", "slll", "lldd", "gggp", "llll",
			"ssss", "ppdd", "ccdd", "dddl", "cddd", "sccc", "llgg", "pppp", "ssll", "pppp", "ggll", "ssll", "ppgg",
			"ggpp", "ppgg", "cccc", "g777", "sppp", "sspp", "pddd", "cccc", "ppll", "gppp", "gggl", "llld", "cccc",
			"ccss", "ddll", "ggpp", "zppp", "7777", "cccs", "czpp", "ggg7", "pppc", "ssll", "lggg", "lccc", "ppss",
			"llll", "gggp", "dlll", "ssll", "lggg", "gggp", "lddd", "lggg", "cccs", "plll", "cccc", "llll", "cccc",
			"pppp", "pppd", "777p", "sspp", "sppp", "lllp", "ccdd", "ppll", "77pp", "pppp", "lggg", "dppp", "dddl",
			"llgg", "czpp", "llll", "ssss", "llgg", "ssll", "llgg", "llld", "pppp", "lllp", "sssc", "dddd", "ddpp",
			"gppp", "pddd", "pggg", "sssp", "pppp", "pccc", "gppp", "llgg", "pccc", "zppp", "pccc", "dddd", "glll",
			"csss", "lddd", "csss", "ggg7", "ssll", "ccss", "llll", "lggg", "77pp", "ddpp", "ppgg", "lppp", "sssl",
			"lccc", "sssl", "llgg", "lldd", "gggp", "lccc", "cccc", "ddpp", "7ppp", "pppp", "cccc", "gppp", "lllc",
			"gggg", "sssp", "gggc", "czpp", "ccss", "gg77", "ppss", "psss", "gccc", "psss", "777p", "csss", "llcc",
			"clll", "pppl", "ssll", "pppg", "cccc", "pppp", "dddd", "gggg", "pppp", "llcc", "ppps", "cccc", "ccss",
			"dddp", "dddd", "77pp", "cccd", "cccc", "llll", "ssll", "lllc", "7777", "pccc", "ppll", "ggpp", "ssss",
			"sssp", "pppl", "l777", "ccss", "ppss", "ppps", "ssll", "llll", "ppss", "lccc", "gggc", "sszc", "sszc",
			"ppps", "cccd", "ppgg", "dlll", "pppp", "7777", "ssll", "ggcc", "lggg", "dddd", "dddd", "cddd", "lllc",
			"sssc", "cczp", "pccc", "dppp", "ddpp", "cccc", "ppll", "ddpp", "ggpp", "ccss", "dddd", "gggp", "pppp",
			"llgg", "plll", "lllc", "pppl", "plll", "ssss", "dppp", "dppp", "llgg", "77pp", "llgg", "dddd", "lllg",
			"ppss", "sssl", "pppp", "lllg", "pppg", "llll", "dddp", "pppp", "csss", "dddl", "ssll", "czpp", "ggpp",
			"ssll", "sccc", "cccc", "gggg", "gggl", "llll", "ssss", "gggg", "csss", "sssp", "gggc", "sssp", "llcc",
			"cccd", "cccz", "lddd", "7777", "gccc", "ccdd", "cccc", "ppcc", "sssl", "ddpp", "pggg", "llld", "pppp",
			"llll", "szcc", "ppps", "7777", "ccss", "llgg", "ssss", "7ppp", "cccc", "psss", "ssss", "szcc", "pppp",
			"lccc", "pppp", };

	/**
	 * Slot machine screen observations.
	 */
	public static final Map<Character, Double> SYMBOLS_FREQUENCIES = new HashMap<Character, Double>();

	/**
	 * Reel start combination.
	 */
	private static final String REEL_START = "cccz";

	/**
	 * Reel end combination.
	 */
	private static final String REEL_END = "zppp";

	/**
	 * Combinations used as controls of the reel correctness.
	 */
	private static final String CONTROLS[] = { REEL_START, "ggggcccczppppssss", "ppppsssszccccdddd",
			"llllgggg7777ppppdddd", "sssllll7777ppppdddd", REEL_END };

	/**
	 * Minimal generated reel length.
	 */
	private static final int MIN_REEL_LENGTH = 50;

	/**
	 * Maximum generated reel length.
	 */
	private static final int MAX_REEL_LENGTH = 180;

	/**
	 * Combinations which are neighbors.
	 */
	private static final Map<String, Set<String>> NEIGHBORS = new HashMap<String, Set<String>>();

	/*
	 * Initialization of the static variables.
	 */
	static {
		for (String observation : OBSERVATIONS) {
			/*
			 * Each combination should be presented only once in the neighbor matrix.
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

				/*
				 * If the neighbor is already presented we do not count it.
				 */
				if (NEIGHBORS.get(observation).contains(neighbor) == true) {
					continue;
				}

				// TODO Different criteria for neighbor can speed up
				// calculations.
				for (int size = OBSERVATION_SIZE - 1; size > 0; size--) {
					/*
					 * Check overlapping with different sizes.
					 */
					if (observation.endsWith(neighbor.substring(0, size)) == false) {
						continue;
					}

					/*
					 * Keep only valid overlapping.
					 */
					NEIGHBORS.get(observation).add(neighbor);
				}
			}
		}

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
			if (reel.contains(piece) == false) {
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
	 * @return Reel merged with the neighbor or empty string if there is a problem.
	 */
	private static String merge(String reel, String neighbor) {
		/*
		 * Check different overlap sizes.
		 */
		for (int overlap = neighbor.length() - 1; overlap > 0; overlap--) {
			/*
			 * If current reel does not end with the current checked neighbor we do nothing.
			 */
			if (reel.endsWith(neighbor.substring(0, neighbor.length() - overlap)) == false) {
				continue;
			}

			/*
			 * Merge end with part of the neighbor.
			 */
			return reel + neighbor.substring(neighbor.length() - overlap);
		}

		/*
		 * Return the reel itself if the merge is not possible.
		 */
		return reel;
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
			Object next[] = NEIGHBORS.get(reel.substring(reel.length() - OBSERVATION_SIZE)).toArray();

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
		// System.out.println(reel);

		return "";
	}

	/**
	 * Euclidean distance between reel symbols frequencies and observation symbols
	 * frequencies.
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
		final long EXPERIMENTS = 100000000L;

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

		monte();

		System.out.println("FINISH");
	}

}
