public class Main {
    public static void main(String[] args) {

        Fighter warrior = new Warrior();
        Wizard wizard = new Wizard();

        System.out.println(warrior); // Fighter is a Warrior
        System.out.println(wizard);  // Fighter is a Wizard

        // Wizard is initially vulnerable
        System.out.println("Wizard vulnerable: " + wizard.isVulnerable());
        System.out.println("Warrior attacks wizard: " + warrior.getDamagePoints(wizard));

        // Wizard prepares a spell
        wizard.prepareSpell();
        System.out.println("\nWizard prepares a spell...");
        System.out.println("Wizard vulnerable: " + wizard.isVulnerable());
        System.out.println("Wizard attacks warrior: " + wizard.getDamagePoints(warrior));

        // Warrior attacks wizard again
        System.out.println("Warrior attacks wizard: " + warrior.getDamagePoints(wizard));
    }
}

