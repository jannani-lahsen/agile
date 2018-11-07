package commande.commande;

import java.util.List;

public class Commande {
	
	private int prix_unitaire;
	private int quantite_commande;
	private String etat_commande ;
	private List <Commande> commandes;
	
	public Commande(int prix_unitaire, int quantite_commande) {
		super();
		this.prix_unitaire = prix_unitaire;
		this.quantite_commande = quantite_commande;
	}
	public int getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(int prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	public int getQuantite_commande() {
		return quantite_commande;
	}
	public void setQuantite_commande(int quantite_commande) {
		this.quantite_commande = quantite_commande;
	}
	
	public int prixTotal(int prix_unitaire , int quantite_commande) {
		return (prix_unitaire*quantite_commande);
	}
	

	public String getEtat_commande() {
		return etat_commande;
	}
	public void setEtat_commande(String etat_commande) {
		this.etat_commande = etat_commande;
	}
	public void add (Commande c) {
		this.commandes.add(c);
	}
}
