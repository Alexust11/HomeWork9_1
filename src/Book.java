public class Book {
    private String title;
    Author author = new Author("Иванов","иван");
    private int yearPublishing;

    public Book(String title, int yearPublishing) {
        this.title = title;
        this.yearPublishing = yearPublishing;


    }
    public String getTitle() {
        return title;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}
