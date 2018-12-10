package jp.ac.uryukyu.ie.e155725;

public class Hero extends LivingThing{

    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP, attack);
        this.setNam(name);
        setHitPoint(maximumHP);
        this.setAttack(attack);
        setDead(false);
        //サブクラスの初期化？

    }

    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getNam());
        }
    }
}