#Author: lahsen jannani
Feature: Calcul prix Total

 En tant qu’utilisateur, j’aimerais que quand je fournis la quantité et le prix unitaire d’un
produit , le total de la commande s’affiche
  Scenario Outline:: Calcul automatique du prix total  
  Given La créattion d'une commande avec <prix,quantite> 
  When  l'utilisateur le valide 
  Then  Le prix total se calcule automatiquement
  
  
Examples: 
  
      | prix | quantite | total  |
      | 10   |     10   |  150   |