 /**
  * This is a driver class that demonstrates how a mail office is created and mails get added to it.
  *  @author Khandan Monshi
  */
/*
* Class: CMSC201
* Instructor: Monshi
* Description: this program takes in mail into an array and then sorts the array and then displays it.
* Due: 05/5/16 
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here:Brandon Tennyson
*/

import java.util.ArrayList;

public class MailOfficeDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		final  int RGULAR =1, PRIORITY =2 , OVERNIGHT=3;
		

        // Create a new Mail Office
		MailOffice mOffice =  new MailOffice("Rockville Post Office\n\n");

		 

		//Add 6 Mail objects to the MailOffice mOffice 
		mOffice.addMail(RGULAR,3.5, "20852","John", "Fred" );
	 	mOffice.addMail(RGULAR,20,"20852", "Anna", "Micheal");
		mOffice.addMail(PRIORITY,2, "20865", "Mary", "Antonio");
		mOffice.addMail(PRIORITY,3, "50987", " Rob", "Alex");
		mOffice.addMail(OVERNIGHT,11, "20876", "Sonia", "Kevin");
		mOffice.addMail(OVERNIGHT,10, "20137","Sam", "Peter");
	

		//Display the mails in the MailOffice mOffice
		System.out.println(mOffice);

		// Sort mails in the mOffice and save the result in a new arrayList
		ArrayList  <Mail>  sortedOffice = mOffice.sortMails();
		System.out.println("SORETD LIST:");
		
		//Display the contents of the sorted array
		for  ( Mail  m : sortedOffice )
		{
			System.out.println(m);
		}


	}

}