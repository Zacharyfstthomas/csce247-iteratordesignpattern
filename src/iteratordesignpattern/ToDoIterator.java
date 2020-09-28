package iteratordesignpattern;
/**
 * 
 * Method which helps allow for the iteration of ToDo arrays,
 * which is especially useful for grabbing values from all the ToDos
 * within an array.
 * @author zacharystthomas
 *
 */
public class ToDoIterator implements Iterator{

	private ToDo[] todos;
	private int position = 0;
	
	/**
	 * Constructor. Initializes todos ToDo array.
	 * @param todos: Entered from ContractorToDoList, the ToDo array is set as this 
	 * instance's ToDo array, to be used in the other methods.
	 */
	public ToDoIterator(ToDo[] todos) {
	
		this.todos = todos;
	}
	/**
	 * Checks if the position variable is larger than the length of the todos array and
	 * if the ToDo at index position of todos is null.
	 * Either one being true indicates that there is another item in the array, meaning
	 * it can be called.
	 * @return Returns false if either is true, returns true otherwise.
	 */
	public boolean hasNext() {
		if(position > todos.length || todos[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public ToDo next() {
		ToDo todo = todos[position];
		position++;
		return todo;
	}
}
