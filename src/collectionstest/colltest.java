package collectionstest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class colltest {

	public static void arrListtest() {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		// Traversing list through Iterator
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void linkedlisttest() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ravi");
		ll.add("Ajay");

		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void vectortest() {
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		v.add("Garima");

		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void stacktest() {
		Stack<String> stack = new Stack<String>();

		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		String myname = stack.pop();

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void priorityQueueTest() {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");

		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());

		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

	public static void dequeuetest() {
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
//		arrListtest();
//		linkedlisttest();
//		vectortest();
//		stacktest();
//		priorityQueueTest();
		dequeuetest();

//		System.out.print("Done!");
	}

}
