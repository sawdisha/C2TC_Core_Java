class Box
{
	float width;
	float height;
	float depth;
	String color;
	
	
	float calcVol()
	{
		return width*height*depth;
	}
	}

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box box1=new Box();
//box1=new Box();
box1.width=3.4f;
box1.height=2.2f;
box1.depth=1.4f;
box1.color="Green";

float vol=box1.calcVol();
System.out.println("Volume of Box1 is "+vol+" and the color is "+box1.color+".");

Box box2=new Box();
//box2=new Box();
box2.width=5.4f;
box2.height=4.2f;
box2.depth=4.1f;
box2.color="Red";

float vol1=box2.calcVol();
System.out.println("Volume of Box2 is "+vol1+" and the color is "+box2.color+".");

	}

}
