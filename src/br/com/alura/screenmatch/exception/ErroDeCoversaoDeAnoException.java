package br.com.alura.screenmatch.exception;

public class ErroDeCoversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeCoversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
