import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Princ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question1 : La différence entre Somme et Sommable est que Sommable contient un argument de + 
		    Somme<Integer> sommeEntier = (a, b) -> a + b;
	        Somme<Double> sommeDouble = (a, b) -> a + b;
	        Somme<Long> sommeLong = (a, b) -> a + b;
	        Somme<String> sommeString = (a, b) -> a.concat(b);
	        
	     // Question2
	        
	        List<String> l2s = new ArrayList<>();
	        
	        l2s.add("e1");
	        l2s.add("e2");
	        
	        ToString<List<String>> toStringList = a -> {
	        	
	            final StringBuilder builder = new StringBuilder();
	            
	            a.forEach((val) -> {
	            	
	                builder.append(val + ", ");
	            });
	            return builder.toString();
	        };
	        System.out.println(toStringList.show(l2s));

	        HashMap<String, Integer> hm = new HashMap<>();
	        
	        hm.put("k1", 1);
	        hm.put("k2", 2);
	        
	        ToString<HashMap<String, Integer>> toStringMap = a -> {
	        	
	            final StringBuilder builder = new StringBuilder();
	            
	            a.forEach((key, val) -> {
	                builder.append(String.format("%s : %d, ", key, val));
	                
	            });
	            return builder.toString();
	        };
	        
	        System.out.println(toStringMap.show(hm));

	    }
	}
	


