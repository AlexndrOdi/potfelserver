package com.portfel.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vizit")
public class Vizit {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private long id;

    @Column(name = "from_ip", nullable = false)
    private String fromIP;

    @Column(name = "value", nullable = false)
    private String string;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getFromIP() {return fromIP;}

    public void setFromIP(String fromIP) {this.fromIP = fromIP;}

    public String getString() {return string;}

    public void setString(String string) {this.string = string;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}

    @Override
    public String toString() {
        return "Vizit{" +
                "id=" + id +
                ", fromIP=" + fromIP +
                ", string='" + string + '\'' +
                ", date=" + date +
                '}';
    }
}
