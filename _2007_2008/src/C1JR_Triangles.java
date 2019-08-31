import java.util.*;
import java.io.*;
public class C1JR_Triangles {
	static Scanner in;
	static double a1[];
	static double a2[];
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("C1JR.in"));
		for(int i = 0; i < 10; i++) {
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
		a1 = new double[3];
		a2 = new double[3];
		for(int i = 0; i < 3; i++) {
			a1[i] = in.nextDouble();
		}
		for(int i = 0; i < 3; i++) {
			a2[i] = in.nextDouble();
		}
	}
	public static void solve() {
		
		int count = 0;
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 3; i++) {
				if(a1[j] == a2[i]) {
					count++;
					a2[i]=0;
				}
			}
		}
		System.out.println(count);
	}
}
