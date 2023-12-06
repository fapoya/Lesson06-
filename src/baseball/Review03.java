package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam base01 = new BaseBallTeam();
        base01.name = "東京ヤクルトスワローズ";
        base01.win = 80;
        base01.lose = 59;
        base01.draw = 4;
        base01.report();

        BaseBallTeam base02 = new BaseBallTeam();
        base02.name = "横浜DeNAベイスターズ";
        base02.win = 73;
        base02.lose = 68;
        base02.draw = 2;
        base02.report();

        BaseBallTeam base03 = new BaseBallTeam();
        base03.name = "阪神タイガース";
        base03.win = 68;
        base03.lose = 71;
        base03.draw = 4;
        base03.report();

        BaseBallTeam base04 = new BaseBallTeam();
        base04.name = "読売ジャイアンツ";
        base04.win = 68;
        base04.lose = 72;
        base04.draw = 3;
        base04.report();

        BaseBallTeam base05 = new BaseBallTeam();
        base05.name = "広島東洋カープ";
        base05.win = 66;
        base05.lose = 74;
        base05.draw = 3;
        base05.report();

        BaseBallTeam base06 = new BaseBallTeam();
        base06.name = "中日ドラゴンズ";
        base06.win = 66;
        base06.lose = 75;
        base06.draw = 2;
        base06.report();
    }

}
