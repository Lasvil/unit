import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void testWith800() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testWith1100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWith1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
