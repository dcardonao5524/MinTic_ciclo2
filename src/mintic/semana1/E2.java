package mintic.semana1;

public class E2 {

    public static int sumaPares(int[] vector){

        int s = 0;

        for (int j : vector) {
            if (j % 2 == 0 && j > 0) {
                s = s + j;
            }
        }
        return s;
    }
}
