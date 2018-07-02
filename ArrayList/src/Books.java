import java.util.Comparator;

public class Books {
    int bookid;
    String booktitle;
    int bookrating;


    public Books(int bookid, String booktitle, int bookrating) {
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.bookrating = bookrating;
    }

    public Books() {
        this.bookid=0;
        this.booktitle="";
        this.bookrating=0;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public int getBookrating() {
        return bookrating;
    }

    public void setBookrating(int bookrating) {
        this.bookrating = bookrating;
    }


    void display() {
        System.out.println("Book ID : "+bookid+" | "+"Book Title : "+booktitle+" | "+"Book Rating : "+bookrating);
    }

}

//for sorting
class booktitlecomparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o1.booktitle.compareToIgnoreCase(o2.booktitle);
    }
}
class bookratingcomparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        if (o1.bookrating == o2.bookrating)
        return 0;
        else if (o1.bookrating < o2.bookrating)
            return 1;
        else
            return -1;
    }
}
