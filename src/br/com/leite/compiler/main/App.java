package br.com.leite.compiler.main;


import br.com.leite.compiler.lexico.Scanner;
import br.com.leite.compiler.lexico.Token;

public class App {

	public static void main(String[] args) {
		Scanner sc =  new Scanner("imput.lts");
		Token token = null;
		do {
			token = sc.nextToken();
			if(token != null) {
				System.out.println(token);
			}
		} while (token != null);

	}

}
