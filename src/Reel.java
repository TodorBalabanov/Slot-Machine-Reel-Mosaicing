import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Information for the reel which should be reconstructed.
 * 
 * @author Todor Balabanov
 */
class Reel {

	/**
	 * Slot machine screen observations.
	 */
	public final Map<Character, Double> SYMBOLS_FREQUENCIES = new HashMap<Character, Double>();

	/**
	 * Combinations which are neighbors.
	 */
	private final Map<String, Set<String>> NEIGHBORS = new HashMap<String, Set<String>>();

	/**
	 * Slot machine screen observations.
	 */
	public List<String> observations = null;

	/**
	 * Size of the observed reel.
	 */
	private int frame = 0;

	/**
	 * Reel start combination.
	 */
	private String start = "";

	/**
	 * Reel end combination.
	 */
	private String end = "";

	/**
	 * Combinations used as controls of the reel correctness.
	 */
	private String controls[] = {};

	/**
	 * Minimal generated reel length.
	 */
	private int min = 0;

	/**
	 * Maximum generated reel length.
	 */
	private int max = 0;

	/**
	 * Constructor with all parameters.
	 * 
	 * @param observations
	 *            Array with all observations.
	 * @param start
	 *            Start pattern.
	 * @param end
	 *            End pattern.
	 * @param controls
	 *            Very well known control patterns.
	 * @param min
	 *            Minimum generated reel length.
	 * @param max
	 *            Maximum generated reel length.
	 */
	public Reel(String[] observations, String start, String end, String[] controls, int min, int max) {
		super();

		this.start = start;
		this.end = end;
		this.controls = controls;
		this.min = min;
		this.max = max;

		this.observations = Arrays.asList(observations);

		frame = observations[0].length();
		for (String observation : observations) {
			/*
			 * All observations should be with equal length.
			 */
			if (observation.length() != frame) {
				throw new RuntimeException(
						"Observation length conflict between " + frame + " and " + observation.length() + "!");
			}

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
			for (String neighbor : observations) {
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
				for (int size = frame - 1; size >= 1; size--) {
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
		for (String observation : observations) {
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
	 * Check reel for having at least some of the observations.
	 * 
	 * @param reel
	 *            Generate reel.
	 * @return True if it is a partial valid reel, false otherwise.
	 */
	boolean partialValid(String reel) {
		/*
		 * Check only unique observations.
		 */
		Set<String> unique = NEIGHBORS.keySet();

		/*
		 * Size of the reel checked part.
		 */
		int size = (reel.length() / frame) * frame;

		/*
		 * Group parts according observation size.
		 */
		for (int i = 0, j = frame; j < size; i++, j++) {
			if (unique.contains(reel.substring(i, j)) == false) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Check reel for having at least one of the observations.
	 * 
	 * @param reel
	 *            Generate reel.
	 * @return Array with all wrong segments.
	 */
	String[] wrongSegments(String reel) {
		Set<String> wrong = new HashSet<String>();

		/*
		 * At least one observed pieces to be presented at the end.
		 */
		for (int i = 0; i < reel.length() - frame + 1; i++) {
			if (NEIGHBORS.keySet().contains(reel.substring(i, i + frame)) == false) {
				wrong.add(reel.substring(i, i + frame));
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
	String[] missingObservations(String reel) {
		Set<String> missing = new HashSet<String>();

		/*
		 * Check control pieces to be presented.
		 */
		for (String control : controls) {
			if (reel.contains(control) == false) {
				missing.add(control);
			}
		}

		/*
		 * Check all observed pieces to be presented.
		 */
		for (String piece : NEIGHBORS.keySet()) {
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
	 * Check reel for repeating segments.
	 * 
	 * @param reel
	 *            Generate reel.
	 * @return Number of segments which repeats.
	 */
	String[] repeatingSegments(String reel) {
		Map<String, Integer> counters = new HashMap<String, Integer>();

		/*
		 * Check all patterns with each other. It is kind of autocorrelation.
		 */
		for (int i = 0; i < reel.length() - frame - 1; i++) {
			String pattern = reel.substring(i, i + frame);

			/*
			 * Each pattern is a key in the map.
			 */
			if (counters.containsKey(pattern) == false) {
				counters.put(pattern, 0);
			}

			for (int j = i + 1; j < reel.length() - frame; j++) {
				String check = reel.substring(j, j + frame);

				/*
				 * Increase counter if there is a repeat.
				 */
				if (pattern.equals(check) == true) {
					counters.put(pattern, counters.get(pattern) + 1);
				}
			}
		}

		/*
		 * Form final result.
		 */
		int i = 0;
		String result[] = new String[counters.keySet().size()];
		for(String pattern : counters.keySet()) {
			result[i++] = "" + counters.get(pattern) + " " + pattern;
		}
		
		return result;
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
	String merge(String reel, String neighbor) {
		/*
		 * Check different overlap sizes.
		 */
		for (int overlap = neighbor.length() - 1; overlap > 0; overlap--) {
			/*
			 * If current reel does not end with the current checked neighbor we
			 * do nothing.
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
	 * Euclidean distance between reel symbols frequencies and observation
	 * symbols frequencies.
	 * 
	 * @param reel
	 *            Generated reel.
	 * @return Euclidean distance.
	 */
	double distance(String reel) {
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
	 * Generated reel minimum size getter.
	 * 
	 * @return Minimum size.
	 */
	public int min() {
		return min;
	}

	/**
	 * Generated reel maximum size getter.
	 * 
	 * @return Maximum size.
	 */
	public int max() {
		return max;
	}

	/**
	 * Observations getter.
	 * 
	 * @return List of all available observations.
	 */
	public List<String> observations() {
		return observations;
	}

	/**
	 * Neighbors matrix getter.
	 * 
	 * @return List of unique patterns and their neighbors.
	 */
	public Map<String, Set<String>> neighbors() {
		return NEIGHBORS;
	}

	/**
	 * Starting piece getter.
	 * 
	 * @return Starting pattern.
	 */
	public String start() {
		return start;
	}

	/**
	 * Ending piece getter.
	 * 
	 * @return Ending pattern.
	 */
	public String end() {
		return end;
	}

	/**
	 * Size of the observation frame getter.
	 * 
	 * @return Size of reel visible part on the screen.
	 */
	public int frame() {
		return frame;
	}

	/**
	 * Generate random set of all unique observations.
	 * 
	 * @return Array with all unique observations.
	 */
	public String[] random() {
		/*
		 * Get all unique pieces.
		 */
		List<String> list = new ArrayList<String>(NEIGHBORS.keySet());

		/*
		 * Add some more pieces in random order.
		 */
		for (String piece : NEIGHBORS.keySet()) {
			if (Util.PRNG.nextBoolean() == true) {
				list.add(piece);
			}
		}

		/*
		 * Shuffle the order of the selected pieces.
		 */
		Collections.shuffle(list);

		/*
		 * Transform to array.
		 */
		String[] array = new String[list.size()];
		list.toArray(array);

		return array;
	}

	/**
	 * Evaluate the quality of particular pieces set.
	 * 
	 * @param pieces
	 *            Array of pieces.
	 * 
	 * @return Array with evaluations.
	 */
	public double[] evaluate(String[] pieces) {
		String reel = "";
		for (String piece : pieces) {
			String merged = merge(reel, piece);

			if (reel.equals(merged) == true) {
				reel += piece;
			}
		}

		String[] wrong = wrongSegments(reel);
		String[] missing = missingObservations(reel);
		String[] repeats = repeatingSegments(reel);

		return new double[] { (double) distance(reel), (double) reel.length(), (double) wrong.length,
				(double) missing.length, (double) repeats.length };
	}

	/**
	 * Reconstruct reel of particular pieces set.
	 * 
	 * @param pieces
	 *            Array of pieces.
	 * 
	 * @return Generated reel.
	 */
	public String reconstruct(List<String> pieces) {
		String reel = "";
		for (String piece : pieces) {
			String merged = merge(reel, piece);

			if (reel.equals(merged) == true) {
				reel += piece;
			}
		}

		return reel;
	}

}
