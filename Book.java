public class Book {
    public String Pealkiri;
    public String Autor;
    public int lk_arv;
    public int aasta;
    public float review;

    public Book(String pealkiri, String autor, int lk_arv, int aasta, float review) {
        Pealkiri = pealkiri;
        Autor = autor;
        this.lk_arv = lk_arv;
        this.aasta = aasta;
        this.review = review;
    }

    public String getPealkiri() {
        return Pealkiri;
    }

    public void setPealkiri(String pealkiri) {
        Pealkiri = pealkiri;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getLk_arv() {
        return lk_arv;
    }

    public void setLk_arv(int lk_arv) {
        this.lk_arv = lk_arv;
    }

    public int getAasta() {
        return aasta;
    }

    public void setAasta(int aasta) {
        this.aasta = aasta;
    }

    public float getReview() {
        return review;
    }

    public void setReview(float review) {
        this.review = review;
    }
}
