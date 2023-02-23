import java.util.Objects;

public class Article {
    int code;
    Double prix_origine;

    public Article(int code, Double prix_origine) {
        this.code = code;
        this.prix_origine = prix_origine;
    }

    @Override
    public String toString() {
        return "Article{" +
                "code=" + code +
                "; prix_origine=" + prix_origine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false;
        return code == article.code ;
    }

    public Double prixArticle(){
        return prix_origine;
    }
}
