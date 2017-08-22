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
	public static final Set<String> OBSERVATIONS = new HashSet<String>(Arrays.asList(new String[] {

			"llll", "ppzs", "llss", "ppzs", "cggg", "ppll", "gppp", "ppll", "cddd", "pppc", "cccc", "ppzs", "dlll",
			"ccgg", "cccg", "pppp", "dddd", "pzcc", "llll", "ppzc", "cccg", "ddll", "ppss", "cccg", "cddd", "pppz",
			"cccd", "cccg", "gggd", "llld", "cccc", "cccc", "lllp", "7777", "ggdd", "pzcc", "cddd", "pppp", "ccgg",
			"lddd", "gggg", "lllp", "ddd7", "ddss", "zppp", "ggdd", "ddss", "cggg", "pppp", "dddd", "ddds", "pppz",
			"sspp", "gppp", "pzss", "pppz", "pppd", "sssl", "sppp", "ccdd", "dzpp", "lllp", "cddd", "ppps", "dddl",
			"ggpp", "gggg", "llll", "cccc", "cccc", "pppp", "pzss", "cccc", "pzss", "dsss", "ppzs", "dddd", "cccg",
			"ssss", "sssl", "pppc", "ppcc", "gggg", "dddd", "ggpp", "gggp", "ppll", "pzcc", "gggg", "llll", "dd77",
			"7777", "cddd", "llpp", "cddd", "cddd", "lllc", "lppp", "sccc", "ddds", "ggpp", "pzcc", "d777", "77ll",
			"gppp", "pppp", "ccgg", "zccc", "llll", "gggp", "sppp", "pppp", "ppzc", "pppz", "ppzs", "ppzz", "llpp",
			"gggp", "gggp", "ddss", "cccg", "ccgg", "pppp", "ccgg", "zsss", "7lll", "ddss", "lddd", "pppp", "zccc",
			"pppp", "lddd", "pppp", "ddd7", "gppp", "dddl", "ppcc", "cccg", "lddd", "cccg", "dddl", "cccc", "llpp",
			"pppp", "psss", "plll", "ddll", "lccc", "gggg", "ccgg", "zccc", "dlll", "pccc", "llcc", "ppss", "ssll",
			"pppc", "gppp", "llld", "pzss", "sscc", "lccc", "llll", "ddll", "lppp", "pccc", "ccgg", "pppz", "ccgg",
			"sspp", "ssss", "psss", "cccc", "gddd", "ccdd", "cccc", "dddl", "llll", "pppp", "cccc", "sppp", "777l",
			"ppps", "lppp", "cccg", "llpp", "pzcc", "ccgg", "pppp", "sscc", "llll", "zsss", "gggd", "ccdd", "ddds",
			"sscc", "cccc", "lllc", "cccg", "pppp", "lllp", "lppp", "zccc", "gppp", "dddd", "sssp", "pzss", "cccg",
			"plll", "lllp", "llll", "gggp", "ddzp", "ppzs", "sssp", "ppss", "ggpp", "ppll", "sssl", "gggp", "lccc",
			"ccgg", "cccg", "zppp", "cccg", "777l", "gggd", "dsss", "pppp", "pggg", "pzss", "sppp", "zsss", "pppp",
			"llld", "cccg", "gggp", "llld", "dddd", "pccc", "cccc", "llpp", "pzss", "pccc", "llpp", "7lll", "dddz",
			"llll", "llcc", "ddll", "lllp", "pppp", "pppp", "llll", "dsss", "pppl", "gggd", "slll", "lllc", "dddz",
			"llll", "llpp", "pppd", "ggpp", "ppcc", "llpp", "pppz", "dlll", "77ll", "zccc", "ddzp", "gppp", "llcc",
			"7777", "77ll", "cccd", "llll", "gppp", "ccgg", "ppss", "ppll", "lddd", "ccgg", "cccc", "cccc", "pppp",
			"gggg", "ggpp", "lllp", "pzss", "slll", "cddd", "pppp", "sssp", "pccc", "ppll", "llll", "dddd", "ccdd",
			"pppp", "zccc", "ddd7", "cggg", "ggdd", "cccg", "ccgg", "cggg", "gddd", "lllp", "cggg", "cccg", "gddd",
			"llll", "77ll", "slll", "ccgg", "ppdd", "d777", "lccc", "ccdd", "ccgg", "ppzc", "ddll", "pppp", "ccgg",
			"slll", "psss", "lllc", "ppcc", "llll", "slll", "ddds", "llpp", "pppp", "dd77", "cccd", "lccc", "cggg",
			"ppll", "cccg", "777l", "llll", "ppzc", "pddd", "77ll", "pccc", "777l", "dlll", "llpp", "gggd", "llld",
			"cccg", "ppcc", "cggg", "dddl", "777l", "plll", "cccg", "cggg", "llll", "ppps", "ggpp", "llll", "ggdd",
			"ssss", "ccgg", "777l", "sssl", "dsss", "ssss", "zccc", "cddd", "ssss", "cccc", "lccc", "psss", "sscc",
			"lppp", "gggp", "cccd", "sssl", "llpp", "sssp", "pzss", "pppd", "pppz", "7777", "pzcc", "gggp", "ddzp",
			"cddd", "pddd", "zccc", "cggg", "lllp", "dddd", "gggg", "gggg", "llll", "7777", "sssl", "ddss", "ppdd",
			"gppp", "ssss", "lllc", "psss", "pppp", "pppp", "cddd", "dlll", "77ll", "lppp", "ccdd", "ppps", "ddll",
			"llll", "ddss", "ppzs", "lppp", "dd77", "ppzs", "llll", "cccd", "pddd", "sssl", "cddd", "gggp", "ppll",
			"cccc", "ppcc", "llll", "sppp", "llll", "cccg", "cccg", "cccc", "lllc", "dlll", "lllp", "777l", "ggpp",
			"sppp", "ppps", "cccg", "plll", "777l", "plll", "cccg", "cccc", "pppp", "pppz", "llll", "pppl", "zccc",
			"ggdd", "pzcc", "pzcc", "sspp", "gggg", "dddl", "zccc", "sscc", "llpp", "llll", "lldd", "lllp", "zccc",
			"ddds", "d777", "lllc", "gggp", "cggg", "gggp", "dd77", "ggpp", "llll", "gggg", "ppcc", "dd77", "plll",
			"gppp", "ccgg", "lldd", "dddd", "llpp", "7lll", "pppz", "llcc", "ddds", "pppz", "cccd", "llll", "ggpp",
			"pppz", "ppps", "ppcc", "gggp", "lddd", "77ll", "pppl", "sscc", "psss", "ppzc", "cccg", "pppz", "cccg",
			"pppl", "pddd", "lllp", "ppll", "ppll", "sspp", "pppp", "llll", "ccgg", "gppp", "sssc", "llpp", "cccc",
			"7lll", "ppps", "ccdd", "ggdd", "dsss", "lddd", "ppzc", "d777", "pzcc", "cggg", "pppd", "ggpp", "sssc",
			"ppdd", "pppz", "gggd", "cccg", "dddd", "ppdd", "cccg", "sppp", "ssss", "lllp", "dd77", "pzss", "sppp",
			"zccc", "ppzs", "dddd", "lllp", "dddd", "pppp", "llll", "7lll", "dd77", "sssp", "psss", "sccc", "pppp",
			"sppp", "dddd", "gggp", "lllp", "pppp", "ccgg", "lllc", "cggg", "cggg", "ccgg", "d777", "llpp", "llll",
			"dd77", "pccc", "ppss", "pppl", "cggg", "pddd", "slll", "dzpp", "cccc", "cccc", "cggg", "pppp", "pppd",
			"pppz", "ppll", "pppp", "cggg", "pppd", "slll", "d777", "gggg", "llpp", "gggp", "7777", "ssss", "cccg",
			"gggg", "gggp", "cggg", "ddd7", "ppzc", "llcc", "777l", "slll", "lllp", "ccgg", "ppzc", "cggg", "lllp",
			"pddd", "dddd", "pppp", "ccgg", "lldd", "7777", "pppz", "sspp", "ssss", "dddz", "zppp", "ccgg", "gppp",
			"ssss", "ggdd", "pppp", "lddd", "dddd", "ccgg", "cccg", "pzcc", "ggdd", "cccc", "cccg", "gggp", "cccg",
			"ppll", "cggg", "dzpp", "gggd", "lddd", "ssss", "dddd", "ppcc", "ddds", "sscc", "pppl", "ddds", "ggpp",
			"cggg", "sssc", "dddd", "gppp", "llll", "ddll", "ddzp", "7777", "sssp", "ppzs", "zppp", "cccc", "gddd",
			"ggpp", "lllp", "llll", "llld", "slll", "ssll", "777l", "sccc", "ppzs", "cccd", "cccc", "cccd", "ddds",
			"ppss", "77ll", "cddd", "gppp", "gggg", "dddz", "cccg", "dlll", "dlll", "gggg", "lddd", "ppps", "pzss",
			"pppp", "sspp", "dddd", "sspp", "pppp", "cccg", "ddd7", "ccgg", "gggp", "ssss", "ddd7", "dddz", "lllc",
			"ggdd", "sssc", "dddd", "cggg", "ppdd", "cccc", "llcc", "pppl", "plll", "gddd", "gddd", "llpp", "lppp",
			"pppp", "dddd", "ccgg", "llld", "cggg", "ggdd", "gppp", "cccc", "7lll", "lppp", "cccc", "sssc", "ssss",
			"gppp", "ddss", "pppp", "cccg", "pppp", "zsss", "ccgg", "ppzs", "llld", "dddd", "ggdd", "cggg", "gggp",
			"cccg", "cccg", "cccc", "llpp", "slll", "lllc", "llpp", "cggg", "lppp", "gddd", "cggg", "llll", "llpp",
			"dddd", "sssl", "ppzs", "cccg", "dd77", "lppp", "psss", "slll", "lllp", "gggg", "gddd", "dddd", "ccgg",
			"pppz", "sssc", "gggg", "pppz", "ccdd", "gggp", "cccc", "cccc", "pppz", "dddd", "pppz", "pccc", "dd77",
			"dddl", "gppp", "cccg", "gggp", "lllc", "lllc", "lppp", "pppp", "ppzc", "dddd", "llll", "pzcc", "sssl",
			"ggdd", "llpp", "7777", "llll", "cccg", "cccc", "pppp", "slll", "llpp", "dzpp", "dd77", "llll", "ssss",
			"ppcc", "llcc", "lddd", "zsss", "ppdd", "lddd", "sssl", "cccg", "plll", "pppp", "sssl", "zppp", "lllp",
			"llpp", "llpp", "ddd7", "llll", "pppp", "psss", "ppps", "ssss", "dzpp", "pppp", "dddd", "pppp", "pddd",
			"sssp", "ddll", "pppp", "ddzp", "plll", "dddd", "sppp", "llld", "cccc", "pzss", "pzcc", "gggp", "slll",
			"lppp", "77ll", "lllp", "cggg", "dddd", "pppp", "llll", "pppz", "pddd", "lllc", "cccc", "sssc", "pppl",
			"cggg", "gggg", "sssc", "cccd", "gppp", "ddds", "cccd", "cddd", "ssll", "ddd7", "pppz", "ccdd", "pccc",
			"ccgg", "cccg", "ppss", "llll", "7777", "pzss", "gppp", "lllp", "sspp",

	}));

	/**
	 * Slot machine screen observations.
	 */
	public static final Map<Character, Double> SYMBOLS_FREQUENCIES = new HashMap<Character, Double>();

	/**
	 * Reel start combination.
	 */
	private static final String REEL_START = "7777llll";

	/**
	 * Reel end combination.
	 */
	private static final String REEL_END = "dddd7777";

	/**
	 * Combinations used as controls of the reel correctness.
	 */
	private static final String CONTROLS[] = { REEL_START, "ddddzpppp", "ppppzcccc", "ppppzssss", REEL_END };

	/**
	 * Minimal generated reel length.
	 */
	private static final int MIN_REEL_LENGTH = 60;

	/**
	 * Maximum generated reel length.
	 */
	private static final int MAX_REEL_LENGTH = 140;

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
	 * Check reel for having at least one of the observations.
	 * 
	 * @param reel
	 *            Generate reel.
	 * @return True if it is a valid reel, false otherwise.
	 */
	private static String[] wrongSegments(String reel) {
		Set<String> wrong = new HashSet<String>();

		/*
		 * At least one observed pieces to be presented at the end.
		 */
		for (int i = 0; i < reel.length() - OBSERVATION_SIZE + 1; i++) {
			if (OBSERVATIONS.contains(reel.substring(i, i + OBSERVATION_SIZE)) == false) {
				wrong.add(reel.substring(i, i + OBSERVATION_SIZE));
			}
		}

		String result[] = new String[wrong.size()];
		wrong.toArray(result);
		Arrays.sort(result);
		return result;
	}

	/**
	 * Check reel for having controlling combinations and all observations.
	 * 
	 * @param reel
	 *            Generate reel.
	 * @return Number of patterns which are not found in the reel.
	 */
	private static String[] missingObservations(String reel) {
		Set<String> missing = new HashSet<String>();

		/*
		 * Check control pieces to be presented.
		 */
		for (String control : CONTROLS) {
			if (reel.contains(control) == false) {
				missing.add(control);
			}
		}

		/*
		 * Check all observed pieces to be presented.
		 */
		for (String piece : OBSERVATIONS) {
			if (reel.contains(piece) == false) {
				missing.add(piece);
			}
		}

		String result[] = new String[missing.size()];
		missing.toArray(result);
		Arrays.sort(result);
		return result;
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
				return reel;
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
			reel = merge(reel, (String) next[PRNG.nextInt(next.length)]);
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
	 * Monte-Carlo search based reel reconstruction.
	 */
	private static void monte() {
		final long INTERVAL = 10000L;
		final long EXPERIMENTS = 1000000L;

		/*
		 * Solutions generation.
		 */
		Set<String> solutions = new HashSet<String>();
		for (long g = 0L, interval = (EXPERIMENTS / INTERVAL) <= 0 ? 1
				: (EXPERIMENTS / INTERVAL); g < EXPERIMENTS; g++) {
			if (g % interval == 0) {
				System.err.println(String.format("%5.2f", (100D * g / EXPERIMENTS)) + "%");
			}

			solutions.add((String) monteCarloStairs(REEL_START));
		}

		/*
		 * Print solutions with frequencies distance.
		 */
		for (String solution : solutions) {
			System.out.println(wrongSegments(solution).length + "\t" + missingObservations(solution).length + "\t"
					+ distance(solution) + "\t" + solution.length() + "\t" + solution + "\t"
					+ Arrays.toString(wrongSegments(solution)) + "\t" + Arrays.toString(missingObservations(solution)));
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

		System.out.println(OBSERVATIONS);
		System.out.println(NEIGHBORS);

		monte();

		System.out.println("FINISH");
	}

}
