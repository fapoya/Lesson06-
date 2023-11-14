
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        //int型10をint型0で除算
        double a = 10.0 / 0.0; //この場合は、例外が発生しない！！
        
        //この下の出力は実行される！！
        System.out.println(a);
        
        //配列
        //書き方の1つ目
        int[] score;
        score = new int[5];
        
        //宣言と初期化
        int[] score = new int[5];
        //代入処理
        score[0] = 20;
        score[1] = 30;
        score[2] = 40;
        score[3] = 50;
        score[4] = 10;
        
    }

}
