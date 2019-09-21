import java.util.*;
import java.io.*;
public class backforth {
	static Scanner in;
	static PrintWriter out;
	static int[] barn1;
	static int[] barn2;
	static int re = 0;
	static Set<Integer> s;
	static int hold = 0;
	static int[] clone1;
	static int[] clone2;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("backforth.in"));
		out = new PrintWriter(new File("backforth.out"));
		init();
		solve();
		
		in.close();
		out.close();
	}
	public static void init() {
		 barn1 = new int[10];
		 barn2 = new int[10];
		 clone1 = new int[10];
		 clone2 = new int[10];
		 for(int i = 0; i < 10; i++) {
			 barn1[i] = in.nextInt();
			 clone1[i] = barn1[i];
		 }
		 for(int i = 0; i < 10; i++) {
			 barn2[i] = in.nextInt();
			 clone2[i] = barn2[i];
		 }
		 s = new HashSet<Integer>();
	}
	public static void solve() {
		int milk = 1000;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <10; j++) {
				barn1 = clone1.clone();
				barn2 = clone2.clone();
				int sofar=milk-barn1[i]+barn2[j];
				hold = barn1[i];
				barn1[i] = barn2[j];
				barn2[j] = hold;
				
				for(int m = 0; m < 10; m++) {
					for(int k = 0; k < 10; k++) {
						int result = sofar-barn1[m] + barn2[k];
						s.add(result);
						
						}
					}
				}
			}
		out.println(s.size());
		}
	}
