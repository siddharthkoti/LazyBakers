package snippet;

public class Snippet {
	org.hibernate.HibernateException: /hibernate.cfg.xml not found
		at org.hibernate.internal.util.ConfigHelper.getResourceAsStream(ConfigHelper.java:173)
		at org.hibernate.cfg.Configuration.getConfigurationInputStream(Configuration.java:2095)
		at org.hibernate.cfg.Configuration.configure(Configuration.java:2076)
		at org.hibernate.cfg.Configuration.configure(Configuration.java:2056)
		at lazybakers.model.repository.impl.HibernateUtil.getSessionFactory(HibernateUtil.java:16)
		at lazybakers.model.repository.impl.ToppingRepositoryImpl.getAllTopping(ToppingRepositoryImpl.java:102)
		at lazybakers.service.impl.ToppingServiceImpl.getAllTopping(ToppingServiceImpl.java:44)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:317)
		at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:190)
		at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:157)
		at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:99)
		at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:281)
		at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:96)
		at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
		at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:207)
		at com.sun.proxy.$Proxy56.getAllTopping(Unknown Source)
		at lazybakers.controller.ToppingController.getalltopping(ToppingController.java:30)
		at ToppingControllerTest.test(ToppingControllerTest.java:34)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
		at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
		at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
		at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
		at org.springframework.test.context.junit4.statements.RunBeforeTestMethodCallbacks.evaluate(RunBeforeTestMethodCallbacks.java:73)
		at org.springframework.test.context.junit4.statements.RunAfterTestMethodCallbacks.evaluate(RunAfterTestMethodCallbacks.java:82)
		at org.springframework.test.context.junit4.statements.SpringRepeat.evaluate(SpringRepeat.java:73)
		at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
		at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:224)
		at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:83)
		at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
		at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
		at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
		at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
		at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
		at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
		at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:68)
		at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
		at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:163)
		at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)
		at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)
	
	
}
