import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int x;
        int y;

        boolean chatched = false;

        char [][] map = new char[Map.MAX_X][Map.MAX_Y];

        Ghost[] hunter = new Ghost[4];

        for (int i = 0; i < hunter.length; i++) {
            if (rnd.nextInt(2) == 0)
            {
                hunter[i] = new Blinky(rnd.nextInt(Map.MAX_X), rnd.nextInt(Map.MAX_Y));
            }
            else
            {
                hunter[i] = new Clyde(rnd.nextInt(Map.MAX_X), rnd.nextInt(Map.MAX_Y));
            }
        }

        System.out.println("Position X für PacMan");
        x = sc.nextInt();
        System.out.println("Position Y für PacMan");
        y = sc.nextInt();

        Player PacMan = new Player(x, y);
        int timer = 1;
        while (!chatched || timer <= 10)
        {
            System.out.println("Runde" + timer);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}

            Map.clearField(map);

            map [PacMan.getX()][PacMan.getY()] = 'P';

            for (int i = 0; i < hunter.length; i++) {
                if (hunter[i].move(PacMan.getX(), PacMan.getY()))
                {
                    System.out.println("Hunter " + i + " hat gefangen");
                    break;
                }
                map [hunter[i].getX()][hunter[i].getY()] = hunter[i].getSymbol();
            }

            Map.printBoard(map);
            timer ++;


        }

    }
}