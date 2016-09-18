package com.dobrenok.config.ent;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
public class EvengerEntity {


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private long id;

    @Column(name = "title",nullable = false,length = 50)
    private String title;

    @Column(name = "dateCreate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateCreate;

    public EvengerEntity() {

    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setId(long id) {

        this.id = id;
    }

    public Date getDateCreate() {

        return dateCreate;
    }

    public String getTitle() {

        return title;
    }

    public long getId() {

        return id;
    }
}
