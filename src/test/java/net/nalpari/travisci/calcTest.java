package net.nalpari.travisci;

import net.nalpari.travisci.web.service.TestService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class calcTest {

    private TestService testService;

    @Before
    public void setUp() {
        testService = new TestService();
    }

    @Test
    public void calcTest() {
        long sum = testService.calculator(1, 2);
        Assert.assertEquals(sum, 3);
    }
}
