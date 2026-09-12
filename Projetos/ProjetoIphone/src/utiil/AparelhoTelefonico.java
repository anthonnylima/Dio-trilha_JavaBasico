package utiil;
import java.util.Locale;
import java.util.Scanner;
public interface AparelhoTelefonico {
    abstract void ligar(String numero);

    abstract void atender();

    abstract void inciarCorreioDeVoz();
}