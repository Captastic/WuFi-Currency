package capriotti.anthony.WuFi;

/**
 * Created by anthonycapriotti on 1/12/17.
 */
public class WuFi {

    private CurrencyCalculations currencyCalculations;
    private Input input;

    public WuFi(){
        currencyCalculations = new CurrencyCalculations();
        input = new Input();
    }

    public void run(){
        String currentCurrency = input.askStaringCurrencyType();
        System.out.println("What is your requested currency?");
        String requestedCurrency = input.askStaringCurrencyType();
        double currencyAmount = input.askCurrentAmount();

        double convertedAmount = currencyCalculations.convertCurrency(currentCurrency, requestedCurrency, currencyAmount);

        System.out.println("You now have " + convertedAmount);
    }

}
