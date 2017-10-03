package Assignment2;

import java.util.Map;
import java.util.Random;

import Assignment2.ApparatusType.Apparatus_Type;
import Assignment2.WeightPlateSize.WeightPlate_Size;

public class Exercise {
	private ApparatusType at;
	private Map<WeightPlateSize, Integer> weight;
	private int duration;
	
	public Exercise(ApparatusType at, Map<WeightPlateSize, Integer> weight, int duration){
		this.at = at;	
		this.weight = weight;
		this.duration = duration;
		
	};
	//generates a random exercise using the maximum number of plates given in the argument.
	public static Exercise generateRandom(Map<WeightPlateSize, Integer> weight){
		
		
		
		return null;
		
		//return WeightPlate_Size.values()[new Random().nextInt() % Apparatus_Type.values().length];
		
		
		
	};
	
}