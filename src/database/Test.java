package database;

import database.Database;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/**
		Database db = new Database("localhost",3306,"test","root","");
		String[] val = new String[]{"'Hans'","'Peter'","'2003'"};
		System.out.println(db.connect());
		db.insertDatabase("t_accounts", val);
		**/
		Database db = new Database("192.168.178.250",3306,"test","root","Tresor132");
		String[] val = new String[]{"'Hans'","'Peter'","'2003'"};
		System.out.println(db.connect());
	}

}
