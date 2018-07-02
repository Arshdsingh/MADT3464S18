import java.util.Collections;

public class ArrayList{

    public static void main(String args[]) {


       // java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        /**list.add("e");
        list.add("f");
        list.add("d");
        list.add("a");
        list.add("c");
        list.add(1,"b");
        if (list.contains("One")) {
            list.remove("One");
            System.out.println("Data Removed");
        }
        else
            System.out.println("Not Allowed");
        for (String var: list
             ) {
            System.out.println(var);

        }
        System.out.println("-------------------");
        Collections.sort(list);
        for (String var: list
             ) {
            System.out.println(var);

        }*/


        java.util.ArrayList<Books> library = new java.util.ArrayList<Books>();
        Books book1= new Books(1,"One",1);
        Books book2= new Books(2,"Two",2);
        Books book3= new Books(3,"Three",3);
        Books book4= new Books(4,"Four",4);

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);

        for (Books books: library) {   //object of books class
            books.display();
        }

        System.out.println("Size Of ArrayList : "+library.size()); //arraylist.size()

        /*if (library.contains(book2))
         library.remove(book2);
        System.out.println("Size Of ArrayList : "+library.size());*/

        library.add(new Books(5,"Five",5));

        for (Books  books: library) {
            books.display();
        }
        /*Collections.sort(library,new booktitlecomparator());

        for (Books books: library
             ) {
            books.display();
        }*/
        System.out.println("====================");
        Collections.sort(library,new bookratingcomparator());


        for (Books books: library) {
            books.display();
        }
    }
}
