package org.example.hw7;

import org.example.NegativeNumberExeption;

public class Main {
    public static void main(String[] args) {
        Documents employeeContract = new EmployeeContract(12,
                "reewe", "wer23", "erte");
        Documents financeDocument = new FinanceDocument(243, "235",
                345.9, 34);
        Documents goodsShipping = new GoodsShipping(12, "rew", "wer", 234);

        goodsShipping.showInfo();
        employeeContract.showInfo();
        financeDocument.showInfo();

        financeDocument.saveDoc(financeDocument, goodsShipping);

    }
}

