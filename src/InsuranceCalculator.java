public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculate(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return strategy.calculate(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return strategy.calculate(income);
        } else {
            strategy = new InsuranceStrategyVeryHighs();
            return strategy.calculate(income);
        }
    }
    public class InsuranceStrategyVeryHighs extends InsuranceStrategy {
        public InsuranceStrategyVeryHighs() {
        }

        @Override
        public int getConstant() {
            return strategy.getConstant();
        }

        @Override
        public double getWeight() {
            return strategy.getWeight();
        }

        @Override
        public int getAdjustment() {
            return strategy.getAdjustment();
        }
    }
}
