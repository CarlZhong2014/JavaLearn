import java.util.Scanner;

public class TestBreak{
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //控制台录入5位同学成绩，如果有任何一位同学的成绩为非数字时，直接退出整个循环操作。

        double sum = 0.0;

        boolean flag = true;

        for (int i=1; i<=5 ; i++){

            System.out.println("请输入第"+ i + "位同学的成绩");

            double score = input.nextDouble();

            if(score < 0 || score > 100.0){
                flag = false;
                break;
            }

            sum = sum + score;
        }

        if (flag == true) {
            double avg = sum / 5;

            System.out.println("平均分：" +  avg);
        }else{
            System.out.println("程序结束");
        }
    }
}