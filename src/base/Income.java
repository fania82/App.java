package base;

public interface Income {

    double calculateGrossRevenue(int quantity, double price);

    double calculateNetRevenue(double calculatedGrossRevenue, double tax);
}

