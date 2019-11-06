package chapter01;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("========改变野鸭子的飞行 行为========");
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		System.out.println("========改变野鸭子的叫 行为========");
		mallardDuck.setQuackBehavior(new MuteQuack());
		mallardDuck.performQuack();

	}

}
