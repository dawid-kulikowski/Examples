public class Loops {
    protected int a;
    protected int b;
    protected int c;
    protected String symbol;

    // Constructor
    public Loops(int a, int b, int c, String symbol) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.symbol = symbol;
    }

    // whileLoop - executes as long as condition is true
    public void whileLoop(){
    while (a<100) {
        a++;
        System.out.println(a);
        }
    }

    // doWhileLoop - executes as long as condition is true (will execute once no matter what conditions are)
    public void doWhileLoop(){
    do {
        b++;
        System.out.println(b);
    } while (b<100);
    }


// for loop - loop that executes block of code a limited amount of times
   public void forLoop(){
        for(int i=0; i<=b; i+=10){
            System.out.println(i);
        }
    }

    //for-each loop


    public void forEachLoop(){

        String[] animals = new String[3];
        animals[0] = "tiger";
        animals[1] = "cat";
        animals[2] = "dog";

        for(String i : animals) {
            System.out.println(i+"s");
        }



    }


// nestedLooop - loop inside  of a loop
   public void nestedLoop(){
        for(int i=1; i<a; i++){
            System.out.println("");
            for(int j=1; j<b; j++) {
                System.out.print("|");
            }
        }
    }


}
