public class ShieldDefence implements DefenceMethod {
    String shield;

    public ShieldDefence(String shield) {
        this.shield = shield;
    }

    @Override
    public void defend() {
        System.out.println("blocking with " + shield);
    }


}
