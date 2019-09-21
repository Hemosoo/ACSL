import java.util.*;
import java.io.*;
public class C1JR_Prints {
	static Scanner in;
	static int[] nums;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("C1JR.in"));
		for(int i = 0; i < 5; i++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				System.out.println("Error");
			}
		}
		
	}
	public static void init() {
		int cnt = 0;
		nums = new int[5];
		if(in.hasNextInt() == true) {
			for(int i = 0; i < 5; i++) {
				nums[cnt] = in.nextInt();
			}
		}
	}
	public static void solve() {
		
	}
}
