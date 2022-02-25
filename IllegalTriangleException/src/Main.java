public class Main {
    public static void main(String[] args) {
        try {
            Triangle tamGiac = new Triangle(4 , 2, 3);
        } catch (Illegal e) {
            System.out.println(e.getMessage());;
        }
    }
}
