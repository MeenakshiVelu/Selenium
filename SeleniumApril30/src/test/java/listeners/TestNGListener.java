package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{
	
	

@Override
public void onTestStart(ITestResult result) {
	System.out.println("Test is started: "+ result.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test is successful: "+ result.getName());
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test is failed: "+ result.getName());
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test is skipped: "+ result.getName());
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Test is onTestFailedButWithinSuccessPercentage: "+ result.getName());
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("Test is onTestFailedWithTimeout: "+ result.getName());
}


}
