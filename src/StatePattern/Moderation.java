package StatePattern;

public class Moderation implements State {
    Document doc;

    public Moderation(Document doc) {
        this.doc = doc;
    }

    @Override
    public void render(String author) {
        if(doc.getApprovedAuthors().contains(author))  {
            System.out.println("Moderated document rendered by " + author);
        }else {
            System.out.println( author + " does  not have editing rights");
        }

    }

    @Override
    public void publish(String admin) {
        if(doc.getAdmin().equals(admin)) {
            System.out.println(admin + " has approved the moderated document, it is now  ready to be published");
            doc.setState(new Publish(doc));
        }else{
            System.out.println(admin + " does not have the rights to publish this document");
        }
    }

}
