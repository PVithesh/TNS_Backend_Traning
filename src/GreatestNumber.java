// program to find the greatest number among three numbers
public class GreatestNumber {

	public static void main(String[] args) {
		int a = 25;
        int b = 40;
        int c = 30;

        if (a >= b && a >= c) {
            System.out.println("a is greatest: "+a);
        } else if (b >= c) {
            System.out.println("b is greatest: "+b);
        } else {
            System.out.println("c is greatest: "+c);
        }

	}

}
