package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int y =0; y<cathetusLength; y++){
            System.out.println(" ");
            for(int x =0; x<y; x++){
                System.out.print("8");
            }
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(5);
    }
}
