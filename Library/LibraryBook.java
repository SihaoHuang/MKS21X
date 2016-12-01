public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
  private String callNumber;

  public LibraryBook(String theAuthor, String theTitle, String theISBN, String theCallNumber){
    super(theAuthor, theTitle, theISBN);
    callNumber = theCallNumber;
  }

  public LibraryBook(){
    super();
    callNumber = "";
  }

  public abstract void checkout(String patron, String due);
  public abstract void returned();
  public abstract String circulationStatus();

  public int compareTo(LibraryBook b){
    return this.getCallNumber().compareTo(b.getCallNumber());
  }

  public String toString(){
    return "The author is " + getAuthor() + ", the title is " + getTitle() + ", the ISBN is" + getISBN() + ", the call number is " + callNumber;
  }

  public String getCallNumber(){
    return callNumber;
  }

  public void setCallNumber(String newCallNumber){
    callNumber = newCallNumber;
  }
}