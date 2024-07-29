import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Qual o ano do filme?");
        int ano = leitura.nextInt();
        System.out.println(ano);

        System.out.println("Qual nota você da para o filme?");
        float nota = leitura.nextFloat();
        System.out.println(nota);
    }



}




