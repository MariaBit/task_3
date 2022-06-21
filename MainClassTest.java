import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {

        String actual = getClassString();
        String expected1 = "hello";
        String expected2 = "Hello";

        if (actual.contains(expected1))
        {
            Assert.assertTrue(true);
        } else if (actual.contains(expected2))
        {
            Assert.assertTrue(true);
        } else
        {
            Assert.fail("Фраза не Hello, world");
        }

    }
}
