package Exception;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo();

	}

	public static void  demo(){

	try{

	System.out.println("Hello world");

	int i=2/0;

	//these code wont exceute at all and control passes to catch and then to fincally method
	System.out.println("Completed");

	 }

	catch(Exception e){

	System.out.println("in catch");

	}

	finally {

	System.out.println("Finally method");

	} 

	}

	

}
