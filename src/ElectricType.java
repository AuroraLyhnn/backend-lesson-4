import java.util.Random;

class ElectricType extends Pokemon {
    private int thunderPower;
    private int thunderMove;

    public ElectricType (String name, int level, double height, double weight, String speaks) {
        super(name, level, height, weight, speaks);

        Random random = new Random();
        this.thunderPower = random.nextInt(10);
    }

    public void thunderMove(){
        this.thunderMove = getAttack() + getThunderPower();
    }

    public void sound(){
        System.out.println("Bzzt bzzt ⚡⚡");
    }

    public void thunderPunch(){
        thunderMove();
        System.out.println(getName() + " uses ⚡ thunder punch! ⚡");
        sound();
        System.out.println("Damage: " + getThunderMove());
    }

    public void electroBall(){
        thunderMove();
        System.out.println(getName() + " uses ⚡ electro ball! ⚡");
        sound();
        System.out.println("Damage: " + getThunderMove());
    }

    public void thunder(){
        thunderMove();
        System.out.println(getName() + " uses ⚡ thunder! ⚡");
        sound();
        System.out.println("Damage: " + getThunderMove());
    }

    public void thunderStorm(){
        System.out.println(getName() + " uses thunder storm!");
        System.out.println(getName() + " feels a bit stronger now!");
        setThunderPower(getThunderPower() + 5);
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
                thunderPunch();
                break;
            case 3:
                electroBall();
                break;
            case 4:
                thunder();
                break;
            case 5:
                thunderStorm();
                break;
        }
    }

    public int getThunderPower(){
        return thunderPower;
    }

    public void setThunderPower(int thunderPower) {
        this.thunderPower = thunderPower;
    }

    public int getThunderMove() {
        return thunderMove;
    }
}