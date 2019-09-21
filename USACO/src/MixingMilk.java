import java.util.*;
import java.io.*;
public class MixingMilk {
	static Scanner in;
	static PrintWriter out;
	static int[] buckets;
	static int[] bucketCap;
	static int[] clone1;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("mixmilk.in"));
		out = new PrintWriter(new File("mixmilk.out"));
		init();
		solve();
		
		in.close();
		out.close();
	}
	public static void init() {
		buckets = new int[3];
		bucketCap = new int[3];
		clone1 = new int[10];
		for(int i = 0; i < 3; i++) {
			bucketCap[i] = in.nextInt();
			buckets[i] = in.nextInt();
			clone1[i] = buckets[i];
		}
		System.out.println(Arrays.toString(bucketCap));
		System.out.println(Arrays.toString(buckets));
	}
	public static void solve() {
		buckets = clone1.clone();
		while(count<100) {
			for(int i = 0; i < 3; i++) {
				if(i!=2) {
					buckets[i+1] = buckets[i] + buckets[i+1];
					if(bucketCap[i+1]<buckets[i+1]) {
						buckets[i] = buckets[i+1]-bucketCap[i+1];
						
					}
					else {
						buckets[i] = 0;
					}
				}
				else {
					buckets[0] = buckets[0] + buckets[i];
					if(bucketCap[0]<buckets[0]) {
						buckets[i] = buckets[0]-bucketCap[0];
						buckets[0] = buckets[0]-bucketCap[0];
					}
					else {
						buckets[i] = 0;
					}
				}
				count++;
				if(count == 100) {
					break;
				}
			}
		}
		out.println(buckets[0] + "\n" + buckets[1] + "\n" + buckets[2] + "\n");
	}
}
