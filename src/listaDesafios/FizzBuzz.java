/*
    Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:

    Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
    Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
    Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.

 */

public class FizzBuzz {
    public static void main(String[] args){
        int i;
        int contador = 0,resto3,resto5;

        for(i = 1;i <= 100;i++){
            contador++;
            resto3 = contador % 3;
            resto5 = contador % 5;

            if(resto3 == 0 && resto5 == 0) {
                System.out.println("\u001b[33m FizzBuzz \u001b[m");

            }else if(resto3 == 0){
                System.out.println("\u001b[36m Fizz \u001b[m");

            }else if(resto5 == 0){
                System.out.println("\u001b[32m Buzz \u001b[m");

            }

        }
    }
}