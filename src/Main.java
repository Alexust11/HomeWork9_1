
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Петров", "Петр");

        Book book1 = new Book("Война миров", author1,2000);
        Book book2 = new Book("Звездный путь", author2,2020);

        System.out.println("Название книги -" + book1.getTitle() + ", ее автор -" + author1.getSurName() +" "+author1.getName()+ ", год издания -" + book1.getYearPublishing());
        book2.setYearPublishing(2022);
        System.out.println("Название книги -" + book2.getTitle() + ", ее автор -" + author2.getSurName() +" "+author2.getName()+ ", год издания -" + book2.getYearPublishing());

    }

}