package ru.catwarden.sltest;

import java.sql.Date;
import java.text.SimpleDateFormat;

// class for console data output
public class BirthdayWithIndex {
    private int index;
    private String name;
    private String date;

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public BirthdayWithIndex(int index, String name, Date date){
        this.index = index;
        this.name = name;
        this.date = FORMAT.format(date);
    }

    public String getName(){
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getIndex() {
        return index;
    }
}


