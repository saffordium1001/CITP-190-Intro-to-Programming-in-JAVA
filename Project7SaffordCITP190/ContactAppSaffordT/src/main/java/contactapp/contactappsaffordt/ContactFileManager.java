/*
====================================================================================================
Student: Twymun Safford
Date: 05/03/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
For FILE I/O
Instructor: Maissam Khalil
Contact App Application - ContactFileManager Class
Description: This application creates and maintains a contact book based on user input; now implements
serializable requirement
====================================================================================================
 */
package contactapp.contactappsaffordt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ContactFileManager 
{
    public void writeContacts(String fileName, Contact[] contacts) throws IOException 
    {
		FileOutputStream fos = new FileOutputStream(new File(fileName), false);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(contacts);
		oos.close();
    }
    
    public Contact[] readContacts(String fileName) throws IOException, ClassNotFoundException 
    {
		FileInputStream fis = new FileInputStream(new File(fileName));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Contact[] contacts = (Contact[]) ois.readObject();
		ois.close();
		return contacts;
	}
}
