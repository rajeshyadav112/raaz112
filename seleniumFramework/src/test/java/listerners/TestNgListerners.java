package listerners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListerners implements ITestListener{
	
	  @Override
	public void onTestStart(ITestResult result) {
		
		  System.out.println("*****test started"+result.getTestName());
	}
	  
	  
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("****Test suceed"+ result.getTestName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("*****test skikkepd"+result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("****on test failure"+ result.getInstanceName());
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println(result.getEndMillis());
	}
	
	   

}
