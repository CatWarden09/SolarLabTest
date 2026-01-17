package ru.catwarden.sltest;

import java.sql.Date;

// class for fetching the data from the DB
public class Birthday {
    private String name;
    private Date date;

    public Birthday(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return name;
    }

    public Date getDate() {
        return date;
    }
}
