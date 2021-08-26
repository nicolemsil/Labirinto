public class Coordenada {
    private int linha;
    private int coluna;

    //construtor
    public Coordenada(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    //getter e setters
    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

}
