package com.listergrya.listdata;

public class StorageListData {
	
	private IListData listDataImpl;
	
	public StorageListData(IListData listDataImpl) {
		this.listDataImpl = listDataImpl;
	}
	
	public Object listData(){
		Object listData = listDataImpl.listData();
		return listData;
	}
	
}
