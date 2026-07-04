public class Main {
    public static void main(String[] args){
        double currVal=10000;
        double growthRate=0.10;
        int years=5;
        double futureVal=FinancialForecast.calculateFutureValue(currVal, growthRate, years);
        System.out.println("Current Value : Rs" + currVal);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : Rs%.2f", futureVal);
    }
}
