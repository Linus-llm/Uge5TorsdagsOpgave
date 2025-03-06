import java.util.Scanner;
import java.util.ArrayList;
class GameMenu{ //4.a entity class
	private ArrayList<String> actions = new ArrayList<>(); //4.b private instance varible

	public GameMenu(ArrayList<String> actions){ //4.c and 4.d constructor with arraylist parameter
	this.actions = actions;
	}

	public void displayMenu(){ //4.h method to print the arraylist
		for(String i:actions){
			System.out.println(i);
		}
	}
	public String getAction(){ //5.a prints a message and ask the user to type a number
		System.out.println("Type a number to choose an action"); 
		displayMenu();
		Scanner scan = new Scanner(System.in); //5.b creating scanner object
		String choice = scan.nextLine(); //5.b 
		return choice; //5.c returning users input
	}
}