import java.io.*;
import java.util.Scanner;

public class AddressBook {

private Contact[] friends; // An array of Contacts - each stores info for one friend
private int numfriends; // Number of friends currently in AddressBook

	
// Create an empty AddressBook
public AddressBook() {
	friends = new Contact[10];
	numfriends = 0;
}

public int numContacts(){
	return numfriends;
}

public int deleteContact(String s){
        int pos = haveContact(s);
        friends[pos] = friends[friends.length-1];
        numfriends --;
        return haveContact(s);
 }
	
public void addContact(Contact c){
	friends[numfriends] = c;
	 numfriends++;
}
	
private int haveContact(String s){
	for (int i=0; i<numfriends; i++){
		if(friends[i].getName.equals(s)){
		    return i;
		}
		else{
		    return -1;
		}
	}
}
	    
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        AddressBook redbook = new AddressBook();
        menu();
	int choice = scan.nextInt();
}
	

public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String choice = s.next();
	
        System.out.println("You can delete a contact, add a contact, print the contacts, or see if your list contains a contact.\n" + " What would you like to do?");
        
	AdressBook book = new AdressBook();
	
        if(choice == "add"){
         	System.out.println("Imput name:");
            	String name = s.next();
            	System.out.println("Imput age: ");
            	int age = s.nextInt();
            	System.out.println("Imput phone number Ex:5135183026");
           	int number = s.nextInt();
            	System.out.println("Imput birthday date as month: ");
            	int month = s.nextInt();
            	System.out.println("Input Birthday date year: ");
            	int year = s.nextInt();
            	Contact c = new Contact(name, age, number, month, year);
            	book.addContact(c);
        }
	
        if(choice == "delete"){
        	System.out.println("What would you like to delete? ");
            	String deleted = s.next();
            	book.deleteContact(deleted);
        }
	
        if(choice = "print"){
            	for(int i = 0; i<numfriends; i ++){
                	System.out.println(friends[i]);
            	}
        }
	
        if(choice = ("contains contact") || choice == ("has contact")){
            	String isIn = s.next();
        }        
 }

