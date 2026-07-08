package day;

import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2026/6/1 22:16
 * @Description: 猜数字游戏
 * @Version: 1.0
 */
public class day7 {

    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("========== 猜数字游戏 ==========");
        System.out.println("我已经想好了一个 1 到 100 之间的数字，请猜一猜！");

        while (true) {
            System.out.print("请输入你的猜测：");
            while (!scanner.hasNextInt()) {

                System.out.println("请输入有效的整数！");
                scanner.next();
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("太小了！再试试。");
            } else if (guess > targetNumber) {
                System.out.println("太大了！再试试。");
            } else {
                System.out.println("========== 恭喜你猜中了！ ==========");
                System.out.println("正确答案是：" + targetNumber);
                System.out.println("你用了 " + attempts + " 次猜中。");
                break;
            }
        }

        scanner.close();
    }

}
