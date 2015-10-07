import java.util.Map;
import java.util.TreeMap;

/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a list of cars, sorted like a "map"
 * 
 */


public class CarSortedMap {
	
	public static void main(String[] args) {
		
		//1
		//declarations
		Map<String, Car> carMap = new TreeMap<String, Car>();
		
		//2
		//we add elements to the set
		carMap.put("1234 AAA", new Car("Alfa Romeo", "Giulia", 2900, 6));
		carMap.put("2321 BBB", new Car("Seat", "Ibiza", 1200, 3));
		carMap.put("8232 FFF", new Car("Ford", "Focus", 2000, 4));
		carMap.put("3311 FFF", new Car("Ford", "Mondeo", 2200, 4));
		carMap.put("9381 LLL", new Car("Seat", "Leon", 1600, 4));
		Car hyundi = new Car("Hyundai", "Atos", 1500, 3);
		carMap.put("B 9011 XC", hyundi);
		carMap.put("9234 BHG", new Car("Hyundai", "Santa Fe", 3000, 6));
		carMap.put("9216 CKK", new Car("Hyundai", "Accent", 2000, 4));
		
		//3
		//yes, we can add duplicate elements or "values", but we cannot add duplicate keys. in the case
		//at hand we can have two duplicate cars as long as they don't share the same "license number"
		//if we try to add a value with the same key as another, the latter is replaced by the former
		
		//4
		for (Map.Entry entry : carMap.entrySet()) {
			System.out.println("License Number (AKA \"key\"): " + entry.getKey() + " Vehicle: " + entry.getValue());
        }
		
	}
	

}
