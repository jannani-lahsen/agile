#Author: lahsen jannani
Feature: Sélectionner des produits

 En tant qu’utilisateur, j’aimerais sélectionner des produits
  Scenario: Sélectionner des produits 
  Given La création des produits avec <nom,prix,quantite> 
  When  l'utilisateur selectionne les produits voulus
  Then  Afficher les produits selectionnees
  
  