//Person class
/**
 * People in the city
 * it has name, age, and phone number
 */
public abstract class Person 
{
	String Name;
	int Age;
	int PhoneNum;
	String newFaveCandy;

	//PT -- need javadoc for public methods, too. -1
	public void setName(String newName) 
	{
		Name = newName;
	}
	public String getName() 
	{
		return Name;
	}
	public void setAge(int newAge) 
	{
		//Validate the agem newPhone. -2
		Age = newAge;
	}
	public int getAge()	
	{
		return Age;
	}
	public void setPhone(int newPhone) 	
	{
		PhoneNum = newPhone;
	}
	public int getPhone()	
	{
		return PhoneNum;
	}
	
}
