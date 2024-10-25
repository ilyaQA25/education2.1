package org.example.hw7;

import java.util.Calendar;
import java.util.Date;

public class EmployeeContract {
    private Integer documentId;
    private Calendar endOfContract;
    private Date dateOfDocument; //дата док-та, когда был заключен документ
    private String nameEmployee;

    public EmployeeContract(Integer documentId, Calendar endOfContract, Date dateOfDocument, String nameEmployee) {
        this.documentId = documentId;
        this.endOfContract = endOfContract;
        this.dateOfDocument = dateOfDocument;
        this.nameEmployee = nameEmployee;
    }

    public EmployeeContract() {
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Calendar getEndOfContract() {
        return endOfContract;
    }

    public void setEndOfContract(Calendar endOfContract) {
        this.endOfContract = endOfContract;
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(Date dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }
}
