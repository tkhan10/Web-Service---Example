/**
 * 
 */
package com.tofek.webservice;

/**
 * @author tofek.khan
 * Specification : JAX-RPC
 * Implementation : Axis implementation.
 *
 */
public class CallService {
   
	public int add(int i, int j){
		return i+j;
	}
	
	public int sub(int i, int j){
		return i-j;
	}
}
