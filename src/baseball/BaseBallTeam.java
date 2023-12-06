package baseball;

public class BaseBallTeam {
    //フィールド
    public String name; //球団名
    public int win;     //勝ち数
    public int lose;    //負け数
    public int draw;    //引き分け数
    private double winRate; //勝率

    //引数なしのコンストラクタ(念のため記述しただけなので中身はなし)
    public BaseBallTeam() {
    }

    //引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率メソッド
    public void getRate() {
        //勝率の計算
        this.winRate = (double) this.win / (this.win + this.lose);
    }

    //報告するメソッド
    public void report(){
        getRate();
        System.out.println(this.name + "　の2022年の成績は　" + this.win + "勝 " + this.lose + "負 " + this.draw + "分、勝率は　" + this.winRate + "です。");
    }

}
