import java.io.BufferedReader;
import java.io.IOException;

public class Arquivo {
    private BufferedReader arquivoTxt;

    //construtor
    public Arquivo(BufferedReader arquivoTxt) {
        this.arquivoTxt = arquivoTxt;
    }

    //getter e setter
    public BufferedReader getArquivoTxt() {
        return arquivoTxt;
    }

    public void setArquivoTxt(BufferedReader arquivoTxt) {
        this.arquivoTxt = arquivoTxt;
    }

    public Coordenada encontraEntrada() throws IOException {
        String textoLinha;

        int linhaArquivo = 0;
        while((textoLinha = this.arquivoTxt.readLine()) != null )
        {
            //System.out.println(textoLinha);

            if (textoLinha.contains("E"))
            {
                return new Coordenada(linhaArquivo, textoLinha.indexOf('E') ); //indexOf retorna o indice do caracter E dentro da string, e o 1º parametro é o nº da linha
            }
            linhaArquivo++;
        }
        return null;
    }
}
