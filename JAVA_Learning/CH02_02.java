public class CH02_02 {
	final static double C = 2997924581.2;
	public static void main(String args[]){
		int m;
		double e;
		m = 10;
		// C = 2.5; cannot assign a value to final variable
		e = m * C * C; 

		System.out.println("mass:" + m);
		System.out.println("energy:" + e);
	}
}