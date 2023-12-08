package baseball;

public class BaseBallTeam {
    //フィールド
    private String name; //球団名
    private int win;     //勝ち数
    private int lose;    //負け数
    private int draw;    //引き分け数


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
    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }

    //報告するメソッド
    public void report(){
        double winRate = getRate();
        System.out.println(this.name + "　の2022年の成績は　" + this.win + "勝 " + this.lose + "負 " + this.draw + "分、勝率は　" + winRate + "です。");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWin() {
        return win;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    
    public int getLose() {
        return lose;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    
    public int getDraw() {
        return draw;
    }
    
    public void setDraw(int draw) {
        this.draw = draw;
    }
}
