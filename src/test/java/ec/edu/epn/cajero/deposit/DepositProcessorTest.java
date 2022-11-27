package ec.edu.epn.cajero.deposit;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class DepositProcessorTest {

    private DepositGateway gateway;
    private DepositProcessor processor;

    @Before
    public void setUp() {
        gateway = Mockito.mock(DepositGateway.class);
        processor = new DepositProcessor(gateway);
    }

    @Test
    public void give_deposit_when_is_correct_then_OK() {
        Mockito.when(gateway.requestDeposit(Mockito.any())).thenReturn(new DepositResponse(DepositResponse.DepositStatus.OK));
        assertTrue(processor.makeDeposit(245));
    }

    @Test
    public void give_deposit_when_is_wrong_then_ERROR() {
        Mockito.when(gateway.requestDeposit(Mockito.any())).thenReturn(new DepositResponse(DepositResponse.DepositStatus.ERROR));
        assertFalse(processor.makeDeposit(480));
    }

}