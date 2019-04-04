//dRIVER PACKAGE HAVING MAIN 
package driver;
//IMPORTING ALL THE PACKAGES
import producer.*;
import Q.*;
import consumer.*;
public class driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //CREATING OBJECT OF CLASS Q
		Q q=new Q();
		 new producer(q);
		 new consumer(q);
		}
}
