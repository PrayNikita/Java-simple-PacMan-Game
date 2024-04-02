import java.util.Random;

public class Clyde extends Ghost{
    public Clyde(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean move(int PlayerX, int PlayerY) {
        Random rnd = new Random();
        boolean done = false;

        int direction = rnd.nextInt(4);

        do {
            switch (direction) {
                case (0): {
                    if (this.x < Map.MAX_X)
                    {
                        this.x++;
                        done = true;
                    }

                }
                break;
                case (1): {
                    if (this.x > 0) ;
                    {
                        this.x--;
                        done = true;
                    }

                }
                break;
                case (2): {
                    if (this.y < Map.MAX_Y) ;
                    {
                        this.y++;
                        done = true;
                    }

                }
                break;
                case (3): {
                    if (this.y > 0)
                    {
                        this.y--;
                        done = true;
                    }

                }
                break;

            }
        } while (!done);

        if (this.x == PlayerX && this.y == PlayerY) return true;

        return false;
    }

    @Override
    public char getSymbol()
    {
        return 'C';
    }
}
