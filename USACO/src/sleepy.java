import java.util.*;
import java.io.*;
public class sleepy {
	static Scanner in;
	static PrintWriter out;
	static Integer num, count, hold;
	static ArrayList<Integer> n;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("sleepy.in"));
		out = new PrintWriter(new File("sleepy.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		count = 0;
		num = in.nextInt();
		n = new ArrayList<Integer>(num);
		for(int i = 0; i < num; i++) {
			n.add(in.nextInt());
		}
	}
	public static void solve() {
		for(int i = num-1; i > 0; i--) {
			if(n.get(i-1) > n.get(i)) {
				count = i;
				break;
			}
		}
		out.println(count);
	}
}
