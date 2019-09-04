package zoo;

/**
 * @author Gabriel RIBIER
 *
 */

public class Utilisation {

	public static void main(String[] args) {
		
		Chien labrador = new Chien(80, "Tintin", "Milou");
		System.out.println(labrador);
		Animal koala = new Animal(120, "Kangourou");
		Chien bulldog = new Chien(3, "Samy", "Scooby-doo");
		Chien chiwawa = new Chien(56, "Lucky-luke", "Rantanplan");
		Animal[] meute = {labrador, koala, bulldog, chiwawa};
		for (Animal animal : meute) {
			System.out.println(animal.getNom());
		}

	}

}
