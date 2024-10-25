package org.example.hw7;

import java.util.Date;

public class FinanceDocument {
    private Double finalAmount;
    private Date dateOfDocument;
    private Integer documentId;
    private Integer departmentId;

    public FinanceDocument(Double finalAmount, Date dateOfDocument, Integer documentId, Integer departmentId) {
        this.finalAmount = finalAmount;
        this.dateOfDocument = dateOfDocument;
        this.documentId = documentId;
        this.departmentId = departmentId;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(Date dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "FinanceDocument{" +
                "finalAmount=" + finalAmount +
                ", dateOfDocument=" + dateOfDocument +
                ", documentId=" + documentId +
                ", departmentId=" + departmentId +
                '}';
    }

    public FinanceDocument() {
    }
}
