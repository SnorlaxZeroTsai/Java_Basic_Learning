// CH03 - Input/Output

public class CH03_03{
	private static char myData;
	public static void main(String [] args){
		
		

		java.util.Scanner input_obj=new java.util.Scanner(System.in);
		System.out.print("Please input string data:");
		String my_string = input_obj.nextLine();
		System.out.println(my_string);

		System.out.print("Please input int data:");
		int my_int = input_obj.nextInt();
		System.out.println(my_int);

		System.out.print("Please input double data:");
		double my_double = input_obj.nextDouble();
		System.out.println(my_double);
	}
}