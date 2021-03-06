package com.ourownjava.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author ourownjava.com
 * 
 */
@Category(IntegrationTest.class)
public class CodeIntegrationTest 
{
    private Code code;
    
    @Before
    public void setUp(){
    	this.code = new Code();
    }
    
    @Test
    public void testToString(){
    	Assert.assertEquals("code uder test", code.toString());
    }
	
}
