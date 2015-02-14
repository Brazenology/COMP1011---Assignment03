/**
 * @author Brendan Kallio
 *Abstract Planet Class of COMP1011 - Assignment 3.
 *Generates a hero's abilities, determines if his/her hit
 *attempt is successful, and calculates the damage dealt.
 *@Modified February 14, 2015.
 */
public abstract class Planet {
	//INSTANCE VARIABLES
	private String _name;
	private double _diameter;
	private double _mass;
	private double _orbitalPeriod;
	private double _rotationPeriod;
	private int _ringCount;
	private int _moonCount;
	
	//-----------------GETTERS--------------------------
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
	
	//-----------------------SETTERS--------------------------
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
	
	//CONSTRUCTOR
	public Planet (String name, double diameter, double mass) {
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
	}
	
	@Override
	public String toString() {
		return _name + _diameter + _mass;
	}
}
