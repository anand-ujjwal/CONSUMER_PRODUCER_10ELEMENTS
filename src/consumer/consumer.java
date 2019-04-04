//CONSUMER PACKAGE HAVING A THREAD consumer TO USE GET FUNCTION
package consumer;
//IMPORTING PACKAGE Q
import Q.*;
public class consumer implements Runnable {
	Q q;
	 
	//constructor which creates thread
	public consumer(Q q)
	{
	this.q=q;
	new Thread(this,"consumer").start();
	}
	//method run() which calls get() method
	public void run()
	{
	while(true)
	q.get();
	 }

}
