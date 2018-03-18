package com.listergray.outinterface.impl;

import com.listergray.outinterface.IOutInterface;

public class GateOutInterface implements IOutInterface {

	public Object devilerUrl() {
		return this.getClass().getName();
	}

}
