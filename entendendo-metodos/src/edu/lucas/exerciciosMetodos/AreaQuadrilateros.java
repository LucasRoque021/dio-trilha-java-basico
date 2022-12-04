package edu.lucas.exerciciosMetodos;

public class AreaQuadrilateros {
 
  public static double calcularArea(double ladoQuadrado){
    return Math.pow(ladoQuadrado, 2);
  }

  public static double calcularArea(double baseRetangulo, double alturaRetangulo){
    return baseRetangulo * alturaRetangulo;
  }

  public static double calcularArea(double baseMaior, double baseMenor, double alturaTrapezio){
    return (baseMaior+baseMenor)/2 * alturaTrapezio;
  }
  
}
  
  

