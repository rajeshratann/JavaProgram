package com.d2h.main;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MenuItemTest{
	
	@InjectMocks
	MenuItem menuItem;
	
	
	@Test
	public void testInputValueAccount() {
		int response=menuItem.inputValueOption(1);
		Assert.assertNotNull(response);
		Assert.assertEquals(100, response);
	}
	
	@Test
	public void testInputValueRecharge() {
		int response=menuItem.inputValueOption(2);
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testInputValuePackService() {
		int response=menuItem.inputValueOption(3);
		Assert.assertNotNull(response);
		Assert.assertEquals(0, response);
	}
	
	@Test
	public void testInputValuePackChannelPack() {
		int response=menuItem.inputValueOption(4);
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testInputValueAddChannel() {
		int response=menuItem.inputValueOption(5);
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testInputValueAddSpecialService() {
		int response=menuItem.inputValueOption(6);
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testInputValueSize() {
		int response=menuItem.inputValueOption(7);
		Assert.assertNotNull(response);
	}
	@Test
	public void testInputValueSubscriptionDetails() {
		int response=menuItem.inputValueOption(8);
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testInputValueDefault() {
		int response=menuItem.inputValueOption(9);
		Assert.assertNotNull(response);
	}
}

