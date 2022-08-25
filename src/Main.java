public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Петров", "Петр");
        Book book1 = new Book("Война миров", 2022);
        Book book2 = new Book("Звездный путь", 2020);
        book1.author=author1;
        book2.author=author2;
        System.out.println("название книги - " + book1.getTitle() + " ,автор " + book1.author.getSurName() + " " + book1.author.getName() + " год издания: " + book1.getYearPublishing());
        book2.setYearPublishing(2019);
        System.out.println("название книги - " + book2.getTitle() + " ,автор " + book2.author.getSurName() + " " + book2.author.getName() + " год издания: " + book2.getYearPublishing());

    }

}