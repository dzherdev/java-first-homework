package homeworks.lists;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Environment {

    private static Properties props = new Properties();
    private static final String FILE_NAME="file.properties";

    private Environment(){

    }

    public static Properties getEnvironment() throws IOException {
        if(props.isEmpty()){
            InputStream env = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILE_NAME);
            props.load(env);
        }
        return  props;
    }



}
