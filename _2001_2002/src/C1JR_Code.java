import java.util.*;
import java.io.*;

public class C1JR_Code {
	static Scanner in;
	static char c;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("c1jr.in"));
		for(int i = 0; i < 10; i++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	private static void init() {
		c = in.next().charAt(0);
	}
	
	private static void solve() {
		int n = c-64;
		int ans = 0;
		if('A' <= c && c<= 'E') {
			ans = n*2;
		}
		else if('F' <= c && c<= 'J') {
			
		}
		else if('K' <= c && c<= 'O') {
			
		}
		else if('P' <= c && c<= 'T') {
	
		}
		else if('U' <= c && c<= 'Z') {
	
		}
		
		//output
		ans += 64;
		System.out.println((char)ans);
	}
}
