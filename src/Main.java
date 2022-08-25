
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Петров", "Петр");

        Book book1 = new Book("Война миров", author1,2000);
        Book book2 = new Book("Звездный путь", author2,2020);

        System.out.println(book1.getAuthor());//Возвращает ссылку?


    }

}