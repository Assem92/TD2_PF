
public class Princ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Somme<Integer> sommeEntier = (a, b) -> a + b;
	        Somme<Double> sommeDouble = (a, b) -> a + b;
	        Somme<Long> sommeLong = (a, b) -> a + b;
	        Somme<String> sommeString = (a, b) -> a.concat(b);
	}

}
