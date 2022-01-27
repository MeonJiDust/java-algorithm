package chap03;

class GenericClass <E>{

	private E element; // 제네릭 타입 변수
	
	void set(E element) { // 제네릭 파라미터 메소드
		
		this.element = element; 
	}
	
	E get() { // 제네릭 타입 변환 메소드
		return element;
	}
}

public class Generic{
	public static void main(String[] args) {
		
		GenericClass<String> aClass = new GenericClass<String>();
		GenericClass<Integer> bClass = new GenericClass<Integer>();
		
		aClass.set("Hi");
		bClass.set(10);
		
		System.out.println("1 " + aClass.get());
		System.out.println("2 " + bClass.get());
		System.out.println("1 " + aClass.getClass().getName());
		System.out.println("2 " + bClass.getClass().getName());
		
	}
	
}

