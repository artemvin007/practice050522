import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n = scan.nextFloat();
		float m = scan.nextFloat();
		float a = scan.nextFloat();
		System.out.println(Math.round(Math.ceil(n / a) * Math.ceil(m / a)));
	}
}