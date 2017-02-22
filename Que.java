import java.util.ArrayList;

class Que{

	ArrayList<String> queue = new ArrayList<>();


	Que(){}

	void push(String data)
	{
		queue.add(data);
	}
	String pop()
	{
		String toRemove = queue.remove(queue.size() - 1);
		return toRemove;

	}

	int numberOfElements()
	{
		return queue.size();
	}

	public static void main(String [] args)
	{
		Que q = new Que();
		q.push("Test");
		q.push("YAY");
		System.out.println(q.pop());
		System.out.println(q.numberOfElements());
		return;	
	}
}