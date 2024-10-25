package org.example.hw7;

public class GoodsShipping extends Documents {
    private String goodsType;
    private Integer amountOfGoods;

    public GoodsShipping(Integer documentId, String dateOfDocument, String goodsType, Integer amountOfGoods) {
        super(documentId, dateOfDocument);
        this.amountOfGoods = amountOfGoods;
        this.goodsType = goodsType;

    }

    public GoodsShipping(Integer documentId, String dateOfDocument) {
        super(documentId, dateOfDocument);
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

    @Override
    public String toString() {
        return "GoodsShipping{" + "goodsType='" + goodsType + '\'' + ", amountOfGoods=" + amountOfGoods + '}';
    }

    @Override
    public void showInfo() {
        System.out.println("GoodsShipping: goodsType= " + goodsType + ", amountOfGoods=" + amountOfGoods + ", docId= " + getDocumentId() + ", dateOfDoc= " + getDateOfDocument());
        super.showInfo();
    }
/* public void showInfo(){
        System.out.println("GoodsShipping: goodsType= "+goodsType + ", amountOfGoods="+ amountOfGoods + ", docId= " + getDocumentId()+", dateOfDoc= "+getDateOfDocument() );
    }*/
}
