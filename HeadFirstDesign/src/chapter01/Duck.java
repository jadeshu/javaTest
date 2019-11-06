package chapter01;

// 鸭子类
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}
	
	public abstract void display();
	
	// 执行飞行
	public void performFly() {
		flyBehavior.fly();
	}
	
	// 执行叫声
	public void performQuack() {
		quackBehavior.quack();
	}
	
	// 设定行为
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
