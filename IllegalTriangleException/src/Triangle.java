public class Triangle extends Exception{
    private double a, b, c;

    public Triangle(double a, double b, double c) throws Illegal{
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Cạnh không được âm đâu nhé!");
        } else
        if(a+b <= c || a+c <= b || b+c <= a) {
            System.out.println("không đáp ứng bất đẳng thức tam giác");
        } else {
            System.out.println("Tam giác này hợp lệ!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
