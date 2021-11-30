import java.util.ArrayList;

public class Document {
    private State currState;
    private String admin;
    private ArrayList<String> approvedAuthors;
    
    public Document(ArrayList<String> authors, String admin) {
        this.approvedAuthors = authors;
        this.admin = admin;
        this.currState  = new Draft(this);
    } 

    public void render(String author) {
        currState.render(author);
    }

    public void publish(String admin) {
        currState.publish(admin);
    }

    public void setState(State s) {
        this.currState = s;
    }

    public State getCurrState() {
        return currState;
    }

    public void setCurrState(State currState) {
        this.currState = currState;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public ArrayList<String> getApprovedAuthors() {
        return approvedAuthors;
    }

    public void setApprovedAuthors(ArrayList<String> approvedAuthors) {
        this.approvedAuthors = approvedAuthors;
    }

    
}
