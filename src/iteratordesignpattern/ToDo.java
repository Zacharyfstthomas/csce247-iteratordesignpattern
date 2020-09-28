package iteratordesignpattern;

import java.util.ArrayList;
/**
 * 
 * Each instance of ToDo represents a job to be completed at the property.
 * Each ToDo has multiple class variables, including the title of the job,
 * the description of the job, the price of the job, a name to contact
 * concerning the job, and a list of supplies to be used for the job.
 * @author zacharystthomas
 *
 */
public class ToDo {
	
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	/**
	 * Constructor. Initializes the class variables.
	 * @param title: Given by driver, used to initialize the title variable.
	 * @param description: Given by driver, used to initialize the description variable.
	 * @param price: Given by driver, used to initialize the price variable.
	 * @param contact: Given by driver, used to initialize the contact variable.
	 * @param supplies: Given by driver, used to initialize the supplies variable.
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	/**
	 * @return Returns the value of the price variable.
	 */
	public double getPrice() {
		
		return this.price;
	}
	/**
	 * Returns a string value which displays to the user the details of the job, using the class variables.
	 * For the supplies ArrayList, a single String is made to combine each element of the ArrayList
	 * into one String that can be entered into the return statement.
	 * @return Returns this instance's title, description, contact, supplies, and price variables, each 
	 * with special formatting.
	 */
	public String toString() {
		
		String suppliesReturn = "";
		for(String supply : supplies) {
			suppliesReturn += "- "+supply+"\n";
			
		}
		
		return "\n***** "+this.title+" *****\n"
				+this.description + "\nBusiness Contact: "+this.contact
				+"\nSupply List: \n" + suppliesReturn + "Price : $"+this.getPrice()+"\n";
	}


}
