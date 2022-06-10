public class Arrays {

    // array - store multiple values in a single variable
    String[] car;
    String[][] cars;

    public Arrays(String[] car, String[][] cars) {
        this.car = car;
        this.cars = cars;
    }
    public void simpleArray() {
        car[0] = "Fiat";
        car[1] = "Ford";
        car[2] = "Audi";

        for(int i=0; i<car.length; i++) {
            System.out.println(car[i]);
        }
    }

    // 2d array - array of arrays

    public void multiDimensionArray(){
        cars[0][0] = "Audi";
        cars[0][1] = "Ford";
        cars[0][2] = "Fiat";
        cars[1][0] = "Volkswagen";
        cars[1][1] = "Renault";
        cars[1][2] = "Peugeot";
        cars[2][0] = "Opel";
        cars[2][1] = "Alfa Romeo";
        cars[2][2] = "BMW";

        for (int i=0;i<cars.length;i++) {
            System.out.println();
            for(int j=0;j<cars[i].length; j++) {
                System.out.println(cars[i][j]+" ");
            }
        }
    }
}
