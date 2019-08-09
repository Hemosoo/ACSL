import java.util.*;
import java.io.*;
public class C1JR_Astericks {
	static Scanner in;
	static String s;
	static int n1, n2;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("C2JR.in"));
		for(int i = 0; i < 9; i++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				System.out.print("error");
			}
		}
	}
	public static void init() {
		s = in.next();
		n1 = in.nextInt();
		if(s.equals("B")) n2 = in.nextInt();
	}
	public static void solve() {
		if(s.equals("S")) {
			for(int i = 0; i < n1; i ++) {
				for(int j = 0; j < n1; j ++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(s.equals("H")) {
			for(int i = n1; i >= 0; i--) {
				for(int j = 0; j < n1-i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(s.equals("L")) {
			for(int i = 0; i < n1; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(s.equals("B")) {
			for(int i = 0; i < n2; i ++) {
				for(int j = 0; j < n1; j ++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
	}
}
