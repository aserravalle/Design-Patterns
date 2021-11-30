package StatePattern;

public class Draft implements State {
    Document doc;

    public Draft(Document doc) {
        this.doc = doc;
    }

    @Override
    public void render(String author) {
        if(doc.getApprovedAuthors().contains(author))  {
            System.out.println("Draft rendered by " + author);
        }else {
            System.out.println( author + " does  not have editing rights");
        }
    }

    @Override
    public void publish(String admin) {
        if(doc.getAdmin().equals(admin)) {
            System.out.println(admin + " has approved the draft, moving document to moderation stage");
            doc.setState(new Moderation(doc));
        }else{
            System.out.println(admin + " does not have the rights to publish this document");
        }
    }
}
