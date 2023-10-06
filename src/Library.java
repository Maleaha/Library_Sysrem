import javax.swing.*;

public class Library {
    //has a relationship, so object of Library item will be taken.
    public LibraryItem[] shelf=new LibraryItem[3]; // item array
    public void borrowItem(LibraryItem item) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] != null && shelf[i].equals(item) && !shelf[i].isBorrowed()) {
                shelf[i].setBorrowed(true);
                System.out.println("BORROWED: " + item.getTitle());
                return; // Exit the loop once item is borrowed
            }
        }
        System.out.println("not avaiblable ");
    }



    public void addItem(LibraryItem item) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                shelf[i] = item;
                System.out.println("WE ADDED " + item.getTitle());
                break; //wjy look forward?
            }
            else
                System.out.println("shelf is full");
        }
    }
    void displayAvailableItems() {
        for (int i = 0; i < shelf.length; i++){
            LibraryItem item = shelf[i];
            if(shelf != null) {
                System.out.printf("%s\t%s\t%d\t%b\t", item.getTitle(), item.getAuthor(), item.getYear(), item.isBorrowed());
                System.out.println(item.getItemType());
            }
        }
    }
    void returnItem(LibraryItem item){
        for(int i = 0; i < shelf.length; i++){
            if(shelf[i] != null) {
                if (shelf[i].getTitle().equals(item.getTitle())) {
                    shelf[i].setBorrowed(false);
                }
            }
        }
    }
    void displayBorrowedItems() {
        for (int i = 0; i < shelf.length; i++) {
            LibraryItem item = shelf[i];
            if (item != null && item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }






}
