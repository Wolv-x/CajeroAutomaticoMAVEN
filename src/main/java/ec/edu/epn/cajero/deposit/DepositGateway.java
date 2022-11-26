package ec.edu.epn.cajero.deposit;

public interface DepositGateway {
    public DepositResponse requestDeposit(DepositRequest depositRequest);
}
