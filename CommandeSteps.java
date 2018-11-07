package commande.commande;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class CommandeSteps {
	Commande commande;
	private String etat;

	@Given("La créattion d'une commande avec <prix,quantite>")
	public void creer_commande() {
		 commande = new Commande(10,10);
	}

	@When("l'utilisateur le valide")
	public void valider_commande() {
		commande.setEtat_commande("valide");
		assertEquals("valide",commande.getEtat_commande());
	}

	@Then("Le prix total se calcule automatiquement")
	public void calculer_total() {
		assertEquals(100,commande.prixTotal(10, 10));
	}
}