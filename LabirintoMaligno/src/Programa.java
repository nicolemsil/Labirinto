import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {

        String nomeArquivo;
        Coordenada coordenadaEntrada = null;
        Arquivo arquivo = null;
        try {
            while (coordenadaEntrada == null)
            {
                nomeArquivo = "C:/Users/nicsi/Desktop/Teste1.txt"; // Teclado.getUmString();
                arquivo = new Arquivo(new BufferedReader(new FileReader(nomeArquivo)));
                System.out.println("Abrindo " + nomeArquivo);
                Labirinto labirinto = new Labirinto(arquivo);
                coordenadaEntrada = arquivo.encontraEntrada();
                labirinto.preencheLabirinto();

            }

        }
        catch (IOException e)
        { }
    }
}
