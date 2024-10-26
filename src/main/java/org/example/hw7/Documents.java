package org.example.hw7;

public class Documents implements Registr {

    private Integer documentId;
    private String dateOfDocument;

    public Documents(Integer documentId, String dateOfDocument) {
        this.documentId = documentId;
        this.dateOfDocument = dateOfDocument;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(String dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public void showInfo() {
    }

    @Override
    public void saveDoc() {
        Documents documents;
        documents = null;
        Documents[] docList;
        docList = new Documents[10];
        for (int i = 0; i < docList.length; i++) {
            docList[0] = documents;
            if (docList.length > 10) {
                System.out.println("wrong number of docs");
            }
        }
    }
}