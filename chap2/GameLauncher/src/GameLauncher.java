class Player{
    int number = 0; //where the guess goes

    void guess(){
        number = (int) (Math.random() * 3);
        System.out.println("I'm guess "+number);
    }
}
class GuessGame{
    Player p1;
    Player p2;

    void startGame(){
        p1 = new Player();
        p2 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;

        int targetNumber = (int) (Math.random() * 3);
        System.out.println("I'm thinking of a number between 0 to 9...");

        while(true){
            System.out.println("Number to guess is "+ targetNumber);

            p1.guess();
            p2.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed "+ guessp1);

            guessp2 = p2.number;
            System.out.println("Player one guessed "+ guessp2);

            if (guessp1 == targetNumber){
                p1isRight = true;
            }

            if (guessp2 == targetNumber){
                p2isRight = true;
            }

            if (p1isRight || p2isRight){
                System.out.println("We have a winner");
                System.out.println("Player one got it right? "+p1isRight);
                System.out.println("Player two got it right? "+p2isRight);
                System.out.println("Game is over.");
                break;
            }else{
                System.out.println("Players will have to try again.");
            }
        }
    }
}
public class GameLauncher {
    public static void main(String[] args) throws Exception {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
