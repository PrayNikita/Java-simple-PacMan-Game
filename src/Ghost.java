import java.util.Vector;

public class Ghost {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public  boolean move(int PlayerX, int PlayerY)
    {
        if (this.x == PlayerX && this.y == PlayerY) return true;

        return false;
    }

    public char getSymbol()
    {
        return 'G';
    }

    @Override
    public String toString() {
        return "Ghost{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Ghost(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
