package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 1; i<=cathetusLength; i++){
            int var = i;
            for (int j = 1; j<=cathetusLength*2; j++){
                if (j>=cathetusLength-i+1 && j<=cathetusLength+i-1){
                    System.out.print(var);
                    if (j<cathetusLength){
                        var--;
                    }else var++;
                }else {
                    if (j<cathetusLength){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(3);
    }
}
