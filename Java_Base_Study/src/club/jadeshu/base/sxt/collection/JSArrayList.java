package club.jadeshu.base.sxt.collection;

import java.beans.IntrospectionException;
import java.util.List;

/** 
 * @ClassName: JSArrayList 
 * @version V1.0
 * @author: jadeshu
 * @date: 2019年1月15日 下午9:02:52 
 * @Description:  
 */
public class JSArrayList {
	private Object[] elementData;
	private int size;
	
	public JSArrayList() {
		this(10);
	}

	public JSArrayList(int initCapacity) {
		elementData = new Object[initCapacity];
	}

	public int size(){
		return this.size;
	}
	
	public void add(Object obj) {
		if (this.size >= this.elementData.length) {
			Object[] newObjects = new Object[this.size * 2];
			System.arraycopy(elementData, 0, newObjects, 0, elementData.length);
			elementData = newObjects;
		}
		
		elementData[size++] = obj;
	}
	
	public Object get(int index) {
		if (index < 0 || index >= this.size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return elementData[index];
	}
	
	public void remove(int index) {
		if (index < 0 || index >= this.size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int len = elementData.length - 1;
		
		for (int i = index; i < len; i++) {
			elementData[i] = elementData[i + 1];
		}
		this.size--;
	}
	
	public static void main(String[] args) {
		JSArrayList list = new JSArrayList(2);
		list.add("sjdksajk");
		list.add("1121212");
		list.add("sjd443434ksajk");
		
		list.add("sjdrerwerewksajk");
		
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
