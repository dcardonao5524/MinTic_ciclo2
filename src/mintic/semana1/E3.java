package mintic.semana1;

public class E3 {
    public static double mean(int [] vector){
        double contElem = 0;
        double sum = 0;

        for (int j = 0; j < vector.length; j++){
            sum = sum + vector[j];
            contElem += 1;

        }
        double promedio = sum / contElem;

        return promedio;

    }

}
