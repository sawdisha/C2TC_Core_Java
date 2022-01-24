package Day17_collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
class Student1
{
	int id;
	String name;
	int grade;
	public Student1(int id, String name, int grade) {
	
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public String toString()
	{
		String str="Student is["+id+","+name+","+grade+"]";
				return str;
	}
	
}
class Employee1
{
	int id;
	String name;
	String email;
	Float salary;
	public Employee1(int id, String name, String email, Float salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String toString()
	{
		String str="("+id+","+name+","+email+","+salary+")";
		return str;
	}
	
}

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1(101,"Harry",10);
		Student1 s2=new Student1(102,"Potter",10);
		Integer i=new Integer(100);
		String s="Collection Example";
		Float f=new Float(22.22f);
		Character ch=new Character('C');
		Employee1 e1=new Employee1(101,"Suhas","sushas@gmail.com",40000.0f);
		Employee1 e2=new Employee1(102,"Thor","thor@gmail.com",41000.0f);
		Employee1 e3=new Employee1(103,"Hulk","hulk@gmail.com",45000.0f);
		Employee1 e4=new Employee1(104,"Salman","salman@gmail.com",43000.0f);
		
		ArrayList al1=new ArrayList();
		al1.add(0,i);
		al1.add(1,s);
		al1.add(2,f);
		al1.add(3,ch);
		al1.add(s1);
		al1.add(s2);
		System.out.println("Size:"+al1.size());
		ArrayList al2=new ArrayList(al1);
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);
		al2.add(e4);
		System.out.println("Size:" +al2.size());
		Iterator i1=al2.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
			
		}
	}
	
	
}
