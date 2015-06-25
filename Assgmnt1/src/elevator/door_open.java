package elevator;



public class door_open extends elevator_door{
	
	public door_open() {
		super();
		// TODO Auto-generated constructor stub
		String  statename="open";
		System.out.println("Door is "+statename);
	}
	
	
	@Override
	public void Switch(context c) {
		// TODO Auto-generated method stub
	
		door_close cl=new door_close();
		c.setState(cl);
		
	}


}
