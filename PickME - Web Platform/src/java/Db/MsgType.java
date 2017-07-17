package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * MsgType generated by hbm2java
 */
public class MsgType  implements java.io.Serializable {


     private Integer msgTypeId;
     private String msgType;
     private Set messages = new HashSet(0);

    public MsgType() {
    }

    public MsgType(String msgType, Set messages) {
       this.msgType = msgType;
       this.messages = messages;
    }
   
    public Integer getMsgTypeId() {
        return this.msgTypeId;
    }
    
    public void setMsgTypeId(Integer msgTypeId) {
        this.msgTypeId = msgTypeId;
    }
    public String getMsgType() {
        return this.msgType;
    }
    
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
    public Set getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set messages) {
        this.messages = messages;
    }




}


