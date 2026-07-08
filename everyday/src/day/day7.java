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
        int targetNumber = new Random().nextInt(100) + 1;
        int attempts = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("========== 猜数字游戏 ==========");
            System.out.println("我已经想好了一个 1 到 100 之间的数字，请猜一猜！");

            while (true) {
                int guess = readGuess(scanner);
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("太小了！再试试。");
                } else if (guess > targetNumber) {
                    System.out.println("太大了！再试试。");
                } else {
                    System.out.println("========== 恭喜你猜中了！ ==========");
                    System.out.println("正确答案是：" + targetNumber);
                    System.out.println("你用了 " + attempts + " 次猜中。");
                    return;
                }
            }
        }
    }

    private static int readGuess(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("请输入有效的整数！");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
