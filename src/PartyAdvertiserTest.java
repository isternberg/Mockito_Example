import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PartyAdvertiserTest {

    @Mock
    private Party party;

    @InjectMocks
    private PartyAdvertiser partyAdvertiser = new PartyAdvertiser(party);

    @Test
    public void testName() throws Exception {
        Mockito.when(party.getLocation()).thenReturn("Technodrom");
        Mockito.when(party.getEnterncePrice()).thenReturn(42);
        assertEquals(partyAdvertiser.advertiseParty(),
                "Party at Technodrom for 42 USD!");


    }
}