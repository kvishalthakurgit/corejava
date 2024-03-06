package ipa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
//check transient keyword
public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		int o = 0b011111;
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 1016;
		e.hname = "human name";

		try {
			FileOutputStream fileOut = new FileOutputStream("D://employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D://employee.ser");
		} catch (IOException | ArithmeticException |NoClassDefFoundError i) {
			i.printStackTrace();
		}
	}
}
