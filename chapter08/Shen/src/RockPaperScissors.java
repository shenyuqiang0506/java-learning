/**
 * @Author 申宇强
 * @Date 2023/4/24 16:08
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            // 玩家出拳
            System.out.print("请输入您的出拳（1. 剪刀，2. 石头，3. 布）：");
            int playerChoice = scanner.nextInt();
            String playerGesture = "";
            switch (playerChoice) {
                case 1:
                    playerGesture = "剪刀";
                    break;
                case 2:
                    playerGesture = "石头";
                    break;
                case 3:
                    playerGesture = "布";
                    break;
                default:
                    System.out.println("无效的输入，请重新输入！");
                    continue;
            }

            // 计算电脑出拳
            int computerChoice = random.nextInt(3) + 1;
            String computerGesture = "";
            switch (computerChoice) {
                case 1:
                    computerGesture = "剪刀";
                    break;
                case 2:
                    computerGesture = "石头";
                    break;
                case 3:
                    computerGesture = "布";
                    break;
            }

            // 输出结果
            System.out.println("您出了：" + playerGesture);
            System.out.println("电脑出了：" + computerGesture);
            if (playerChoice == computerChoice) {
                System.out.println("平局！");
            } else if ((playerChoice - computerChoice == -1) || (playerChoice - computerChoice == 2)) {
                System.out.println("您赢了！");
                playerScore++;
            } else {
                System.out.println("电脑赢了！");
                computerScore++;
            }

            // 输出总分
            System.out.println("当前总分：您 " + playerScore + " - " + computerScore + " 电脑");

            // 判断是否继续游戏
            System.out.print("是否继续游戏（y/n）？");
            String choice = scanner.next();
            if (!choice.toLowerCase().equals("y")) {
                break;
            }
        }

        System.out.println("游戏结束，最终得分为：您 " + playerScore + " - " + computerScore + " 电脑");
    }
}


