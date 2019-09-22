import java.util.*;
import java.io.*;
public class mixmilk {
	static Scanner in;
	static PrintWriter out;
	static int c1, m1, c2, m2, c3, m3;
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
		c1 = in.nextInt();
		m1 = in.nextInt();
		c2 = in.nextInt();
		m2 = in.nextInt();
		c3 = in.nextInt();
		m3 = in.nextInt();
	}
	public static void solve() {
		while(count<34) {
			int space = c2-m2;
			if(space >= m1) {
				m2 += m1;
				m1 = 0;
			}
			else {
				m1 -= space;
				m2 = c2;
			}
			if(count == 33) {
				break;
			}
			space = c3-m3;
			if(space >= m2) {
				m3 += m2;
				m2 = 0;
			}
			else {
				m2 -= space;
				m3 = c3;
			}
			space = c1 - m1;
			if(space >= m3) {
				m1 += m3;
				m3 = 0;
			}
			else {
				m3 -= space;
				m1 = c1;
			}
			count++;
		}
		out.print(m1 + "\n" + m2 + "\n" + m3 + "\n");
	}
	/*if(i!=2) {
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
						buckets[i] = buckets[i]-bucketCap[0];
						buckets[0] = bucketCap[0];
					}
					else {
						buckets[i] = 0;
					}
				}
				count++;
				if(count == 100) {
					break;
				}*/
}
