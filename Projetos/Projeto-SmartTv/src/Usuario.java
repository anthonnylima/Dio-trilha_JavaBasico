public class Usuario {
    public static void main(String[] args) throws Exception {
        Smartv smartv = new Smartv();

        smartv.ligar();
        smartv.mudarCanalUmPorVez();
        smartv.mudarCanalDireto(12);
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.diminuirVolume();
    }
}
