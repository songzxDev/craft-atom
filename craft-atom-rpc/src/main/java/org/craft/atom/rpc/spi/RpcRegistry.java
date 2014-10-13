package org.craft.atom.rpc.spi;


/**
 * RPC registry
 * 
 * @author mindwind
 * @version 1.0, Oct 11, 2014
 */
public interface RpcRegistry {

	/**
	 * Register a rpc api.
	 * 
	 * @param api
	 */
	void register(RpcApi api);
	
	/**
	 * Unregister a rpc api.
	 * 
	 * @param api
	 */
	void unregister(RpcApi api);
	
	/**
	 * Lookup a rpc api.
	 * 
	 * @param  api query api object
	 * @return result rpc api.
	 */
	RpcApi lookup(RpcApi api);
}
