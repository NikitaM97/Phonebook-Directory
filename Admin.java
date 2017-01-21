import java.util.Scanner;

public class Admin extends User implements AdminInt{
	Admin(){};
	Admin(String name, String passcode, String mail){
		username=name;
		password=passcode;
		email=mail;
	}
	private String email;
	static Scanner input=new Scanner(System.in);
	public void edit_entry(){
		System.out.println("Enter the first name of the entry.");
		String first_name=input.next();
		System.out.println("Enter the last name of the entry");
		String last_name=input.next();
		Phone_Book_Directory.Edit(first_name, last_name);
}
	public void add_entry(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first name of the entry.");
		String name=input.next();
		System.out.println("Enter the last name of the entry.");
		String last_name=input.next();
		System.out.println("Enter the phone number of the entry");
		String number=input.next();
		System.out.println("Enter a zip code");
		String zip=input.next();
		System.out.println("Enter an email");
		String email=input.next();
		System.out.println("Enter an id");
		int id=input.nextInt();
		PhoneBookEntry entry=new PhoneBookEntry(id,name,last_name,email,zip,number);
		Phone_Book_Directory.addEntry(entry);
	}
	public void delete_entry(){
		System.out.println("Enter the ID of the entry you would like to delete");
		int deletion=input.nextInt();
		Phone_Book_Directory.DeleteEntry(deletion);
	}
	public void linear_search(){
		System.out.println("Enter the phone number of the entry you would like to find");
		String number=input.next();
		System.out.println("First name:"+Phone_Book_Directory.LinearSearchByPhoneNumber(number).GetFirstName());
		System.out.println("Phone number:"+Phone_Book_Directory.LinearSearchByPhoneNumber(number).GetNumber());
	}
	public void binary_search(){
		System.out.println("Enter the id of the phone book entry you would like to see,");
		int searchID=input.nextInt();
		Phone_Book_Directory.SearchbyIDBinarySearch(searchID).PrintBookEntry();
	}
	public void changeUserName(){
		System.out.println("Enter the new username");
		username=input.next();
	}
	public void changePassWord(){
		System.out.println("Enter the new password");
		password=input.next();
	}
	public void sort(){
		Phone_Book_Directory.SortbyID();
		System.out.println("Phone book is sorted.");
	}

public void PrintUserInfo(){
	System.out.println("Username:"+username);
	System.out.println("Password:"+password);
	System.out.println("Email:"+email);
}
}
	
