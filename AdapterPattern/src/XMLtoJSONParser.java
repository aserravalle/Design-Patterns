public class XMLtoJSONParser implements JSONParser {
    private String fileToConvert;

    public XMLtoJSONParser(String file) {
        this.fileToConvert = file;
    }

	@Override
	public void parseJSON(String filename) {
		if(fileToConvert.contains(".xml")) {
            fileToConvert = fileToConvert.replace(".xml", ".json");
        }
	}

	@Override
	public String getFileToParse() {
		// TODO Auto-generated method stub
		return fileToConvert;
	}
}
