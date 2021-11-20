public class ArrayLineSearch{
    public static void main(String[] args) {
        double[] myArray = {1,2,3,4,234,523,561,34,51,35,15,153234,523,53,342,234};
        double key = 53;
        for (int i=0; i < myArray.length ; i++){
            if (key == myArray[i]){
                System.out.println("found it " + key + " at index:" + i);
            }
        }

    }
}
