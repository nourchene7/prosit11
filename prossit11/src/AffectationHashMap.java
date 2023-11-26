import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;


public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            System.out.println("Employé ajouté au département : " + e.getNom() + " -> " + d.getNom());
        } else {
            System.out.println("Cet employé est déjà affecté à un département !");
        }
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            Employe e = entry.getKey();
            Departement d = entry.getValue();
            System.out.println("Employé : " + e.getNom() + ", Département : " + d.getNom());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Employé supprimé : " + e.getNom());
        } else {
            System.out.println("Cet employé n'est pas présent dans la liste !");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " du département " + d.getNom() + " supprimé !");
        } else {
            System.out.println("Cet employé ne travaille pas dans ce département !");
        }
    }

    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println("Employé : " + e.getNom());
        }
    }

    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println("Département : " + d.getNom());
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>(new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.getId() - e2.getId();
            }
        });
        treeMap.putAll(affectations);
        return treeMap;
    }

}
