public abstract Class LibraryBook extends Book implements Comparable<Book>{
  private String callNumber;

  public LibraryBook(String theAuthor, String theTitle, String theISBN, String theCallNumber){
    super(theAuthor, theTitle, theISBN);
    callNumber = theCallNumber;
  }

  public LibraryBook(){
    super();
    callNumber = "";
  }

  public void LibraryBook()
  public abstract void checkOut();
  public abstract void returned();
  public abstract String circulationStatus();

  public int compareTo(LibraryBook b){
    return this.title.compareTo(b.getTitle);
  }

  public String toString(){
    return "The author is " + author + ", the title is " + title + ", the ISBN is" + ISBN + ", and the call number is " + callNumber + "." + ;
  }

  public String getCallNumber(){
    return callNumber;
  }

  public void setCallNumber(String newCallNumber){
    callNumber = newCallNumber;
  }
}