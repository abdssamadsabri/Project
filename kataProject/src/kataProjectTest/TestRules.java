package kataProjectTest;

import static org.junit.Assert.*;

import org.junit.Test;

import kataProject.NumberChecker;

public class TestRules {

	NumberChecker testObject = new NumberChecker();
    @Test
	public void test_Divisor_Of_Three(){
		assertEquals("Foo",testObject.encrypt(6));
	}
    @Test
    public void test_Divisor_Of_Five(){
    	assertEquals("Bar",testObject.encrypt(20));
    }
    @Test
    public void test_Divisor_Of_Seven(){
    	assertEquals("Qix",testObject.encrypt(14));
    }
    @Test
    public void test_Contain_Three(){
    	assertEquals("Foo",testObject.encrypt(13));
    }
    @Test
	public void test_Divisors_Order() {
		assertEquals("FooQix",testObject.encrypt(21)); 
	}
    @Test
    public void test_Divisor_Before_Content(){
    	assertEquals("FooBar",testObject.encrypt(51));
    }
    @Test
    public void test_Content_In_Order(){
    	assertEquals("BarFoo",testObject.encrypt(53));
    }
   @Test
   public void test_Multiple_Divisor_And_Contain_5(){
	   assertEquals("FooBarBar",testObject.encrypt(15));
   }
  @Test
  public void test_Multiple_Container_And_Divisor_Of_3(){
	  assertEquals("FooFooFoo",testObject.encrypt(33));
  }

}
