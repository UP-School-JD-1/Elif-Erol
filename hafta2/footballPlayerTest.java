package hafta2;

public class footballPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FootballPlayer alex = new FootballPlayer();
       alex.no = 10;
       alex.name = "Alex de Souza";
       alex.minutes = 0;
       alex.inPlay = true;
       alex.numberOfGoals =0;
       
       alex.play(90);
       alex.score();
       alex.score();
       
       System.out.println("Number of goals Alex scored: " + alex.numberOfGoals);
       System.out.println("Alex played totally: " + alex.minutes + "minutes so far");

       
       alex.play(60);
       alex.score();      
       
       System.out.println("Number of goals Alex scored: " + alex.numberOfGoals);
       System.out.println("Alex played totally: " + alex.minutes + "minutes so far");
       
       System.out.println("**************");
       
       FootballPlayer cem = new FootballPlayer();
       cem.no = 1;
       cem.name = "Cem D";
       cem.minutes = 0;
       cem.inPlay = true;
       cem.numberOfGoals =0;
       
       cem.play(10);
       cem.score();
       cem.score();
       cem.score();
       
       System.out.println("Number of goals Cem scored: " + cem.numberOfGoals);
       System.out.println("Cem played totally: " + cem.minutes + "minutes so far");

	}

}
