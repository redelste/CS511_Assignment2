package Assignment2;
import java.util.Random;
public class ApparatusType {

	public enum Apparatus_Type {
		LEGPRESSMACHINE, BARBELL, HACKSQUATMACHINE, LEGEXTENSIONMACHINE, LEGCURLMACHINE, LATPULLDOWNMACHINE, PECDECKMACHINE, CABLECROSSOVERMACHINE
	};
	
	public Apparatus_Type RandomApparatusType(){
		return Apparatus_Type.values()[new Random().nextInt() % Apparatus_Type.values().length];
	}
}