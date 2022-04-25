public class BusinessAcct extends Account {
    private double businessCharge = 500;

    public BusinessAcct(double balance, String firstName, String lastName, String street, String city, String state,
            String zip) {
        super(balance, firstName, lastName, street, city, state, zip);
    }

    public void withdrawal(double amt) {

        double balance = getBalance();
        if (amt <= balance) {
            super.withdrawal(amt);
            if (getBalance() < businessCharge) {
                super.withdrawal(10.0);
            } else {
                super.withdrawal(0);
            }
            
        } else {
            System.out.println("Not enough money in account.");
        }
    }

    public double getBusinessCharge() {
        return businessCharge;
    }

    public void setBusinessCharge(double businessCharge) {
        this.businessCharge = businessCharge;
    }

}
