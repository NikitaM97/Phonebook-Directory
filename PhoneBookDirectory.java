import java.util.Scanner;
public class PhoneBookDirectory{
private static PhoneBookEntry[] phone_array=new PhoneBookEntry[6];

public int addEntry(PhoneBookEntry entry){
	for (int i=0;i<phone_array.length;i++){
		if (phone_array[i]==null){
			phone_array[i]=entry;
			return 1;
			}
}
return 0;	
}
public void printAllEntries(PhoneBookEntry[] phone_array){
	for (int i=0;i<phone_array.length;i++){
		if (phone_array[i]!=null){
		phone_array[i].PrintBookEntry();
		}
	}
}

public  PhoneBookEntry LinearSearchByPhoneNumber(String PhoneNumber){
	//decided to have it return a phonebookentry instead of an int because returning an int value is counter-initiative with regards to this method's later implementation
	for (int i=0;i<phone_array.length;i++){
		if (phone_array[i]!=null){
		if (phone_array[i].GetNumber().equals(PhoneNumber)){
			return phone_array[i];
		}
		}
	}
	PhoneBookEntry empty=new PhoneBookEntry();
	return empty;
}

public  PhoneBookEntry SearchbyIDBinarySearch(int id){
	for (int i=0;i<phone_array.length;i++){
		if (phone_array[i]!=null){
		if (phone_array[i].GetID() ==id){
			return phone_array[i];
		}
		}
	}
	PhoneBookEntry empty=new PhoneBookEntry();
	return empty;
}

public  void SortbyID(){
for (int i = 0; i < phone_array.length; i++) {
	if (phone_array[i]==null){
		break;
	}
	else{
    for (int j = i + 1; j < phone_array.length; j++) {
    	if (phone_array[j]==null){
    		break;
    	}
    	else{
            PhoneBookEntry temp = new PhoneBookEntry();
            if (phone_array[i].GetID() > phone_array[j].GetID()) {
                temp = phone_array[i];
                phone_array[i] = phone_array[j];
                phone_array[j] = temp;
}
    	}
    }
	}
}
}

public  int Edit(String firstName, String lastName){
	Scanner input=new Scanner(System.in);
	for (int i=0;i<phone_array.length;i++){
		if (phone_array[i]!=null){
			if (phone_array[i].GetFirstName().equals(firstName)&&
					phone_array[i].GetLastName().equals(lastName)){
				System.out.println("What value would you like to edit? Enter id, email, zip, phone_number, first_name, last_name");
				String user_choice=input.next();
				if (user_choice.equals("id")){
					System.out.println("Enter an integer");
					phone_array[i].SetID(input.nextInt());
					return 1;
				}
				if (user_choice.equals("email")){
					System.out.println("Enter an email");
					phone_array[i].SetEmail(input.next());
					return 1;
				}
				if (user_choice.equals("zip")){
					System.out.println("Enter a zip code");
					phone_array[i].SetZip(input.next());
					return 1;
				}
				if (user_choice.equals("first_name")){
					System.out.println("Enter an first name");
					phone_array[i].SetFirstName(input.next());
					return 1;
			}
				if (user_choice.equals("last_name")){
					System.out.println("Enter a last name.");
					phone_array[i].SetLastName(input.next());
					return 1;
		}
				if (user_choice.equals("phone_number")){
					System.out.println("Enter a phone number.");
					phone_array[i].SetNumber(input.next());
					return 1;
				}
	}
			
		}
	}
	input.close();
	return 0;
}

public  int DeleteEntry(int id){
	for (int i=0;i<phone_array.length;i++){
		if (phone_array[i]!=null){
			//all null values are -1
			if (phone_array[i].GetID()==id){
				phone_array[i].SetID(-1);
				phone_array[i].SetEmail("-1");
				phone_array[i].SetFirstName("-1");
				phone_array[i].SetLastName("-1");
				phone_array[i].SetZip("-1");
				phone_array[i].SetNumber("-1");
			}
			return 1;	
		}
	}
	return 0;
}
}

