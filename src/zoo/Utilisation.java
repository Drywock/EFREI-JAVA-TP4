package zoo;

/**
 * @author Gabriel RIBIER, Thomas LINTANF
 *
 */

public class Utilisation {

	public static void main(String[] args) {
		
		//Défini une instance de Chien
		Chien labrador = new Chien(80, "Tintin", "Milou");
		
		//Affiche le nom du chien, son poids et le nom du maître
		System.out.println(labrador);
		
		//Défini une instance d'Animal
		//Animal koala = new Animal(120, "Kangourou");
		
		//Défini deux autres instances de Chien
		Chien bulldog = new Chien(3, "Samy", "Scooby-doo");
		Chien chiwawa = new Chien(56, "Lucky-luke", "Rantanplan");
		
		//Défini une instance de Chat
		Chat garfield = new Chat(21, "John", "Sphynx");
		
		//Défini un tableau contenant 4 instances d'Animal
		Animal[] meute = {labrador, garfield, bulldog, chiwawa};
		
		//Affiche les noms des 4 animaux  dans le tableau
		for (Animal animal : meute) {
			System.out.println(animal.getNom());
		}
		
		//Teste les méthodes implémenter dans les classes Chien, Chat et Zoo
		labrador.manger();
		garfield.manger();
		Zoo parc = new Zoo();
		parc.add(garfield);
		parc.add(labrador);
		System.out.println(parc);
	}

}
