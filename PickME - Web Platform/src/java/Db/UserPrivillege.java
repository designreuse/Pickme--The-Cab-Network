package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * UserPrivillege generated by hbm2java
 */
public class UserPrivillege  implements java.io.Serializable {


     private String userPrivillegeUri;
     private String userPrivillegeName;
     private Set userTypeHasUserPrivilleges = new HashSet(0);

    public UserPrivillege() {
    }

	
    public UserPrivillege(String userPrivillegeUri) {
        this.userPrivillegeUri = userPrivillegeUri;
    }
    public UserPrivillege(String userPrivillegeUri, String userPrivillegeName, Set userTypeHasUserPrivilleges) {
       this.userPrivillegeUri = userPrivillegeUri;
       this.userPrivillegeName = userPrivillegeName;
       this.userTypeHasUserPrivilleges = userTypeHasUserPrivilleges;
    }
   
    public String getUserPrivillegeUri() {
        return this.userPrivillegeUri;
    }
    
    public void setUserPrivillegeUri(String userPrivillegeUri) {
        this.userPrivillegeUri = userPrivillegeUri;
    }
    public String getUserPrivillegeName() {
        return this.userPrivillegeName;
    }
    
    public void setUserPrivillegeName(String userPrivillegeName) {
        this.userPrivillegeName = userPrivillegeName;
    }
    public Set getUserTypeHasUserPrivilleges() {
        return this.userTypeHasUserPrivilleges;
    }
    
    public void setUserTypeHasUserPrivilleges(Set userTypeHasUserPrivilleges) {
        this.userTypeHasUserPrivilleges = userTypeHasUserPrivilleges;
    }




}


