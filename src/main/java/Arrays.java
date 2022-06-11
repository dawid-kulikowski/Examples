import java.util.ArrayList;

public class Arrays {

    // array - store multiple values in a single variable
    String[] car;
    String[][] cars;
    ArrayList<String> carr;

    public Arrays(String[] car, String[][] cars,ArrayList<String> carr) {
        this.car = car;
        this.cars = cars;
        this.carr = carr;
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


    //ArrayList - Resizable Array

    public void resizableArray(){

        carr.add("ferrari");
        carr.add("lamborghini");
        carr.add("bentley");

        carr.set(1,"mercedes-benz");
        carr.remove(2);

        for(int i=0;i<carr.size();i++){
            System.out.println(carr.get(i));
        }



    }






}
