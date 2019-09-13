
public class Ashuapmushuan {

	public static void main(String[] args) {
		OrignalExperimental alice = new OrignalExperimental();
		OrignalExperimental bob = new OrignalExperimental();
		OrignalExperimental marvin = new OrignalExperimental();
		OrignalExperimental nantucket = new OrignalExperimental();
		
		alice.init();
		bob.init();
		marvin.init();
		nantucket.init();
		
		alice.setNom("Alice");
		bob.setNom("Bob");
		marvin.setNom("Marvin");
		nantucket.setNom("nantucket");
		
		System.out.println("Voici les details des orignaux");
		System.out.println(" ");
		
		alice.afficherDetails();
		System.out.println(" ");
		bob.afficherDetails();
		System.out.println(" ");
		marvin.afficherDetails();
		System.out.println(" ");
		nantucket.afficherDetails();
		
		System.out.println(" ");
		injecterModificateurDeGenes(bob,true);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Quelques jours plus tard... ");
		
		alice.afficherDetails();
		System.out.println(" ");
		bob.afficherDetails();
		System.out.println(" ");
		marvin.afficherDetails();
		System.out.println(" ");
		nantucket.afficherDetails();
		
		
		
	}
	
	public static void injecterModificateurDeGenes(OrignalExperimental orignalCible, boolean valeur) {
	
		orignalCible.setEstRadioactif(valeur);
		System.out.println("L'orignal infecté est : " + " " + orignalCible.getNom());
		
		orignalCible.setEstDemoniaque(valeur);
		
		
	}
	
}
