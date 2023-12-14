package com.ecommerce.qa.utilities;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry implements IRetryAnalyzer {
	private int MAX_RETRY_COUNT = 3;
    private int retryCount = 0;
    public boolean retry(ITestResult iTestResult){
     
    	if(!iTestResult.isSuccess()){
    		if(retryCount < MAX_RETRY_COUNT){
    			retryCount++;
    		}
    		return true;
    	}
    	return false;
    }
    
}
