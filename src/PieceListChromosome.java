import java.util.List;

import org.apache.commons.math3.genetics.AbstractListChromosome;
import org.apache.commons.math3.genetics.InvalidRepresentationException;

/**
 * Slot machine observations pieces chromosome.
 * 
 * @author Todor Balabanov
 */
class PieceListChromosome extends AbstractListChromosome<String> {

	/**
	 * Constructor with array representation of the chromosome.
	 * 
	 * @param representation
	 *            Chromosome as array of values.
	 * 
	 * @throws InvalidRepresentationException
	 *             If the representation is an invalid chromosome.
	 */
	public PieceListChromosome(String[] representation) throws InvalidRepresentationException {
		super(representation);
	}

	/**
	 * Constructor with list representation of the chromosome.
	 * 
	 * @param representation
	 *            Chromosome as list of values.
	 * @param copy
	 *            Deep copy flag.
	 */
	public PieceListChromosome(List<String> representation, boolean copy) {
		super(representation, copy);
	}

	/**
	 * Constructor with list representation of the chromosome.
	 * 
	 * @param representation
	 *            Chromosome as list of values.
	 * 
	 * @throws InvalidRepresentationException
	 *             If the representation is an invalid chromosome.
	 */
	public PieceListChromosome(List<String> representation) throws InvalidRepresentationException {
		super(representation);
	}

	@Override
	public double fitness() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void checkValidity(List<String> representation) throws InvalidRepresentationException {
		// TODO Auto-generated method stub
	}

	@Override
	public AbstractListChromosome<String> newFixedLengthChromosome(List<String> representation) {
		// TODO Auto-generated method stub
		return null;
	}

}
