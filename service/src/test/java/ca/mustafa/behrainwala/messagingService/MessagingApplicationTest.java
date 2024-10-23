package ca.mustafa.behrainwala.messagingService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MessagingApplicationTest {
    @Test
    void mainTest() {
        MessagingApplication.main(new String[] {});
        assertTrue(true);
    }

    @Test
    void contextLoads() {
        assertTrue(true);
    }
}
