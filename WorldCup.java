import java.util.Scanner;
public class WorldCup {
	public static void main(String[]args) {
		Scanner kbd = new Scanner(System.in);
		int entrance = kbd.nextInt();
		int[] queue = new int[entrance];
		int[] queue1 = new int[entrance];
		int idddddkk = 0;
		int idk = 0;
		for(int i=0;i < entrance ; i++) {
			queue[i] = kbd.nextInt();
			idk = (int)Math.ceil(((queue[i]-i)/(double)1)/entrance);
			queue1[i] = idk;
			if(queue1[i] < queue1[idddddkk] ) {
				idddddkk = i;
			}
		}
		System.out.print(idddddkk+1);
	}
}