public class StockDataProvider implements XMLParser {
    private String fileToParse;

    public StockDataProvider(String file) {
        this.fileToParse  = file;
    }

    @Override
    public void parseXML(String filename) {
        if(filename.endsWith(".xml")) {
            System.out.println(filename + " successfully parsed");
        }else {
            System.out.println("unable to parse " + filename + " incomapitable file type");
        }

    }

    public String getFileToParse() {
        return fileToParse;
    }

}
