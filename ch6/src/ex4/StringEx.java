package ex4;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");
		
		// connect string
		a = a.concat(b);
		System.out.println(a);
		
		// remove empty
		a = a.trim();
		System.out.println(a);
		
		// change string
		a = a.replace("ab", "12");
		System.out.println(a);
		
		// separate string
		String s[] = a.split(",");
		for(int i=0; i<s.length; i++)
			System.out.print(s[i] + " ");
	}
}
