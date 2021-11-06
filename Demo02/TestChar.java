public class TestChar{
    public static void main(String[] args){
        char c1 = 'A';

        char c2 = 65; //整数赋值，根据A码进行转换

        char c3 = '\u0041'; //4位十六进制码，根据Unicode进行转换

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}