package chap03Operator;

public class Ex14 {

	public static void main(String[] args) {
		char c= 'a';
		for(int i=0; i<26; i++) {
			System.out.println(c++);
		}
		System.out.println();
		
		c='A';
		for(int i=0; i<26; i++) {
			 System.out.println(c++);
		}
		System.out.println();
		
		c='0';
		for(int i=0; i<10; i++) {
			 System.out.println(c++);
		}
		System.out.println();
	}
}
