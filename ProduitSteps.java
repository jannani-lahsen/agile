package commande.commande;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class ProduitSteps {
	Produit prod1,prod2,prod3,prod4;
	List <Produit> li = new ArrayList<Produit>();

	@Given("La création des produits avec <nom,prix,quantite>")
	public void creer_produit() {
		 prod1 = new Produit("article1",10,10);
		 prod2 = new Produit("article2",5,20);
		 prod3 = new Produit("article3",40,50);
		 prod4 = new Produit("article1",56,60);
	}

	@When("l'utilisateur selectionne les produits voulus")
	public void valider_PRODUIT() {
		li.add(prod1);
	}

	@Then("Afficher les produits selectionnees")
	public void calculer_total() {
		System.out.println(Arrays.toString(li.toArray()));
	}
}