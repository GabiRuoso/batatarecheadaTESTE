package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        
        String frase = entrada.lerString("Coloque uma frase");
        System.out.println(frase);
        int espacos = processamento.criar_vet(frase);
        
        saida.imprimirInt("Número de espaços da frase:", espacos);
        
        
        
    }

}
