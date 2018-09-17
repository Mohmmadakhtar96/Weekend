import java.util.ArrayList;
public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Doctor A = new Doctor("Jeff ","Junior", 1);
         Doctor B = new Doctor("Kevin", "Consultant", 3);
         ArrayList<Doctor> team1 = new ArrayList<Doctor>();
         team1.add(A);
         team1.add(B);
         Doctor A1 = new Doctor("Peter ","Junior", 1);
         Doctor B1 = new Doctor("John", "Consultant", 3);
         Doctor C1 = new Doctor("Bob ","Junior", 1);
         ArrayList<Doctor> team2 = new ArrayList<Doctor>();
		 Teams team = new Teams(team1);
		 team2.add(A1);
         team2.add(B1);
         team2.add(C1);
		 Teams teams2 = new Teams(team2);
		 
		

System.out.println(team1);
System.out.println(team2);
	}

	}

