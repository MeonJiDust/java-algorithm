package chap04;

public class Prac02<E> {

	private int max;
	private int ptr;
	private E[] stk;
	
	public static class EmptyGstackException extends RuntimeException{
		public EmptyGstackException() {
			
		}
	}
	
	public static class OverflowGstackException extends RuntimeException{
		public OverflowGstackException() {
			
		}
	}
	
	public Prac02 (int capacity) {
		
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		}catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public E push(E x) throws OverflowGstackException{
		
		if(ptr >= max)
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}
	
	public E pop() throws EmptyGstackException{
		
		if(ptr <= 0)
			throw new EmptyGstackException();
		return stk[--ptr];
	}
	
	public E peek() throws EmptyGstackException{
		
		if(ptr <= 0)
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}
}
