
public class TestIPLTeam {
public static void main(String [] args) {
	Player[] plst = {
			new Player ( 11 , "Virat Kohli",  "Right Handed Batsman" ),
			new Player ( 12 ,  "Rohit sharma",  "Right handed batsman"), 
			new Player ( 13,  "Jasprit Bumrah",  "Bowler"),
			
	};
	Player c = new Player( 11,  "Rohit Sharma",  "Right Handed Batsmane");
	Team t1 = new Team( 101,  "RCB", c, plst, 3);
	System.out.println();
			
}
}
