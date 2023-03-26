
import java.util.*;

public class Queue {

//attribute

	protected LinkedList list;

//default constructor

	public Queue() {
		list = new LinkedList();
	}

//check whether the queue contains any elements or not

	public boolean isEmpty() {
		return list.isEmpty();
	}

//get the number of elements stored

	public int size() {
		return list.size();
	}

//insert an element to the back of the queue

	public void enqueue(Object element) {
		list.addLast(element);
	}

//delete the front element from the queue

	public Object dequeue() {
		return list.removeFirst();
	}

//get the first element from the queue

	public Object front() {
		return list.getFirst();
	}

//get the last element in the queue

	public Object rear() {
		return list.getLast();
	}

	//Display Queue data
	public void display() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}
}