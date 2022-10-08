package com.gg.test08;

public class Book {
     private String title;
     private String author;
     private int examplesSold;

     @Override
     public int hashCode() {
          return examplesSold;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          Book other = (Book) obj;
          if(title != null ? !title.equals(other.title) : other.title != null) {
               return false;
          }
          return author != null ? author.equals(other.author) : other.author == null;
     }

}

