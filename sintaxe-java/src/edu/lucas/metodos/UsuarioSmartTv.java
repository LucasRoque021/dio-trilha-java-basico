package edu.lucas.metodos;

public class UsuarioSmartTv {
  public static void main(String[] args) throws Exception {
    ExSmartTv smartTv = new ExSmartTv();

    smartTv.ligarTv();
    smartTv.aumentarVolume();

    System.out.println("Volume atual: "+smartTv.getVolume());


  }
}
