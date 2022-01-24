import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is "+(a+b));
	
		ScannerClassDemo obj=new ScannerClassDemo();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());

	}

}
