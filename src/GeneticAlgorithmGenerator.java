import java.util.LinkedList;
import java.util.List;

import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.apache.commons.math3.genetics.FixedElapsedTime;
import org.apache.commons.math3.genetics.GeneticAlgorithm;
import org.apache.commons.math3.genetics.Population;
import org.apache.commons.math3.genetics.TournamentSelection;

/**
 * Genetic algorithm reels generator.
 * 
 * @author Todor Balabanov
 */
class GeneticAlgorithmGenerator {

	/**
	 * Reel info reference.
	 */
	private static Reel model = null;

	/**
	 * Constructor with all parameters.
	 * 
	 * @param reel
	 *            Reel info reference.
	 */
	GeneticAlgorithmGenerator(Reel model) {
		GeneticAlgorithmGenerator.model = model;
	}

	public String generate(long optimizationTimeout, int populationSize, double crossoverRate, double mutationRate,
			double elitismRate, int tournamentArity) {
		/*
		 * Generate initial population.
		 */
		List<Chromosome> list = new LinkedList<Chromosome>();
		for (int i = 0; i < populationSize; i++) {
			list.add(new PieceListChromosome(model, model.random()));
		}
		Population initial = new ElitisticListPopulation(list, 2 * list.size(), elitismRate);

		/*
		 * Initialize genetic algorithm.
		 */
		GeneticAlgorithm algorithm = new GeneticAlgorithm(new RandomPointCrossover<PieceListChromosome>(), crossoverRate,
				new RandomPieceMutation(), mutationRate, new TournamentSelection(tournamentArity));

		/*
		 * Run optimization.
		 */
		Population optimized = algorithm.evolve(initial, new FixedElapsedTime(optimizationTimeout));

		/*
		 * Obtain result.
		 */
		return model.reconstruct(((PieceListChromosome) optimized.getFittestChromosome()).representation());
	}

}
