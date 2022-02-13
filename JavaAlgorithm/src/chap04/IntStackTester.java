package chap04;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		IntStack iStack = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + iStack.size() + "/" + iStack.capacity());
			System.out.println("(1)push (2)pop (3)peek (4)dump (0)exit");
			
			int menu = scanner.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			
			case 1:
				System.out.println("data: ");
				x = scanner.nextInt();
				try {
					iStack.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = iStack.pop();
					System.out.println("pop data is " + x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			
			case 3:
				try { 
					x = iStack.peek();
					System.out.println("peek data is " + x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 4:
				iStack.dump();
				break;
				
			}
		}
	}

}
