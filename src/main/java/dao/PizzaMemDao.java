package dao;


import java.util.ArrayList;
import java.util.Arrays;


import classe.Pizza;

public class PizzaMemDao implements IPizzaDao {
	Pizza pizza1 = new Pizza("PEP", "Pépéroni", 12.50);
	Pizza pizza2 = new Pizza("MAR", "Margherita", 14.00);
	Pizza pizza3 = new Pizza("REIN", "La Reine", 11.50);
	Pizza pizza4 = new Pizza("FRO", "La 4 fromages", 12.00);
	Pizza pizza5 = new Pizza("CAN", "La cannibale", 12.50);
	Pizza pizza6 = new Pizza("ORI", "L'orientale", 13.50);
	Pizza pizza7 = new Pizza("IND", "L'indienne", 14.00);
	String code;
	String name;
	Double price;
	
	
	Pizza[] piz = { pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7 };
	
	

	ArrayList<Pizza> pizzas = new ArrayList<Pizza>(Arrays.asList(piz));
	

	
	public ArrayList<Pizza> findAllPizzas() {
		return pizzas;
	}

	public Pizza findPizzaByCode(String codePizza) {
		Pizza pizz = null;
		for (Pizza pizza : pizzas) {
			if(pizza.getCode().equals(codePizza)) {
				pizz  = pizza;
			}
		}
		return pizz;
	}

	public boolean isPizzaExists(String codePizza) {
		boolean exist = false;
			if(findPizzaByCode(codePizza)!=null) {
				exist = true;
			}
		return exist;
	}

	public void updatePizza(String codePizza, Pizza pizza) {
		Pizza pizz = findPizzaByCode(codePizza);
		if(pizz!=null) {
			pizz.setCode(pizza.getCode());
			pizz.setDesignation(pizza.getDesignation());
			pizz.setPrice(pizza.getPrice());
		}
	}

	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}

//	public void deletePizza(String codePizza) {
//		Pizza[] newPizzas = new Pizza[pizzas.length - 1];
//		int i = 0;
//		for (Pizza pizza : pizzas) {
//
//			if (!pizza.getCode().equals(codePizza)) {
//				newPizzas[i] = pizza;
//				i++;
//			}
//		}
//		pizzas = newPizzas;
//	}
	public void deletePizza(String codePizza) {
		Pizza pizDeleted = findPizzaByCode(codePizza);
		pizzas.remove(pizDeleted);
	}

	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
