public class Methods {
    int a;
    int b;
    int c;
    double d;
    double e;
    double f;

    String name;
    String surname;

    public Methods(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Methods(int a, int b, int c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }


    // simple method
    public static int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }


    // overloaded method - same name - different parameters
    public static int add (int a, int b, int c) {
        System.out.println(a+b-c);
        return a + b - c;
    }

    // overloaded method - same name - different types
    public static double add (double d, double e, double f) {
        System.out.println(d+e+f);
        return d+e+f;
    }

    // Overriding toString Method
    public String toString(){
        return name+surname;
    }




}

