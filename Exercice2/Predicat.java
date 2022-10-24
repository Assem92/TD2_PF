import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicat<T> {
	
	 Predicate<Paire<Integer, Double>> tailleTropPetite = a -> a.fst < 100;
	    Predicate<Paire<Integer, Double>> tailleTropGrande = a -> a.fst > 200;
	    Predicate<Paire<Integer, Double>> tailleIncorrecte = a -> tailleTropPetite.test(a) || tailleTropGrande.test(a);
	    Predicate<Paire<Integer, Double>> tailleCorrecte = Predicate.not(tailleIncorrecte);
	    Predicate<Paire<Integer, Double>> poidsTropLourd = a -> a.snd > 150.0;
	    Predicate<Paire<Integer, Double>> poidsCorrect = Predicate.not(poidsTropLourd);
	    Predicate<Paire<Integer, Double>> accesAutorise = a -> tailleCorrecte.test(a) && poidsCorrect.test(a);

	    
	    @SuppressWarnings("hiding")
		public <T> List<T> filtragePredicatif(List<Predicate<T>> conditions, List<T> elements){
	        List<T> R = new ArrayList<>();
	        
	        Predicate<T> predicat = x -> true;

	        for(Predicate<T> p : conditions){
	            predicat = predicat.and(p);
	        }
	        for(T e : elements) {
	            if (predicat.test(e)){
	                R.add(e);
	            }
	        }
	        return R;
	    }
	    
	    public static void main(String[] args) {
	        Predicat<Object> app = new Predicat<>();

	        Paire<Integer, Double> carré = new Paire<Integer, Double>(150, 100.0); 
	        Paire<Integer, Double> Oualli = new Paire<Integer, Double>(250, 100.0); 
	        Paire<Integer, Double> biggy = new Paire<Integer, Double>(150, 200.0); 

	        System.out.println(app.accesAutorise.test(carré));
	        System.out.println(app.accesAutorise.test(Oualli));
	        System.out.println(app.accesAutorise.test(biggy));

	    }
}
