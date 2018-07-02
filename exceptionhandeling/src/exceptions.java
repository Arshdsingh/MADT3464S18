public class exceptions {
    public static void main (String args[]) {
        try {
            int n = Integer.parseInt("123a");
            System.out.println(n);

            if (n<150) {
                throw new NumberFormatException();
            }
            }
            catch (NumberFormatException e) {
                System.err.println(e);
            }
            finally {
            System.err.println("In finally block");
        }

              }
}
