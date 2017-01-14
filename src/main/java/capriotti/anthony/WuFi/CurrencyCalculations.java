package capriotti.anthony.WuFi;

/**
 * Created by anthonycapriotti on 1/13/17.
 */
public class CurrencyCalculations {

    private final static double usd_rate = 1;
    private final static double euro_rate = 0.94;
    private final static double british_pound_rate = 0.82;
    private final static double indian_rupee_rate = 68.32;
    private final static double australian_dollar_rate = 1.35;
    private final static double canadian_dollar_rate = 1.32;
    private final static double singapore_dollar_rate = 1.43;
    private final static double swiss_franc_rate = 1.01;
    private final static double malasyain_ringgit_rate = 4.47;
    private final static double japanese_yen_rate = 115.84;
    private final static double chinese_yuan_renmimbi_rate = 6.92;

    public double convertCurrency(String currentUserCurrency, String desiredUserCurrency, double currencyAmount){

        double currentCurrencyRate = getCurrencyRate(currentUserCurrency);
        double desiredCurrencyRate = getCurrencyRate(desiredUserCurrency);

        double convertedCurrency = currencyAmount * desiredCurrencyRate / currentCurrencyRate;

        return convertedCurrency;
    }

    private double getCurrencyRate(String currencyType) {
        double exchangeRate = 0;
        switch (currencyType) {
            case "usd": exchangeRate = usd_rate;
                break;
            case "euro": exchangeRate = euro_rate;
                break;
            case "pound" : exchangeRate = british_pound_rate;
                break;
            case "rupee" : exchangeRate = indian_rupee_rate;
                break;
            case "aud" : exchangeRate = australian_dollar_rate;
                break;
            case "cand" : exchangeRate = canadian_dollar_rate;
                break;
            case "spd" : exchangeRate = singapore_dollar_rate;
                break;
            case "franc" : exchangeRate = swiss_franc_rate;
                break;
            case "ringgit" : exchangeRate = malasyain_ringgit_rate;
                break;
            case "yen" : exchangeRate = japanese_yen_rate;
                break;
            case "yuan" : exchangeRate = chinese_yuan_renmimbi_rate;
                break;

        }

        return exchangeRate;
    }
}


