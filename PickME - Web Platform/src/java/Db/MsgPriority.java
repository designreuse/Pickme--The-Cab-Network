package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * MsgPriority generated by hbm2java
 */
public class MsgPriority  implements java.io.Serializable {


     private Integer msgPriorityId;
     private String msgPriority;
     private Set messages = new HashSet(0);

    public MsgPriority() {
    }

    public MsgPriority(String msgPriority, Set messages) {
       this.msgPriority = msgPriority;
       this.messages = messages;
    }
   
    public Integer getMsgPriorityId() {
        return this.msgPriorityId;
    }
    
    public void setMsgPriorityId(Integer msgPriorityId) {
        this.msgPriorityId = msgPriorityId;
    }
    public String getMsgPriority() {
        return this.msgPriority;
    }
    
    public void setMsgPriority(String msgPriority) {
        this.msgPriority = msgPriority;
    }
    public Set getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set messages) {
        this.messages = messages;
    }




}


