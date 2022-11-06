//subclass of super class Food 

public class Burger extends Food //inheritance
{
	private int type;
	private int cost; 
	private Cheese cheese = new Cheese(type,cost);
	private int[] ingredients;
	private int ingredientsCost;

	//declares all the four prices for 4 available ingredients 


  //constructor of burger class
	public Burger(int type, int cost)
	{
		super(type, cost);
	}
	
	//getter of burger type
	public int getType() {
		return type;
	}
	
	//setter of burger type
	public void setType(int type) {
		this.type = type;
	}
	
	//getter of ingredients 
	public void costIngredients(int[] ingredients) {
		int ingredientsCost = 0;
		for(int i = 0; i<ingredients.length; i++) {
			ingredientsCost += ingredients[i];
		}
		this.ingredientsCost = ingredientsCost;
		// TODO Auto-generated method stub
	}
	
  //getter. implemented version of calculateCost for burger with cheese and ingredients
	public int calculateCost(int type)
	{
		if(type == 0) {
			cost = 0;
		}
		if(type == 1) {
			cost = 4000;
		}
		if(type == 2) {
			cost = 5000;
		}
		if(type == 3) {
			cost = 5500;
		}
	    if(type == 4) {
	    	cost = 5000;
	    }
	    int burgerCost= cost;
	    

		int total = burgerCost + ingredientsCost+ cheese.calculateCost();
		// TODO Auto-generated method stub
		
	    return total;
	}
  
  //setter. Implemented version of calculateCost setter for burger
	 public void setCost(int cost)
	 {
	   this.cost = cost;
	    
	 }

	//getter of cheese
	public Cheese getCheese() {
		return cheese;
	}
	
	//setter of cheese
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}


	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}


	//getter of ingredients
	public int[] getIngredients() {
		return ingredients;
	}


	//setter of ingredients
	public void setIngredients(int[] ingredients) {
		this.ingredients = ingredients;
	}





}