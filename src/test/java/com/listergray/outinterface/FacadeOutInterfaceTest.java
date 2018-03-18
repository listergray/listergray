package com.listergray.outinterface;

import org.junit.Before;
import org.junit.Test;

public class FacadeOutInterfaceTest {
	
	/**
	 * 测试外观模式
	 */
	@Test
	public void testFacadeOutInterface() {

		FacadeOutInterface facadeOutInterface = new FacadeOutInterface();
		String dealAppOutInterface = "" + facadeOutInterface.dealAppOutInterface();
		System.out.println(dealAppOutInterface);
	}

}
