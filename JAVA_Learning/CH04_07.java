// CH04 - return

public class CH04_07{
	public static void main(String [] args){
		int output = sum(5);
		System.out.println(output);	
	}	
	static int sum(int n){
			int sum=0;
			for(int i=1; i <=n; i++){
				sum+=i;
			}
			return sum;
		}
		
}