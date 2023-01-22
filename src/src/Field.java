public class Field {
    char[] p = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

    boolean allUsed = true;
    boolean yasOrNo = true;
    char player = 'n';
    boolean flag = true;

    void checkWin(char[] positions) {
        if (positions[0] == positions[4] && positions[4] == positions[8] && positions[4] != ' ' && positions[0] != ' ' && positions[8] != ' '){
            player = positions[0];
            flag = false;
        }
        if (positions[2] == positions[4] && positions[4] == positions[6] && positions[4] != ' ' && positions[2] != ' ' && positions[6] != ' '){
            player = positions[2];
            flag = false;
        }
        for (int i = 0; i < positions.length; i++) {
            if ((i % 3 == 0) && positions[i] == positions[i + 1] && positions[i + 1] == positions[i + 2] && positions[i] != ' ' && positions[i + 1] != ' ' && positions[i + 2] != ' ') {
                player = positions[i];
                flag = false;
                break;
            }
            if (i < 3 && positions[i] == positions[i + 3] && positions[i + 6] == positions[i + 3] && positions[i] != ' ' && positions[i + 3] != ' ' && positions[i + 6] != ' ') {
                player = positions[i];
                flag = false;
                break;
            }
        }
    }
    void checkOfOpot(char[] positions, int c) {
        yasOrNo = true;
        if (positions[c] == '◯' || positions[c] == 'x') {
            yasOrNo = false;
        }
    }
    void checkAll(char[] positions){
        allUsed = true;
        for (int i = 0; i < positions.length; i++){
            if (positions[i] == ' '){
                allUsed = false;
                break;
            }
        }
    }
    void printField(){

        for (int i = 0; i < p.length; i++) {
            if (i % 3 == 0) {
                if (p[i] == '◯') {
                    System.out.printf(" %d │ %d │ %d       %s[32m%c%s[0m ", i, i + 1, i + 2, (char) 27, p[i], (char) 27);
                } else {
                    System.out.printf(" %d │ %d │ %d       %s[31m%c%s[0m ", i, i + 1, i + 2, (char) 27, p[i], (char) 27);
                }
            } else {
                if (p[i] == '◯'){
                    System.out.printf("│ %s[32m%c%s[0m ", (char) 27, p[i], (char) 27);
                } else {
                    System.out.printf("│ %s[31m%c%s[0m ", (char) 27, p[i], (char) 27);
                }
            }
            if (i % 3 == 2 && i != 8){
                System.out.println("\n━━━╈━━━╈━━━     ━━━╈━━━╈━━━");
            }
        }

        System.out.printf("\n\n▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚\n\n");
    }
}
