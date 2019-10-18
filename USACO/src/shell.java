import java.util.*;
import java.io.*;
public class shell {
	static Scanner in;
	static PrintWriter out;
	static int num, a[], b[], g[], s[], hold; 
	static int count;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("shell.in"));
		out = new PrintWriter(new File("shell.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		num = in.nextInt();
		a = new int[num];
		b = new int[num];
		g = new int[num];
		for(int i = 0; i < num; i++) {
			a[i] = in.nextInt()-1;
			b[i] = in.nextInt()-1;
			g[i] = in.nextInt()-1;
			
		}
	}
	public static void solve() {
		int max = 0;
		for(int i = 0; i < 3; i++) {
			reset(i);
			game();
			max = Math.max(max, count);
		}
		out.println(max);
	}

	public static void game() {
		for(int j = 0; j < num; j++) {
			hold = s[a[j]];
			s[a[j]] = s[b[j]];
			s[b[j]] = hold;
			if(s[g[j]] == 1) {
				count++;
			}
		}
	}
	public static void reset(int i) {
		count = 0;
		s = new int[3];
		s[i] = 1;
	}
}
