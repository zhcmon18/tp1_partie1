
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
}
