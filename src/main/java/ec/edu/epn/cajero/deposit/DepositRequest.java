package ec.edu.epn.cajero.deposit;

public class DepositRequest {

    private double amount;

    public DepositRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
