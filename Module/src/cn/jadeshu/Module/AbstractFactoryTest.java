package cn.jadeshu.Module;

/**
 * @ClassName: ProductA 
 * @version V1.0
 * @author: jadeshu
 * @date: 2019年1月21日 下午6:32:43 
 * @Description:抽象工厂方法
 * 1.抽象工厂能生产一系统产品
 */

// 产品A接口
interface ProductA{
	void Show();
}

// 具体产品A1
class ProductA1 implements ProductA{

	@Override
	public void Show() {
		System.out.println("I'm ProductA1");
	}
	
}

// 具体产品A2
class ProductA2 implements ProductA{

	@Override
	public void Show() {
		System.out.println("I'm ProductA2");
	}
	
}

//产品B接口
interface ProductB{
	void Show();
}

// 具体产品B1
class ProductB1 implements ProductB{

	@Override
	public void Show() {
		System.out.println("I'm ProductB1");
	}
	
}

// 具体产品B2
class ProductB2 implements ProductB{

	@Override
	public void Show() {
		System.out.println("I'm ProductB2");
	}
	
}

// 抽象工厂接口(具备能生产产品A和产品B两种产品的能力)
interface AbstractFactory{
	ProductA createProductA();
	ProductB createProductB();
}

// 工厂1(能生产产品A1和产品B1的具体产品)
class Factory1 implements AbstractFactory{

	@Override
	public ProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB1();
	}
	
}

// 工厂2(能生产产品A2和产品B2的具体产品)
class Factory2 implements AbstractFactory{

	@Override
	public ProductA createProductA() {
		return new ProductA2();	
	}

	@Override
	public ProductB createProductB() {
		return new ProductB2();
	}
	
}
public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory factory1 = new Factory1();
		ProductA pA1 = factory1.createProductA();
		ProductB pB1 = factory1.createProductB();
		
		pA1.Show();
		pB1.Show();
		
		AbstractFactory factory2 = new Factory2();
		ProductA pA2 = factory2.createProductA();
		ProductB pB2 = factory2.createProductB();
		
		pA2.Show();
		pB2.Show();
	}

}
