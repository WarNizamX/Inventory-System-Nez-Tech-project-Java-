
package com.crud.project;

public class books {
    int id;
    String bookName;
    String bookDesc;
    String authName;
    String cat;

    public books() {
    }

    public books(int id, String bookName, String bookDesc, String authName, String cat) {
        this.id = id;
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.authName = authName;
        this.cat = cat;
    }

    public books(String bookName, String bookDesc, String authName, String cat) {
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.authName = authName;
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "books{" + "id=" + id + ", bookName=" + bookName + ", bookDesc=" + bookDesc + ", authName=" + authName + ", cat=" + cat + '}';
    }
    
    
}

