import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++){
		    String temp = scan.next();
		    if (temp.length() > 10){
		        System.out.print(temp.charAt(0));
		        System.out.print(temp.length() - 2);
		        System.out.println(temp.charAt(temp.length() - 1));
		    }else{
		        System.out.println(temp);
		    }
		}
	}
}