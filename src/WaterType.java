import java.util.Random;

public class WaterType extends Pokemon {
    private int waterPower;
    private int waterMove;

    public WaterType (String name, int level, double height, double weight, String speaks) {
        super(name, level, height, weight, speaks);

        Random random = new Random();
        this.waterPower = random.nextInt(10);
    }

    public void waterMove(){
        this.waterMove = getAttack() + getWaterPower();
    }

    public void sound(){
        System.out.println("Splaaash! 🌊");
    }

    public void surf(){
        waterMove();
        System.out.println(getName() + " uses 🌊 surf! 🌊");
        sound();
        System.out.println("Damage: " + getWaterMove());
    }

    public void hydroPump(){
        waterMove();
        System.out.println(getName() + " uses 🌊 hydro pump! 🌊");
        System.out.println(getSound());
        System.out.println("Damage: " + getWaterMove());
    }

    public void hydroCanon(){
        waterMove();
        System.out.println(getName() + " uses 🌊 hydro canon! 🌊");
        System.out.println(getSound());
        System.out.println("Damage: " + getWaterMove());
    }

    public void rainDance(){
        System.out.println(getName() + " uses rain dance!");
        System.out.println(getName() + " feels a bit stronger now!");
        setWaterPower(getWaterPower() + 5);
    }

    @Override
    public void useAttack() {
        Random random = new Random();
        int attackChoice = random.nextInt(6); // Picks 0, 1, or 2

        switch (attackChoice) {
            case 0:
                quickAttack();
                break;
            case 1:
                scratch();
                break;
            case 2:
                surf();
                break;
            case 3:
                hydroPump();
                break;
            case 4:
                hydroCanon();
                break;
            case 5:
                rainDance();
                break;
        }
    }

    public int getWaterPower(){
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

    public int getWaterMove() {
        return waterMove;
    }
}