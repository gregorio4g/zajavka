package com.gg.testy.test08;

public class Book12 {
     String title;
     String author;
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
          Book12 other = (Book12) obj;
          if(title != null ? !title.equals(other.title) : other.title != null) {
               return false;
          }
          return author != null ? author.equals(other.author) : other.author == null;
     }

}

