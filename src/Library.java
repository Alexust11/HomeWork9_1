public class Library {
    private Book[] book;

    public Library(int quantit) {
        this.book=new Book[quantit];
    }
    public  void records(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Книга: "+ book.getTitle()+ " записана в ячейку " + i);
                break;
            }
            if (i == books.length - 1) {
                System.out.println("Свободных ячеек для книги: "+book.getTitle()+ " нет");
            }
        }
    }
}
