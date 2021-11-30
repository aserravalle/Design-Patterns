public class AdapterTest {
    public static void main(String[] args) {
        StockDataProvider xmlsender = new StockDataProvider("data.xml");
        AnalyticsLibrary jsonreceiver = new AnalyticsLibrary("");
        //sender should be able to parse the xmlfile passed
        xmlsender.parseXML(xmlsender.getFileToParse());
        //shouldnt work since the file received from the provider is of type xml
        jsonreceiver.parseJSON(xmlsender.getFileToParse());
        //use an adapter to convert file from .xml to .json 
        XMLtoJSONParser adapter = new XMLtoJSONParser(xmlsender.getFileToParse());
        //parse the converted file which should work now
        adapter.parseJSON(adapter.getFileToParse());
        jsonreceiver.parseJSON(adapter.getFileToParse());
    }
}
