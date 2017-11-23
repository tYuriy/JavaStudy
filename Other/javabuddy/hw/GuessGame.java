package Other.javabuddy.hw;

/**
 * Created by user on 02.02.2017.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 =0;
        int guessp2 =0;
        int guessp3 =0;

        boolean p1isRght = false;
        boolean p2isRght = false;
        boolean p3isRght = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("I start with number from 1 to 10");

        while (true) {
            System.out.println("You need to guess number - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("First player say number " + guessp1);
            guessp2 = p2.number;
            System.out.println("Second player say number " + guessp2);
            guessp3 = p3.number;
            System.out.println("Third player say number " + guessp3);
            if (guessp1 == targetNumber) {
                p1isRght = true;
            }
            if (guessp2 == targetNumber) {
                p2isRght = true;
            }
            if (guessp3 == targetNumber) {
                p3isRght = true;
            }

            if (p1isRght || p2isRght || p3isRght) {
                System.out.println("We have a winner!!!");
                System.out.println("First player won? " + p1isRght);
                System.out.println("Second player won? " + p2isRght);
                System.out.println("Third player won? " + p3isRght);
                System.out.println("Game over");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
 class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random()*10);
    }
}
 class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
