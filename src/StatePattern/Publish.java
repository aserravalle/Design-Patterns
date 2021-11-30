package StatePattern;

public class Publish implements State{
    Document doc;

    public Publish(Document doc) {
        this.doc = doc;
    }

    @Override
    public void render(String author) {
        System.out.println("Document has already been rendered, now ready to be published");

    }

    @Override
    public void publish(String admin) {
        if(doc.getAdmin().equals(admin)) {
            System.out.println(admin + " has  officially published the document");
        }else{
            System.out.println(admin + " does not have the rights to publish this document");
        }
    }

}
