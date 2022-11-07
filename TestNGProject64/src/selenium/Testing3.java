package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert = new SoftAssert();
  @Test (priority = 1 , groups = {"smoke" , "sanity"})//create new user test@test.com
  public void createUser() {
	  System.out.println("I am in Home Test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc","abc");
  }
  @Test (priority = 2, dependsOnMethods = "createUser") //Edit user test@test.com
  public void editUser() {
	  System.out.println("Before assertion");
	  softAssert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After assertion");
	  softAssert.assertAll();	//should be added compulsory when use SoftAssert //work like error collector in JUnit
  }
  @Test (priority = 3, dependsOnMethods = "editUser")//Delete user test@test.cpm
  public void deleteUser() {
	  System.out.println("I am in end Test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(4>3, "Verifying Element1");
	  System.out.println("After assertion");
	  softAssert.assertEquals("abc", "abc1");
	  System.out.println("After Second assertion");
	  softAssert.assertAll();
  }
  
}
