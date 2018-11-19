package com.pizzeria;

import java.util.Scanner;

import classe.Pizza;

public class PizzeriaAdminConsoleApp {

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean end = false;
		/*
		 * methode pour afficher le menu 
		 */
	
		System.out.println(Pizza.displayMenu());
		
		/**
		 * boucle tant pour afficher le menu tant que l'utilisateur ne tape pas 99 
		 * */
		//scan.nextLine();
		while(!end) {
			System.out.println("----------------------");
			int value = scan.nextInt();
			switch (value) {
			/**
			 * affiche la liste des pizzas
			 */
			case 1:
				System.out.println("----------------------");
				System.out.println("Liste des pizzas:");
				
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Ajoute une nouvelle pizza
			 */
			case 2:
				System.out.println("----------------------");
				System.out.println("Ajout d’une nouvelle pizza");
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Mise a jour d'un pizza	
			 */
			case 3:
				System.out.println("----------------------");
				System.out.println("Mise à jour d’une pizza");
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Supprime une pizza
			 */
			case 4:
				System.out.println("----------------------");
				System.out.println("Suppression d’une pizza");
				System.out.println(Pizza.displayMenu());
				break;	
			/*
			 * 
			 * Fin de la boucle (valeur par defaut)
			 */
			case 99:
			default:
				System.out.println("----------------------");
				System.out.println("Au revoir");
				end =true;
				break;
			}
			
		}
	}

}
