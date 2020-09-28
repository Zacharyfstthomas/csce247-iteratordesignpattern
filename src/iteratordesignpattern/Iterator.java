package iteratordesignpattern;
/**
 * Interface, which is used by ToDoIterator, 
 * contains two methods essential for every Iterator.
 * @author zacharystthomas
 *
 */
public interface Iterator {

	public boolean hasNext();
	public Object next();
}
