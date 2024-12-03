/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private ArrayList<String> authors =new ArrayList();

    public Book(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    
     public void addAuthor(String authorName) {
        boolean a=false;
        for (String author : authors){
            if (author.equals(authorName)){
                a=true;
                System.out.println("Error, cannot add authorname!");
            }
        }
        if (a==false) authors.add(authorName);
    }
    public void removeAuthor(String authorName) {
        boolean a=false;
        for (String author : authors){
            if (author.equals(authorName)){
                a=true;
                authors.remove(authorName);
                System.out.println("Remove success!");
            }
        }
        if (a==false) authors.add(authorName);
    }
}
