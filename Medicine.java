/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ABC TRADERS
 */
public class Medicine {
    private int id, quantity,sellingprice, buyingprice;
    private String name, description;

    public Medicine() {
          this.id = 0;
        this.sellingprice = 0;
        this.buyingprice = 0;
        this.name = "";
        this.description = "";
        this.quantity=0;
    }

    public Medicine(int id, int sellingprice, int buyingprice, String name, String description, int quantity) {
        this.id = id;
        this.sellingprice = sellingprice;
        this.buyingprice = buyingprice;
        this.name = name;
        this.description = description;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(int sellingprice) {
        this.sellingprice = sellingprice;
    }

    public int getBuyingprice() {
        return buyingprice;
    }

    public void setBuyingprice(int buyingprice) {
        this.buyingprice = buyingprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", sellingprice=" + sellingprice + ", buyingprice=" + buyingprice + ", name=" + name + ", description=" + description + '}';
    }
    
}
