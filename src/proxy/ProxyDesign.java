package proxy;

interface DBConnectionService {

    void intilalizeConnection();
}

class RealCalculation implements DBConnectionService {
    String config;

    public RealCalculation(String config) {
        this.config = config;
        this.intilalizeConnection();
        System.out.println("Actual DB Connection will happen when it is really require");
    }

    @Override
    public void intilalizeConnection() {
        // some intensive calculation
    }
}

class ProxyCalculationService implements DBConnectionService {
    private RealCalculation realCalculation;
    String config;

    ProxyCalculationService(String config) {
        this.config = config;
        System.out.println("Created just proxy object to return the current code.");
    }
    @Override
    public void intilalizeConnection() {
        realCalculation = new RealCalculation(this.config);
        realCalculation.intilalizeConnection();
    }
}

public class ProxyDesign {

    public static void main(String[] args) {
        DBConnectionService dbConnectionService = new ProxyCalculationService("http://abc.com");
        System.out.println("SOme other stuffs in the code ");
        dbConnectionService.intilalizeConnection();
    }

}
