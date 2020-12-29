# tp5
 
********* Réponse étape 5 *********

- WEB

La dépendance spring-web contient des utilitaires Web partagés pour les environnements Servlet et Portlet, tandis que spring-webmvc permet la prise en charge MVC pour les environnements Servlet.

Étant donné que spring-webmvc contient spring-web en tant que dépendance, la spécification explicite de Spring-web n'est pas requise lors de l'utilisation de spring-webmvc.


- JPA 

Spring Boot JPA est une spécification Java pour la gestion des données relationnelles dans les applications Java. Il nous permet d'accéder et de conserver les données entre l'objet / classe Java et la base de données relationnelle. JPA suit le mappage objet-relation (ORM). C'est un ensemble d'interfaces. ... L'API Java Persistence.


- HIBERNATE

Hibernate comprend les mappages que nous ajoutons entre les objets et les tables. Il garantit que les données sont stockées / extraites de la base de données en fonction des mappages. Hibernate fournit également des fonctionnalités supplémentaires en plus de JPA. Mais dépendre d'eux signifierait un verrouillage pour Hibernate.

- H2 

H2 est un système de gestion de base de données relationnelle open source créé entièrement en Java. Il peut être intégré dans des applications Java ou s'exécuter en mode client-serveur.

- DevTools

DevTools signifie Developer Tool. Le but du module est d'essayer d'améliorer le temps de développement tout en travaillant avec l'application Spring Boot. Spring Boot DevTools récupère les modifications et redémarre l'application.

- Thymeleaf

Thymeleaf est une bibliothèque Java. Il s'agit d'un moteur de template XML / XHTML / HTML5 capable d'appliquer un ensemble de transformations aux fichiers de template afin d'afficher les données et / ou le texte produit par vos applications. Permet de créer une application Web simple à l'aide de Spring Boot, de Tomcat intégré, du moteur de modèle Thymeleaf et de JPA.

********* Réponse étape 13 *********

 - 1- @GetMapping("/greeting")
 - 2- return "greeting";
 - 3- on le récupere avec : @RequestParam(name="name",required=false, defaultValue="World") et on l'envoie avec : model.addAttribute("nomTemplate", nameGET);


********* Réponse étape 17 *********

La table adresse a été créé

********* Réponse étape 18 *********

Grâca aux annotation ajoutées Hibernate accéde à la base de donnée et créer la table . 

********* Réponse étape 20 *********

Oui on voit tous le contenus de la table adresse .

********* Réponse étape 23 *********

@Autowire : Annotation qui  permet de faire l’injection de dépendances entre les beans de l’application . 

********* Réponse étape 6 partie 2 ********* 

 * oui il faut une clé API pour appeler OpenWeatherMap
 * http://api.openweathermap.org/data/2.5/weather?lon=%f&lat=%f&appid=%s&lang=fr&units=metric
 * POST 
 * url = String.format("http://api.openweathermap.org/data/2.5/weather?lon=%f&lat=%f&appid=%s&lang=fr&units=metric", lat, lon, MeteoController.KEY_API );
 * pour la temperature on la trouve dans : main --> temp 
 * pour la prévision on la trouve dans : weather --> description

Lien github : 
https://github.com/Manoucha/tp5.git
