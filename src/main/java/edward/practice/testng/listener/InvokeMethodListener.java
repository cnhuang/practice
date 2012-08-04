package edward.practice.testng.listener;

import java.util.Arrays;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokeMethodListener implements IInvokedMethodListener
{

	public void afterInvocation(IInvokedMethod method, ITestResult result)
	{
		if (method.isTestMethod())
		{
			System.out.println("After Listener for " + method.getTestMethod().getMethodName());
			System.out.println(result.getThrowable());
			System.out.println(Arrays.toString(result.getParameters()));
			System.out.println(result.isSuccess());
			result.setStatus(ITestResult.SUCCESS);
			for(String s : result.getAttributeNames())
				System.out.print(s+",");
			System.out.println();
		}

	}

	public void beforeInvocation(IInvokedMethod method, ITestResult result)
	{
		if (method.isTestMethod())
		{
			System.out.println("Before Listener for " + method.getTestMethod().getMethodName());
			System.out.println(result.getThrowable());
			System.out.println(Arrays.toString(result.getParameters()));
			
		}
	}

}
