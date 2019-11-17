package TestNGTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FirstTestNG2 {
  @Test
  public void firsttestcase() {
	  System.out.println("1");
  }
  
  @Test
  public void secondtestcase() {
	  System.out.println("2");
  }
  
  @Test
  public void thirdtestcase() {
	  System.out.println("3");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before");
  }
  @AfterTest
  public void AfterTest() {
	  System.out.println("after");
	  
  }
}
