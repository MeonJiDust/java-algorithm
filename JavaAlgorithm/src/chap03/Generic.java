package chap03;

class GenericClass <E>{

	private E element; // 제네릭 타입 변수
	
	public GenericClass() { //생성자
		// TODO Auto-generated constructor stub
	}
	
	void set(E element) { // 제네릭 파라미터 메소드
		
		this.element = element; 
	}
	
	E get() { // 제네릭 타입 변환 메소드
		return element;
	}
	
	public <T> T genericMethod(T a) {
		
		return a;
	}
}

class GenericClass2<K, V>{
	
	private K first;
	private V second;
	
	public GenericClass2() {
		// TODO Auto-generated constructor stub
	}
	
	void set(K frist, V second) {
		
		this.first = frist;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	
	V getSecond() {
		return second;
	}
	
	
}
public class Generic{
	public static void main(String[] args) {
		
		GenericClass<String> aClass = new GenericClass<String>();
		GenericClass<Integer> bClass = new GenericClass<Integer>();
		
		GenericClass2<String, Integer> class2 = new GenericClass2<String, Integer>();
		
		aClass.set("Hi");
		bClass.set(10);
		
		class2.set("Hello", 20);
		
		System.out.println("1 " + aClass.get());
		System.out.println("2 " + bClass.get());
		System.out.println("1 " + aClass.getClass().getName());
		System.out.println("2 " + bClass.getClass().getName());
		System.out.println("3 " + class2.getFirst());
		System.out.println("3 " + class2.getSecond());
		System.out.println("3 " + class2.getFirst().getClass().getName());
		
		System.out.println(aClass.genericMethod(3).getClass().getName());
		
	}
	
}

