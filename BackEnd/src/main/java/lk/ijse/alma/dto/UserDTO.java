package lk.ijse.alma.dto;

public class UserDTO {
    private
    int userID;
    private String userimage;
    private String userfname;
    private String userlname;
    private String useremail;
    private String useraddress;
    private String userbday;
    private String userpassword;

    public UserDTO() {
    }

    public UserDTO(int userID, String userimage, String userfname, String userlname, String useremail, String useraddress, String userbday, String userpassword) {
        this.setUserID(userID);
        this.setUserimage(userimage);
        this.setUserfname(userfname);
        this.setUserlname(userlname);
        this.setUseremail(useremail);
        this.setUseraddress(useraddress);
        this.setUserbday(userbday);
        this.setUserpassword(userpassword);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }

    public String getUserfname() {
        return userfname;
    }

    public void setUserfname(String userfname) {
        this.userfname = userfname;
    }

    public String getUserlname() {
        return userlname;
    }

    public void setUserlname(String userlname) {
        this.userlname = userlname;
    }

    public String  getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUserbday() {
        return userbday;
    }

    public void setUserbday(String userbday) {
        this.userbday = userbday;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userID='" + userID + '\'' +
                ", userimage='" + userimage + '\'' +
                ", userfname='" + userfname + '\'' +
                ", userlname='" + userlname + '\'' +
                ", useremail='" + useremail + '\'' +
                ", useraddress='" + useraddress + '\'' +
                ", userbday='" + userbday + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }
}
