import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Sample {
	
@BeforeMethod
public void test() {
	for(int i =1; i<=100; i++){
		System.out.println(i);
	}
	Assert.assertEquals(true, true);
}
}
