package animal;

public class Human extends Animal implements Thinkable {
    
    //フィールド（趣味の情報）
    private String syumi;//趣味
    
    //getter
    public String getSyumi() {
        return syumi;
    }
    
    //setter
    public void setSyumi(String syumi) {
        this.syumi = syumi;
    }
    
    //引数なしのコンストラクタ
    public Human() {
    }
    
    //引数ありのコンストラクタ
    public Human(String name, int age, String syumi) {
        super.setName(name);
        super.setAge(age);
        this.syumi = syumi;
    }
    @Override    
    //趣味思考のメソッド
    public void think() {
        System.out.println("私は" + this.syumi + "について考えています。");
    }
}

