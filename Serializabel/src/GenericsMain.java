public class GenericsMain {
    public static void main(String args[]) {
        Generics<Integer> generics = new Generics<Integer>();
        generics.set(new Integer(10));
        System.out.print("Interger value : "+generics.get());

        Generics<String> stringGenerics = new Generics<String>();
        stringGenerics.set(new String("Generics Example"));
        System.out.print("String Value : "+stringGenerics.get());

        Integer[] integers = {1,2,3,4,5,6};
        System.out.print("");

    }
}
