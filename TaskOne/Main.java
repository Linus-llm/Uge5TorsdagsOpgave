class Main{


public static void main(String[] args){

Team myTeam = new Team("xdd");
Team myTeam2 = new Team("blob");
Team myTeam3 = new Team("rat");
Team myTeam4 = new Team("otter");
Team myTeam5 = new Team("silverfish");
Team myTeam6 = new Team("monkey");


myTeam.setRank(1);
myTeam2.setRank(2);
myTeam3.setRank(3);
myTeam4.setRank(4);
myTeam5.setRank(5);
myTeam6.setRank(6);


myTeam.addPlayer("rod");
myTeam.addPlayer("dor");

System.out.println(myTeam);

}
}