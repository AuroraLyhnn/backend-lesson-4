import java.util.Random;

public class GrassType extends Pokemon {
    private int grassPower;
    private int grassMove;

    public GrassType (String name, int level, double height, double weight, String speaks) {
        super(name, level, height, weight, speaks);

        Random random = new Random();
        this.grassPower = random.nextInt(10);
    }

    public void grassMove(){
        this.grassMove = getAttack() + getGrassPower();
    }

    public void sound(){
        System.out.println("Rustle rustle! 🍃");
    }

    public void leafStorm(){
        grassMove();
        System.out.println(getName() + " uses 🍃 leaf storm! 🍃");
        sound();
        System.out.println("Damage: " + getGrassMove());
    }

    public void leachSeed(){
        grassMove();
        System.out.println(getName() + " uses 🍃 leach seed! 🍃");
        sound();
        System.out.println("Damage: " + getGrassMove());
    }

    public void leaveThrower(){
        grassMove();
        System.out.println(getName() + " uses 🍃 leave thrower! 🍃");
        sound();
        System.out.println("Damage: " + getGrassMove());
    }

    public void grassyTerrain(){
        System.out.println(getName() + " uses grassy terrain!");
        System.out.println(getName() + " feels a bit stronger now!");
        setGrassPower(getGrassPower() + 5);
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
                leafStorm();
                break;
            case 3:
                leachSeed();
                break;
            case 4:
                leaveThrower();
                break;
            case 5:
                grassyTerrain();
                break;
        }
    }

    public int getGrassPower(){
        return grassPower;
    }

    public void setGrassPower(int firePower) {
        this.grassPower = firePower;
    }

    public int getGrassMove() {
        return grassMove;
    }
}