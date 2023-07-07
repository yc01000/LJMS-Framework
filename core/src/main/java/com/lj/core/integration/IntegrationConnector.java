package com.lj.core.integration;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ IntegrationConnector.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:38:58 
 *  @version : 1.0
 *  @desc    : Integration 커넥터의 공통 함수를 정의하는 인터페이스
 */
public interface IntegrationConnector<E1, E2, E3> {

	/**
	 * sryu (2017. 8. 7. 오전 9:12:29)
	 * desc   :  
	 * @param  E1 generic 1st parameter, E3 generic 2nd parameter
	 * @return E2 generic type of return
	 */
	public E2 request(E1 req, E3 property);
}
