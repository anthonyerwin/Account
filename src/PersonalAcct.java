public class PersonalAcct extends Account {
    private double personalCharge = 100;

    public PersonalAcct(double balance, String firstName, String lastName, String street, String city, String state,
            String zip) {
        super(balance, firstName, lastName, street, city, state, zip);
    }

    public void withdrawal(double amt) {

        double balance = getBalance();
        if (amt <= balance) {
            super.withdrawal(amt);
            if (getBalance() < personalCharge) {
                super.withdrawal(2.0);
            } else {
                super.withdrawal(0);
            }
            
        } else {
            System.out.println("Not enough money in account.");
        }
    }

    public double getPersonalCharge() {
        return personalCharge;
    }

    public void setPersonalCharge(double personalCharge) {
        this.personalCharge = personalCharge;
    }

}
