import java.util.*;
import java.io.*;

public class C1JR_Code {
	static Scanner in;
	static char c;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("c1jr.in"));
		for(int i = 0; i < 10; i++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	private static void init() {
		c = in.next().charAt(0);
	}
	
	private static void solve() {
		int n = c-64;
		int ans = 0;
		
		if('A' <= c && c<= 'E') {
			ans = n*2;
		}
		else if('F' <= c && c<= 'J') {
			ans = (n%3)*5;
		}
		else if('K' <= c && c<= 'O') {
			ans = (n/4)*8;
		}
		else if('P' <= c && c<= 'T') {	          
	        ans = 10*(n % 10 + n/10); 
		}
		else if('U' <= c && c<= 'Z') {
			ans = 12*(gcf(n));
			
		}

      
        ans = ans%26;
        if(ans==0) ans = 26;
      
			
		
		//output
		ans += 64;
		System.out.println((char)ans);
	}
  
  static int gcf(int n){
    for(int i = n/2; i>1; i--)
      if(n%i==0) return i;
    
    return 1;
  }
}