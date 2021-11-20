public class CopyArray1 {
    public static void main(String[] args) {
        double[] myArray = {1, 2, 3};
        double[] yourArray = new double[3];
        yourArray = myArray;
        
        System.out.println("Disaple myArray");
        displayArray(myArray);

        System.out.println("Disaple yourArray");
        displayArray(yourArray);

        myArray[2] = 10;
        
        System.out.println("Disaple myArray");
        displayArray(myArray);

        System.out.println("Disaple yourArray");
        displayArray(yourArray);

    }

    public static void displayArray(double[] arrayVar){
        for (double e: arrayVar){
            System.out.println(e);
        }        
    }
}