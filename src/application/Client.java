package application;

public class Client {
 String nom,prenom;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public Client(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
 
}
