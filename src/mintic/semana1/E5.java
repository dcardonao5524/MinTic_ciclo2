package mintic.semana1;

public class E5 {

    public static int[] sumaVectorial(int[] v1, int[] v2) {
        int[] s = v1.clone();

        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < (v1.length); j++) {
                s[j] = v1[j] + v2[j];
            }
        }
        return s;
    }
}

