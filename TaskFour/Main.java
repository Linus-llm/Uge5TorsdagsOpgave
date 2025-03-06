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
		myGameMenu.displayMenu(); //4.i testing new method
	}
}