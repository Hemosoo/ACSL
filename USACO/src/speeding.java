import java.util.*;
import java.io.*;
public class speeding {
	static Scanner in;
	static PrintWriter out;
	static int a[], b[], n, m, max, temp, speed, s, e;
	
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("speeding.in"));
		out = new PrintWriter(new File("speeding.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		n = in.nextInt();
		m = in.nextInt();
		s = 0;
		e = 0;
		max = 0;
		a = new int[101];
		b = new int[101];
		for(int i = 0; i < n; i++) {
			temp = in.nextInt();
			speed = in.nextInt();
			s = e;
			e += temp;
			for(int j = s; j < e; j++) {
				a[j] = speed;
			}
		}
		s = 0;
		e = 0;
		for(int i = 0; i < m; i++) {
			temp = in.nextInt();
			speed = in.nextInt();
			s = e;
			e += temp;
			for(int j = s; j < e; j++) {
				b[j] = speed;
			}
		}
	}
	public static void solve() {
		for(int i = 0; i < 101; i++) {
			max = Math.max(max, b[i] - a[i]);
		}
		out.println(max);
	}
	
}
