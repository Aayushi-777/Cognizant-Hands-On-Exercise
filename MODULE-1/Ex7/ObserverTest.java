public class ObserverTest{
    public static void main(String args[]){
        StockMarket market=new StockMarket("TCS");
        Observer mobile=new MobileApp("Aayushi");
        Observer web=new WebApp("Bob");
        market.registerObserver(mobile);
        market.registerObserver(web);
        market.setPrice(3850);
        System.out.println();
        market.setPrice(3920);
    }
}
