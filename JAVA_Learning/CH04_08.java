// CH04 - for each

public class CH04_08{
	public static void main(String [] args){
		int A[] = {1, 2, 3, 4, 5};
		for(int i:A){
				System.out.println(i);	
		}

		int score[][]={   
	  				{15,25,30,17},
	  				{22,52,10,8}
			};
		for(int r[]:score){
			for (int c:r) {
				System.out.println(c);	
			}		
		}			
	}			
}