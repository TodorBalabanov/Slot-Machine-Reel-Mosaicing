import java.util.Arrays;

/**
 * Application single entry point class.
 * 
 * @author Todor Balabanov
 */
public class Main {

	/**
	 * Application single entry point method.
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("START");

		Reel reels[] = {

				new Reel(new String[] {

				},

						"",

						"",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

				},

						"",

						"",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

				},

						"",

						"",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

				},

						"",

						"",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

				},

						"",

						"",

						new String[] {},

						50, 150

				),

		};

		/*
		 * Just point the reference.
		 */
		Reel reel = reels[0];

		System.out.println(reel.observations());
		System.out.println(reel.neighbors());

		/*
		 * For single solution checking.
		 */
		// String solution = "";
		// String[] wrong = reel.wrongSegments(solution);
		// String[] missing = reel.missingObservations(solution);
		// String[] repeats = reel.repeatingSegments(solution);
		// System.out.println(wrong.length + "\t" + missing.length + "\t" +
		// repeats.length + "\t" + reel.distance(solution)
		// + "\t" + solution.length() + "\t" + solution + "\t" +
		// Arrays.toString(wrong) + "\t"
		// + Arrays.toString(missing) + "\t" + Arrays.toString(repeats));

		/*
		 * Monte-Carlo search based optimization.
		 */
		MonteCarloGenerator monte = new MonteCarloGenerator(reel);
		System.out.println(monte.generate(100000000L, 10000L, 6, 10));

		/*
		 * Genetic algorithm based optimization.
		 */
		// GeneticAlgorithmGenerator genetic = new
		// GeneticAlgorithmGenerator(reel);
		// System.out.println(genetic.generate(60L, 23, 0.9, 0.1, 0.1, 2));

		System.out.println("FINISH");
	}

}
