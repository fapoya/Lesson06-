
public class UseVariable {

    public static void main(String[] args) {
        String inputName = null; //参照型の変数inputNameの宣言
        String name = "TANAKA"; // ←(２)
        
        // ~inputNameへの代入やnameを利用したコードを想定（省略）～
        
        name = null; //←(3)文字列”TANAKA”の参照が不要になったので、nullを代入
        
        System.out.println();

    }

}
