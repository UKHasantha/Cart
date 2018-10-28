package lk.ijse.alma.dto;

public class CategoryDTO {
    private String catid;
    private String catdesc;

    public CategoryDTO() {
    }

    public CategoryDTO(String catid, String catdesc) {
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
        return "CategoryDTO{" +
                "catid='" + catid + '\'' +
                ", catdesc='" + catdesc + '\'' +
                '}';
    }
}
