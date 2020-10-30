package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Emp(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Emp() {
		
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void print() {
		System.out.println("id: "+id+"  name:"+ name+"  address:"+address);
	}
	
}
public class Q3 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	//serialization
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"));
	Emp emp=new Emp(12,"dhathri","SR");
	emp.print();
	oos.writeObject(emp);
	System.out.println(emp);
	
	System.out.println("object is written");
	
	//deserialization
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.ser"));	
	System.out.println(emp);
}
}
