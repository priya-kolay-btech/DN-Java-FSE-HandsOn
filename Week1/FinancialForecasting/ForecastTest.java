public class ForecastTest {

    public static void main(String[] args) {

        double currentValue = 10000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue =
                FinancialForecast.predictFutureValue(
                        currentValue,
                        growthRate,
                        years
                );

        System.out.printf(
                "Predicted Future Value after %d years = %.2f%n",
                years,
                futureValue
        );
    }
}