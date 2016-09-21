	     Arithmétique des ordinateurs et calculs en haute précision
	         Fonenantsoa Maurica, LIM Université de La Réunion
	            TechEvent 23 sept 2016, St Denis, La réunion


============
BUT
============
Faire des caluls au mieux exacts, au moins d'une précision maitrisée.


============
PROBLEME
============
Les nombres utilisés par les ordinateurs ne sont pas des nombres réels => calculs différents.
Exemples: arithmétique entière modulo, erreurs d'arrondis des flottants.


============
SOLUTIONS
============
1) Réécrire les calculs en tenant compte de la spécificité des calculs en machines.
     + : calculs extremement rapides
     - : pas toujours facile
     
2) Pour les grands entiers, utiliser des entiers de
   précision arbitraire, cad precision uniquement limitée par la mémoire dispo. 
   
3) Pour les calculs n'utilisant que des opérations arithmétiques, utiliser les rationnels.
     + : calculs toujours exacts
     - : couteux en mémoire et en temps
     
4) Pour les nombres réels, utiliser des flottants de
   précision personnalisable, cad nombre de décimaux défini (ex Apflaot) ou type défini fixe (ex MPFR).
     - : determiner le nombre de décimaux ou le bon type pour garantir la precision
	 du résultat final peut être difficile
	 	 
5) Faire du calcul symbolique.
     + : l'analyse d'erreur ne considère que la formule finale
         car elle est la seule à être évaluée numériquement
