package ec.edu.epn.cajero.deposit;

public class DepositResponse {

    enum DepositStatus{
        OK,ERROR;
    }

    private DepositStatus status;

    public DepositResponse (DepositStatus status){
        this.status = status;
    }

    public DepositStatus getStatus() {
        return status;
    }
}
