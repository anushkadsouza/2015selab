package elevator;

public class door_close extends elevator_door{
	
	public door_close() {
		super();
		// TODO Auto-generated constructor stub
		String  statename="close";
		System.out.println("Door is "+statename);
	}
	
	
	@Override
	public void Switch(context c) {
		// TODO Auto-generated method stub
	
		door_open o=new door_open();
		c.setState(o);
		
	}

}
