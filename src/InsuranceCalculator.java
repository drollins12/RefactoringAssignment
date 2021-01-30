public class InsuranceCalculator {

    private final InsuranceStrategyVeryHighs insuranceStrategyVeryHighs = new InsuranceStrategyVeryHighs();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return (income-10000)*0.2+35600;
        } else if (income <= 60000) {
            return (income-30000)*0.1+76500;
        } else {
            return insuranceStrategyVeryHighs.calculateInsuranceVeryHigh(income);
        }
    }
    public class InsuranceStrategyVeryHighs {
        public InsuranceStrategyVeryHighs() {
        }
        public double calculateInsuranceVeryHigh(double income) {
            return (income - getAdjustment()) * getWeight() + getConstant();
        }

        public int getConstant() {
            return insuranceStrategyVeryHighs.getConstant();
        }

        public double getWeight() {
            return insuranceStrategyVeryHighs.getWeight();
        }

        public int getAdjustment() {
            return insuranceStrategyVeryHighs.getAdjustment();
        }
    }
}
