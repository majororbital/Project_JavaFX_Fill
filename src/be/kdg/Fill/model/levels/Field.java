package be.kdg.Fill.model.levels;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 13:49
 */
public class Field {
	Tiles[][] tiles;

	public Field(int dimension) {
		tiles = new Tiles[dimension][dimension];
	}
}
