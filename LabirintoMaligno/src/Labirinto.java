import java.io.BufferedReader;
import java.io.IOException;

public class Labirinto {

    char labirinto [][];

    private Arquivo arquivo;

     public Labirinto (Arquivo arquivo) throws IOException {
         this.arquivo = new Arquivo(arquivo.getArquivoTxt());
         String linhas = arquivo.getArquivoTxt().readLine();
         String colunas = arquivo.getArquivoTxt().readLine();
         System.out.println(linhas + colunas);
         this.labirinto = new char[Integer.valueOf(linhas)][Integer.valueOf(colunas)];
     }

     public void preencheLabirinto () throws IOException {
         int linhaArquivo = 0;
         String textoLinha;

         System.out.println("LABIRINTOU");
         while((textoLinha = this.arquivo.getArquivoTxt().readLine()) != null ) {
             for (int i = 0; i < textoLinha.length(); i++){
                 this.labirinto[linhaArquivo][i] = textoLinha.charAt(i);
                 System.out.print(this.labirinto[linhaArquivo][i]);
             }
             System.out.println();
             linhaArquivo++;

         }

     }

}
