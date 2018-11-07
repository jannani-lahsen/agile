package commande.commande;
import java.util.List;

import commande.commande.Commande;

public class Produit {
	private String nomProduit;
	private int prixProduit;
	private int quantiteProduit;
	private List <Produit> prod;
	public Produit(String nomProduit, int prixProduit, int quantiteProduit) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.quantiteProduit = quantiteProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public int getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(int prixProduit) {
		this.prixProduit = prixProduit;
	}
	public int getQuantiteProduit() {
		return quantiteProduit;
	}
	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
	
	public void add (Produit p) {
		this.prod.add(p);
	}	

}
