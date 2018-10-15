import java.util.Scanner;
public class Pizza {
	public static void main(String[]args) {
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt() + 1;
		if(n == 0) {
			System.out.print("0");
		}else if(n>0 && ((n%2)==0)){
			System.out.print(n/2);
		}else {
			System.out.print(n);
		}
	}
}