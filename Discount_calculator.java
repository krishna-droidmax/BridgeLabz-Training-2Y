public class Discount_calculator {
    public static void main(String[]args){
        double fee =125000;
        double discountPercent =10;
        double discount=fee* discountPercent/100;
        double finalfee=fee-discount;

        System.out.println("The discount amount in INR is "+discount+" and final discounted fee is "+finalfee);

    }
    
}
