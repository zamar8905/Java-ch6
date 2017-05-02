public class EqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(2,3);
        Rect b = new Rect(6,1);
        Rect c = new Rect(5,7);
        if(a.equals(b)) System.out.println("a is equal to b");
        if(a.equals(c)) System.out.println("a is equal to c");
        if(b.equals(c)) System.out.println("b is equal to c");
    }
}
