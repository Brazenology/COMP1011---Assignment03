/**
 * @author Brendan Kallio
 *GiantPlanet Class of COMP1011 - Assignment 3.
 *A subclass of Planet that also takes in a variable "type" that defines
 *a GiantPlanet.
 *@Modified February 14, 2015.
 */
public class GiantPlanet extends Planet {
	private String _type;
	
	public GiantPlanet(String name, double diameter, double mass, String type) {
		super(name, diameter, mass);
			this._type = type;	
	}
	
	public boolean hasMoons() {
		if (get_moonCount() > 0) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public boolean hasRings() {
		if (get_ringCount() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
