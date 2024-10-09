package eshop.CucumberFramework.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfiguratorManager {

    public static Properties prop;
    public static Properties getConfiguration(){
        prop = new Properties();
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Resources/GlobalData.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            prop.load(fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;



    }
}
