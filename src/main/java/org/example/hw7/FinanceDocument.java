package org.example.hw7;

import java.util.Date;

public class FinanceDocument extends Documents {
    private Double finalAmount;
    private Integer departmentId;

    public FinanceDocument(Integer documentId, String dateOfDocument, Double finalAmount, Integer departmentId) {
        super(documentId, dateOfDocument);
        this.departmentId = departmentId;
        this.finalAmount = finalAmount;
    }

    public FinanceDocument(Integer documentId, String dateOfDocument) {
        super(documentId, dateOfDocument);
    }

    @Override
    public void showInfo() {
        System.out.println("FinanceDocument: finalAmount= " + finalAmount + ", departmenId=" + departmentId + ", docId= " + getDocumentId() + ", dateOfDoc= " + getDateOfDocument());
        super.showInfo();
    }
}
