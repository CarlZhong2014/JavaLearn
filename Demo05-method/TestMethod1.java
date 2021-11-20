public class TestMethod1{
    public static void main(String[] args){
        System.out.println("床前明月光");
        printUnderline();
        System.out.println("疑是地上霜");
        printUnderline();
        System.out.println("举头望明月");
        printUnderline();
        System.out.println("低头思故乡");
        printUnderline();
    }

    public static void printUnderline(){
        for(int i=0; i<10;i++){
            System.out.print('-');
        }
        System.out.println();
    }
}