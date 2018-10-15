import java.util.Scanner;
public class HitLottery {
	public static void main(String[]args) {
		Scanner kbd = new Scanner(System.in);
		int money = kbd.nextInt();
		int n[] = {100,20,10,5,1};
		int bill = 0;
		for(int i = 0 ; i <= 4 ;i++) {
			bill = bill+(money/n[i]);
			money = money-(money/n[i]*n[i]);
		}
		System.out.print(bill);
	}
}