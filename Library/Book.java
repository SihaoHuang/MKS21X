public class Book{

  private String author;
  private String title;
  private String ISBN;

  public Book(){
    author = "";
    title = "";
    ISBN = "";
  }

  public Book(String theAuthor, String theTitle, String theISBN){
    author = theAuthor;
    title = theTitle;
    ISBN = theISBN;
  }

  public String toString(){
    return "The author is " + author + ", the title is " + title + ", the ISBN is " + ISBN;
  }

  public void setAuthor(String newAuthor){
    author = newAuthor;
  }

  public void setTitle(String newTitle){
    title = newTitle;
  }

  public void setISBN(String newISBN){
    ISBN = newISBN;
  }

  public String getAuthor(){
    return author;
  }

  public String getTitle(){
    return title;
  }

  public String getISBN(){
    return ISBN;
  }
  
}
