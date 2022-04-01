package CollectionMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;


public class Mobile {
	
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	ArrayList<String> modelList = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Mobile [mobiles=" + mobiles + "]";
	}
	
	public String addMobile(String company, String model) {

		String message = "Mobile added successfully";

		// this method will take a string as a company name and its model as an
		// //argument.
		// ex: "apple", "Iphone13"
		// add the company as key and its model as an element of ArrayList in the above
		// //mobiles HashMap.
		// if the company name already exists then their model should be added to the
		// //existing list.
		// This method should return a message "Mobile added successfully" after
		// //adding a mobile.
		
		modelList.add(model);
		mobiles.put(company, modelList);

		return message;
	}

	public ArrayList<String> getModels(String company) {
		ArrayList<String> result = null;
		// This method return the list of all the models of the supplied company
		// if we supply any invalid company name then it should return null value

		return result;
	}

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		String msg = mobile.addMobile("Apple", "iPhone13Pro");
		String msg2 = mobile.addMobile("Samsung", "S22");
		String msg3 = mobile.addMobile("Samsung", "S10+");
		String msg4 = mobile.addMobile("Apple", "iPhone12Pro");
		
		
		
		System.out.println(mobile.mobiles);
	}

	



	

}
