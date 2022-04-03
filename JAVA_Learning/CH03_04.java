// CH03 - Pratice

public class CH03_04{
	private static char myData;
	public static void main(String [] args){
		
		int total = 2850;
		int hundred_dollars = total / 100;
		int fifty_dollars = (total % 100) / 50;
		int ten_dollars = ((total % 100) % 50) / 10;
		System.out.println("$100 : " + hundred_dollars);
		System.out.println("$50 : " + fifty_dollars);
		System.out.println("$10 : " + ten_dollars);
	}
}