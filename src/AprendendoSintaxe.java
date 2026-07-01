import java.util.Scanner;

public class AprendendoSintaxe {
    void entrada_e_saida(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, Seja Bem-Vindo ao meu código em Java!\nInsira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Quantos anos você tem? ");
        int idade = scanner.nextInt();

        System.out.print("Olá, " + nome + " de " + idade + " anos");

        System.out.print("\nAgora preciso que você informe sua altura em metros: ");
        float altura = scanner.nextFloat();

        System.out.printf("Seu nome é %s, você possui %d anos e sua altura é %.2fm!%n", nome, idade, altura);
    }

    void teste_com_arrays(){
        String[] frutas = {"Banana", "Maçã", "Pera"};
        for(String fruta : frutas){
            System.out.printf(" %s ", fruta);
        }
        IO.println();

        boolean[] chaves = new boolean[5];
        chaves[0] = true;
        for(int i = 1; i < 5; i++){
            if(chaves[i-1]){
                chaves[i] = false;
            } else {
                chaves[i] = true;
            }
        }
        IO.print("Chaves Valores: ");
        for(int i = 0; i < chaves.length - 1; i++){
            IO.print(chaves[i]);
            IO.print(", ");
        }
        IO.print(chaves[chaves.length - 1]);
    }
}
