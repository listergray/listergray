/**
 * 
 */
package com.listergray.outinterface;

import javax.annotation.Resource;

import com.listergray.outinterface.impl.AppOutInterface;
import com.listergray.outinterface.impl.GateOutInterface;

/**
 * Faction: ����ӿ�����࣬ʹ�õ������ģʽ
 * @author Administrator
 */
public class FacadeOutInterface {
	
	@Resource
	private AppOutInterface appOutInterface;
	@Resource
	private GateOutInterface gateOutInterface;
	
	public Object dealAppOutInterface(){
		Object devilerUrl = appOutInterface.devilerUrl();
		return devilerUrl;
	}
	
	public Object dealGateOutInterface(){
		Object devilerUrl = gateOutInterface.devilerUrl();
		return devilerUrl;
	}
	
}
