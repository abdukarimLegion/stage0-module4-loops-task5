package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int x = 1; x <= sideLength; x++) {
            System.out.println(" ");
            for (int y = 1; y <= sideLength; y++) {
                System.out.print("8");
            }
        }
    }
}
