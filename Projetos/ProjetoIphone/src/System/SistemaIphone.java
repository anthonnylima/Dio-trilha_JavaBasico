package System;

import utiil.*;

import java.util.Scanner;

public class SistemaIphone implements AparelhoTelefonico, NavegacaoInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("ligando para o numero ".concat(numero));
    }

    @Override
    public void atender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Atender ligação?");
        String respota= sc.nextLine();

        if (respota.equalsIgnoreCase("sim")){
            System.out.println("atendendo...");
        }
        else{
            System.out.println("Chamda recusada");
        }
    }

    @Override
    public void inciarCorreioDeVoz() {
        System.out.println("Reproduzindo correios de voz");
    }

    @Override
    public boolean exibirPagina(String url) {
        System.out.println("Acessando a url: ".concat(url));
        return true;
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Adcionando nova aba");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void trocarMusica(String musica) {
        System.out.println("trocando de musica para: ".concat(musica));
    }
}
