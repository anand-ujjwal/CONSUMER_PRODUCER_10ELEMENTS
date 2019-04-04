//PRODUCER PACKAGE HAVING A THREAD producer TO USE PUT FUNCTION
package producer;
import Q.*;
public class producer implements Runnable {
	Q q;
	 //constructor
	public producer(Q q)
	{
	this.q=q;
	//creating producer thread
	 new Thread(this,"Producer").start();
	}
	 public void run()
	 { //declaring an array
	 int[] arr=new int[10];
	 for(int i=0;i<10;i++)
	 {
		 arr[i]=i; 
	 }
	 while(true)
	 {
	 q.put(arr);
	 }
	 }
}
