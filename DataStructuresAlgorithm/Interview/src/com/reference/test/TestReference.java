package com.reference.test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import org.junit.Test;
public class TestReference {
	@Test
	public void testStrongReference(){
		Object referent = new Object();
		//System.out.println(referent);
		Object strongReference = referent;
		referent = null;
		//System.out.println(strongReference);
		System.gc();
		assertNotNull(strongReference);
	}
	@Test
	public void testSoftReference(){
		String str = "test";
		SoftReference<String> softreference = new SoftReference<String>(str);
		str = null;
		System.gc();
		assertNotNull(softreference.get());
	}
	@Test
	public void testWeakReference(){
		String str = "test";
		WeakReference<String> weakReference = new WeakReference<String>(str);
		str = null;
		System.gc();
		assertNull(weakReference.get());
	}
	@Test
	public void testPhantomReference(){
		String str = "test";
		PhantomReference<String> phantomReference = new PhantomReference<String>(str, null);
		str = null;
		System.gc();
		assertNotNull(phantomReference.get());
	}
	public static void main(String[] args) {
		
		new TestReference().testStrongReference();

	}

}
