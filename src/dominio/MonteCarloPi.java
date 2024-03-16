package dominio;

import java.util.function.IntPredicate;

public class MonteCarloPi {
    public static void main(String[] args) {
        int numPoints = 1000000; // Número de puntos a generar
        
        // Definición de la función para estimar pi utilizando simulación de Montecarlo
        IntPredicate isInsideCircle = n -> {
            double x = Math.random();
            double y = Math.random();
            return x * x + y * y <= 1;
        };

        // Estimación de pi
        double piEstimate = estimatePi(numPoints, isInsideCircle);

        System.out.println("Estimación de pi: " + piEstimate);
    }

    // Función para estimar pi utilizando simulación de Montecarlo
    public static double estimatePi(int numPoints, IntPredicate isInsideCircle) {
        int pointsInsideCircle = 0;

        // Generar puntos y contar los que están dentro del círculo
        for (int i = 0; i < numPoints; i++) {
            if (isInsideCircle.test(i)) {
                pointsInsideCircle++;
            }
        }

        // Calcular la estimación de pi
        return 4.0 * pointsInsideCircle / numPoints;
    }
}