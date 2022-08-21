package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int i = 0; i < length; i++) {
            System.out.println(" ");
            for (int y = 0; y < height; y++) {
                System.out.print("8");
            }
        }
    }
}
