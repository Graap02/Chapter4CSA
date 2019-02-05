public class CreatePolicies {
    public static void main(String[] args) {
        carInsurancePolicy2 first = new carInsurancePolicy2(123);
        carInsurancePolicy2 second = new carInsurancePolicy2(456, 4);
        carInsurancePolicy2 third= new carInsurancePolicy2(789, 12, "Newcastle");
        //carInsurancePolicy2 fourth = new carInsurancePolicy2();
        
        first.display();
        second.display();
        third.display();
    }
}
