import java.util.Scanner;

public class Game {
    private Stadium stadium;
    private Team homeTeam;
    private Team vistingTeam;
    private SoccerBall ball;
    private Referee majorReferee;
    private Referee[] linesmen;

    public static void main(String[] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equalsIgnoreCase("Start")) {
                System.out.println("Here we go! Please select home team first:\n" +
                    "Real Madrid, Barcelona, Manchester United, Chelsea, Juventus, AC Milan");
            }
            if (scanner.nextLine().equalsIgnoreCase("Real Madrid")) {
                Team homeTeam = new Team("Madrid");
                homeTeam.headCoach = new Coach("MadridCoach");
                
                game.homeTeam = homeTeam;
                System.out.println("You have selected 'Real Madrid' as the homeTeam .\n" +
                                "Please select visiting team :\n" +
                                "Barcelona, Manchester United, Chelsea, Juventus, AC Milan\n");

            }
            if (scanner.nextLine().equalsIgnoreCase("AC Milan")) {
                Team visitingTeam = new Team("ACMilan");
                visitingTeam.headCoach = new Coach("ACMilanCoach");
                
                game.visitingTeam = visitingTeam;
                System.out.println("You have selected 'AC Milan' as the visiting Team .\n" +
                "Please select the stadium for the match: San Siro, Nou Camp, Bernabeu, Old Trafford:\n");

            }
            if (scanner.nextLine().equalsIgnoreCase("Bernabeu")) {
                game.stadium = new Stadium("Bernabeu");
                System.out.println("You have selected 'Bernabeu' as the stadium .\n" +
                "Good job! All settle down. Game started:\n");
                game.referee = new Referee("Obama");
                game.referee.whistling();
                game.homeTeam.kickBall();
            }
            
            
        }
    }

    
}
