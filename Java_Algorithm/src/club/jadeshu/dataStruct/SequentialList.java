package club.jadeshu.dataStruct;

import java.util.Scanner;

/***
 * @ClassName: Data 
 * @version V1.0
 * @author: jadeshu
 * @date: 2019年2月24日 下午11:26:07 
 * @Description:测试数据类的结构
 */
class Data {
	String key;		// 结点的关键字 
	String name;	// 保存的数据
	int age;		// 保存的数据
}

/***
 * @ClassName: SeqList 
 * @version V1.0
 * @author: jadeshu
 * @date: 2019年2月24日 下午11:25:52 
 * @Description:顺序表,索引从1开始存储
 */
class SeqList {
	static final int MAXLEN = 100;	// 定义顺序表的最大长度
	private Data[] listData = new Data[MAXLEN + 1];		// 保存顺序表的结构数组 从1开始
	private int size;	// 顺序表已存结点的数量
	
	public int getSize() { // 返回顺序表的元素个数
		return size;
	}

	public SeqList() {
		this.size = 0;
	}

	// 添加数据到顺序表末尾
	public boolean addEnd(Data data) {
		if (this.size >= MAXLEN) {
			System.out.println("顺序表已满，不能再添加结点了！");
			return false;
		}
		
		this.listData[++this.size] = data;
		return true;
	}
	
	// 插入数据元素到顺序表的索引index处
	public boolean insert(int index, Data data) {
		if (this.size >= MAXLEN) {
			System.out.println("顺序表已满，不能插入结点！");
			return false;
		}
		
		if (index < 1 || index > this.size) {
			System.out.println("元素序号错误，不能插入元素！");
			return false;
		}
		
		for (int i = this.size; i >= index; i--) {
			this.listData[i + 1] = this.listData[i];
		}
		this.listData[index] = data;
		this.size++;
		return true;
	}
	
	// 根据索引删除顺序表中的数据元素
	public boolean delete(int index) {
		if (index < 1 || index > this.size) {
			System.out.println("删除结点序号错误，不能删除结点！");
            return false;              	//删除不成功，返回0
		}
		
		for (int i = index; i < this.size; i++) {
			this.listData[i] = this.listData[i + 1];
		}
		this.size--;
		return true;
	}
	
	// 根据索引返回数据
	public Data findByIndex(int index) {	
		if (index < 1 || index > this.size) {
			System.out.println("结点序号错误，不能返回结点！");
			return null;
		}
		
		return this.listData[index];
	}
	
	// 根据关键字key来查找,返回索引位置
	public int findByKey(String key) {
		for (int i = 1; i <= this.size; i++) {
			if (this.listData[i].key.compareTo(key) == 0) {
				return i;	// 返回节点序号
			}
		}
		return 0;	// 未找到
	}
	
	// 显示
	public void show() {
		for (int i = 1; i <= this.size; i++) {
			System.out.printf("%s,%s,%d\n", this.listData[i].key,
					this.listData[i].name, this.listData[i].age);
		}
	}
}

public class SequentialList {
	public static void main(String[] args) {
		
		System.out.println("顺序表操作练习！");
		SeqList sList = new SeqList();	// 定义顺序表
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("请输入添加的结点(学号[key]、姓名、年龄)");
			Data data = new Data();
			data.key = scanner.next();
			data.name = scanner.next();
			data.age = scanner.nextInt();
			
			if (data.age != 0) {
				if (!sList.addEnd(data)) {
					break;
				}
			} else {	// 输入年龄为0则退出输入
				break;
			}
		} while (true);
		
		System.out.println("顺序表中的节点顺序为：");
		sList.show();
		
		System.out.println("\n要取出结点的序号：");
		int index = scanner.nextInt();   //输入节点序号    
		Data pdata = sList.findByIndex(index);
		if (pdata != null) {
			System.out.printf("第%d个结点为：(%s,%s,%d)\n",index,pdata.key,pdata.name,pdata.age);
		}
		
		System.out.println("\n要查找结点的关键字：");
		String keyStr = scanner.next();
		index = sList.findByKey(keyStr); // 按关键字查找返回序号
		
		pdata = sList.findByIndex(index); // 按序号查找，返回节点数据
		if (pdata != null) {
			System.out.printf("第%d个结点为：(%s,%s,%d)\n",index,pdata.key,pdata.name,pdata.age);
		}
	}
}