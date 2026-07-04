public class FinancialForecast{
    public static double calculateFutureValue(double currVal, double growthRate, int years){
        if(years==0){
            return currVal;
        }
        return calculateFutureValue(currVal, growthRate, years-1)*(1+growthRate);
    }
}