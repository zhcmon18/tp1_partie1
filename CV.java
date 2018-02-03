import java.util.ArrayList;

public class CV {
	 
	private String nom;
	  private String prenom;
	  private String formation;
	  private float experience;
	  private String[] competences;
	  private String attentes;


	  public CV(String nom, String prenom, String formation, float experience, String[] competences, String attentes){
	    this.nom = nom;
	    this.prenom = prenom;
	    this.formation = formation;
		this.experience = experience;
		this.competences = competences;
		this.attentes = attentes;
	 }

	public void affiche() {

		String competencesLisible = "";
		
		for (int i = 0; i < competences.length; i++) {
			if (i != competences.length - 1) {
		
				competencesLisible += competences[i] + ", ";
		
			} else {
				competencesLisible += competences[i] + ".";
			}
		}
		    
		System.out.println("nom : " + this.nom + 
			    "\nprenom : " + this.prenom +
			    "\nFormation : " + this.formation +
			    "\nExpériences : " + this.experience +
			    "\nCompétences : " + competencesLisible +
			    "\nAttentes : " + this.attentes + "\n");
	}

	public static void main(String args[]) {
		System.out.println("Bienvenue chez Barrette!\n");

		CV cvJustin = new CV("Fofana", "Justin", "420.AA Informatique de gestion", 2,
				new String[] { "pro du vélo", "dance comme un arbre" }, "Que tous le monde s'amuse bien :)");

		CV cvYoucef = new CV("Bokari", "Oussama Youcef", "420.AA Informatique de gestion", 2,
				new String[] { "pro du vélo", "dance comme un crabe" }, "Que tous le monde s'amuse bien :)");

		CV cvPavel = new CV("Zaharciuc", "Pavel", "420.AA Informatique de gestion", 2,
				new String[] { "pro du vélo", "dance comme un crabe" }, "Que tous le monde s'amuse bien :)");

		ArrayList<CV> equipe = new ArrayList<>();

		equipe.add(cvJustin);
		equipe.add(cvYoucef);
		equipe.add(cvPavel);

		for (CV cv : equipe) {
			cv.affiche();
		}

	}
}
