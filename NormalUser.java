import java.util.Scanner;
public class NormalUser extends User implements NormalUserInt {
	NormalUser(){};
	NormalUser(String name, String passcode, int ID){
		username=name;
		password=passcode;
		id=ID;
	}
	private int id;
	static Scanner input=new Scanner(System.in);
	public void add_phone_entry(){
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
	public void edit_phone_entry(){
		System.out.println("Enter the first name of the entry.");
		String first_name=input.next();
		System.out.println("Enter the last name of the entry");
		String last_name=input.next();
		Phone_Book_Directory.Edit(first_name, last_name);
	}
	public void sort(){
		Phone_Book_Directory.SortbyID();
		System.out.println("Phone book is sorted.");
	}
	public void Linear_search(){
		System.out.println("Enter the phone number of the entry you would like to find");
		String number=input.next();
		System.out.println("First name:"+Phone_Book_Directory.LinearSearchByPhoneNumber(number).GetFirstName());
		System.out.println("Phone number:"+Phone_Book_Directory.LinearSearchByPhoneNumber(number).GetNumber());
	}
	public void PrintUserInfo(){
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		System.out.println("ID:"+id);
	}

}
