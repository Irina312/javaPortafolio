package day31;
	// Interview questions
public class TeamTask {
	public static void main(String[] args) {
		String[][] team = {
				{"Yulduz", "Mark", "Akylbek", "Daniel"},
				{"Arianna", "Frank", "Nurgazy", " Anna"},
				{"Selvin", "Meerim", "Gulzhanna", "Rocio"},
				{"Job", "Evelyn", "Edil", "Aizhamal"}};
		System.out.println(team[1][1]); // Frank
		System.out.println(team[3][2]); // Edil
		
		System.out.println("-----");
		
		// Find out total number of chars of all elements in the array
		int totalLength = 0;
		
		for (int i = 0; i < team.length; i++) {
			for (int j = 0; j < team[i].length; j++) {
				totalLength = totalLength + team[i][j].length(); // .length() -> to get chars
				// System.out.println(team[i][j].length()); 
			}
		}
		
		System.out.println("Length: " + totalLength);
		
		// print only names with even length from team array
		
		for (int i = 0; i < team.length; i++) {
			for (int j = 0; j < team[i].length; j++) {
			if (team[i][j].length() % 2 == 0) {
				System.out.println(team[i][j]);
				}
			}
		}
	}
}


