package Entity;

import java.util.Scanner;

public class Book {
    public int isbn;
    public String title;
    public String author;
    public int pages;

    
    public Book() {
        
    }
    
    public Book(int isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void getBook() {
        System.out.println("ISBN:    "+ this.isbn);
        System.out.println("Título:  "+ this.title);
        System.out.println("Autor:   "+ this.author);
        System.out.println("Páginas: "+ this.pages);
        System.out.println("");
    }

    public void setBook() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el <ISBN> del libro: ");
        this.isbn = Integer.parseInt(leer.nextLine());
        
        System.out.println("Ingrese el <título> del libro: ");
        this.title = leer.nextLine();
        
        System.out.println("Ingrese el <autor> del libro: ");
        this.author = leer.nextLine();
        
        System.out.println("Ingrese la <cantidad de páginas> del libro: ");
        this.pages = Integer.parseInt(leer.nextLine());
        
        System.out.println("");
    }

    
    
}
