import java.util.*;
import java.io.*;
public class blist {
	static Scanner in;
	static PrintWriter out;
	static int num;
	static int[] time1;
	static int[] time2;
	static int[] buckets;
	static int bucketNum;
	static int[] times;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("blist.in"));
		out = new PrintWriter(new File("blist.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		num = in.nextInt();
		time1 = new int[num];
		time2 = new int[num];
		buckets = new int[num];
		times = new int[1001];
		for(int i = 0; i < num; i++) {
			time1[i] = in.nextInt();
			time2[i] = in.nextInt();
			buckets[i] = in.nextInt();
		}
		for(int i = 0; i < 1001; i++) {
			times[i] = 0;
		}
	}
	public static void solve() {
		for(int j = 0; j < num; j++) {
			for(int i = time1[j]; i <= time2[j]; i++) {
				times[i] += buckets[j];
			}
		}
		Arrays.sort(times);
		out.print(times[1000]);
	}
}
