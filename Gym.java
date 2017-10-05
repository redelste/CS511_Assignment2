package Assignment2;

import java.util.Map;

import java.util.Set;
import java.util.concurrent.ExecutorService;

public class Gym implements Runnable {
	private static final int GYM_SIZE = 30;
	private static final int GYM_REGISTERED_CLIENTS = 10000;
	private Map<WeightPlateSize, Integer> noOfWeightPlates = WeightPlateSize.noOfWeightPlates;
	private Set<Integer> clients; // for generating fresh client ids
	private ExecutorService executor;

	// various semaphores - declaration omitted
	

	public void run() {
		
	}
}
