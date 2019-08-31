import java.util.*;
import java.io.*;
public class C1JR_ASCLDIGITS {
	static Scanner in;
	static int num;
	static ArrayList<Integer> n;
	static int max;
	static int i;
	static int count;
	public static void main(String[] args) throws IOException {
		
		in = new Scanner(new File("C1JR.in"));
		for(int i = 0; i< 10; i++) {
			try {
				init();
				solve();
				
			}
			catch(Exception e) {
				System.out.print("Error");
			}
		}
	}
	public static void init() {
		n = new ArrayList<Integer>();
		num = in.nextInt();
		while(num != 0) {
			n.add(0, num%10);
			num = num/10;
		}
		
		
	}
	public static void solve() {
		max = n.get(0);
      	count = 0;
		for(i = 1; i < n.size(); i++) {
			if(n.get(i) > max) {
				max = n.get(i);
                count = i;
			}
		}
      
      
      
		if(max%2 == 1) {
			max = 0;
		}
		else if(max%2 == 0) {
			max += 4;
			max = max%10;
		}
		n.set(count, max);
		if(n.get(0)==0) n.remove(0);
		System.out.println(n);
	}
}
