package ex7;

public class MathEx {
	public static void main(String[] args) {
		double a = -2.789873;
		
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a));	// higher value
		System.out.println(Math.floor(a));	// lower value
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(1.5));
		System.out.println(Math.rint(3.141592));	// closest value
		
		// [1, 10] random value
		System.out.print("Lucky number : ");
		for(int i=0; i<10; i++)
			System.out.print(1 + Math.round(Math.random()*9) + " ");
	}
}
