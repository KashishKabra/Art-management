/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ALLCLASS;

/**
 *
 * @author Manya
 */
public class Gallery {
    private String gid;
    private String gname;
    private String location;
    private String contactDetails;

    public Gallery() {
        this.gid = "";
        this.gname = "";
        this.location = "";
        this.contactDetails = "";
    }

    public Gallery(String gid, String gname, String location, String contactDetails) {
        this.gid = gid;
        this.gname = gname;
        this.location = location;
        this.contactDetails = contactDetails;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
    
}
