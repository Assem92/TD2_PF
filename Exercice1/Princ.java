
public class Princ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question1 : La différence entrre Somme et Sommable est que Sommable contient un argument de + 
		    Somme<Integer> sommeEntier = (a, b) -> a + b;
	        Somme<Double> sommeDouble = (a, b) -> a + b;
	        Somme<Long> sommeLong = (a, b) -> a + b;
	        Somme<String> sommeString = (a, b) -> a.concat(b);
	}

}
