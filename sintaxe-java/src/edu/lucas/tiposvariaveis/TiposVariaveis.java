package edu.lucas.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos: byte, short, int, long, float, double, boolean, char
        byte idade = 29;
        double salarioMinimo = 2500.33;
        long cpf = 11122233344L;
        

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /*Constantes: são escritas em letras maiúsculas por convenção e deve ser usado o modificador final para impedir que o valor dessa constante seja modificado */
        final float VALOR_DE_PI = 3.14F;

    }
}
