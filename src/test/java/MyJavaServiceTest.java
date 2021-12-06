import com.testjunit.test.core.BaseTest;
import com.testjunit.myjavaservice.MyJavaService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyJavaServiceTest extends BaseTest {

    @Autowired
    private MyJavaService myJavaService; // MyJavaService is the Java Service added in app

    @Test
    public void getJsonData() {
        String jsonData = myJavaService.sampleJavaOperation();
        Assert.assertNotNull(jsonData);
    }
}