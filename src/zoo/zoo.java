/**
 * 
 */
package zoo;

/**
 * @author Thomas LINTANF
 *
 */
public class zoo {
	private java.util.ArrayList<Animal> animaux;
	
	public zoo() {
		animaux = new java.util.ArrayList<Animal>();
	}
	
	public void add(Animal animal) {
		animaux.add(animal);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animaux == null) ? 0 : animaux.hashCode());
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
		zoo other = (zoo) obj;
		if (animaux == null) {
			if (other.animaux != null)
				return false;
		} else if (!animaux.equals(other.animaux))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "zoo [animaux=" + animaux + "]";
	}

}
