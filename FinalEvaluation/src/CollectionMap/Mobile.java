package CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class Mobile{
	
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	
	
	@Override
	public String toString() {
		return "Mobile [mobiles=" + mobiles + "]";
	}
	
	public String addMobile(String company, String model) {

		String message = "Mobile added successfully";

		Set<Entry<String, ArrayList<String>>> keySet = mobiles.entrySet();
		
		boolean flag=true;
		for(Entry<String, ArrayList<String>> str: keySet ) {
			if(str.getKey().equals(company)) {
				flag = false;
				str.getValue().add(model);
			}
		}
		
		if(flag) {
			ArrayList<String> modelList = new ArrayList<>();
			modelList.add(model);
			mobiles.put(company, modelList);
		}

		return message;
	}

	public ArrayList<String> getModels(String company) {
		ArrayList<String> result = new ArrayList<>();
		boolean flag=true;
		Set<Entry<String, ArrayList<String>>> keySet = mobiles.entrySet();
		for(Entry<String, ArrayList<String>> str: keySet ) {
			if(str.getKey().equalsIgnoreCase(company)) {
				result = str.getValue();
				flag=false;
			}
		}
		if(flag)
			result = null;
		

		return result;
	}

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.addMobile("apple", "iPhone12");
		mobile.addMobile("apple", "iPhone13");
		mobile.addMobile("apple", "iPhone14");
		mobile.addMobile("apple", "iPhone15");
		
		List<String> modelList = mobile.getModels("Apple");
		
		System.out.println(mobile.mobiles);
		System.out.println(modelList);
	}
}
