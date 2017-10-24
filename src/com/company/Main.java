package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

         Scanner keyboard= new Scanner (System.in);
         String answer;

        NewsPaper  newsPaper = new NewsPaper ();
        Article article = new Article ();

        newsPaper.setArticle ( article );
        System.out.println ("Enter the title of the News paper: " );

        newsPaper.setNewsTitle ( keyboard.nextLine ());

        do{
            System.out.println ("Enter the Date of the Article: " );
            article.setDate ( keyboard.nextLine () );

            System.out.println ("Enter the title of the article: " );
            article.setTitle ( keyboard.nextLine () );
            System.out.println ("Do you want to add another article?(yes/no)" );
            answer= keyboard.nextLine ();
            newsPaper.addArticle ( article );
        }while(answer.equalsIgnoreCase ( "yes" )||!answer.equalsIgnoreCase ( "no" ));


        newsPaper.setBrand ( "Brand of the news paper " );


        System.out.println ( newsPaper.getNewsTitle () );

        System.out.println ("========================================" );
        for(Article article1: newsPaper.articleArrayList){
            System.out.println (" ARTICLE " );
            System.out.println ( article1.getTitle () );
            System.out.println (article1.getDate () );
        }

    }
}
