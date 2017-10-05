package Assignment2;

import java.util.Random;

public enum WeightPlateSize {
	SMALL_3KG, MEDIUM_5KG, LARGE_10KG;

	static WeightPlateSize RandomWeightPlate_Size() {
		return WeightPlateSize.values()[new Random().nextInt()
				% WeightPlateSize.values().length];
	}
}
