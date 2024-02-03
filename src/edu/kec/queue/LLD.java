package edu.kec.queue;
import java.util.Deque;
import java.util.LinkedList;

public class LLD {
  
	public static void main(String []args) {
		Deque<String> processList =new LinkedList<String>();
		processList.offer("youtube");
		processList.offer("instagram");
		processList.add("Facebook");
		processList.addLast("GUI");
		processList.addFirst("incoming call");
		System.out.println(processList.peek());//op->incoming call
		System.out.println(processList.peekFirst());//op->incoming call
		System.out.println(processList.peekLast());//GuI
		
		System.out.println(processList.poll());//op->incoming call
		System.out.println(processList.pollFirst());//op->youtube
		System.out.println(processList.pollLast());//op->GuI
		
		System.out.println(processList.peek());
		System.out.println(processList.peekFirst());
		System.out.println(processList.peekLast());
	}
}
