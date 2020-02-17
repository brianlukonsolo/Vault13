import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Log4j
public class HashMd5Test {
    String textInput = "inputStringToBeProcessed";

    @Test
    public void itShouldReturnAnMd5HashStringWhenGivenAnInputString() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String expectedHash = "8db61ac065813983432a4b11334fd359";
        HashMd5 md5Hash = new HashMd5();
        String actual = md5Hash.calculateMd5DigestValue(textInput);
        log.info("Actual: " + actual);
        log.info("Expected: " + expectedHash);

        assert (actual.equals(expectedHash));
    }

}
