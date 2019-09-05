/**
 * 
 */
package zoo;

/**
 * @author Thomas LINTANF
 *
 */
public class Chien extends Animal{
	
	private String maitre;
	
	public Chien(int poids, String nom, String maitre) {
		super(poids,nom);
		this.maitre = maitre;
	}

	/**
	 * @return le maitre
	 */
	public String getMaitre() {
		return maitre;
	}

	/**
	 * @param maitre le nouveau maitre
	 */
	public void setMaitre(String maitre) {
		this.maitre = maitre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((maitre == null) ? 0 : maitre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chien other = (Chien) obj;
		if (maitre == null) {
			if (other.maitre != null)
				return false;
		} else if (!maitre.equals(other.maitre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chien " + getNom() + " qui � pour maitre " + maitre + " et p�se " + getPoids();
	}

	@Override
	void manger() {
		System.out.println("Le chien mange du Pal");
	}

}
