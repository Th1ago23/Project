import java.util.Scanner;

public class LeituraDeNumeros {
    private int num1;
    private int num2;
    private LeituraDeNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    private String verificarNumero(){
        if (num1 > num2){
            return "O número 1 é maior que o número 2";
        } else if (num1 < num2){
            return "O número 2 é maior que o número 1";
        } else{
            return "Os números são iguais";
        }
    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = leitura.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int b = leitura.nextInt();

        LeituraDeNumeros numero = new LeituraDeNumeros(a,b);
        System.out.println(numero.verificarNumero());;
    }
}

