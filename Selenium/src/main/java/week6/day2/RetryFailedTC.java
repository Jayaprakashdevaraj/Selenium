package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTC implements IRetryAnalyzer{

	int maxRetry = 3;  //max retry count
	int retryCount =0; // initial count
	
	
	public boolean retry(ITestResult result) {

		if(!result.isSuccess() && retryCount < maxRetry) {   //taking faild case && retry count should be less or equal 3
			
			retryCount++;  // count increase
			return true;   // if true loop close
		}
		return false;    // testcase failed in recheck too
	}

	
}
