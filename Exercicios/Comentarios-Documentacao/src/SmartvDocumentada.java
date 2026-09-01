import java.util.Scanner;
    /** <h1>Smart tv</h1>
     * essa classe simula um sistema de funcionamento de uma Smartv bem simples,
     * com funcionalidades como ligar, desligar, mudar o canal e mudar o volume.
     * @author : Anthonny de Lima Lucena
     * @version :1.0
     * @since : 10/09/2026
     */
public class SmartvDocumentada {
    boolean ligada = false;
    int canal = 0;
    int volume = 99;

        /** <h1>Metodo ligar</h1>
         * consiste em mudar a varivel boolean ligada para true, indicando que a tv esta ligada
         */
    public void ligar() {
         ligada=true;
    }
        /** <h1>Metodo Desligar</h1>
         * consiste em mudar a varivel boolean ligada para false, indicando que a tv esta desligada
         */
    public void desligar() {
        ligada=false;
    }
        /** <h1>Metodo mudar canal(proximo canal)</h1>
         * ele adciona mais um ao valor de canal, que referencia ao numeroção do proximo canal
         */
    public void mudarParaPrximoCanal() {
        ++canal;
        System.out.println("Canal atual: " + canal);
    }

        /** <h1>Metodo mudar canal(direto)</h1>
         * ele muda o valor do canal, que é passado pelo usuario com parametro da função
         * @param canalescolhido representa o canal escolhido pelo usuario.
         */
    public void mudarCanalDireto(int canalescolhido) {
        canal = canalescolhido;
        System.out.println("Canal atual: "+ canal);
    }

    /** <h1>Metodo aumentar volume</h1>
     * aumenta mais 1 de de som por vez, ate que chegue em 100 que é o valor maximo
     */
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

    /** <h1>Metodo diminuir volume</h1>
                * deminui 1 de de som por vez, ate que chegue em 0 que é o valor minimo
     */
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