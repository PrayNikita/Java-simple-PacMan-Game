
public class Blinky extends Ghost{

    public Blinky(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean move(int PlayerX, int PlayerY)
    {
        int xDiff = Math.abs(PlayerX - this.x);
        int yDiff = Math.abs(PlayerY - this.y);

        if (xDiff > yDiff)
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
