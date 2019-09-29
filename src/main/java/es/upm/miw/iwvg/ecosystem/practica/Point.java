package es.upm.miw.iwvg.ecosystem.practica;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        checkLimits(x,y);
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setX(int xValue) {
        checkLimits(xValue,xValue);
        x = xValue;
    }

    public void setY(int yValue) {
        checkLimits(yValue,yValue);
        y = yValue;
    }

    private void checkLimits(int x, int y){
        assert x >= 0 && x <= 100;
        assert y >= 0 && y <= 100;
    }
}
