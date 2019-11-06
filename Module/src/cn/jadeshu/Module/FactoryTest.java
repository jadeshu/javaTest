package cn.jadeshu.Module;

/**
 * @ClassName: Product 
 * @version V1.0
 * @author: jadeshu
 * @Description:工厂方法
 * 工厂方法：生产单一产品，具体什么工厂生产什么产品
 */
// 产品接口
interface ProductC{
	void Show();
}

// 具体产品C1
class ProductC1 implements ProductC{

	@Override
	public void Show() {
		System.out.println("I'm ProductC1");
	}
	
}

// 具体产品C2
class ProductC2 implements ProductC{

	@Override
	public void Show() {
		System.out.println("I'm ProductC2");
	}
	
}

// 抽象工厂接口
interface Factory{
	ProductC createProduct();
}

// 工厂C1(能生产产品C1的具体产品)
class ProductC1Factory implements Factory{

	@Override
	public ProductC createProduct() {
		return new ProductC1();
	}
	
}

// 工厂C2(能生产产品C2的具体产品)
class ProductC2Factory implements Factory{

	@Override
	public ProductC createProduct() {
		return new ProductC2();
	}
	
}

public class FactoryTest {

	public static void main(String[] args) {
		ProductC1Factory f1 = new ProductC1Factory();
		ProductC p1 =  f1.createProduct();
		p1.Show();
		
		ProductC2Factory f2 = new ProductC2Factory();
		ProductC p2 =  f2.createProduct();
		p2.Show();
	}

}
