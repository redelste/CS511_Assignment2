package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Client {
	private int id;
	private List<Exercise> routine;

	public Client(int id) {
		this.id = id;
		this.routine = new ArrayList<>();
	}

	public void addExercise(Exercise e) {
		this.routine.add(e);
	}
	// map<K,V> K -> the type of keys, V = mapped values
	
	/**
	 * Builds a client with given id and noOfWeightPlates map
	 * 
	 * @param id
	 * @param noOfWeightPlates
	 * @return
	 */
	public static Client generateRandom(int id, Map<WeightPlateSize, Integer> noOfWeightPlates) {
		Client bigbaby = new Client(id);
		int numE = 15 + new Random().nextInt(6);
		for(int i = 0; i < numE; i++){
			bigbaby.addExercise(Exercise.generateRandom(noOfWeightPlates));
		}
		
		return bigbaby;
	}
	
	public String toString(){
		return "ID: " + this.id + "\nRoutine: " + this.routine + "\nRoutineLength: " + this.routine.size();
	}
	
//	public static void main(String[] args){
//		Client e = Client.generateRandom(20, WeightPlateSize.noOfWeightPlates);
//		System.out.println(e.toString());
//	}

}