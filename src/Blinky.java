import java.util.Random;

public class Blinky extends Ghost{

    public Blinky(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean move(int PlayerX, int PlayerY)
    {
        int xDiff = PlayerX - this.x;
        int yDiff = PlayerY - this.y;

        if (PlayerX > yDiff)
        {
            if (PlayerX > this.x) this.x ++;
            else this.x --;
        }

        else
        {
            if (PlayerY > this.y) this.y ++;
            else this.y --;
        }
        if (this.x == PlayerX && this.y == PlayerY) return true;

        return false;
    }

    @Override
    public char getSymbol()
    {
        return 'B';
    }
}
