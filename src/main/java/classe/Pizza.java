package classe;

	public class Pizza {
		/*Id (ou identifiant unique pour chaque Pizza) : 1
			Code : MAR
			Désignation : MARGARITA
			Prix : 9,20 €
		*/
		
		private String code = null;
		private String designation = null;
		private Double price = null;
	
		
		
		/**
		 * 
		 * @param code
		 * @param designation
		 * @param price
		 */
		public Pizza(String code, String designation, Double price) {
			this.code = code;
			this.designation = designation;
			this.price = price;
		}
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		
		public static String displayMenu() {
			return "***** Pizzeria Administration *****\r\n" + 
					"1. Lister les pizzas\r\n" + 
					"2. Ajouter une nouvelle pizza\r\n" + 
					"3. Mettre à jour une pizza\r\n" + 
					"4. Supprimer une pizza\r\n" + 
					"99. Sortir";
		}
		
}
