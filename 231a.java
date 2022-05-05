import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int count = 0;
		for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = 0; j < 3; j++){
                sum += scan.nextInt();
            }
            count += sum / 2;
        }
        System.out.println(count);
	}
}