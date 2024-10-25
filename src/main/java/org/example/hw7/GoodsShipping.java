package org.example.hw7;

import java.util.Date;

public class GoodsShipping {
    private Integer documentId;
    private String goodsType;
    private Integer amountOfGoods;
    private Date dateOfDocument;

    public GoodsShipping(Integer documentId, String goodsType, Integer amountOfGoods, Date dateOfDocument) {
        this.documentId = documentId;
        this.goodsType = goodsType;
        this.amountOfGoods = amountOfGoods;
        this.dateOfDocument = dateOfDocument;
    }

    public GoodsShipping() {
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(Integer amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(Date dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    @Override
    public String toString() {
        return "GoodsShipping{" +
                "documentId=" + documentId +
                ", goodsType='" + goodsType + '\'' +
                ", amountOfGoods=" + amountOfGoods +
                ", dateOfDocument=" + dateOfDocument +
                '}';
    }

}
