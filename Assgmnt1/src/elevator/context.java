package elevator;



public class context {

	elevator_door state;
	
public void switchstate(){
		
		state.Switch(this);
	}

	public elevator_door getState() {
		return state;
	}

	public void setState(elevator_door state) {
		this.state = state;
	}

}
