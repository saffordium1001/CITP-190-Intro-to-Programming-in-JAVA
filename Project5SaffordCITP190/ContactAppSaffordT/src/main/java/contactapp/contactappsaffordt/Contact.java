/*
====================================================================================================
Student: Twymun Safford
Date: 04/09/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Contact App Application - Contact Class
Description: This application creates and maintains a contact book based on user input.
====================================================================================================
 */
package contactapp.contactappsaffordt;

/**
 *
 * @author tksafford
 */
public class Contact {

    /*
=================================================
Private Instance Variables
=================================================
     */
    private String name;
    private String address;
    private String phone;
    private String email;


    /*
=================================================
Getters and Setters - Instance Variables
=================================================
     */
//Getter - name string
    public String getName() {
        return name;
    }
//Setter - name string

    public void setName(String newName) {
        this.name = newName;
    }
//Getter - address string

    public String getAddress() {
        return address;
    }
//Setter - address string

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
//Getter - phone string

    public String getPhone() {
        return phone;
    }
//Setter - phone string

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
//Getter - email string

    public String getEmail() {
        return email;
    }
//Setter - email string

    public void setEmail(String newEmail) 
    {
        this.email = newEmail;
    }

    /*
=================================================
ToString method
=================================================
     */
    @Override
    public String toString() {
        //format needs to be in terms of name, address, phone, email
        return ("Name: " + this.name + "\tAddress: " + this.address + "\tPhone Number: " + this.phone + "\tEmail: "+this.email);
    }
}
