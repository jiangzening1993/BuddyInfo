import java.util.HashMap;
import java.util.Map;


public class AddressBook {
	
	private Map<String, BuddyInfo> addressBook;
	
	public AddressBook(){
		addressBook = new HashMap<String, BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy){
		addressBook.put(buddy.getName(), buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy){
		addressBook.remove(buddy);
	}
	
	/*public static void main(String[] args) {
		System.out.println("AddressBook");
		BuddyInfo bi = new BuddyInfo();
		bi.setAddress("Carleton");
		bi.setName("Tom");
		bi.setPhoneNumber("613");
		AddressBook ab = new AddressBook();
		ab.addBuddy(bi);
		ab.removeBuddy(bi);
	}*/
	
	public int size(){
		return addressBook.size();
	}
	
	public void clear(){
		addressBook.clear();
	}
}
