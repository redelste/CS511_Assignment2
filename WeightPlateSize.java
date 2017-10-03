package Assignment2;

import java.util.Random;
import java.util.concurrent.Semaphore;

import Assignment2.ApparatusType.Apparatus_Type;

public class WeightPlateSize {
	 public enum WeightPlate_Size {
		  SMALL_3KG , MEDIUM_5KG , LARGE_10KG }
	 
		public WeightPlate_Size RandomWeightPlate_Size(){
			return WeightPlate_Size.values()[new Random().nextInt() % Apparatus_Type.values().length];
		}
}
