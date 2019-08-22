package com.example.fountaneclub;

public class Domain {

    private  int id;
    private String title, subtitle;
    private int image;

    public Domain(int id, String title, String subtitle, int image) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getImage() {
        return image;
    }
}
