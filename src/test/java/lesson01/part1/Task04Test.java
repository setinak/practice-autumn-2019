package lesson01.part1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.ReadFileUtil;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;
import java.util.List;

@RunWith(JUnit4.class)
public class Task04Test {
    @Before
    public void setUp() throws Exception {
        SystemOutGatewayUtil.setCustomOut();

    }
    @After
    public void tearDown() throws Exception {
        SystemOutGatewayUtil.setOriginalOut();
    }
    @Test
    public void checkOutput(){
        Task04.main(null);
        ByteArrayOutputStream s = SystemOutGatewayUtil.getOutputArray();
        String s2 = s.toString();
        Assert.assertEquals("26\n25\n", s2);
    }
    @Test
    public void checkLine() {
        List<String> lines = ReadFileUtil.readFileInList("./src/main/java/lesson01/part1/Task04.java");
        String lineWithMethodCall = lines.get(22);

        Assert.assertTrue("line must contain y = x / y;", lineWithMethodCall.contains("y = x / y;"));
    }
}