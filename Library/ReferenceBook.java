public Class ReferenceBook extends LibraryBook{

  private String collection;

  public ReferenceBook(String theAuthor, String theTitle, String theISBN, String theCallNumber, String theCollection){
    super(theAuthor, theTitle, theISBN, theCallNumber);
    collection = theCollection;
  }

  public ReferenceBook(){
    super();
    collection = "";
  }

  public String getCollection(){
    return collection;
  }

  public void setCollection(String newCollection){
    collection = newCollection;
  }

  public void checkout(){
    System.out.println("cannot check out a reference book");
  }

  public void returned(){
    System.out.println("reference book could not have been checked out -- return impossible");
  }

  public void circulationStatus(){
    return "non-circulating reference book";
  }

}