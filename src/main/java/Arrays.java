public class Arrays {

    // array - store multiple values in a single variable
    String[] car;

    public Arrays(String[] car) {
        this.car = car;
    }
    public void simpleArray() {
        car[0] = "Fiat";
        car[1] = "Ford";
        car[2] = "Audi";

        for(int i=0; i<car.length; i++) {
            System.out.println(car[i]);
        }

    }
}
