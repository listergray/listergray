package com.listergrya.listdata.impl;

import com.listergrya.listdata.IListData;

public class ContractListData implements IListData {

	public Object listData() {
		return this.getClass().getName();
	}
}
