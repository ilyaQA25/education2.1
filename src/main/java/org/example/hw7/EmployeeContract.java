package org.example.hw7;

import java.util.Calendar;
import java.util.Date;

public class EmployeeContract extends Documents {
    private String endOfContract;
    private String nameEmployee;


    public EmployeeContract(Integer documentId, String dateOfDocument, String endOfContract, String nameEmployee) {
        super(documentId, dateOfDocument);
        this.endOfContract = endOfContract;
        this.nameEmployee = nameEmployee;
    }

    public EmployeeContract(Integer documentId, String dateOfDocument) {
        super(documentId, dateOfDocument);
    }

    @Override
    public void showInfo() {
        System.out.println("EmployeeContract: endOfContract= " + endOfContract + ", nameEmployee=" + nameEmployee + ", docId= " + getDocumentId() + ", dateOfDoc= " + getDateOfDocument());
        super.showInfo();
    }
}

