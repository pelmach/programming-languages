package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTest {
    private Cal cal = new Cal();

    @Test(groups = {"functest"})
    public void testSum() throws Exception{
        Assert.assertEquals(5,cal.sum(1, 4));
    }
    @Test(groups = {"functest"})
    public void testMult() throws Exception{
        Assert.assertEquals(5, cal.mult(1,5));
    }
    @Test(groups = {"functest"})
    public void testDel() throws Exception{
        Assert.assertEquals(5, cal.del(5,1));
    }
    @Test(groups = {"checkintest"})
    public void testSub() throws Exception{
        Assert.assertEquals(1, cal.sub(5,4));
    }
}

