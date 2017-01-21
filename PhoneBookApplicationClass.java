import java.util.Scanner;
import java.io.*;

public class PhoneBookApplicationClass { 
	//overload the methods of the constructors instead of overriding 
	//how to read in strings and ints from text file. 
	//when i use ImportTexts how to update user and admin objects without making both of them have the same information
	//how to get rid of white space in file

static Admin mainadmin=new Admin();
static NormalUser mainUser=new NormalUser();
public static void main(String []args){
		try{
		    FileInputStream fstream = new FileInputStream("AdminFile.txt");
		          DataInputStream in = new DataInputStream(fstream);
		          BufferedReader br = new BufferedReader(new InputStreamReader(in));
		          String strLine;
		          while ((strLine = br.readLine()) != null)   {
		   String[] admin_file = strLine.split(",");
		   Admin admin=new Admin(admin_file[0],admin_file[1], admin_file[2]);//process record , etc
		   mainadmin=admin;
		          }
		   in.close();
		   }catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		   }
	try{
	    FileInputStream fstream = new FileInputStream("NormalUserFile.txt");
	          DataInputStream in = new DataInputStream(fstream);
	          BufferedReader br = new BufferedReader(new InputStreamReader(in));
	          String strLine;
	          while ((strLine = br.readLine()) != null)   {
	   String[] user_file = strLine.split(",");
	   int id=Integer.valueOf(user_file[2]);
	   NormalUser userbook=new NormalUser(user_file[0],user_file[1], id);//process record , etc
	   mainUser=userbook;
	   }
	   in.close();
	   }catch (Exception e){
	     System.err.println("Error: " + e.getMessage());
	   }



	if ("admin".equals("admin")){
		mainadmin.PrintUserInfo();
		mainUser.PrintUserInfo();
	}
	
}
}
