package utiil;

import javax.print.DocFlavor;

public interface NavegacaoInternet {
    abstract boolean exibirPagina(String url);

    abstract void adcionarNovaAba();

    abstract void atualizarPagina();
}
