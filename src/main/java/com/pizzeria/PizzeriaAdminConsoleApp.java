package com.pizzeria;

import java.util.Collections;
import java.util.Scanner;

import classe.Pizza;
import classe.Pizzeria;
import dao.PizzaMemDao;
import dao.PriceDownComparator;
import dao.PriceUpComparator;

public class PizzeriaAdminConsoleApp {

	
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		PizzaMemDao myPizzas = new PizzaMemDao();
	
		//pour mettre fin a la boucle 
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
				System.out.println("tri par ordre croissant tapez 1 \n\r tri par ordre decroissant tapez 2");
				int choice = scan.nextInt();
				if(choice==1) {
					//tri par ordre croissant le prix des pizzas
					 Collections.sort(myPizzas.findAllPizzas(), new PriceUpComparator());
					 System.out.println(myPizzas);
				}else {
					//tri par ordre decroissant le prix des pizzas
					Collections.sort(myPizzas.findAllPizzas(), new PriceDownComparator());
					 System.out.println(myPizzas);
				}
				System.out.println("Liste des pizzas:");
				Pizzeria.displayAllPizza(myPizzas.findAllPizzas());
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
				String code = scan.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String name = scan.nextLine();
				System.out.println("Veuillez le prix:");
				Double price = Double.valueOf(scan.nextLine());
				Pizza newPizza = new Pizza(code, name, price);
				myPizzas.addPizza(newPizza);
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Mise a jour d'une pizza	
			 */
			case 3:
				
				System.out.println("----------------------");
				System.out.println("Mise à jour d’une pizza");
				Pizzeria.displayAllPizza(myPizzas.findAllPizzas());
				scan.nextLine();
				System.out.println("Veuillez saisir le code de la pizza à modifier");
				String oldCode = scan.nextLine();
				
				System.out.println("Veuillez saisir le nouveau code");
				code = scan.nextLine();
				System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
				name = scan.nextLine();
				System.out.println("Veuillez le nouveau prix:");
				price = Double.valueOf(scan.nextLine());
				Pizza pizz = new Pizza(code, name, price);
				myPizzas.updatePizza(oldCode,pizz);
				System.out.println(Pizza.displayMenu());
				break;
			/*
			 * 
			 * Supprime une pizza
			 */
			case 4:
				System.out.println("----------------------");
				System.out.println("Suppression d’une pizza");
				Pizzeria.displayAllPizza(myPizzas.findAllPizzas());
				scan.nextLine();
				System.out.println("Veuillez saisir le code de la pizza à modifier");
				code = scan.nextLine();
				
				myPizzas.deletePizza(code);
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
