package elevator;

public abstract class elevator_door {

	String statename;

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	
	public void display(){
		if(statename=="open"){
			System.out.println("The door is open\n");
		}
		else
			System.out.println("The door is close\n");
	}

	public abstract void Switch(context c);
	
}
