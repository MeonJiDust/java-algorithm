package chap03;

class ID{
	
	private static int counter = 0;
	private int id;
	
	public ID() {
		
		id = ++counter;
	}
	
	public int getId() {
		
		return id;
	}
	
	public static int getCounter() {
		
		return counter;
	}
}

public class IdTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ID id = new ID();
		ID id2 = new ID();
		
		System.out.println(id.getId());
		System.out.println(id2.getId());
		
		System.out.println(ID.getCounter());

	}

}
