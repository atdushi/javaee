
package com.virtualpairprogrammers.staffmanagement;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SystemUnavailableException", targetNamespace = "http://staffmanagement.virtualpairprogrammers.com/")
public class SystemUnavailableException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SystemUnavailableException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SystemUnavailableException_Exception(String message, SystemUnavailableException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SystemUnavailableException_Exception(String message, SystemUnavailableException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.virtualpairprogrammers.staffmanagement.SystemUnavailableException
     */
    public SystemUnavailableException getFaultInfo() {
        return faultInfo;
    }

}
