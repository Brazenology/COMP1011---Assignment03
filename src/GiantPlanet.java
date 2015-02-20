/**
 * @author Brendan Kallio
 *GiantPlanet Class of COMP1011 - Assignment 3.
 *A subclass of Planet that also takes in a variable "type" that defines
 *a GiantPlanet.
 *@Modified February 20, 2015.
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {
	//Instance Variables
	private String _type;
	private String iceType = "ice";
	private String gasType = "gas";
	
	//-----------------------Public Properties----------------------------
	public String get_type() {
		return _type;
	}

	public void set_type(String _type) {
		this._type = _type;
	}
	
	//-------------------------CONSTRUCTOR---------------------------------
	public GiantPlanet(String name, double diameter, double mass, String type) {
		super(name, diameter, mass);
			this._type = type;	
	}
	
	/*
	 * Determines if the giant planet has moons by checking the get_moonCount() method.
	 * @return boolean
	 */
	@Override
	public Boolean HasMoons() {
		return (get_moonCount() > 0) ? true : false;
	}
	
	/*
	 * Determines if the giant planet has rings by checking the get_ringCount() method.
	 * @return boolean
	 */
	@Override
	public Boolean HasRings() {
		return (get_ringCount() > 0) ? true : false;
	}
	
	/*
	 * Checks to see if the giant planet "_type" variable was set to a valid type.
	 * @return boolean
	 */
	public boolean checkType() {
		if (_type.equalsIgnoreCase(iceType)) {
		return true;
		} else if (_type.equalsIgnoreCase(gasType)) {
		return true;
		}else {
		return false;
		}
	}
}
