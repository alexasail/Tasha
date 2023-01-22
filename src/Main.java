import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Играть\n2. Раздел статистики\n3. Завершить игру\n");
            int move = scanner.nextInt();
            if (move == 1) {
                game.game();
            }
            if (move == 2) {
                while (true) {
                    System.out.println("\n1.Статистика по победам.");
                    System.out.println("2.Статистика по поражениям.");
                    System.out.println("3.Статистика по кол-ву игр.");
                    System.out.println("4.Статистика по победам подряд.");
                    System.out.println("5.Ачивки.");
                    System.out.println("6.Выйти.\n");
                    int move2 = scanner.nextInt();
                    System.out.println();
                    if (move2 == 1) {
                        game.printWins();
                    }
                    if (move2 == 2) {
                        game.printLosses();
                    }
                    if (move2 == 3) {
                        game.setGames();
                    }
                    if (move2 == 4) {
                        game.setWinsInARow();
                    }
                    if (move2 == 5) {
                        game.setAchievementsForGame();
                    }
                    if (move2 == 6) {
                        break;
                    }
                }
            }
            if (move == 3) {
                game.printWins();
                game.printLosses();
                game.setGames();
                game.setWinsInARow();
                game.setAchievementsForGame();
                break;
            }
        }
    }
}
