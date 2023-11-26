public class main {

        public static void main(String[] args) {
//        SocieteArrayList societe = new SocieteArrayList();
//
//        Employe employe1 = new Employe(1, "Amine", "Messaoudi", "Informatique", 1);
//        Employe employe2 = new Employe(2, "Mohamed", "Ben Ali", "Gestion", 2);
//        Employe employe3 = new Employe(3, "Khadija", "Bouazizi", "Finance", 3);
//
//        societe.ajouterEmploye(employe1);
//        societe.ajouterEmploye(employe2);
//        societe.ajouterEmploye(employe3);
//
//        System.out.println("La liste des employés avant le tri :");
//        societe.displayEmploye();
//
//        societe.trierEmployeParNomDépartementEtGrade();
//
//        System.out.println("La liste des employés après le tri :");
//        societe.displayEmploye();
//
//        System.out.println("L'existence de l'employé \"Mohamed\" : " + societe.rechercherEmploye("Mohamed"));
//        System.out.println("L'existence de l'employé avec l'identifiant 2 : " + societe.rechercherEmploye("Amine"));
//        // Création de départements
//        Departement dep1 = new Departement(1, "Département A", 10);
//        Departement dep2 = new Departement(2, "Département B", 15);
//
//        // Création de la liste des départements avec HashSet
//        DepartementHashSet departementHashSet = new DepartementHashSet();
//
//        // Ajout des départements
//        departementHashSet.ajouterDepartement(dep1);
//        departementHashSet.ajouterDepartement(dep2);
//
//        // Affichage des départements
//        System.out.println("Liste des départements:");
//        departementHashSet.displayDepartement();
//
//        // Recherche d'un département par nom
//        String nomRecherche = "Département A";
//        boolean trouve = departementHashSet.rechercherDepartement(nomRecherche);
//        System.out.println("Département " + nomRecherche + " trouvé : " + trouve);
//
//        // Suppression d'un département
//        departementHashSet.supprimerDepartement(dep1);
//
//        // Affichage mis à jour des départements
//        System.out.println("Liste des départements après suppression:");
//        departementHashSet.displayDepartement();
//
//        // Tri des départements par id
//        System.out.println("Liste des départements triés par id:");
//        departementHashSet.trierDepartementById().forEach(System.out::println);


            Employe employe1 = new Employe(1, "Doe", "John", "Département A", 3);
            Employe employe2 = new Employe(2, "Smith", "Jane", "Département B", 2);

            // Création de départements
            Departement departementA = new Departement(1, "Département A", 10);
            Departement departementB = new Departement(2, "Département B", 8);

            // Utilisation de SocieteArrayList pour la gestion des employés
            SocieteArrayList societe = new SocieteArrayList();
            societe.ajouterEmploye(employe1);
            societe.ajouterEmploye(employe2);

            // Utilisation de DepartementHashSet pour la gestion des départements
            DepartementHashSet departements = new DepartementHashSet();
            departements.ajouterDepartement(departementA);
            departements.ajouterDepartement(departementB);

            // Utilisation d'AffectationHashMap pour gérer les affectations d'employés aux départements
            AffectationHashMap affectations = new AffectationHashMap();
            affectations.ajouterEmployeDepartement(employe1, departementA);
            affectations.ajouterEmployeDepartement(employe2, departementB);

            // Affichage des employés et départements affectés
            affectations.afficherEmployesEtDepartements();

            // Suppression d'un employé
            affectations.supprimerEmploye(employe1);

            // Affichage des employés restants
            affectations.afficherEmployes();

            // Affichage des départements restants
            affectations.afficherDepartements();

            // Recherche d'un employé
            System.out.println("Recherche d'employé : " + affectations.rechercherEmploye(employe2));

            // Recherche d'un département
            System.out.println("Recherche de département : " + affectations.rechercherDepartement(departementB));

            // Tri des employés par identifiant
            System.out.println("Tri des employés par identifiant : " + affectations.trierMap());


            //


        }
    }
