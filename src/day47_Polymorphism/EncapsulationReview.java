package day47_Polymorphism;

public class EncapsulationReview {
    private String bookTitle;//getter and setter possible
    private final String publishDate;//just getter possible

    public EncapsulationReview(String bookTitle, String publishDate) {
        // this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        if(bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }


}
