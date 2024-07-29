import java.util.Scanner;

public class Metodos {
    float pi;
    float raio;
    int base;
    int altura;

    //Utilizando o método construtor para declarar um atributo padrão
    public Metodos(){
        this.pi = (float) Math.PI;
    }
    //Utilizando um método com retorno e não usar o println pelas boas práticas
    public String calcularAreaCirculo(float raio){
        return "A Area do círculo é: " + raio * pi;
    }
    //Utilizando um método com retorno e não usar println pelas boas práticas
    public String calcularAreaQuadrado(int base, int altura){
        return "A area do quadrado é: " + base * altura;
    }

    //Area de execução do código
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                Menu de métodos!
                1 - Calcular área do círculo
                2 - Calcular área do triangulo
                """);
        int indice = leitura.nextInt();
    //Fiz uma estrutura if para fazer a comparação e associar os métodos
        if (indice == 1){
            System.out.println("Entre com o raio do círculo: ");
            float r = leitura.nextFloat();
            Metodos circulo = new Metodos();
            System.out.println(circulo.calcularAreaCirculo(r));

        } else if (indice == 2) {
            System.out.println("Entre com a base do quadrado: ");
            int a = leitura.nextInt();
            System.out.println("Entre com a altura do quadrado: ");
            int b = leitura.nextInt();

            Metodos quadrado = new Metodos();
            System.out.println(quadrado.calcularAreaQuadrado(a,b));
        }

    }
}
