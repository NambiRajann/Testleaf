package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampletest2 {
	@Test
	@Parameters("name")
	void name(String name)
	{
		
		Assert.assertEquals(name, "namb");
	}

}
