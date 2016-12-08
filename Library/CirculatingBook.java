public class CirculatingBook extends LibraryBook{
  String currentHolder;
  String dueDate;

  public CirculatingBook(String theAuthor, String theTitle, String theISBN, String theCallNumber){
    super(theAuthor, theTitle, theISBN, theCallNumber);
  }

  public CirculatingBook(){
    super();
  }

  public String toString(){
    String appended = "";
    if (currentHolder != null) {
      appended += ", the current holder is " + currentHolder;
    }
    if (dueDate != null) {
      appended += ", the due date is " + dueDate;
    }
    return super.toString() + appended;
  }

  public String getCurrentHolder(){
    return currentHolder;
  }

  public String getDueDate(){
    return dueDate;
  }

  public void setDueDate(String newDueDate){
    dueDate = newDueDate;
  }

  public void setCurrentHolder(String newCurrentHolder){
    currentHolder = newCurrentHolder;
  }

  public void checkout(String patron, String due){
    setCurrentHolder(patron);
    setDueDate(due);
  }

  public void returned(){
    setCurrentHolder(null);
    setDueDate(null);
  }

  public String circulationStatus(){
    if ((dueDate != null)&&(currentHolder != null)){
      return "Held by " + currentHolder + ", and due on " + dueDate;
    }
    else return "book available on shelves";
  }

}