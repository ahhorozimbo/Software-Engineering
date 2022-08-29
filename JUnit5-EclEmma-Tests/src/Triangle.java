package Tests;

public class Triangle {
	public static int triangle(int a, int b, int c) {
		if((a >= b + c) || (b >= a + c) || (c >= a + b))
			return 0;
		else if ((a==b) && (b==c))
			return 3;
		else if ((a==b) || (b==c) || (a==c))
			return 2;
		else 
			return 1;
	}
}
