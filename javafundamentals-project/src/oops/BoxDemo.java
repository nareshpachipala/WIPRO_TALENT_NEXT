package oops;

public class BoxDemo {
    double width, height, depth;

    BoxDemo(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        BoxDemo box = new BoxDemo(5.0, 4.0, 3.0);

        System.out.println("Width: " + box.width);
        System.out.println("Height: " + box.height);
        System.out.println("Depth: " + box.depth);
        System.out.println("Volume = " + box.volume());
    }
}
