import java.util.Scanner;

public class Game {
    private int lives = 10;
    private char[] board;
    private String wort = "Tex";
    private int lastPos;
    public void start(){
        this.initBoard();
        /*for (int i = 0; i <= lives; i++){ // (int i = 0; i <= lives; lives--;)
            this.showBoard();
            Scanner s = new Scanner(System.in);
            char buchstabe = s.nextLine().toLowerCase().toCharArray()[0];
            if (exists(buchstabe)){
            } else {
                System.out.println("Haha! Loser!");
            }
            }*/
            int korrekt = 0;
            while (lives >= 1){

                this.showBoard();
                Scanner s = new Scanner(System.in);
                char buchstabe = s.nextLine().toLowerCase().toCharArray()[0];
                if (exists(buchstabe)){
                    System.out.println("Du hast richtig geraten!");
                    showBoard(buchstabe);
                    korrekt++;
                    if (korrekt == this.wort.length()) {
                        System.out.println("Du hast gewonnen!");
                    }
                } else {
                    System.out.println("Haha! Loser!");
                }
                lives--;
            }




    }

    private boolean exists(char buchstabe){
        this.lastPos = this.wort.toLowerCase().indexOf(buchstabe);
        return this.lastPos > -1;
    }

    private void initBoard() {
        board = new char[wort.length()];
        for (int i = 0; i < board.length; i++) {
            board[i] = '_';
        }
    }

    private void showBoard(){
        System.out.println(board);
    }

    private void showBoard(char buchstabe){
        this.board[this.lastPos] = this.wort.charAt(this.lastPos);
    }
}
