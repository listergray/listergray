package com.listergrya.listdata.impl;

import com.listergrya.listdata.IListData;

public class SupplyListData implements IListData {

	public Object listData() {
		return this.getClass().getName();
	}
}
