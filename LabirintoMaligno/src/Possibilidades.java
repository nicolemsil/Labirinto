public class Possibilidades {
    private boolean direita;
    private boolean esquerda;
    private boolean cima;
    private boolean baixo;
    private Coordenada posicaoAual;

    Pilha<Fila<Coordenada>> possibilidades;


    public Possibilidades(boolean direita, boolean esquerda, boolean cima, boolean baixo, Coordenada posicaoAual) {
        this.direita = direita;
        this.esquerda = esquerda;
        this.cima = cima;
        this.baixo = baixo;
    }

    public Coordenada getPosicaoAual() {
        return posicaoAual;
    }

    public void setPosicaoAual(Coordenada posicaoAual) {
        this.posicaoAual = posicaoAual;
    }
}

