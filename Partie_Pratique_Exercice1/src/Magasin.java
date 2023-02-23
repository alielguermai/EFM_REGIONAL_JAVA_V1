import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Magasin {
    ArrayList<Article> liste = new ArrayList<>();
    public int indiceDe(int code){
        int indice = 0 ;
        for (Article a : liste){
            if (a.code==code)
                return indice;
            indice++;
        }
        return -1;
    }
    public void ajouter(Article a) throws IOException {
        if (liste.contains(a))
            throw new IOException("L'article appartient deja au magasin");
        liste.add(a);
    }
    public boolean supprimer(int code){
        for (Article a : liste){
            if (a.code==code) {
                liste.remove(a);
                return true;
            }
        }
        return false;
    }
    public boolean supprimer(Article a){
        if (liste.contains(a)) return false;
        liste.remove(a);
        return true;
    }
    public int nombreArticlesEnSolde(){
        return liste.size();
    }
    public void enregistrer(String chemin) throws IOException {
        FileWriter fichier = new FileWriter(chemin);
        fichier.write(liste.toString());
        fichier.close();
    }
}
