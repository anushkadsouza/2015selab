package elevator;

public class ele_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		floor f1 = new floor();
		f1.setCurrent_floor("1st");
		f1.display();
		elevator_door ed=new elevator_door();
		ed.setStatename(new door_open);
		ed.display();
	}

}
