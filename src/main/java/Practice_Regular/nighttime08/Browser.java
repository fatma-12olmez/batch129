package Practice_Regular.nighttime08;

public class Browser {
    public static void main(String[] args) {

        String adresCubugu="Her browser'da adres cubugu vardir";

        Edge edge=new Edge();
        edge.search();
        edge.sifrekaydetme();
        edge.get();

        Edge edge2=new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);
    }


    public void get(){
        System.out.println("Browser'lar web sayfasina gider");
    }
    public void search() {
        System.out.println("Browser'lar web sayfasinda arastirma yapar");
    }
    public void sifrekaydetme() {
        System.out.println("Browser'lar istenildiginde sifreyi kaydeder");
    }
}
