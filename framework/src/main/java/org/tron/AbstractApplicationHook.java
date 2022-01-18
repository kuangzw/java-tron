package org.tron;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

import org.tron.core.capsule.BlockCapsule;
import org.tron.core.capsule.TransactionCapsule;
import org.tron.core.db.TransactionTrace;

/**
 * FullNode hook
 * @author kuang
 *
 */
public abstract class AbstractApplicationHook {
	private static AbstractApplicationHook hook = null;
	public static Map<String, String> cache = new HashMap<String, String>();

	public static AbstractApplicationHook getInstance() { 
		return AbstractApplicationHook.hook;
	} 
	
	public static void registHook(AbstractApplicationHook _hook) { 
		AbstractApplicationHook.hook = _hook;
	}

	public abstract void processTransaction(TransactionCapsule trx, TransactionTrace trxTrace, BlockingQueue<TransactionCapsule> queue) ;
	
	
	public abstract void proccessNewBlock(BlockCapsule newBlock);
	
}
