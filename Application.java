/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

public class Application {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Item<String> myName = new Item<String>();
		myName.setE("Andrew");
		
		Item<Integer> myInteger = new Item<Integer>();
		myInteger.setE(19);
		
		SmallBag<Item> myBag = new SmallBag<Item>();
		myBag.setItem(myName);
		System.out.println(myBag.getItem().getE());
		
		myBag.setItem(myInteger);
		System.out.println("\n"+myBag.getItem().getE());
	}

}
