package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i<=cathetusLength; i++){

            for (int a = i; a<cathetusLength; a++){
                System.out.print(" ");
            }

            for (int a = cathetusLength-i; a<cathetusLength; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
