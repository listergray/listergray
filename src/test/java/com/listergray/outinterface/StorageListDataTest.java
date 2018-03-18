package com.listergray.outinterface;

import org.junit.Test;

import com.listergrya.listdata.StorageListData;
import com.listergrya.listdata.impl.ContractListData;

public class StorageListDataTest {

	@Test
	public void testListData() {
		StorageListData storageListData = new StorageListData(new ContractListData());
		String listData = ""+storageListData.listData();
		System.out.println(listData);
	}

}
