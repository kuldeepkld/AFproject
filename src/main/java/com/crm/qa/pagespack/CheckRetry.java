package com.crm.qa.pagespack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (com.crm.qa.utilpack.AnnotationTransformer.class)
public class CheckRetry {
	
	@Test
	public void t1() {
		System.out.println("hola");
		Assert.assertFalse(true);
		
	}
	@Test
	public void t2() {
		Assert.assertFalse(true);
	}
	@Test
	public void t3() {
		
		Assert.assertFalse(true);
		System.out.println("bye");
		
	}

}
