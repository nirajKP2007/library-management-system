abstract class CentralLibrarySystem{
    abstract void addBook(String bookName);
    abstract void issueBook(String bookName);
    abstract void returnBook(String bookName);

}

class ManagingSoftware extends CentralLibrarySystem{

    String [] availableBooks = new String[100];
    int numOfGivenBooks;
    int noOfBooks;
    String [] givenBooks = new String[100];
    void addBook(String Book){
        for (int i = 0;i<noOfBooks;i++){
            if (availableBooks[i].equalsIgnoreCase(Book)){
                System.out.println("Book already Present!!");
                return;
            }
            }
        System.out.println("Book added successfully!!");
        availableBooks[noOfBooks] = Book;
        noOfBooks ++;
        }
    void issueBook(String Book){

        for (int i =0;i<noOfBooks;i++){
            if (availableBooks[i].equalsIgnoreCase(Book)){

                System.out.println(Book + " book issued successfully");
                for (int m = i;m<noOfBooks-1;m++){
                    availableBooks[m] = availableBooks[m+1];
                }
                availableBooks[noOfBooks-1] = null;

                givenBooks[numOfGivenBooks] = Book;
                numOfGivenBooks ++;
                noOfBooks  --;
                return;
            }
        }


        System.out.println("Book not present");}

    void returnBook(String Book){
        for (int k = 0; k < numOfGivenBooks;k++){
         if (givenBooks[k].equalsIgnoreCase(Book))  {
        System.out.println( givenBooks[k] + " book returned to the library successfully!!");
        availableBooks[noOfBooks] = Book;
             for (int y = k;y<numOfGivenBooks-1;y++){
                 givenBooks[y] = givenBooks[y+1];
             }
             numOfGivenBooks --;
             noOfBooks ++;
             return;
    }



        }
        System.out.println(Book + " Book was not borrowed before");
    }
    void availableBooks(){
        System.out.println("Available Books");
        for (String elements:availableBooks){
            if (elements != null) {

                System.out.println("*" + elements);
            }
        }
    }

}


public class Main2{
    public static void main(String[] args) {
        ManagingSoftware mS = new ManagingSoftware();
        mS.addBook("Atomic Habbits");
        mS.addBook("The Manifesto");

        mS.issueBook("Atomic Habbits");

        mS.availableBooks();
    }
}

