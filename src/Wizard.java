class Wizard extends Fighter {

    boolean wizardIsNotPrepared = false;

    boolean isPrepareSpell = false;


    public void prepareSpell(){
        isPrepareSpell = true;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    @Override
    boolean isVulnerable() {
        if (isPrepareSpell)
            return false;
        else { return true;
        }
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if (isPrepareSpell)
            return 12;
        else{ return 3;
        }
    }
}
