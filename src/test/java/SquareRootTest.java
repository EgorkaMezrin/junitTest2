import org.example.SquareRoot;
import org.junit.jupiter.api.*;

public class SquareRootTest {
   @BeforeEach
    public void initTest(){
       System.out.println("start SquareRoot test === complete");
   }

   @Test
   public void negativeArgument(){
       double a = -4;
       SquareRoot root = new SquareRoot();
       Assertions.assertThrows(ArithmeticException.class, () -> {
           root.calculateSquareRoot(a);
       });

   }

   @AfterEach
    public void endTest(){
       System.out.println("end SqureRoot test === complete");
   }
}
