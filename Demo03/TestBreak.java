import java.util.Scanner;

public class TestBreak{
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //控制台录入5位同学成绩，如果有任何一位同学的成绩为非数字时，直接退出整个循环操作。

        double sum = 0.0;

        for (int i=1; i<=5 ; i++){

            System.out.println("请输入第"+ i + "位同学的成绩");

            double score = input.nextDouble();

            if(score < 0 || score > 100.0){
                break;
            }

            sum = sum + score;
        }

        System.out.println("程序结束");
    }
}