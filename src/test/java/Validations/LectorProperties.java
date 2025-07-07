package Validations;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LectorProperties {

	private static Properties props = new Properties();

	static {
		try {
			InputStream input = LectorProperties.class.getClassLoader().getResourceAsStream("properties/Config_properties");
			props.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String get(String clave) {
		return props.getProperty(clave);
	}
}
