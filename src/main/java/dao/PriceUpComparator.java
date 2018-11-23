package dao;

import java.util.Comparator;

import classe.Pizza;

public class PriceUpComparator implements Comparator<Pizza> {
	public PriceUpComparator(){
		
	}
// trie le prix des pizzas par orde croissant
	public int compare(Pizza p1, Pizza p2) {
		
		int result = p1.getPrice().compareTo(p2.getPrice());
		 
	  	return result;
	}
}
