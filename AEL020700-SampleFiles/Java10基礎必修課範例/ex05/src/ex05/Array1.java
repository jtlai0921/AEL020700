package ex05;

public class Array1 {

	public static void main(String[] args) {
		char[] str = { 'J', 'a', 'v', 'a' };
		System.out.print("原始字串 -> ");
		System.out.println(str);
		encode(str);
		System.out.print("擾碼後字串 -> ");
		System.out.println(str);
		decode(str);
		System.out.print("還原後字串 -> ");
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