package club.jadeshu.base.sxt.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	public String name;
	public int age;
	public int height;
	transient int weight;  // transient 透明 ，不参与序列化
}

/**
 * @ClassName: ObjectIO01
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午3:45:28
 * @Description: ObjectInputStream ObjectOutputStream
 */
public class ObjectIO01 {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"ObjectIO01.dat"));
		Person person = new Person();
		person.age = 20;
		person.name = "jadeshu";
		person.height = 120;
		person.weight = 20;

		oos.writeObject(person);
		oos.flush();
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"ObjectIO01.dat"));
		Person person2 = (Person) ois.readObject();
		System.out.println(person2.weight);
		ois.close();
	}

}