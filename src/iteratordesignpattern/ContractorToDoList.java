package iteratordesignpattern;

import java.util.ArrayList;
/**
 * 
 * ContractorToDoList contains the array of the ToDos, the address of the location of the contractor work,
 * and a count to determine how many ToDos are in the array. This class allows for the addition 
 * of ToDos to the todos array, and also calculates the total cost of all of the jobs.
 * Additionally returns the address and initializes the ToDoIterator.	
 * @author zacharystthomas
 *
 */
public class ContractorToDoList {

	private String address;
	private ToDo[] todos;
	private int count;
	/**
	 * Constructor. Initializes the array with a length of two.
	 * @param address: Given from the driver, String value containing the address of all jobs.
	 */
	public ContractorToDoList(String address) {
		
		this.todos = new ToDo[2];
		this.address = address;
		this.count = 0;
	}
	/**
	 * 
	 * Adds a ToDo to the array todos. In order to add the array, much is done to ensure 
	 * the array can hold a new toDo and that it is added at the proper spot.
	 * If the element of the array is not null, i.e. is a ToDo, then the array is full
	 * and must be expanded, so the array to the array growArray returns.
	 * Afterwards, a count finds the first null element in the array, and then 
	 * creates a new ToDo at that index. 
	 * @param title: Given from driver, holds the title of the job.
	 * @param description: Given from driver, holds the description of the job.
	 * @param price: Given from driver, holds the price of the job.
	 * @param contact: Given from driver, holds the individual to contact concerning the job.
	 * @param supplies: Given from driver, holds the supplies required for the job.
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {

		if(this.todos[this.todos.length-1] != null) { 
			this.todos = growArray(this.todos);	
			}
		
		while(this.todos[this.count] != null) {
				this.count++;
			}
		this.todos[count] = new ToDo(title, description, price, contact, supplies);
			
			
		}
	
	/**
	 * Allows for ToDoIterator class to be used with this instance's todos array. 
	 * @return Returns a new instance of ToDoIterator which can interate through this instance's todos array.
	 */
	public ToDoIterator createIterator() {
		
		return new ToDoIterator(this.todos);
			
	}
		/**
		 * @return Returns this instance's address value.
		 */
	public String getAddress() {
		
		return this.address;
	}
	/**
	 * Iterates through the entire todos array, and for all ToDo values, takes
	 * the price from each ToDo and adds it to a sum of all the costs, to be returned.
	 * @return Returns the sum of every ToDo's price in the todos array. 
	 */
	public double getTotalCost() {
		double totalCost = 0;
		ToDoIterator toDoIterator = createIterator();
		while(toDoIterator.hasNext()) {
			totalCost += toDoIterator.next().getPrice(); 	
		}
		return totalCost;
	}
	/**
	 * Creates a new ToDo array, sets its length to double the parameter array,
	 * and then copies each value from the parameter array into the new array,
	 * which is then returned.
	 * @param todos: Given from the addToDo method, has the values of this instance's todos array.
	 * @return Returns an array which is double the size of the array entered, 
	 * with the same values of the parameter array in the same indexes.
	 */
	private ToDo[] growArray(ToDo[] todos) {
	
		ToDo[] newtodos = new ToDo[todos.length*2];
		for(int i=0;i<todos.length;i++) {
			newtodos[i] = todos[i];
	}
		
		return newtodos;
	
}
	
	
}
