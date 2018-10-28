package lk.ijse.alma.dto;

public class AdminDTO {
    private String adminID;
    private String adminname;
    private String adminemail;
    private String adminpassword;

    public AdminDTO() {
    }

    public AdminDTO(String adminID, String adminname, String adminemail, String adminpassword) {
        this.setAdminID(adminID);
        this.setAdminname(adminname);
        this.setAdminemail(adminemail);
        this.setAdminpassword(adminpassword);
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "adminID='" + adminID + '\'' +
                ", adminname='" + adminname + '\'' +
                ", adminemail='" + adminemail + '\'' +
                ", adminpassword='" + adminpassword + '\'' +
                '}';
    }
}
