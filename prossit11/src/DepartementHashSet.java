import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement t) {
        departements.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departements) {
            if (departement.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        departements.remove(t);
    }

    @Override
    public void displayDepartement() {
        for (Departement departement : departements) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedDepartements = new TreeSet<>(departements);
        return sortedDepartements;
    }
}