package Day16_array;
class Student1
{
	public int roll_no;
	public String name;
	Student1(int roll_no, String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}

public class CFG {

	public static void main(String[] args) {
		// declares an Array of integers.
		Student1[] arr;
		//allocating memory for 5 objects of type Student or instantiation
		arr=new Student1[5];
		//initialize the first elements of array
		arr[0]=new Student1(1,"Aman");
		//initialize the second elements of array
		arr[1]=new Student1(2,"Vaibhav");
		//so on...
		arr[2]=new Student1(3,"Shikhar");
		arr[3]=new Student1(4,"Darmesh");
		arr[4]=new Student1(5,"Mohit");
		//accessing the elements of the specified array
		for(int i=0;i<arr.length;i++)
		System.out.println("Element at "+i+":"+arr[i].roll_no+" "+arr[i].name);

	}

}
