public class YourProgram {
    public static void modifyValues(Rectangle rectangle, int w, int l) {
        rectangle.setHeight(rectangle.getHeight() / 2);
        rectangle.setWidth(rectangle.getWidth() * 3 + 1 );
        w = w * 3 + 1;
        l = l  / 2;
    }
    public static void printValues(Rectangle rectangle, int w, int l) {
        System.out.printf("Rectangle: Width %d, Length: %d, Area: %d%n",
                rectangle.getWidth(), rectangle.getHeight(), rectangle.getArea());
        System.out.printf("Values of w: %d, of l: %d%n", w, l);
        System.out.printf("Width == w? %b,  Length == l? %b%n%n",
                rectangle.getWidth() == w, rectangle.getHeight()==l);
    }
    public static void main(String[] args) {
        int w = 5;
        int l = 10;
        Rectangle rectangle = new Rectangle(w,l);
        printValues(rectangle, w, l);
        modifyValues(rectangle, w, l);
        System.out.println("Values Modified!");
        printValues(rectangle, w, l);
    }
}

