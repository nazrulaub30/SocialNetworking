package com.social.entity;
// Generated Apr 24, 2017 9:29:38 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Friend generated by hbm2java
 */
@Entity
@Table(name="friend"
    ,catalog="socialsite"
)
public class Friend  implements java.io.Serializable {


     private Long friendId;
     private Users usersByUserId1;
     private Users usersByUserId2;
     private int status;

    public Friend() {
    }

    public Friend(Users usersByUserId1, Users usersByUserId2, int status) {
       this.usersByUserId1 = usersByUserId1;
       this.usersByUserId2 = usersByUserId2;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="friend_id", unique=true, nullable=false)
    public Long getFriendId() {
        return this.friendId;
    }
    
    public void setFriendId(Long friendId) {
        this.friendId = friendId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id_1", nullable=false)
    public Users getUsersByUserId1() {
        return this.usersByUserId1;
    }
    
    public void setUsersByUserId1(Users usersByUserId1) {
        this.usersByUserId1 = usersByUserId1;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id_2", nullable=false)
    public Users getUsersByUserId2() {
        return this.usersByUserId2;
    }
    
    public void setUsersByUserId2(Users usersByUserId2) {
        this.usersByUserId2 = usersByUserId2;
    }

    
    @Column(name="status", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }




}


