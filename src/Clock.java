
public class Clock {

    public static void main(String[] args) {
        //int型の3つの引数を持つgetScondsメソッドを呼び出す
        int seconds = getSeconds(6, 24, 40);
        System.out.println(seconds);    
    }
    
    
    //int型引数を2つ受け取るaddメソッドの定義(戻り値あり)
    public static int getSeconds(int num1, int num2, int num3) {
        int result = num1*60*60 + num2*60 + num3;
        return result;
    }
}
