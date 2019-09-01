import java.util.*;
import java.io.*;
public class C1JR_Golf {
	static Scanner in;
	static int fr, sec, totalFr, totalSec;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("C1JR.in"));
		for(int i = 0; i < 4; i++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		System.out.println(total());
	}
	public static void init() {
		fr = in.nextInt();
		sec = in.nextInt();
		totalFr += fr;
		totalSec += sec;
	}
	public static void solve() {
		int dif = fr-sec;
		System.out.println(subTotal(dif));
		
	}
	public static String subTotal(int a) {
		if(a == 1) {
			return "birdie";
		}
		else if(a == 2) {
			return "eagle";
		}
		else if(a == -1) {
			return "bogey";
		}
		else if(a == -2) {
			return "double bogey";
		}
		else {
			return "par";
		}
	}
	public static String total() {
		int dif = totalSec - totalFr;
		if(dif>0) {
			return dif +  " over par";
		}
		else if (dif<0) {
			return dif + " under par";
			
		}
		else {
			return "par";
		}
	}
}
