
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    
    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object book){
        if(this == book){
            return true;
        }
        if(!(book instanceof Book)){
            return false;
        }
        Book bookChecked = (Book) book;
        
        return bookChecked.name.equals(this.name) && bookChecked.publicationYear == this.publicationYear;
    }
}
