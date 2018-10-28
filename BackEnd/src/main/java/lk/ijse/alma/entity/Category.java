package lk.ijse.alma.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    private
    String catid;
    private String catdesc;

    public Category() {
    }

    public Category(String catid, String catdesc) {
        this.setCatid(catid);
        this.setCatdesc(catdesc);
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid;
    }

    public String getCatdesc() {
        return catdesc;
    }

    public void setCatdesc(String catdesc) {
        this.catdesc = catdesc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catid='" + catid + '\'' +
                ", catdesc='" + catdesc + '\'' +
                '}';
    }
}
