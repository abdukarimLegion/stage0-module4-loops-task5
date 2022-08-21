package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if( i==j || i+j==n-1){
                    System.out.print("8");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(5);
    }
}
