package edu.kec.queue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue <Integer> orders =new PriorityQueue<Integer>(Comparator.reverseOrder());
        orders.offer(2134);
        orders.offer(1256);
        orders.add(9876);
        
        System.out.print(orders.peek());
        System.out.print(orders.poll());
	}

}
