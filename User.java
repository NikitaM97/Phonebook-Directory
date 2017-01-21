
abstract class User {
 public static  String username;
 public static  String password;
 PhoneBookDirectory Phone_Book_Directory=new PhoneBookDirectory();
public  void PrintUserInfo(){
	System.out.println("Username:"+username);
	System.out.println("Password:"+password);
}
public void ImportTexts(String name, String passcode){
	name=username;
	password=passcode;
}
}