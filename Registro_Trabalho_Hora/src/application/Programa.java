package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Trabalhador;
import entities.TrabalhadorTercerizado;

public class Programa {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com numero de trab");
		int num = sc.nextInt();
		List<Trabalhador> lista = new ArrayList<>();
		for(int i =0; i<num; i++) {
			System.out.println("Trabalhador #" + (i+1));
			System.out.println("Trabalhador (y/n)?");
			String t = sc.next();
			if(t.equalsIgnoreCase("n")) {
				sc.nextLine();
				System.out.println("Nome?");
				String nome =sc.nextLine();
				System.out.println("Horas?");
				Integer horas =sc.nextInt();
				System.out.println("Valor hora?");
				Double valorHoraTx= sc.nextDouble();
			    Trabalhador tra = new Trabalhador(nome, horas, valorHoraTx);
				lista.add(tra);
			} else if(t.equalsIgnoreCase("y")) {
				sc.nextLine();
				System.out.println("Nome?");
				String nome =sc.nextLine();
				System.out.println("Horas?");
				Integer horas =sc.nextInt();
				System.out.println("Valor hora?");
				Double valorHoraTx= sc.nextDouble();
				Trabalhador trt = new TrabalhadorTercerizado(nome, horas, valorHoraTx, 2.0);
				lista.add(trt);
			}
		}
		
		for(Trabalhador t: lista ) {
			System.out.println(t);
		}
	}

}
