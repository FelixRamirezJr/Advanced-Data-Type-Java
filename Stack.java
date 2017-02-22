import java.util.*;

class Stack{
	ArrayList<Student> students = new ArrayList<>();

	void push(String id, String name)
	{
		Student s = new Student(id,name);
		students.add(s);
	}

	void push(Student s)
	{
		students.add(s);
	} 

	String pop()
	{
		return sutdents.remove(0);
	}
	public static void main (String [] args)
	{
		// Implement Stack ADT
		return;
	}
}

class Student{
	String id;
	String name;

	Student(String id, String name)
	{
		this.id = id;
		this.name = name;
	}

	String toString()
	{
		return ("Name: " + name + " id: " + id);
	}

}