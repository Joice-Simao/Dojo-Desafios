import java.util.Scanner;

/*
    Sua tarefa é processar uma seqüência de números inteiros para determinar as seguintes estatísticas:
        Valor mínimo
        Valor máximo
        Número de elementos na seqüência
        Valor médio
    Por exemplo para uma seqüência de números "6, 9, 15, -2, 92, 11", temos como saída:
        Valor mínimo: -2
        Valor máximo: 92
        Número de elementos na seqüência: 6
        Valor médio: 18.1666666
 */
public class EstatisticasSimples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = 0, valorMinimo = 999999999, valorMaximo = 0, totalNumeros = 0, valorMedio = 0,
                somaNumeros= 0;

        System.out.println("\t\t\t\t\t>>> Programa Estatística Simples <<<");
        System.out.println("Informe os números que serão processados para finalizar o programa " +
                "digite o número 0 (zero)\n");

        do {
            System.out.print("Informe um número : ");
            numero = scanner.nextInt();

            if (numero != 0) {
                totalNumeros++;
                somaNumeros = numero + somaNumeros;

                if (numero < valorMinimo) {
                    valorMinimo = numero;
                }
                if (numero > valorMaximo) {
                    valorMaximo = numero;
                }
            }
        }while (numero != 0);

        valorMedio = somaNumeros / totalNumeros;

        System.out.println("Valor mínimo: " +valorMinimo);
        System.out.println("Valor máximo: " +valorMaximo);
        System.out.println("Número de elementos na seqüência: " +totalNumeros);
        System.out.println("Valor médio: " +valorMedio);

    }
}
