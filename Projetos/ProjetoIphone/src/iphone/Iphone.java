package iphone;

import System.SistemaIphone;

public class Iphone {
    public static void main(String[] args) {
        SistemaIphone sistema = new SistemaIphone();

        sistema.adcionarNovaAba();
        sistema.atender();
        sistema.ligar("83999004558");
        sistema.trocarMusica("Segredo-Kayblack");
    }
}
