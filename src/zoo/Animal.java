/**
 * 
 */
package zoo;

/**
 * @author Thomas LINTANF
 *
 */
abstract class Animal {
	private int poids;
	private String nom;
	
	public Animal() {
		poids = 0;
		nom = "";
	}
	
	public Animal(int poids, String nom) {
		this.poids = poids;
		this.nom = nom;
	}

	abstract void manger();
	
	/**
	 * @return le poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids le nouveau poids
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom le nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + poids;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (poids != other.poids)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [poids=" + poids + ", nom=" + nom + "]";
	}
}
