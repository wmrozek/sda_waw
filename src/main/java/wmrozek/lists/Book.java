package wmrozek.lists;

public class Book {
    private String title;
    private String description;
    private Integer pageCount;
    private String author;

    public Book(String title, String description, Integer pageCount, String author) {
        this.title = title;
        this.description = description;
        this.pageCount = pageCount;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return pageCount.equals(book.pageCount);
    }

    @Override
    public int hashCode() {
        return pageCount.hashCode();
    }

    @Override
    public String toString() {
        return "Książka{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
