
public class IntDataTypeDemo {
	//primitive Data Types-Integer

	public static void main(String[] args) {
		byte maxbyte=127;
		byte minbyte=-128;
		System.out.println("Min range of byte is "+minbyte+" Max range of byte is "+maxbyte);
		
		short maxshort=32767;
		short minshort=-32768;
		System.out.println("Min range of short is "+minshort+" Max range of short is "+maxshort);
		
		int maxint=2147483647;
		int minint=-2147483648;
		System.out.println("Min range of int is "+minint+" Max range of int is "+maxint);
		
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L;
		System.out.println("Min range of long is "+minlong+" Max range of long is "+maxlong);
		
		float f=3.5687173649564f;
		double d=763.26438716354962843;
		
		System.out.println("float value is "+f+" double value is "+d);
		
		//ASCII code representation
		int a='A';
		char var='A';
		System.out.println(a);
		System.out.println(var);
		
		int b=66;
		char c=(char)b;
		System.out.println(c);
		
		//unicode representation
		char var1='\u20AC';
		System.out.println(var1);
		
			
	}

}
