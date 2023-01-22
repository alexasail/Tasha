
public class UltraSuperPuperMegaGigaDvizhok {
    int[][] c = {
            {4, 3, 5},
            {4, 0, 8},
            {4, 6, 2},
            {4, 1, 7},
            {0, 1, 2},
            {6, 7, 8},
            {0, 3, 6},
            {2, 5, 8},
    };

    void gemeBot(char[] pos) {
        boolean flagO = true;

        // поверка на возможность выиграть за нолики этим ходом
        for (int i = 0; i < 8; i++) {
            if (pos[c[i][0]] != 'x' && pos[c[i][1]] == '◯' && pos[c[i][2]] == '◯') {
                pos[c[i][0]] = 'o';
                flagO = false;
                break;
            }
            if (pos[c[i][0]] == '◯' && pos[c[i][1]] != 'x' && pos[c[i][2]] == '◯') {
                pos[c[i][1]] = '◯';
                flagO = false;
                break;
            }
            if (pos[c[i][0]] == '◯' && pos[c[i][1]] == '◯' && pos[c[i][2]] != 'x') {
                pos[c[i][2]] = '◯';
                flagO = false;
                break;
            }
        }
        // проверка на победу человека  следующим ходом и устранение его выигрыша

        if (flagO) {
            for (int i = 0; i < 8; i++) {
                if (pos[c[i][0]] != '◯' && pos[c[i][1]] == 'x' && pos[c[i][2]] == 'x') {
                    pos[c[i][0]] = '◯';
                    flagO = false;
                    break;
                }
                if (pos[c[i][0]] == 'x' && pos[c[i][1]] != '◯' && pos[c[i][2]] == 'x') {
                    pos[c[i][1]] = '◯';
                    flagO = false;
                    break;
                }
                if (pos[c[i][0]] == 'x' && pos[c[i][1]] == 'x' && pos[c[i][2]] != '◯') {
                    pos[c[i][2]] = '◯';
                    flagO = false;
                    break;
                }
            }
        }

        // поверка на 3 в ряд свободных и ход
        if (flagO) {
            for (int i = 0; i < 8; i++) {
                if (pos[c[i][0]] != 'x' && pos[c[i][1]] != 'x' && pos[c[i][2]] != 'x') {
                    if (pos[c[i][0]] != '◯') {
                        pos[c[i][0]] = '◯';
                        flagO = false;
                        break;
                    }
                    if (pos[c[i][1]] != '◯') {
                        pos[c[i][1]] = '◯';
                        flagO = false;
                        break;
                    }
                    if (pos[c[i][2]] != '◯') {
                        pos[c[i][2]] = '◯';
                        flagO = false;
                        break;
                    }
                }
            }
        }
        if (flagO) {
            for (int i = 0; i < 9; i++) {
                if (pos[i] != 'x' && pos[i] != '◯') {
                    pos[i] = '◯';
                    break;
                }
            }
        }
    }
}

