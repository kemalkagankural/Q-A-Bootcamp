package appium.capabilities;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Map;

public class Load_capabilities {
	public static DesiredCapabilities pathToDesiredCapabilitites(String path) {
		try {
			Gson gson = new Gson();
			Type type = new TypeToken<Map<String, ?>>(){}.getType();
			Map<String , ?> map =  gson.fromJson(new FileReader(path), type);
			return new DesiredCapabilities(map);
        } catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
