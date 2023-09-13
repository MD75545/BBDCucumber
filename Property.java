package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	Properties pro;
	public String path = "D:\\Cucumber_SalesBoom\\Commandata.properties";

	public Property() {
		try {
			File file = new File(path);
			FileInputStream f1 = new FileInputStream(file);
			pro = new Properties();
			pro.load(f1);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String getUrl() {
		String url = pro.getProperty("Url");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("Username");
		return username;

	}

	public String getPassword() {
		String password = pro.getProperty("Password");
		return password;
	}

	public String getsBrowzer() {
		String browzer = pro.getProperty("Browzer");
		return browzer;
	}

	public String GetInvalidInvalidUsername() {
		String username = pro.getProperty("InvalidUsername");
		return username;
	}

	public String GetInvalidInvalidPassword() {
		String Password = pro.getProperty("InvalidPassword");
		return Password;
	}
}