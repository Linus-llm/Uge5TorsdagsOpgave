import java.util.ArrayList;
class Main{ //4.e main class
	static ArrayList<String> actions; //4.f new arraylist called actions
	public static void main(String[] args){
		actions = new ArrayList<>(); //4.f
		actions.add("1) Start game"); //4.f
		actions.add("2) Resume game"); //4.f
		actions.add("3) Pause game"); //4.f
		actions.add("4) End game"); //4.f
		//System.out.print(actions.get(2)); 
		GameMenu myGameMenu = new GameMenu(actions); //4.g instantiates myGameMenu with actions
		//myGameMenu.displayMenu(); //4.i testing new method
		String choicee = myGameMenu.getAction(); //5.d calling get action on instance
		int intChoice = Integer.parseInt(choicee); //5.g casting it to choicee to int
		
		doAction(intChoice); //5.g passing it to doAction method
	}
	public static void doAction(int action){ //5.e creating the new method for printing the message
		int intChoice = action;
		
		switch (intChoice) { //5.f switch case 
		case 1:
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Resuming game");
			break;
		case 3:
			System.out.println("Pausing game");
			break;
		case 4:
			System.out.println("Ending game");
			break;
		default:
			System.out.println("Not valid");
			break;
		}
	}
}