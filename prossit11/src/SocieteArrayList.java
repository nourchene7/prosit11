import java.util.ArrayList;
import java.util.Comparator;
public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        this.employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : this.employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return this.employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        this.employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : this.employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        this.employes.sort(Comparator.comparing(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        this.employes.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getDepartement)
                .thenComparing(Employe::getGrade));
    }
}