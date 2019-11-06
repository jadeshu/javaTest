package club.jadeshu.dataStruct;

class Data2 {
	String name;	// 保存的数据
	int age;		// 保存的数据
}

public class MyList {
	class Node {
		Data2 data2;
		Node nextNode;
	}
	Node head = null;	// 头结点

	@SuppressWarnings("unused")
	Node addEnd(Data2 date) {
		Node node = null;
		if((node = new Node()) ==null){
            System.out.print("申请内存失败！\n"); 
            return null;  							//分配内存失败 
        }else{
        	node.data2 = date;
        	node.nextNode = null;
        	
        	if (this.head == null) {
				this.head = node;
			}else {
				Node tempNode =  this.head;
				while (tempNode.nextNode != null) {
					tempNode = tempNode.nextNode;
				}
				tempNode.nextNode = node;
			}
        }
		
		return this.head;
	}
	
	@SuppressWarnings("unused")
	Node addFrist(Data2 date) {
		Node node = null;
		if((node = new Node()) ==null){
            System.out.print("申请内存失败！\n"); 
            return null;  							//分配内存失败 
        }else{
        	node.data2 = date;
        	node.nextNode = this.head;
        	this.head = node;
        }
		return this.head;
	}
	
	void dispy() {
		Node node = this.head;
		while (node != null) {
			System.out.println("姓名："+node.data2.name + " " + "年龄：" + node.data2.age);
			node = node.nextNode;
		}
	}
	
	public static void main(String[] args) {
		MyList myList = new MyList();
		Data2 d1 = new Data2();
		d1.age = 20;
		d1.name = "shuyugan";
		myList.addEnd(d1);
		Data2 d2 = new Data2();
		d2.age = 30;
		d2.name = "jade";
		myList.addEnd(d2);
		
		Data2 d3 = new Data2();
		d3.age = 40;
		d3.name = "caihua";
		myList.addFrist(d3);
		
		myList.dispy();
	}

}
