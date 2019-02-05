public class carInsurancePolicy2 {
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public carInsurancePolicy2(int num, int payments, String city) {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;

    }
    public carInsurancePolicy2(int num, int payments) {
        this(num, payments, "Mayfield");
    }
    public carInsurancePolicy2(int num) {
        this(num, 2,  "Mayfield");
    }
    public void display()
    {
     System.out.println("Policy #" + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");
    }
}
