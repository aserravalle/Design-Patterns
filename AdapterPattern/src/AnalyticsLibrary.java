public class AnalyticsLibrary implements  JSONParser {
    private String fileToParse;

    public AnalyticsLibrary(String file) {
        this.fileToParse = file;
    }

    @Override
    public void parseJSON(String filename) {
        if(filename.endsWith(".json")) {
            System.out.println(filename + " successfully parsed");
        }else {
            System.out.println("unable to parse " + filename + " incomapitable file type");
        }
    }

    public String getFileToParse() {
        return fileToParse;
    }

    public void setFileToParse(String fileToParse) {
        this.fileToParse = fileToParse;
    }


}
