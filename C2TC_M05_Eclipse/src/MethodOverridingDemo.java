class Bank
{
	float getRateOfInterest()
	{
	return 6.7f;
	}
}

class SBI extends Bank
{
	float getRateOfInterest()
	{
	return 7.0f;
	}
}

class HDFC extends Bank
{
	float getRateOfInterest()
	{
	return 6.8f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
	return 6.9f;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj1=new HDFC();
		System.out.println(obj1.getRateOfInterest());
		//child class object is created and assigned to parent class reference variable
		//i.e. Dynamic Binding
		//Dynamically binding child class object with super class function at run time
	}

}
