package club.jadeshu.dataStruct;

import java.lang.reflect.Array;

public class MyArray{
	private long[] arr;
	private int len;
	
	public MyArray() {
		this(50);
	}
	
	public MyArray(int size) {
		this.arr = new long[size];
		this.len = 0;
	}
	
	/*
	 * 添加数据
	 */
	public void add(long e) {
		this.arr[this.len] = e;
		this.len++;
	}
	
	/*
	 * 删除数据
	 */
	public boolean removeByData(long e) {
		for (int i = 0; i < this.len; i++) {
			if (this.arr[i] == e) {
				for (int j = i; j < (this.len-1); j++) {
					this.arr[j] = this.arr[j+1];
				}
				this.len--;
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * 根据索引进行删除
	 */
	public boolean removeByIndex(int index) {
		if (index < 0 || index >= this.len) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for (int i = index; i < (this.len-1); i++) {
			this.arr[i] = this.arr[i+1];
		}
		
		this.len--;
		return true;
	}
	
	/*
	 * 显示数据
	 */
	public void show() {
		System.out.print("[");
		for (int i = 0; i < this.len; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.print("]");
	}
	
	/*
	 * 查找数据
	 */
	public int findByData(long e) {
		for (int i = 0; i < this.len; i++) {
			if (this.arr[i] == e) {
				return i;
			}
		}
		return -1;
	}
	/*
	 * 根据索引来查找数据
	 */
	public long findByIndex(int index) {
		if (index < 0 || index >= this.len) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		return this.arr[index];
	}
	
	/*
	 * 根据索引更新数据
	 */
	public void change(int index, long newValue) {
		if (index < 0 || index >= this.len) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		this.arr[index] = newValue;
	}
	
	public static void main(String[] args) {
		MyArray myArr = new MyArray();
		myArr.add(13);
		myArr.add(43);
		myArr.add(55);
		myArr.add(2);
		myArr.add(103);
		myArr.show();
		
		System.out.println();
		int index = myArr.findByData(103);
		System.out.println("位置在数组的第" + (index+1) + "位!");
		
		myArr.removeByData(103);
		myArr.show();
		
		System.out.println();
		myArr.removeByIndex(1);
		myArr.show();
		
		System.out.println();
		long num = myArr.findByIndex(0);
		System.out.println("根据索引查找到的数据为：" + num);
		
		myArr.removeByIndex(2);
		myArr.show();
	}
}

////泛型
//public class MyArray<T>{
//	private T[] arr;
//	private int len;
//	
////	public MyArray() {
////		this.arr = (T[])(Array.newInstance(this.arr.getClass().getComponentType(), 50));
////		this.len = 0;
////	}
//	public MyArray(Class<T> type) {
//		this(type, 50);
//	}
//	
//	public MyArray(Class<T> type,int size) {
//		// 记录: (T[])(Array.newInstance(arr.getClass().getComponentType(), size));
//		this.arr = (T[])Array.newInstance(type, size);
//		this.len = 0;
//	}
//	
//	/*
//	 * 添加数据
//	 */
//	public void add(T e) {
//		this.arr[this.len] = e;
//		this.len++;
//	}
//	
//	/*
//	 * 删除数据
//	 */
//	public boolean removeByData(T e) {
//		for (int i = 0; i < this.len; i++) {
//			if (this.arr[i] == e) {
//				for (int j = i; j < (this.len-1); j++) {
//					this.arr[j] = this.arr[j+1];
//				}
//				this.len--;
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	
//	/*
//	 * 根据索引进行删除
//	 */
//	public boolean removeByIndex(int index) {
//		if (index < 0 || index >= this.len) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		
//		for (int i = index; i < (this.len-1); i++) {
//			this.arr[i] = this.arr[i+1];
//		}
//		
//		this.len--;
//		return true;
//	}
//	
//	/*
//	 * 显示数据
//	 */
//	public void show() {
//		System.out.print("[");
//		for (int i = 0; i < this.len; i++) {
//			System.out.print(this.arr[i] + " ");
//		}
//		System.out.print("]");
//	}
//	
//	/*
//	 * 查找数据
//	 */
//	public int findByData(T e) {
//		for (int i = 0; i < this.len; i++) {
//			if (this.arr[i] == e) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	/*
//	 * 根据索引来查找数据
//	 */
//	public T findByIndex(int index) {
//		if (index < 0 || index >= this.len) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		
//		return this.arr[index];
//	}
//	
//	/*
//	 * 根据索引更新数据
//	 */
//	public void change(int index, T newValue) {
//		if (index < 0 || index >= this.len) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		
//		this.arr[index] = newValue;
//	}
//	
//	public static void main(String[] args) {
//		MyArray<Long> myArr = new MyArray<Long>(Long.class);
//		myArr.add((long) 13);
//		myArr.add((long) 43);
//		myArr.add((long) 55);
//		myArr.add((long) 2);
//		myArr.add((long) 103);
//		myArr.show();
//		
//		System.out.println();
//		int index = myArr.findByData((long) 103);
//		System.out.println("位置在数组的第" + (index+1) + "位!");
//		
//		myArr.removeByData((long) 103);
//		myArr.show();
//		
//		System.out.println();
//		myArr.removeByIndex(1);
//		myArr.show();
//		
//		System.out.println();
//		long num = myArr.findByIndex(0);
//		System.out.println("根据索引查找到的数据为：" + num);
//		
//		myArr.removeByIndex(2);
//		myArr.show();
//	}
//}