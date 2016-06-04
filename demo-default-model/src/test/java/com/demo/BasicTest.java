package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class BasicTest {

	@Test
	public void whenGenerateCorrectAnswer() {
		Assert.assertTrue("assert true", true);
	}

	@Test(expected=Exception.class)
	public void whenExpectedException() throws Exception {
		throw new Exception("throws exception");
	}
	
}
