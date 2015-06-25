package elevator;

public class floor {

	String current_floor;

	public String getCurrent_floor() {
		return current_floor;
	}

	public void setCurrent_floor(String current_floor) {
		this.current_floor = current_floor;
	}
	
	
	public void display(){
		System.out.print("current floor is " + current_floor + " floor\n");
	}
}
