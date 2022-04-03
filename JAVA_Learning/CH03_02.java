// CH03 - Operator

public class CH03_02{
	public static void main(String [] args){
		int math, english;
		char pass;
		math = 56;
		english = 90;
		System.out.print(" Math is: " + math + "\tEnglish is: " + english + "\n");
		pass = ((math >= 60) & (english >= 60)) ? 'Y' : 'N';
		System.out.print("Pass or not: " + pass);
		}
	}