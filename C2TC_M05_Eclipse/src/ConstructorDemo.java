class Student
{
	int id;
	String name;
	String course;
	String email;
	Student()
	{
	}
	public Student(int id, String name, String course, String email) {
	
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}

	public void display()
	{
		System.out.println("Student Information:");
		System.out.println(id+" "+name+" "+course+" "+email);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.id=1;
		s1.name="Disha";
		s1.course="Java";
		s1.email="adahfgh";
		s1.display();
		
		Student s2=new Student(2,"Rachana","BSc","asgsuhd");
		s2.display();
	}

}
