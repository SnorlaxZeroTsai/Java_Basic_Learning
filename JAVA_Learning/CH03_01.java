// CH03 - Operator

public class CH03_01{
	public static void main(String [] args){
		int num, hundred;
		System.out.print("Please input a number:");
		java.util.Scanner input_obj=new
		java.util.Scanner(System.in);
		num = input_obj.nextInt();
		hundred = (num / 100) % 10;
		System.out.print(num + " is " + "x" + hundred + "xx");

		}
	}