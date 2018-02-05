/*
Three steps when creating an object from a class:

• Declaration − A variable declaration with a variable name with an object type.
• Instantiation − The 'new' keyword is used to create the object.
• Initialization − The 'new' keyword is followed by a call to a constructor. 
  This call initializes the new object.

Example:

//First create an object 
ObjectReference = new Constructor();

//Now call a variable as follows 
ObjectReference.variableName;

//Now you can call a class method as follows 
ObjectReference.MethodName();

*/


public class CreatingObjects {
	int objectNumber;
	
	public CreatingObjects(String name){
		// This constructor has one parameter
		System.out.println("Name of object: " + name);
	}
	
	public void setNumber(int number){
		objectNumber = number;
	}
	
	public int getNumber(){
		System.out.println("Object number is " + objectNumber);
		return objectNumber;
	}
	
	
	public static void main(String[] args){
		
		//Object creation
		CreatingObjects object1 = new CreatingObjects("Object 1");
		
		/* Call class method to set object number */
		object1.setNumber(1);
		
		/* Call another class method to get objects number */
		object1.getNumber();
		
		/* You can access instance variable as follows as well */
		 System.out.println("Variable Value :" + object1.objectNumber);
		 
	}
	
}







