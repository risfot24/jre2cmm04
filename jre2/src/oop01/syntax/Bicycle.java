package oop01.syntax;

public class Bicycle {
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	
	private static int numberofBicycles = 0;

	public Bicycle(int startCadence, int startGear, int startSpeed) {
		super();
		this.cadence = startCadence;
		this.gear = startGear;
		this.speed = startSpeed;
		this.id = ++numberofBicycles;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int newValue) {
		this.cadence = newValue;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/*사용자 정의 메소드*/
	public void applyBrake(int decrement){
		speed -= decrement ;
		
	}
	
	public void speedup(int increment){
		speed += increment;
	}
	
	

}
