public class Profit_calculator{
    public static void main (String[]args){
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("Profit: " + profit);
        System.out.println("Profit Percentage: " + profitPercentage + "%");
    }
}