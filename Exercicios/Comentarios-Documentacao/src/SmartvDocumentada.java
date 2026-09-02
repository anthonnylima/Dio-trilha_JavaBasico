/**
 * Smart TV
 *
 * <p>Essa classe simula um sistema de funcionamento de uma Smart TV
 * bem simples, com funcionalidades como ligar, desligar, mudar o canal
 * e mudar o volume.</p>
 *
 * @author Anthonny de Lima Lucena
 * @version 1.0
 * @since 10/09/2026
 */
public class SmartvDocumentada {

    boolean ligada = false;
    int canal = 0;
    int volume = 99;

    /**
     * Liga a Smart TV, alterando o valor da variável {@code ligada}
     * para {@code true}.
     */
    public void ligar() {
        ligada = true;
    }

    /**
     * Desliga a Smart TV, alterando o valor da variável {@code ligada}
     * para {@code false}.
     */
    public void desligar() {
        ligada = false;
    }

    /**
     * Avança para o próximo canal, adicionando 1 ao valor atual
     * da variável {@code canal}.
     */
    public void mudarParaPrximoCanal() {
        ++canal;
        System.out.println("Canal atual: " + canal);
    }

    /**
     * Muda diretamente para o canal escolhido pelo usuário.
     *
     * @param canalEscolhido representa o canal escolhido pelo usuário.
     */
    public void mudarCanalDireto(int canalEscolhido) {
        canal = canalEscolhido;
        System.out.println("Canal atual: " + canal);
    }

    /**
     * Aumenta o volume em 1 unidade por vez, até chegar ao valor máximo
     * de 100.
     */
    public void aumentarVolume() {
        if (volume >= 100) {
            System.out.println("O volume já está no máximo");
            System.out.println("Volume atual: " + volume);
        } else {
            ++volume;
            System.out.println("Volume atual: " + volume);
        }
    }

    /**
     * Diminui o volume em 1 unidade por vez, até chegar ao valor mínimo
     * de 0.
     */
    public void diminuirVolume() {
        if (volume <= 0) {
            System.out.println("O volume já está no mínimo");
            System.out.println("Volume atual: " + volume);
        } else {
            --volume;
            System.out.println("Volume atual: " + volume);
        }
    }
}
```
