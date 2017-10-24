package com.company;

import java.util.ArrayList;

public class NewsPaper {

    private String brand;
    private String newsTitle;
    private Article article;

    ArrayList<Article> articleArrayList= new ArrayList<> (  );

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }


    public NewsPaper()
    {
        article= new Article ();
    }

    public void addArticle(Article article)
    {
        articleArrayList.add ( article );
    }


}
