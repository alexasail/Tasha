import java.util.Scanner;

public class Game {
    int wins = 0;
    int losses = 0;
    int winsInARow = 0;
    int games = 0;
    String[] achievementsForGame = {"ЛОХ","ЛЭЙМ","НОРМ","ОПА_НИХУЯ","ЕБААААТЬ","КРУЧЕ_АЛЬТМАРКА"};

    void game(){
        UltraSuperPuperMegaGigaDvizhok game = new UltraSuperPuperMegaGigaDvizhok();
        Field fieldOp = new Field();
        Scanner scanner = new Scanner(System.in);

        fieldOp.printField();

        while(true)

        {
            System.out.println("Введите поле для хода:");
            int c1 = 123123123;
            c1 = scanner.nextInt();
            if (c1 >= 0 && c1 < 9) {
                fieldOp.checkOfOpot(fieldOp.p, c1);
            }
            if (fieldOp.yasOrNo && c1 >= 0 && c1 < 9) {
                fieldOp.p[c1] = 'x';
            } else {
                System.out.println("Уважаемый, вы еблан? Сходите в нормальное место, например нахуй.\n");
                continue;
            }
            fieldOp.printField();

            fieldOp.checkWin(fieldOp.p);
            if (fieldOp.player != 'n') {
                if (fieldOp.player == '◯'){
                    System.out.printf("Выиграли: %s[32m%c%s[0m \n", (char) 27, fieldOp.player, (char) 27);
                    losses++;
                    winsInARow = 0;
                    games++;
                } else {
                    System.out.printf("Выиграли: %s[31m%c%s[0m \n", (char) 27, fieldOp.player, (char) 27);
                    wins++;
                    winsInARow++;
                    games++;
                }
                break;
            }

            fieldOp.checkAll(fieldOp.p);
            if (fieldOp.allUsed) {
                System.out.println("Ничья");
                games++;
                winsInARow = 0;
                break;
            }

            game.gemeBot(fieldOp.p);

            fieldOp.printField();

            fieldOp.checkWin(fieldOp.p);
            if (fieldOp.player != 'n') {
                if (fieldOp.player == '◯'){
                    System.out.printf("Выиграли: %s[32m%c%s[0m \n", (char) 27, fieldOp.player, (char) 27);
                    losses++;
                    winsInARow = 0;
                    games++;
                } else {
                    System.out.printf("Выиграли: %s[31m%c%s[0m \n", (char) 27, fieldOp.player, (char) 27);
                    wins++;
                    winsInARow++;
                    games++;
                }
                break;
            }

            fieldOp.checkAll(fieldOp.p);
            if (fieldOp.allUsed) {
                System.out.println("Ничья");
                games++;
                winsInARow = 0;
                break;
            }
        }
    }
    void printWins(){
        System.out.printf("Вы победили %d раз)\n", wins);
    }
    void printLosses(){
        System.out.printf("Вы проиграли %d раз(\n", losses);
    }
    void setWinsInARow(){
        System.out.printf("Уже %d игр без поражения\n", winsInARow);
    }
    void setGames(){
        System.out.printf("Вы с нами уже %d игр\n",games);
    }

    void setAchievementsForGame(){
        boolean flag = true;
        System.out.printf("На данный момент ваш уровень игры: ");
        if (wins - losses < -2){
            System.out.printf("%s\n",achievementsForGame[0]);
            flag = false;
        }
        if (wins - losses < 0 && flag){
            System.out.printf("%s\n",achievementsForGame[1]);
            flag = false;
        }
        if (wins - losses < 2 && flag){
            System.out.printf("%s\n",achievementsForGame[2]);
            flag = false;
        }
        if (wins - losses < 5 && flag){
            System.out.printf("%s\n",achievementsForGame[3]);
            flag = false;
        }
        if (wins - losses < 8 && flag){
            System.out.printf("%s\n",achievementsForGame[4]);
            flag = false;
        }
        if (wins - losses <=8  && flag){
            System.out.printf("%s\n",achievementsForGame[5]);
        }
    }

}
