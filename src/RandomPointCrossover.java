import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ChromosomePair;
import org.apache.commons.math3.genetics.CrossoverPolicy;

/**
 * Single random point cross over for chromosomes with different length.
 * 
 * @author Todor Balabanov
 */
public class RandomPointCrossover<T> implements CrossoverPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChromosomePair crossover(Chromosome first, Chromosome second) throws MathIllegalArgumentException {
		/*
		 * Only particular chromosomes can be crossed by this way.
		 */
		if (first instanceof PieceListChromosome == false) {
			return new ChromosomePair(first, second);
		}
		if (second instanceof PieceListChromosome == false) {
			return new ChromosomePair(first, second);
		}

		/*
		 * Obtain parent chromosomes.
		 */
		List<String> parent1 = ((PieceListChromosome) first).representation();
		List<String> parent2 = ((PieceListChromosome) second).representation();

		/*
		 * Chromosomes should be long enough for random point crossover.
		 */
		if (parent1.size() < 3) {
			return new ChromosomePair(first, second);
		}
		if (parent2.size() < 3) {
			return new ChromosomePair(first, second);
		}

		/*
		 * Allocate children chromosomes.
		 */
		List<String> child1 = new ArrayList<String>();
		List<String> child2 = new ArrayList<String>();

		/*
		 * Select random single cut points.
		 */
		int point1 = 1 + (Util.PRNG.nextInt(parent1.size() - 2));
		int point2 = 1 + (Util.PRNG.nextInt(parent2.size() - 2));

		/*
		 * Cross first part.
		 */
		for (int i = 0; i < point1; i++) {
			if (i < parent1.size()) {
				child1.add(parent1.get(i));
			}

			if (i < parent2.size()) {
				child2.add(parent2.get(i));
			}
		}

		/*
		 * Cross second part.
		 */
		for (int i = point2; i < parent1.size() || i < parent2.size(); i++) {
			if (i < parent2.size()) {
				child1.add(parent2.get(i));
			}

			if (i < parent1.size()) {
				child2.add(parent1.get(i));
			}
		}

		/*
		 * Form new generation.
		 */
		return new ChromosomePair(((PieceListChromosome) first).newFixedLengthChromosome(child1),
				((PieceListChromosome) second).newFixedLengthChromosome(child2));
	}

}
