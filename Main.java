import java.util.ArrayList;

class Library{
    String nameOfUser;
   ArrayList <String> books = new ArrayList<>();
   ArrayList<String> issuedBooks = new ArrayList<>();
   public Library(String name){
      this.nameOfUser = name;
   }
   public void addBook(String book_name){
       if(!books.contains(book_name)){
           books.add(book_name);
           System.out.printf("%s Book added to library successfully by %s!!\n",book_name,this.nameOfUser);
       }
       else{
           System.out.println("Book already present in library!!");
       }


   }
    public void borrowBook(String book_name){
        if(books.remove(book_name)){
            issuedBooks.add(book_name);
            System.out.printf("%s given to the borrower successfully by %s!!\n", book_name, this.nameOfUser);
        }
        else{
            System.out.println("Book not found!");
        }
    }
    public void removeBook(String book_name){
        if(books.remove(book_name)) {

        System.out.printf("%s Book removed from library successfully by %s!!\n",book_name,this.nameOfUser);
    }
        else{
            System.out.println("Book not present!!");

        }

    }
    public void returnedBook(String book_name){
       if(issuedBooks.remove(book_name)){
        books.add(book_name);
        System.out.printf("%s Book returned by the borrower successfully by %s!!\n",book_name,this.nameOfUser);
    }
       else{
           System.out.println("Book not present");
       }

       }
    public void availableBooks(){
        System.out.println("Available Books:");
        for(String book : books){
            System.out.println("- " + book);
        }
    }


}

public class Main{
    public static void main(String[] args) {

        Library Raju = new Library("Raju");

        Raju.addBook("Atomic Habbits");

        Raju.availableBooks();


    }
}