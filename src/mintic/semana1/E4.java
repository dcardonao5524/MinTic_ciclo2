package mintic.semana1;

public class E4 {

    public static int[] ordenamientoPersonalizado(int[] vector) {

        int[] vectorOrdenado = vector.clone();

        for (int i = 0; i < (vector.length / 2) - 1; i++) {

            for (int j = 0; j < (vector.length / 2) - 1; j++) {

                if (vectorOrdenado[j] > vectorOrdenado[j + 1]) {
                    int temp;
                    temp = vectorOrdenado[j];
                    vectorOrdenado[j] = vectorOrdenado[j + 1];
                    vectorOrdenado[j + 1] = temp;
                }
            }
        }

        for (int k = (vector.length / 2); k < (vector.length - 1); k++) {
            for (int l = (vector.length / 2); l < (vector.length - 1); l++) {
                if (vectorOrdenado[l] < vectorOrdenado[l + 1]) {
                    int tempB;
                    tempB = vectorOrdenado[l];
                    vectorOrdenado[l] = vectorOrdenado[l + 1];
                    vectorOrdenado[l + 1] = tempB;
                }

            }
        }

        return vectorOrdenado;
    }
}

