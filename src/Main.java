public class Main {
    public static void records(Book[] books, Book book) {
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
    public static void main(String[] args) {



        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Петров", "Петр");
        Author author3 = new Author("Сидоров", "Сидр");
        Book book1 = new Book("Война миров", author1,2000);
        Book book2 = new Book("Звездный путь", author2,2020);
        Book book3 = new Book("Дорога домой", author3,2016);
        Book books[] = new Book[5];
        books[0]=book1;// Забил некоторые ячеки (0,1,4) для того
        books[1]=book1;// чтобы находились пустые и туда
        books[4]=book1;// записывались книги
        records(books, book2);
        records(books,book3);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthor().getSurName()+ " "+books[i].getAuthor().getName()+": "+books[i].getTitle()+": "+books[i].getYearPublishing());
        }





       // System.out.println(books[1].getTitle()+" "+books[1].getYearPublishing()+" "+author1.getSurName()+" "+author1.getName());

//        for (int i = 0; i < books.length; i++) {
//            if (books[i] == null) {
//                books[i] = book2;
//                System.out.println("Книга записана в ячейку " + i);
//                break;
//            }
//        }







//        System.out.println("Название книги -" + book1.getTitle() + ", ее автор -" + author1.getSurName() +" "+author1.getName()+ ", год издания -" + book1.getYearPublishing());
//        book2.setYearPublishing(2022);
//        System.out.println("Название книги -" + book2.getTitle() + ", ее автор -" + author2.getSurName() +" "+author2.getName()+ ", год издания -" + book2.getYearPublishing());

    }

}