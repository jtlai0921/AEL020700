package ex05;

public class Array1 {

	public static void main(String[] args) {
		char[] str = { 'J', 'a', 'v', 'a' };
		System.out.print("��l�r�� -> ");
		System.out.println(str);
		encode(str);
		System.out.print("�Z�X��r�� -> ");
		System.out.println(str);
		decode(str);
		System.out.print("�٭��r�� -> ");
		System.out.println(str);
	}

	static void encode(char[] s) {
		for (int i = 0; i < s.length; i++)
			s[i] += 1;
	}

	static void decode(char[] s) {
		for (int i = 0; i < s.length; i++)
			s[i] -= 1;
		;
	}
}