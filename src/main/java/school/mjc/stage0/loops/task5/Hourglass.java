package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i, j, k;

        for (i = height; i >0; i--) {
            for (j = height-i; j >=1; j--){
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++){
                System.out.print("8 ");
            }


            System.out.println();
        }

        for (i = 1; i <=height; i++) {

            for (j = 1; j <=height-i; j++){
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++){
                System.out.print("8 ");
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
    }
}
