import java.util.*;
import java.io.*;
public class C1JR_poker {
	static Scanner in;
	static String line;
	static String[] cardVals;
	static Integer card1;
	static Integer card2;
	
	
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("C1JR.in"));
		for(int i = 0; i < 9; i++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				System.out.println("Error");
			}
		}
	}
	public static void init() {
        line = in.nextLine();
		cardVals = line.split(" ");
		
		
	}
	public static void solve() {
		int count = 1;
		int count2 = 1;
		for(int i = 0; i < cardVals.length; i++) {
			card1 = Integer.parseInt(cardVals[i]);
			for(int j = i+1; j < cardVals.length ; j++) {
					card2 = Integer.parseInt(cardVals[j]);
					if(card1%13 == card2%13) {
						if(i == 0) {
							count++;
						}
						else {
							count2++;
						}
					}
				}
			}
		if((count == 2 && count2 == 4) || (count == 3 && count2 == 3)) {
			System.out.println("FULL HOUSE");
		}
		else if(count == 2 || count2 == 0 ) {
			System.out.println("PAIR");
		}
		else if(count == 3 || count2 == 2) {
			System.out.println("THREE OF A KIND");
		}
		else if(count == 4 || count2 == 3) {
			System.out.println("FOUR OF A KIND");
		}	
		else {
			System.out.println("NONE");
		}
	
	}
}


