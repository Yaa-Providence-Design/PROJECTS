
import static org.junit.jupiter.api.Assertions.*;

import com.company.even.MyEvenOddTest;
import org.junit.Test;

public class EvenTest {
@Test
public void testEvenOddNumber(){
    MyEvenOddTest even = new MyEvenOddTest();
    assertTrue( true==even.isEvenNumber(100));

}
}
