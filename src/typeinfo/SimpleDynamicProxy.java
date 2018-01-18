package typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.sun.org.apache.regexp.internal.recompile;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;

	public DynamicProxyHandler(Interface interface1) {
		this.proxied=interface1;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("*** proxy:"+proxy.getClass()+".method: "+method+", args: "+args);
		return method.invoke(proxied, args);
	}
}
public class SimpleDynamicProxy{
	public static void consumer(Interface interface1) {
		interface1.doSomething();
		interface1.somethingElse("bononbo");
	}
	public static void main(String[] args) {
		RealObject object=new RealObject();
		consumer(object);
		Interface proxy=(Interface)Proxy.newProxyInstance(SimpleDynamicProxy.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(object));
		consumer(proxy);
	}
}
