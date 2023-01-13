import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor que deseja: ");
        int valor = input.nextInt();
        
        for(int i = 1; i <= valor;i++) {
            String frase = "";
            for(int j = 1; j <= i; j++) {
                frase += i;
            }

            System.out.println(frase);
        }
    }
}
