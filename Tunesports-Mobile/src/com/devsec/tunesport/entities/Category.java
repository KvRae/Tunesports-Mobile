package com.devsec.tunesport.entities;

public class Category {
    private int id ;
    private String name_cat ;
    private String desc_cat ;

    public Category(int id, String name_cat , String desc_cat ) {
        this.id = id;
        this.name_cat = name_cat;
        this.desc_cat = desc_cat;
    }

    public Category(String name_cat, String desc_cat ) {
        this.name_cat = name_cat;
        this.desc_cat = desc_cat;
    }

    public Category() {
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNomCat() {
        return name_cat;
    }
    public void setNomCat(String name_cat) {
        this.name_cat = name_cat;
    }
    public String getDescCat() {
        return desc_cat;
    }
    public void setDescCat(String desc_cat) {
        this.desc_cat = desc_cat;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name_cat=" + name_cat + ", desc_cat=" + desc_cat + '}';
    }

}

