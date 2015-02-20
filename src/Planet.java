/**
 * @author Brendan Kallio
 *Abstract Planet Class of COMP1011 - Assignment 3.
 *Creates a template for a planet with variables name, diameter and mass.
 *@Modified February 14, 2015.
 */
public abstract class Planet {
	//Instance Variables
	private String _name;
	private double _diameter;
	private double _mass;
	private double _orbitalPeriod;
	private double _rotationPeriod;
	private int _ringCount;
	private int _moonCount;
	
	//-----------------------Public Properties--------------------------
	public String get_name() {
		return _name;
	}

	public double get_orbitalPeriod() {
		return _orbitalPeriod;
	}

	public double get_rotationPeriod() {
		return _rotationPeriod;
	}

	public int get_ringCount() {
		return _ringCount;
	}

	public double get_diameter() {
		return _diameter;
	}

	public double get_mass() {
		return _mass;
	}

	public int get_moonCount() {
		return _moonCount;
	}
	
	public void set_orbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}

	public void set_rotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

	public void set_ringCount(int _ringCount) {
		this._ringCount = _ringCount;
	}

	public void set_moonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	
	//-------------------------CONSTRUCTOR---------------------------------
	public Planet (String name, double diameter, double mass) {
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
	}
	
	//Overridden public method toString
	@Override
	public String toString() {
		return "Planet Name   : " + _name + "\n" +
			   "Diameter      : " + _diameter + "\n" +
			   "Mass          : " + _mass;
	}
}
