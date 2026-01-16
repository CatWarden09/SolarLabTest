package ru.catwarden.sltest;


import java.sql.Date;
import java.util.List;

public class Controller {
    private Database db;

    public Controller(Database db){
        this.db = db;
    }

    public List<Birthday> getAllBirthdayList(){
        return db.getAllBirthdays();
    }

    public void setNewBirthday(String name, String year, String month, String day){


        Date date_parsed = Date.valueOf(year + "-" + month + "-" + day);

        Birthday birthday = new Birthday(name, date_parsed);

        db.setNewBirthday(birthday.getName(), birthday.getDate());

    }
}
