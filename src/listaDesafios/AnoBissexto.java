/*
    A cada 4 anos, a diferença de horas entre o ano solar e o do calendário convencional completa
    cerca de 24 horas (mais exatamente: 23 horas, 15 minutos e 864 milésimos de segundo). Para compensar
    essa diferença e evitar um descompasso em relação às estações do ano, insere-se um dia extra no
    calendário e o mês de fevereiro fica com 29 dias. Essa correção é especialmente importante para
    atividades atreladas às estações, como a agricultura e até mesmo as festas religiosas.
    Um determinado ano é bissexto se:
        O ano for divisível por 4, mas não divisível por 100, exceto se ele for também divisível por 400.
    Exemplos:
    São bissextos por exemplo:
        1600 - 1732 - 1888 - 1944 - 2008
    Não são bissextos por exemplo:
        1742 - 1889 - 1951 - 2011
    Escreva uma função que determina se um determinado ano informado é bissexto ou não.
 */

import java.util.Scanner;

public class AnoBissexto {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int ano;
        boolean divisivel4, divisivel100, divisivel400;

        System.out.print("Informe o ano : ");
        ano = scanner.nextInt();

        divisivel4 = (ano % 4) == 0 ;
        divisivel100 = (ano % 100) == 0;
        divisivel400 = (ano % 400) == 0;

        if (divisivel4 == true && divisivel100 == false || divisivel4 == true && divisivel400 == true){
            System.out.print(ano+ " Ano bissexto");

        }else
            System.out.println(ano+ " não é bissexto");

    }
}
