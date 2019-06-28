package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.util.Scanner;

class Entrada {

    Scanner digitado = new Scanner(System.in);

    public String lerString(String msg) {
        //evita que o usuário deixe a string vazia
        while (true) {
            try {
                System.out.print(msg + " =>");
                String x = digitado.nextLine();
                if (x.trim().isEmpty()) {
                    int k = 3 / 0; //propositalmente provoca um erro para ir para o catch
                }
                return x;
            } catch (Exception e) {
                System.out.println("Erro, a string não pode ser vazia");
                digitado= new Scanner(System.in);
            }
        }
    }

}