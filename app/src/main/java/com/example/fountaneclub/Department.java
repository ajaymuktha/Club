package com.example.fountaneclub;

import android.widget.Button;

public class Department  {


    private  int id;
    private  String title, shortdesc;

    private int image;

    public Department(int id, String title, String shortdesc, Button button1, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
    }

    public Department(int i, String department_of, String user_experience, int user_experience1) {

    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }



    public int getImage() {
        return image;
    }
}
