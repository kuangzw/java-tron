package framework.src.main.java.org.tron;

import java.util.concurrent.BlockingQueue;

import org.tron.core.capsule.BlockCapsule;
import org.tron.core.capsule.TransactionCapsule;

/**
 * FullNode hook
 * @author kuang
 *
 */
public abstract class AbstractApplicationHook {
	private static AbstractApplicationHook hook = null;

	public static AbstractApplicationHook getInstance() { 
		return AbstractApplicationHook.hook;
	} 
	
	public static void registHook(AbstractApplicationHook _hook) { 
		AbstractApplicationHook.hook = _hook;
	}

	public abstract void processTransaction(TransactionCapsule trx, BlockingQueue<TransactionCapsule> queue) ;

	public abstract void proccessNewBlock(BlockCapsule newBlock);
	
}
