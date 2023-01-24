
package com.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
       
	Scanner terminal = new Scanner(System.in);
	System.out.println("Digite o primeiro parâmetro");
	int parametroUm = terminal.nextInt();
	System.out.println("Digite o segundo parâmetro");
	int parametroDois = terminal.nextInt();
		
	    try {
		//chamando o método contendo a lógica de contagem
		contar(parametroUm, parametroDois);
		
	    }catch (ParametrosInvalidosException e) {
	//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo Parametro que voce digitou deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
                int contagem = 0;
		    if (parametroUm < parametroDois){
                        contagem = parametroDois - parametroUm;
                }else if (parametroUm > parametroDois) {
                    throw new ParametrosInvalidosException();
                }
		          for (int i = 1; i < contagem + 1; i++) {
                              System.out.println("número" + i);
            }
		//realizar o for para imprimir os números com base na variável contagem
    }
}
