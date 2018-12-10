package jp.ac.uryukyu.ie.e155725;

/**
 * EnemyとHeroの共通部分解消のためのクラス
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     *
     * @param name 動作の主体
     * @param maximumHP 体力
     * @param attack 攻撃力の上限
     */
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);

    }

    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent){
        if(isDead() == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    //アクセサメソッド１
    public String getNam(){ return name; }
    public void setNam(String name){ this.name = name; }
    //アクセサメソッド２
    public int getHitPoint(){ return hitPoint; }
    public void setHitPoint(int hitPoint){ this.hitPoint = hitPoint; }
    //アクセサメソッド３
    public int getAttack(){ return attack; }
    public void setAttack(int attack){ this.attack = attack; }
    //アクセサメソッド４
    public boolean getDead(){ return dead; }
    public void setDead(boolean dead){ this.dead = dead; }
}