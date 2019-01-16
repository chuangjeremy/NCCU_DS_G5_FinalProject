import java.util.ArrayList;

public class KeywordList {

	public ArrayList<Keyword> keywords = new ArrayList<Keyword>();
	
	
	public KeywordList(String food) {
		
		
		
		if(food.contains("pork")) {
			keywords.add(new Keyword("Pork Chops", 2));
			keywords.add(new Keyword("Pork Loin", 2));
			keywords.add(new Keyword("Pork Sausage", 2));
			keywords.add(new Keyword("Pork Shoulder", 2));
			keywords.add(new Keyword("Pork Tenderloin", 2));
			keywords.add(new Keyword("Ground Pork", 2));
			keywords.add(new Keyword("Ham Recipes", 2));
			keywords.add(new Keyword("Bacon Recipes", 2));
			keywords.add(new Keyword("Pork Ribs", 2));
			keywords.add(new Keyword("BBQ & Grilled Pork", 2));
			keywords.add(new Keyword("Pork Casserole", 2));
			keywords.add(new Keyword("Pork Chili", 2));
			keywords.add(new Keyword("Pork Main Dishes", 2));
			keywords.add(new Keyword("Pork Meatloaf", 2));
			keywords.add(new Keyword("Pork Pie", 2));
			keywords.add(new Keyword("Pork Sandwiches", 2));
			keywords.add(new Keyword("Pork Soup", 2));
			keywords.add(new Keyword("Pork Stew", 2));
			keywords.add(new Keyword("Pork Stir-Fry", 2));

		
		}
		if(food.contains("fish")) {
			keywords.add(new Keyword("Anchovy", 2));
			keywords.add(new Keyword("Catfish", 2));
			keywords.add(new Keyword("CodCod", 2));
			keywords.add(new Keyword("Flounder", 2));
			keywords.add(new Keyword("Haddock", 2));
			keywords.add(new Keyword("Halibut", 2));
			keywords.add(new Keyword("Mackerel", 2)); 
			keywords.add(new Keyword("Mahi Mahi", 2));
			keywords.add(new Keyword("Salmon", 2));
			keywords.add(new Keyword("Sardine", 2));
			keywords.add(new Keyword("Snapper", 2));
			keywords.add(new Keyword("Swai", 2));
			keywords.add(new Keyword("Swordfish", 2));
			keywords.add(new Keyword("Tilapia", 2));
			keywords.add(new Keyword("Trout", 2));
			keywords.add(new Keyword("Tuna", 2));
			keywords.add(new Keyword("Walleye", 2));
			keywords.add(new Keyword("Fish Cakes", 2));
			keywords.add(new Keyword("Fish Chowder", 2));

		}
		if(food.contains("shellfish")) {
			keywords.add(new Keyword("Clam", 2));
			keywords.add(new Keyword("Crab", 2));
			keywords.add(new Keyword("Crawfish", 2));
			keywords.add(new Keyword("Lobster", 2));
			keywords.add(new Keyword("Octopus and Squid", 2));
			keywords.add(new Keyword("Oyster", 2));
			keywords.add(new Keyword("Shrimp", 2));

		}
		if(food.contains("vegetable")) {
			keywords.add(new Keyword("Cabbage", 2));
			keywords.add(new Keyword("Carrot", 2));
			keywords.add(new Keyword("Cauliflower", 2));
			keywords.add(new Keyword("Corn", 2));
			keywords.add(new Keyword("Eggplant", 2));
			keywords.add(new Keyword("Green Bean", 2));
			keywords.add(new Keyword("Green Pea", 2));
			keywords.add(new Keyword("Greens", 2));
			keywords.add(new Keyword("Onion", 2));
			keywords.add(new Keyword("Potato", 2));
			keywords.add(new Keyword("Roasted", 2));
			keywords.add(new Keyword("Squash", 2));
			keywords.add(new Keyword("Sweet Potato", 2));
			keywords.add(new Keyword("Tomato", 2));
			keywords.add(new Keyword("Zucchini", 2));

		}

		
		
		if(food.contains("beef")) {
			keywords.add(new Keyword("Beef Meatloaf", 2));
			keywords.add(new Keyword("Ground Beef", 2));
			keywords.add(new Keyword("Beef Stew", 2));
			keywords.add(new Keyword("Beef Main Dishes", 2));
			keywords.add(new Keyword("Beef Chuck", 2));
			keywords.add(new Keyword("Beef Brisket", 2));
			keywords.add(new Keyword("Beef Steaks", 2));
			keywords.add(new Keyword("Beef Short Loin", 2));
			keywords.add(new Keyword("Beef Sirloin", 2));
			keywords.add(new Keyword("Beef Tenderloin", 2));
			keywords.add(new Keyword("Beef Ribs", 2));
			keywords.add(new Keyword("Prime Rib", 2));
			keywords.add(new Keyword("BBQ & Grilled Beef", 2));
			keywords.add(new Keyword("Beef Casserole", 2));
			keywords.add(new Keyword("Beef Chili", 2));
			keywords.add(new Keyword("Beef Pie", 2));
			keywords.add(new Keyword("Beef Salad", 2));
			keywords.add(new Keyword("Beef Sandwiches", 2));
			keywords.add(new Keyword("Beef Soup", 2));
			keywords.add(new Keyword("Beef Stir-Fry", 2));
			keywords.add(new Keyword("Hamburgers", 2));
			keywords.add(new Keyword("Beef Appetizers", 2));
			keywords.add(new Keyword("Beef Sausage", 2));

		}
		
		
		if(food.contains("chicken")) {
			keywords.add(new Keyword("Baked and Roasted Chicken", 2));
			keywords.add(new Keyword("Chicken Breasts", 2));
			keywords.add(new Keyword("Chicken Legs", 2));
			keywords.add(new Keyword("Chicken Sausage", 2));
			keywords.add(new Keyword("Chicken Tenders", 2));
			keywords.add(new Keyword("Chicken Thighs", 2));
			keywords.add(new Keyword("Chicken Wings", 2));
			keywords.add(new Keyword("Ground Chicken", 2));
			keywords.add(new Keyword("Whole Chicken", 2));
			keywords.add(new Keyword("Fried Chicken", 2));
			keywords.add(new Keyword("Chicken Salad", 2));
			keywords.add(new Keyword("Chicken Appetizers", 2));
			keywords.add(new Keyword("BBQ & Grilled Chicken", 2));
			keywords.add(new Keyword("Chicken Chili", 2));
			keywords.add(new Keyword("Chicken Pie", 2));
			keywords.add(new Keyword("Chicken Sandwiches", 2));
			keywords.add(new Keyword("Chicken Soup", 2));
			keywords.add(new Keyword("Chicken Stew", 2));
			keywords.add(new Keyword("Chicken Stir-Fry", 2));

			
		}
		
		if(food.contains("Ingredient")) {
			keywords.add(new Keyword("Ingredient", 0));
		
		}
		
		if(food.contains("CookingTechniques")) {
			keywords.add(new Keyword("CookingTechniques", 0));
		
		}
		
		
		if(food.contains("stew")) {
			keywords.add(new Keyword("stew", 8));
		
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Baking", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Boiling", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Braising", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Browning", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Deep frying", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Fermentation", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Grilling", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Pickling", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Roasting", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Smoking", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Steaming", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Stew", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Stir frying", 8));
		}
		if(food.contains("stew")) {
			keywords.add(new Keyword("Sugar panning", 8));
		}

		
		
		keywords.add(new Keyword(food, 10));
		
	}
		
	
}
