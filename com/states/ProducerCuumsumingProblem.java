package com.states;
class Producer extends Thread{
	Queue a;
	Producer(Queue q) {
		a = q;
	}
	@Override
	public void run() {
		 int i =1;
		 while(true) {
			 a.put(i);
			 i++;
		 }
	}
	
}
class Consumer extends Thread{
	Queue b;
	Consumer(Queue q) {
		b = q;
}
@Override
public void run() {
	 while(true) {
		 b.get();
	 }  
	 }
}
class Queue{
     int x;
	public void put(int i) {
		 x = i;
		 System.out.println("The producer has produced the value"+i+"int0 x");
	}
	public void get() {
		System.out.println("The consumer has consumed the value"+x+"from x");	
	}
	
}

public class ProducerCuumsumingProblem {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();
	}

}
