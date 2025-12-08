import java.util.Scanner;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	static {
		tarr = new Team[20];
		Player[] plst = new Player[15];
		plst[0]= new Player(101,"Rohit Sharma","Right-handed batsman");
		
		plst[1] = new Player (102,  "Virat Kohli", "Left-Handed Batsman");
		
		plst[2] = new Player (103,  "jasprit bumrah", "Bowler");
				
		Player c = new Player(104,  "Rohit sharma",  "Batsman");
		
		int tid;
		tarr[0] = new Team (101,  "Raipur lions", c,plst, 3);
		
		
		Player[] plst1 = new Player[15];
		plst1[0] =new Player(6,"Dravid","Batsman");
		
		plst1[1] = new Player(7,"Saurabh","Batsman");
		
		plst1[2] =new Player(8,"Sachin","AllRounder");
		
		Player c1 = new Player(9,"Sachin","AllRounder");

		tarr[1] = new Team( 102,  "Pune Warriors", c, plst1, 3);
		
		cnt=2;
	}
	public static boolean addNewTeam() {
	Scanner sc = new Scanner(System.in);
	if(cnt!=20) {
		
		System.out.println("enter id");
		int tid = sc.nextInt();
		
		System.out.println("Enter Team Name");
		String tnm = sc.next();
		
		//Captain
		System.out.println("Enter Captain player id");
		int pid   = sc.nextInt();
		
		System.out.println("Enter captain player name ");
		String pnm = sc.next();
		
		System.out.println("Enter Captain player Speciality");
		String sp = sc.next();
		
		Player c = new Player(pid, pnm, sp);
		//loop for creating player list
		
		Player [] plst= new Player [15];
		plst[0] =c;
		int i=1;
		
		String ans = "y";
		
		do {
			System.out.println("Enter Player id : ");
			pid = sc.nextInt();
			
			System.out.println("Enter Player name : ");
			pnm = sc.next();
			
			System.out.println("Enter Player speciality : ");
			sp = sc.next();
			
			plst[i] = new Player(pid,pnm,sp);
			i++;
			
			System.out.println("Do you want to add more? y/n");
			ans = sc.next();
			
			
		}
		
		while(ans.equals( "y"));
		
		tarr [cnt] = new Team(tid,tnm,c,plst,i);
		cnt++;
		return true;
		
	}
	
	return false;
	}
	public static void displayAll() {
		for(Team t:tarr) {
			if (t!=null)
			{
				System.out.println(t);
			}else {
				break;
			}
		}
		
	}
	public static Team findById(int tid) {
		for(Team t:tarr) {
			if(t!=null) {
				if(t.getTid() ==tid) 
					return t;
				
			}
			
			else {
				break;
			}
		}
		return null;
	}
	
	public static boolean addNewPlayer(int tid, int pid, String  pnm, String sp) {
		Team t = findById(tid);
		if(t!=null) {
			Player p = new Player (pid, pnm, sp);
			int s=t.getSize();
			
			t.getPlist()[s]=p;
			t.setSize(s+1);
			return true;
			
		}
	return false;
	}
	
	public static Team findTeamByPlayer(int pid) {
		for(Team t :tarr) {
			if(t!=null) {
				Player [] plst = t.getPlist();
				for(Player p:plst) {
					if(p!=null) {
						if(p.getPid()==pid) {
							return t;
						}
							
						
					}
					
					else{
						break;
					}
					
				}
				
				
			}
			
			else {
				break;
			}
			
			
		}
		
		return null;
		
	}
	

}
