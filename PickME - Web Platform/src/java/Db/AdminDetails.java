package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * AdminDetails generated by hbm2java
 */
public class AdminDetails  implements java.io.Serializable {


     private Integer adminDetailsId;
     private Gender gender;
     private String firstname;
     private String lastname;
     private String mobile;
     private Set administrators = new HashSet(0);

    public AdminDetails() {
    }

	
    public AdminDetails(Gender gender) {
        this.gender = gender;
    }
    public AdminDetails(Gender gender, String firstname, String lastname, String mobile, Set administrators) {
       this.gender = gender;
       this.firstname = firstname;
       this.lastname = lastname;
       this.mobile = mobile;
       this.administrators = administrators;
    }
   
    public Integer getAdminDetailsId() {
        return this.adminDetailsId;
    }
    
    public void setAdminDetailsId(Integer adminDetailsId) {
        this.adminDetailsId = adminDetailsId;
    }
    public Gender getGender() {
        return this.gender;
    }
    
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Set getAdministrators() {
        return this.administrators;
    }
    
    public void setAdministrators(Set administrators) {
        this.administrators = administrators;
    }




}


