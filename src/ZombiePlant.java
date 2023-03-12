public class ZombiePlant {
    int treatPotency;
    int numTreat;

    public ZombiePlant(int treatPotency, int numTreat) {
        this.treatPotency = treatPotency;
        this.numTreat = numTreat;
    }

    public int treatmentsNeeded() {
        return numTreat;
    }

    public int getPotencyRequired(){
        return treatPotency;
    }

    public boolean isDangerous(){
        if(numTreat>0){
            return true;
        }
        return false;
    }

    public void treat(int potency){
        if(potency<=0){
            return;
        }
        if(potency<=treatPotency && numTreat == 0){
            return;
        }
        if(potency<=treatPotency){
            numTreat-=1;
        }
        else{
            numTreat+=1;
        }
    }
}
