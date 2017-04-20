package database;

import database.Database;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Database db = new Database("localhost",3306,"test","root","");
		String[] val = new String[]{"'192'","'10:33'","'18.04.2017'","'33000'","'Irgendwas'"};
		System.out.println(db.connect());
		db.insertDatabase("t_Messungen", val);
	}

}
