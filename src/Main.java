public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Wystąpił wyjątek: NullPointerException");

            e.printStackTrace();

            System.out.println(e.toString());
        }
    }
}