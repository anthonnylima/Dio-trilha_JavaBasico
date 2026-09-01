import java.util.Scanner;
public class Smartv {
    boolean ligada = false;
    int canal = 0;
    int volume = 99;

    public boolean ligar() {
        return ligada=true;
    }

    public boolean desligar() {
        return ligada=false;
    }

    public void mudarCanalUmPorVez() {
        ++canal;
        System.out.println("Canal atual: " + canal);
    }

    public void mudarCanalDireto(int canalescolhido) {
        canal = canalescolhido;
        System.out.println("Canal atual: "+ canal);
    }

    public void aumentarVolume(){
        if (volume >= 100) {
            System.out.println("O volume ja está no maximo");
            System.out.println("Volume atual: "+ volume);
        }
        else {
            ++volume;
            System.out.println("Volume atual: " + volume);
        }
    }

    public void diminuirVolume() {
        if (volume <= 0) {
            System.out.println("O volume ja está no minimo");
            System.out.println("Volume atual: "+ volume);
        }else {
            --volume;
            System.out.println("Volume atual: " + volume);
        }
    }
}