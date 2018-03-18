package com.listergrya.listdata.impl;

import com.listergrya.listdata.IListData;

public class PlanListData implements IListData {

	public Object listData() {
		return this.getClass().getName();
	}
}
