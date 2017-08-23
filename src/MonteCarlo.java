import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Monte-Carlo search solver.
 * 
 * @author Todor Balabanov
 */
class MonteCarlo {

	/**
	 * Reel info reference.
	 */
	private Reel model = null;

	/**
	 * Constructor with all parameters.
	 * 
	 * @param reel
	 *            Reel info reference.
	 */
	MonteCarlo(Reel model) {
		this.model = model;
	}

	/**
	 * Generate reel on a stair based approach.
	 * 
	 * @param reel
	 *            Current reel.
	 * @return Generated reel of empty string if it is not a valid reel.
	 */
	private String stairs(String reel) {
		do {
			/*
			 * End with positive result.
			 */
			if (reel.endsWith(model.end()) == true && reel.length() > model.min()) {
				return reel;
			}

			/*
			 * List next possibilities.
			 */
			Object next[] = model.neighbors().get(reel.substring(reel.length() - model.frame())).toArray();

			/*
			 * There is no step ahead.
			 */
			if (next == null || next.length == 0) {
				break;
			}

			/*
			 * Step ahead in the generation process.
			 */
			reel = model.merge(reel, (String) next[Util.PRNG.nextInt(next.length)]);
		} while (reel.length() < model.max());
		// System.out.println(reel);

		return "";
	}

	/**
	 * Monte-Carlo search based reel reconstruction.
	 * 
	 * @param experiments
	 *            Number of experiments to be done.
	 * @param progress
	 *            Progress log interval.
	 * @param missingLevel
	 *            Level of acceptable missing patterns.
	 * @param wrongLevel
	 *            Level of acceptable wrong patterns.
	 * @return Generation report.
	 */
	public String generate(long experiments, long progress, int missingLevel, int wrongLevel) {
		/*
		 * Solutions generation.
		 */
		Set<String> solutions = new HashSet<String>();
		for (long g = 0L, interval = (experiments / progress) <= 0 ? 1
				: (experiments / progress); g < experiments; g++) {
			if (g % interval == 0) {
				System.err.println(String.format("%5.2f", (100D * g / experiments)) + "%");
			}

			solutions.add((String) stairs(model.start()));
		}

		/*
		 * Print solutions with frequencies distance.
		 */
		String result = "";
		for (String solution : solutions) {
			String[] wrong = model.wrongSegments(solution);
			String[] missing = model.missingObservations(solution);

			/*
			 * Report only solutions with acceptable wrong level.
			 */
			if (wrong.length > wrongLevel) {
				continue;
			}

			/*
			 * Report only solutions with acceptable missing level.
			 */
			if (missing.length > missingLevel) {
				continue;
			}

			result += wrong.length + "\t" + missing.length + "\t" + model.distance(solution) + "\t" + solution.length()
					+ "\t" + solution + "\t" + Arrays.toString(wrong) + "\t" + Arrays.toString(missing);
		}

		return result;
	}

}
