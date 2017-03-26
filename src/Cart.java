/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xiid32
 */
public class Cart {
    private int productID,stock,qnty;
    private String ProductType,Author,BrandName,Category1,Category2,Colour;
    private double price;

    public String getAuthor() {
        return Author;
    }

    public String getCategory1() {
        return Category1;
    }

    public int getQuantity(){
        return qnty;
    }
    public String getCategory2() {
        return Category2;
    }

    public String getProductType() {
        return ProductType;
    }

    public String getBrandName() {
        return BrandName;
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() {
        return productID;
    }

    public int getStock() {
        return stock;
    }
     public int getColour() {
        return stock;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setCategory1(String Category1) {
        this.Category1 = Category1;
    }

    public void setCategory2(String Category2) {
        this.Category2 = Category2;
    }

    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setQuantity(int qnty){
        this.qnty = qnty;
    }
    
}
