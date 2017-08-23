import java.util.ArrayList;
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
	 * Reel info reference.
	 */
	private static Reel model = null;

	/**
	 * Constructor with array representation of the chromosome.
	 * 
	 * @param representation
	 *            Chromosome as array of values.
	 * 
	 * @throws InvalidRepresentationException
	 *             If the representation is an invalid chromosome.
	 */
	PieceListChromosome(Reel model, String[] representation) throws InvalidRepresentationException {
		super(representation);
		PieceListChromosome.model = model;
	}

	/**
	 * Constructor with array representation of the chromosome.
	 * 
	 * @param representation
	 *            Chromosome as array of values.
	 * 
	 * @throws InvalidRepresentationException
	 *             If the representation is an invalid chromosome.
	 */
	protected PieceListChromosome(String[] representation) throws InvalidRepresentationException {
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
	protected PieceListChromosome(List<String> representation, boolean copy) {
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
	protected PieceListChromosome(List<String> representation) throws InvalidRepresentationException {
		super(representation);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double fitness() {
		List<String> list = getRepresentation();
		String array[] = new String[list.size()];
		list.toArray(array);

		double values[] = model.evaluate(array);
		return 0 - values[0] - values[1] - values[2] - values[3];
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void checkValidity(List<String> representation) throws InvalidRepresentationException {
		/*
		 * Accept all as valid.
		 */
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AbstractListChromosome<String> newFixedLengthChromosome(List<String> representation) {
		return new PieceListChromosome(representation, true);
	}

	/**
	 * Chromosome representation getter.
	 * 
	 * @return List with chromosome elements.
	 */
	public List<String> representation() {
		return new ArrayList<String>(getRepresentation());
	}
}
