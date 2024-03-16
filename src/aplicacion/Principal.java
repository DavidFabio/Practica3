package aplicacion;

import dominio.MonteCarloPi;

public class Principal {
    public static void main(String[] args) {
        int numPoints = 1000000; // Número de puntos a generar
        
        // Estimación de pi
        double piEstimate = MonteCarloPi.estimatePi(numPoints, 
                                n -> {
                                    double x = Math.random();
                                    double y = Math.random();
                                    return x * x + y * y <= 1;
                                });

        System.out.println("Estimación de pi: " + piEstimate);
    }
}
