import java.util.ArrayList;
class Team{

 private String teamName;
 private int teamRank;
 private ArrayList<String> teamNames = new ArrayList<>();

 public Team(String teamName){
 	this.teamName = teamName;


 }

public void setRank(int teamRank){

 this.teamRank = teamRank;

}

public String toString(){
String a = "";
	for(String i: teamNames){
	a += i+"\n";
}
	return a;

}

public void addPlayer(String teamName){
	teamNames.add(teamName);


}
}