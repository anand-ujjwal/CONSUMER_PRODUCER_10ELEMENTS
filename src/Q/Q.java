/* PACKAGE Q IS HAVING THE CODE  TO
 * SYNCHRONIZE AND DELAY THE THREADS
 * IT ALSO CONTAINS THE DEFINITION FOR THE PUT AND GET FUNCTIONS 
 */
package Q;

public class Q {
	int[] arr=new int[10];
	boolean valueSet= false ;
	public void delay(int a){
	try{
	Thread.sleep(a);
	}
	catch(InterruptedException e){
	System.out.println(e);
	}
	}
	public synchronized void put(int[] arr )
	{
	for(int i=0;i<10;i++)
	{
	while(valueSet)
	{
	try {
	wait();
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	this.arr[i] = arr[i];
	System.out.println("Put:"+arr[i]);
	}
	valueSet=true;
	notify();
	delay(1000);
	 }
	 public synchronized void get()
	 {
	for(int i=0;i<10;i++)
	{
	while(!valueSet){
	try {
	wait();
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	this.arr[i] = arr[i];
	System.out.println("got:"+arr[i]);
	
	}
	valueSet=false;
	notify();
	delay(1000);
	 }

}
