package edu.kec.queue;

import java.util.ArrayDeque;

public class ADQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayDeque<String> orders =new ArrayDeque<String>();
        orders.offer("order1");
        orders.offer("order2");
        orders.offer("order3");
        orders.offerFirst("order4");
        orders.offerLast("order6");
        //orders.offer("order1");
        System.out.println(orders.peek());
        System.out.println(orders.peekLast());
        
        System.out.println(orders.poll());
        System.out.println(orders.pollLast());
        
	}

}
