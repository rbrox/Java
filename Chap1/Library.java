import java.util.Scanner;



class book{
    String title;
    String author;
    int pages;
    int num;
    String language;

    public book(String title, String author, int pages, int num, String language){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.num = num;
        this.language = language;
    }

   
};

class Library{
    public static void main(String[] args){
        System.out.println("Welcome to the Library");
        System.out.println("*************************");
        System.out.println("1. Add a book, 2. Remove a book, 3. List all books, 4. Quit, 5. Search for a book");
        System.out.println("*************************");
        System.out.println("What would you like to do?");


        Scanner sc = new Scanner(System.in);        
        int choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("Enter the title of the book");
                String title = sc.next();
                System.out.println("Enter the author of the book");
                String author = sc.next();
                System.out.println("Enter the number of pages in the book");
                int pages = sc.nextInt();
                System.out.println("Enter the number of copies of the book");
                int num = sc.nextInt();
                System.out.println("Enter the language of the book");
                String language = sc.next();

                book b = new book(title, author, pages, num, language);

                System.out.println("Book added successfully");
                break;
        }

    }
}