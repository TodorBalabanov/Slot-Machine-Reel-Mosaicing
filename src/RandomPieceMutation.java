import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.MutationPolicy;

/**
 * Mutation for random piece in the chromosome.
 * 
 * @author Todor Balabanov
 */
public class RandomPieceMutation implements MutationPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Chromosome mutate(Chromosome original) throws MathIllegalArgumentException {
		/*
		 * If the chromosome is not from particular class there is nothing to do with
		 * it.
		 */
		if (original instanceof PieceListChromosome == false) {
			return original;
		}

		/*
		 * Swap only two elements in the reel order as mutation.
		 */
		List<String> list = ((PieceListChromosome) original).representation();
		Collections.swap(list, Util.PRNG.nextInt(list.size()), Util.PRNG.nextInt(list.size()));

		return ((PieceListChromosome) original).newFixedLengthChromosome(list);
	}

}
