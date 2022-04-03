// CH04 - continue

public class CH04_06{
	public static void main(String [] args){
		int i, j;
		for (i=1; i<10; i++) {
			for (j=1; j<=i; j++) {
				if (j==5) continue;
				System.out.print(j);
			}
		System.out.println();
		}
	}	
}