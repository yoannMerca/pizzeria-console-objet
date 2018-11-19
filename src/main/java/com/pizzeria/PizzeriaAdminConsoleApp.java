package com.pizzeria;

import java.util.Scanner;

import classe.Pizza;

public class PizzeriaAdminConsoleApp {

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//pour mettre fin a la boucle 
		boolean end = false;
		/*
		 * methode pour afficher le menu 
		 */
	
		System.out.println(Pizza.displayMenu());
		
		/*0 PEP Pépéroni 12.50
			1 MAR Margherita 14.00
			2 REIN La Reine 11.50
			3 FRO La 4 fromages 12.00
			4 CAN La cannibale 12.50
			5 SAV La savoyarde 13.00
			6 ORI L’orientale 13.50
			7 IND L’indienne 14.00
		*/
		Pizza pizza1 = new Pizza("PEP", "Pépéroni", 12.50);
		Pizza pizza2 = new Pizza("MAR", "Margherita", 14.00);
		Pizza pizza3 = new Pizza("REIN", "La Reine", 11.50);	
		Pizza pizza4 = new Pizza("FRO", "La 4 fromages", 12.00);
		Pizza pizza5 = new Pizza("CAN", "La cannibale", 12.50);
		Pizza pizza6 = new Pizza("ORI","L'orientale", 13.50);
		Pizza pizza7 = new Pizza("IND", "L'indienne", 14.00);
		String code;
		String name;
		Double price;
		Pizza[] pizzas = {pizza1, pizza2,pizza3, pizza4,pizza5, pizza6,pizza7};
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
				Pizza.displayAllPizza(pizzas);
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Ajoute une nouvelle pizza
			 */
			case 2:
				/*  Veuillez saisir le code :
					Veuillez saisir le nom (sans espace) :
					Veuillez saisir le prix :
				*/
				System.out.println("----------------------");
				System.out.println("Ajout d’une nouvelle pizza");
				
				scan.nextLine();
				System.out.println("Veuillez saisir le code");
				code = scan.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				name = scan.nextLine();
				System.out.println("Veuillez le prix:");
				price = Double.valueOf(scan.nextLine());
				Pizza newPizza = new Pizza(code, name, price);
				pizzas = Pizza.addNewPizza(newPizza, pizzas);
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Mise a jour d'un pizza	
			 */
			case 3:
				
				System.out.println("----------------------");
				System.out.println("Mise à jour d’une pizza");
				Pizza.displayAllPizza(pizzas);
				scan.nextLine();
				System.out.println("Veuillez saisir le code de la pizza à modifier");
				String oldCode = scan.nextLine();
				
				System.out.println("Veuillez saisir le nouveau code");
				code = scan.nextLine();
				System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
				name = scan.nextLine();
				System.out.println("Veuillez le nouveau prix:");
				price = Double.valueOf(scan.nextLine());
				pizzas = Pizza.updateNewPizza(oldCode,code, pizzas ,name , price);
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Supprime une pizza
			 */
			case 4:
				System.out.println("----------------------");
				System.out.println("Suppression d’une pizza");
				Pizza.displayAllPizza(pizzas);
				scan.nextLine();
				System.out.println("Veuillez saisir le code de la pizza à modifier");
				code = scan.nextLine();
				
				pizzas = Pizza.deletePizza(code, pizzas);
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
