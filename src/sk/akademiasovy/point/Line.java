package sk.akademiasovy.point;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b){
        this.a=a;
        this.b=b;
    }

    public Line(int xa, int ya, int xb, int yb){
        a=new Point(xa,ya);
        this.b=new Point(xb,yb);
    }

    public double getLenght(int i, int i1){
        return a.getDistanceFromOtherPoint(b);
    }

    public Point getMiddleOfLine(){
        return new Point(a.getX()+b.getY()/2,(a.getY()+b.getY())/2);
    }

    public boolean isPararrelWithOsX(){
        return a.getY()==b.getY();
    }

    public boolean isPararrelWithOsY(){
        return a.getX()==b.getX();
    }


}
