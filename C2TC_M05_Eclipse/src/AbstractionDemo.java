abstract class BankAbstract
{
	abstract float  getRateOfInterest();
	void display()
	{
		System.out.println("Abstract class");
	}
}

class Abhyudaya extends BankAbstract
{

	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.0f;
	}
	
}

class RBI extends BankAbstract
{

	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.8f;
	}
	
}

class BOB extends BankAbstract
{

	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.9f;
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abhyudaya obj=new Abhyudaya();
		System.out.println(obj.getRateOfInterest());
		
		BankAbstract obj1=new RBI();
		System.out.println(obj1.getRateOfInterest());
	}

}
