package lk.ijse.alma.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Item {
    @Id
    private
    String itemcode;
    private String itemimage;
    private String itemname;
    private String itemdesc;
    private String itemmanudate;
    private String itemexdate;
    private double itemprice;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    public Item() {
    }

    public Item(String itemcode, String itemimage, String itemname, String itemdesc, String itemmanudate, String itemexdate, double itemprice, Category category) {
        this.itemcode = itemcode;
        this.itemimage = itemimage;
        this.itemname = itemname;
        this.itemdesc = itemdesc;
        this.itemmanudate = itemmanudate;
        this.itemexdate = itemexdate;
        this.itemprice = itemprice;
        this.category = category;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemimage() {
        return itemimage;
    }

    public void setItemimage(String itemimage) {
        this.itemimage = itemimage;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    public String getItemmanudate() {
        return itemmanudate;
    }

    public void setItemmanudate(String itemmanudate) {
        this.itemmanudate = itemmanudate;
    }

    public String getItemexdate() {
        return itemexdate;
    }

    public void setItemexdate(String itemexdate) {
        this.itemexdate = itemexdate;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemcode='" + itemcode + '\'' +
                ", itemimage='" + itemimage + '\'' +
                ", itemname='" + itemname + '\'' +
                ", itemdesc='" + itemdesc + '\'' +
                ", itemmanudate='" + itemmanudate + '\'' +
                ", itemexdate='" + itemexdate + '\'' +
                ", itemprice=" + itemprice +
                ", category=" + category +
                '}';
    }
}
