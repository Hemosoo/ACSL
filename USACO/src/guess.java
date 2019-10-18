import java.util.*;
import java.io.*;
public class guess {
	static ArrayList<String>[] a;
	static Scanner in;
	static PrintWriter out;
	static int same, n, max;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("guess.in"));
		out = new PrintWriter(new File("guess.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		max = 0;
		n = in.nextInt();
		a = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<String>();
			in.next();
			int pn = in.nextInt();
			for(int j = 0; j < pn; j++) {
				a[i].add(in.next());
			}
		}
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(String p: a[i]) {
					if(a[j].contains(p)) {
						same++;
					}
				}
				max = Math.max(same, max);
				same = 0;
			}
		}
		out.println(max+1);
		
	}
}
