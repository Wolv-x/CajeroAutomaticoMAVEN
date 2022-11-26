package ec.edu.epn.cajero.deposit;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class DepositProcessorTest {

    @Test
    public void give_deposit_when_is_correct_then_OK() {
        DepositGateway gateway = Mockito.mock(DepositGateway.class);
        DepositProcessor processor = new DepositProcessor(gateway);

        Mockito.when(gateway.requestDeposit(Mockito.any())).thenReturn(new DepositResponse(DepositResponse.DepositStatus.OK));
        assertTrue(processor.makeDeposit(245));
    }

    @Test
    public void give_deposit_when_is_wrong_then_ERROR() {
        DepositGateway gateway = Mockito.mock(DepositGateway.class);
        DepositProcessor processor = new DepositProcessor(gateway);

        Mockito.when(gateway.requestDeposit(Mockito.any())).thenReturn(new DepositResponse(DepositResponse.DepositStatus.ERROR));

        assertFalse(processor.makeDeposit(245));
    }
}