public class Main {
    public static void main(String[] args) {
        GameCatur GameCatur = new GameCatur();
        GameCatur.start();
        GameCatur.pause();
        GameCatur.game_over();

        GameKartu GameKartu = new GameKartu();
        GameKartu.start();
        GameKartu.pause();
        GameKartu.game_over();
    }
}