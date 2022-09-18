package hafta2;

public class FootballPlayer {
int no;
String name;
public int minutes;
public boolean inPlay;
public int numberOfGoals;
public void play(int minutesToPlay) {
	// TODO Auto-generated method stub
	minutes = minutes + minutesToPlay;
	
}
public void score() {
	// TODO Auto-generated method stub
	numberOfGoals = numberOfGoals +1; //numberOfGoals++;
	
}

}
