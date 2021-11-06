import java.util.Scanner;

public class TestNestedFor2{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double sum = 0.0;
        for(int k=1; k <= 3; k++){
            System.out.println("请输入第" + k + "个班级的成绩");
            for(int i=1; i <= 5; i++){
                
                System.out.println("请输入第"+ i +"位同学的成绩");

                double score = input.nextDouble();

                sum += score;
            }

            double avg = sum / 5;

            System.out.println("第" + k + "个班级平均分：" + avg);
        }
    }
}