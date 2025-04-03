import java.util.Random;

public class FireType extends Pokemon {
    private int firePower;
    private int fireMove;

    public FireType (String name, int level, double height, double weight, String speaks) {
        super(name, level, height, weight, speaks);

        Random random = new Random();
        this.firePower = random.nextInt(10);
    }

    public void fireMove(){
        this.fireMove = getAttack() + getFirePower();
    }

    public void sound(){
        System.out.println("Roaaar! 🔥");
    }

    public void inferno(){
        fireMove();
        System.out.println(getName() + " uses 🔥 inferno! 🔥");
        sound();
        System.out.println("Damage: " + getFireMove());
    }

    public void pyroBall(){
        fireMove();
        System.out.println(getName() + " uses 🔥 pyro ball! 🔥");
        sound();
        System.out.println("Damage: " + getFireMove());
    }

    public void flameThrower(){
        fireMove();
        System.out.println(getName() + " uses 🔥 flame thrower! 🔥");
        sound();
        System.out.println("Damage: " + getFireMove());
    }

    public void sunnyDay(){
        System.out.println(getName() + " uses sunny day!");
        System.out.println(getName() + " feels a bit stronger now!");
        setFirePower(getFirePower() + 5);
    }

    @Override
    public void useAttack() {
        Random random = new Random();
        int attackChoice = random.nextInt(6);

        switch (attackChoice) {
            case 0:
                quickAttack();
                break;
            case 1:
                scratch();
                break;
            case 2:
                inferno();
                break;
            case 3:
                pyroBall();
                break;
            case 4:
                flameThrower();
                break;
            case 5:
                sunnyDay();
                break;
        }
    }

    public int getFirePower(){
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public int getFireMove() {
        return fireMove;
    }
}