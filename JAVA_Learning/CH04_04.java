// CH04 - do while

public class CH04_04{
	public static void main(String [] args){
		
		int m=28, n=2;
		int temp;
		if (n > m){
			temp = m;
			m = n;
			n = temp;
		};

		do{
			temp = m % n;
			m = n;
			n = temp;
		}while(n != 0);
		System.out.println(m);
	}	
}