
public class OrignalExperimental {
	private String nom;
	private int nombreDeTetes;
	private int nombreDeYeux;
	private int nombreDePattes;
	private static boolean estRadioactif;
	private boolean estDemoniaque;
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNombreDeTetes() {
		return nombreDeTetes;
	}


	public void setNombreDeTetes(int nombreDeTetes) {
		this.nombreDeTetes = nombreDeTetes;
	}


	public int getNombreDeYeux() {
		return nombreDeYeux;
	}


	public void setNombreDeYeux(int nombreDeYeux) {
		this.nombreDeYeux = nombreDeYeux;
	}


	public int getNombreDePattes() {
		return nombreDePattes;
	}


	public void setNombreDePattes(int nombreDePattes) {
		this.nombreDePattes = nombreDePattes;
	}


	public static boolean isEstRadioactif() {
		return estRadioactif;
	}


	public static void setEstRadioactif(boolean estRadioactif) {
		OrignalExperimental.estRadioactif = estRadioactif;
	}


	public boolean isEstDemoniaque() {
		return estDemoniaque;
	}


	public void setEstDemoniaque(boolean estDemoniaque) {
		this.estDemoniaque = estDemoniaque;
	}

	public void init ()
	{
		nombreDeTetes = 1;
		nombreDeYeux = 2;
		nombreDePattes = 4;
		estRadioactif = false;
		estDemoniaque = false;
		
	}
	
	public OrignalExperimental() {
		init();
		}
	
	public void afficherDetails () {
		System.out.println("L'orignal s'appelle" + " " + nom);
		System.out.println("L'orignal a" + " " + nombreDeTetes + " " + "Tetes");
		System.out.println("L'orignal a" + " " + nombreDeYeux + " " + "Yeux");
		System.out.println("L'orignal a" + " " + nombreDePattes + " " + "Pattes");
		System.out.println("L'orignal est" + " " + estRadioactif);
		System.out.println("L'orignal est" + " " + estDemoniaque);
	}

}	

 