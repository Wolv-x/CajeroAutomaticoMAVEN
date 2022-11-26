package ec.edu.epn.cajero.deposit;

public class DepositProcessor {

    private DepositGateway gateway;

    public DepositProcessor(DepositGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makeDeposit (double amount){
        DepositResponse response = gateway.requestDeposit(new DepositRequest(amount));
        if (response.getStatus() == DepositResponse.DepositStatus.OK) {
            return true;
        }else {
            return false;
        }
    }
}
