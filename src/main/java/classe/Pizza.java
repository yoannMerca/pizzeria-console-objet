package classe;

	public class Pizza {
		/*Id (ou identifiant unique pour chaque Pizza) : 1
			Code : MAR
			Désignation : MARGARITA
			Prix : 9,20 €
		*/
		private int idPizza;
		private String code = null;
		private String designation = null;
		private Double price = null;
		static int nbr =0;
		
		
		/**
		 * 
		 * @param code de la pizza (les trois premieres lettre en Maj)
		 * @param designation Nom de la pizza
		 * @param price prix de la pizza
		 */
		public Pizza(String code, String designation, Double price) {
			this.idPizza = nbr++;
			this.code = code;
			this.designation = designation;
			this.price = price;
		}
		/**
		 * 
		 * @return retourne le code de la pizza
		 */
		public String getCode() {
			return code;
		}
		/**
		 * 
		 * @param code modifi le code de la pizza
		 */
		public void setCode(String code) {
			this.code = code;
		}
		/**
		 * 
		 * @return retourne la designation
		 */
		public String getDesignation() {
			return designation;
		}
		/**
		 * 
		 * @param designation modifi la designation
		 */
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		/**
		 * 
		 * @return retourne le prix de la pizza
		 */
		public Double getPrice() {
			return price;
		}
		/**
		 * 
		 * @param price modification du prix
		 */
		public void setPrice(Double price) {
			this.price = price;
		}
		public int getIdPizza() {
			return idPizza;
		}
		/**
		 * 
		 * @return methode pour afficher le menu de l'application
		 */
		
		public static String displayMenu() {
			return "***** Pizzeria Administration *****\r\n" + 
					"1. Lister les pizzas\r\n" + 
					"2. Ajouter une nouvelle pizza\r\n" + 
					"3. Mettre à jour une pizza\r\n" + 
					"4. Supprimer une pizza\r\n" + 
					"99. Sortir";
		}
		public String toString() {
	
			return this.code +" -> "+ this.designation +"("+ this.price+" €)";
		}
		
		public static void displayAllPizza(Pizza[] pizzas) {
			
			for (Pizza pizza: pizzas) {
				System.out.println(pizza.toString());
				
			}
		}
		public static Pizza[] addNewPizza(Pizza pizz ,Pizza[] pizzas) {
				
			Pizza[] newPizzas = new Pizza[pizzas.length+1];
 			
			for(int i=0;i<pizzas.length;i++) {
				newPizzas[i] = pizzas[i];
			}	
			newPizzas[newPizzas.length-1] = pizz;
			
			return newPizzas;
		}
		public static Pizza[] deletePizza(String code,Pizza[] pizzas) {
			
			Pizza[] newPizzas = new Pizza[pizzas.length-1];
 			int i =0;
			
			for (Pizza pizza : pizzas) {
				
				if(!pizza.getCode().equals(code)) {
						newPizzas[i] = pizza; 
						i++;
					}
			
			}
			return newPizzas;
		}
		public static Pizza[] updateNewPizza(String oldCode ,String code, Pizza[] pizzas,String name, Double price) {
			for (Pizza pizza : pizzas) {
				
				if(pizza.getCode().equals(oldCode)) {
					pizza.setCode(code);
					pizza.setDesignation(name);
					pizza.setPrice(price);
				};
			}
			
			return pizzas;
		}
		
}
