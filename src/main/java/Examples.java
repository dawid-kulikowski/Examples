import java.util.ArrayList;

public class Examples {
    public static void main(String[] args) {
//        System.out.println("Examples of loops");
//        Loops loops = new Loops(5,5,6,"/");
////        loops.nestedLoop();
////        loops.whileLoop();
////        loops.doWhileLoop();
////        loops.forLoop();

        Arrays arrays = new Arrays(new String[3],new String[3][3],new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        arrays.simpleArray();
        arrays.multiDimensionArray();
        arrays.resizableArray();
        arrays.multiDimensionArrayList();


    }
}
