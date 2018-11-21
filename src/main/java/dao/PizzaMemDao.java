package dao;

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

	Pizza[] pizzas = { pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7 };

	public Pizza[] findAllPizzas() {
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
			
			pizza = pizz;
		}
	}

	public void addPizza(Pizza pizza) {
		Pizza[] newPizzas = new Pizza[pizzas.length + 1];

		for (int i = 0; i < pizzas.length; i++) {
			newPizzas[i] = pizzas[i];
		}
		newPizzas[newPizzas.length - 1] = pizza;
		pizzas = newPizzas;
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
		Pizza[] newPizzas = new Pizza[pizzas.length - 1];
		
		int indiceProvisoire = 0;
		
		for(int i=0;i<pizzas.length;i++) {

			if (!pizzas[i].getCode().equals(codePizza)) {
				newPizzas[indiceProvisoire] = pizzas[i];
				indiceProvisoire++;
			}
		}
		pizzas = newPizzas;
	}

}
