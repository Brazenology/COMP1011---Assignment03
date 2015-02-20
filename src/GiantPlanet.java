/**
 * @author Brendan Kallio
 *GiantPlanet Class of COMP1011 - Assignment 3.
 *A subclass of Planet that also takes in a variable "type" that defines
 *a GiantPlanet.
 *@Modified February 14, 2015.
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {
	private String _type;
	
	//PROPERTIES-----------------------------------------------------------
	public String get_type() {
		return _type;
	}

	public void set_type(String _type) {
		this._type = _type;
	}
	
	//Constructor------------------------------------------------------------
	public GiantPlanet(String name, double diameter, double mass, String type) {
		super(name, diameter, mass);
			this._type = type;	
	}
	
	@Override
	public Boolean HasMoons() {
		if (get_moonCount() > 0) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	@Override
	public Boolean HasRings() {
		if (get_ringCount() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
