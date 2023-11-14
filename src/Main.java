

public class Main {
    public static void main(String[] args) {
        Point pt = new Point(4, 7);
        System.out.println(pt.x);

    }
}

class Point {
    int x, y;

    Point(){
        x = -1;
        y = -1;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}

