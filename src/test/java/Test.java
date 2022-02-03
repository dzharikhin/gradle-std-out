import example.App;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

@SpringBootTest(classes = App.class)
public class Test {
    private static Logger LOG = LoggerFactory.getLogger(Test.class);

    @BeforeAll
    public static void setUp() throws InterruptedException {
        Instant end = Clock.systemDefaultZone().instant().plus(Duration.ofSeconds(20));
        while (Clock.systemDefaultZone().instant().isBefore(end)) {
            LOG.error("stdout");
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        }
    }

    @org.junit.jupiter.api.Test
    public void test() throws InterruptedException {
        LOG.error("done");
    }
}
