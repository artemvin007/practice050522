import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++){
            String temp = scan.next();
            if (temp.charAt(1) == '+'){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
	}
}