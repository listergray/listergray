package com.listergray.outinterface.impl;

import com.listergray.outinterface.IOutInterface;

/**
 * 
 * @author Administrator
 *
 */
public class AppOutInterface implements IOutInterface {

	public Object devilerUrl() {
		return this.getClass().getName();
	}

}
