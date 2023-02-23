import java.io.IOException;

public class ArticleEnSolde extends Article{
    private int remise;

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) throws IOException {
        if (remise<0 || remise>90)
            throw new IOException("La remise doit etre comprise dans l'intervalle [0,90]");
        this.remise = remise;
    }

    public ArticleEnSolde(int code, Double prix_origine, int remise) throws IOException {
        super(code, prix_origine);
        if (remise<0 || remise>90)
            throw new IOException("La remise doit etre comprise dans l'intervalle [0,90]");
        this.remise=remise;
    }

    @Override
    public Double prixArticle() {
        return prix_origine*(remise/100);
    }

    @Override
    public String toString() {
        return "ArticleEnSolde{" +
                "remise=" + remise +
                "; code=" + code +
                "; prix_origine=" + prix_origine +
                "} ";
    }
}
