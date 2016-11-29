package pack5;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object target)
			throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked!");
	}

}
