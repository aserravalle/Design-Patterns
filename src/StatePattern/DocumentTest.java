package StatePattern;

import java.util.ArrayList;

public class DocumentTest {
    public static void main(String[] args) {
        final String administrator = "Steph";
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Shakeel");
        authors.add("Kyra");
        authors.add("Tanvee");
        authors.add("Raman");
        authors.add("Arjun");

        Document proposal = new Document(authors, administrator);
        proposal.render("Shakeel"); //Shakeel is an approved author so the draft should be successfully published
        proposal.publish("Shakeel"); //Shakeel isnt an admin, so he cant publish this
        proposal.publish(administrator); //Steph approves and sends the doc back to moderate
        proposal.render("Hugh  Janus"); //Some random ass dude whos name  sounds like anus tries to edit the doc, gets DENIED!! 
        proposal.render("Kyra");//kyra renders the moderated doc
        proposal.publish(administrator); //steph sends  doc  off to publish
        proposal.render("pppopo"); //no idea who this guy is but who cares doc is already rendered
        proposal.publish(administrator); //document is published!!! go team!
    }
    
}