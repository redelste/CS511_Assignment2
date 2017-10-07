package Assignment2;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Gym implements Runnable {
	private static final int GYM_SIZE = 30;
	private static final int GYM_REGISTERED_CLIENTS = 10000;
	private Map<WeightPlateSize, Integer> noOfWeightPlates = WeightPlateSize.noOfWeightPlates;
	private Set<Integer> clients; // for generating fresh client ids
	private ExecutorService executor; // eggs are cuter

	// LEGPRESSMACHINE, BARBELL, HACKSQUATMACHINE, LEGEXTENSIONMACHINE,
	// LEGCURLMACHINE, LATPULLDOWNMACHINE, PECDECKMACHINE,
	// CABLECROSSOVERMACHINE;
	static Semaphore a_lpm = new Semaphore(5);
	static Semaphore a_bb = new Semaphore(5);
	static Semaphore a_hsm = new Semaphore(5);
	static Semaphore a_lem = new Semaphore(5);
	static Semaphore a_lcm = new Semaphore(5);
	static Semaphore a_lpdm = new Semaphore(5);
	static Semaphore a_pdm = new Semaphore(5);
	static Semaphore a_ccm = new Semaphore(5);
	
	static Semaphore a_sm = new Semaphore(110);
	static Semaphore a_m = new Semaphore(90);
	static Semaphore a_lg = new Semaphore(75);
	static Semaphore mutex = new Semaphore(1);
	// various semaphores - declaration omitted
	// availability for apparatusType: eight
	// availability for weightPlateSize: sm, m, lg
	// mutex

	public Gym() {
		this.clients = new HashSet<Integer>();
		ExecutorService executorService = Executors
				.newFixedThreadPool(GYM_SIZE);

		for (int i = 0; i < GYM_SIZE; i++) {
			clients.add(new Random().nextInt(GYM_REGISTERED_CLIENTS));
		}

	}

	public void run() {
	};

	public static void main(String[] args) {
	}

}
