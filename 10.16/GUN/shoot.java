public class shoot {
    public static void main(String[] args) {
        Guns.HandGun gun1 = new Guns.HandGun();
        Guns.MachineGun gun2 = new Guns.MachineGun();
        gun1.shoot();
        gun1.reload();
        gun2.shoot();
        gun2.reload();
    }

}
