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
}