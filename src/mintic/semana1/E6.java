package mintic.semana1;

public class E6 {

    public static String join(char[] vector) {

        char[] vectorConcatenado1 = vector;
        String vectorConcatenado;

        for (int i = 0; i < vector.length - 1; i++) {
            System.arraycopy(vector, 0, vectorConcatenado1, 0, vector.length - 1);
        }
        vectorConcatenado = String.valueOf(vectorConcatenado1);

        return vectorConcatenado;

    }
}
