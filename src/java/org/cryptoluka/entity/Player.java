package org.cryptoluka.entity;
// Generated 21-jul-2018 5:43:51 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Player generated by hbm2java
 */
@Entity
@Table(name="player"
    ,catalog="dice"
)
public class Player  implements java.io.Serializable {


     private String idplayer;
     private String paymentid;
     private BigDecimal balance;
     private String nickname;
     private String username;
     private String password;
     private String email;
     private Date creationtime;
     private Date lastupdate;
     private Set<Rollhistory> rollhistories = new HashSet<Rollhistory>(0);

    public Player() {
    }

	
    public Player(String idplayer, String paymentid, BigDecimal balance, String nickname, String username, String password, Date creationtime) {
        this.idplayer = idplayer;
        this.paymentid = paymentid;
        this.balance = balance;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.creationtime = creationtime;
    }
    public Player(String idplayer, String paymentid, BigDecimal balance, String nickname, String username, String password, String email, Date creationtime, Date lastupdate, Set<Rollhistory> rollhistories) {
       this.idplayer = idplayer;
       this.paymentid = paymentid;
       this.balance = balance;
       this.nickname = nickname;
       this.username = username;
       this.password = password;
       this.email = email;
       this.creationtime = creationtime;
       this.lastupdate = lastupdate;
       this.rollhistories = rollhistories;
    }
   
     @Id 

    
    @Column(name="idplayer", unique=true, nullable=false, length=36)
    public String getIdplayer() {
        return this.idplayer;
    }
    
    public void setIdplayer(String idplayer) {
        this.idplayer = idplayer;
    }

    
    @Column(name="paymentid", nullable=false, length=64)
    public String getPaymentid() {
        return this.paymentid;
    }
    
    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    
    @Column(name="balance", nullable=false, precision=15, scale=8)
    public BigDecimal getBalance() {
        return this.balance;
    }
    
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    
    @Column(name="nickname", nullable=false, length=100)
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    
    @Column(name="username", nullable=false, length=70)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false, length=70)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="email", length=200)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creationtime", nullable=false, length=19)
    public Date getCreationtime() {
        return this.creationtime;
    }
    
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastupdate", length=19)
    public Date getLastupdate() {
        return this.lastupdate;
    }
    
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="player")
    public Set<Rollhistory> getRollhistories() {
        return this.rollhistories;
    }
    
    public void setRollhistories(Set<Rollhistory> rollhistories) {
        this.rollhistories = rollhistories;
    }




}


