package com.rishabh.utilities;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    Properties properties;

    public ConfigReader() {

        properties = new Properties();

        try {

            InputStream inputStream =
                    getClass().getClassLoader()
                            .getResourceAsStream("config.properties");

            properties.load(inputStream);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public String getBrowser() {

        return properties.getProperty("browser");
    }

    public String getUrl() {

        return properties.getProperty("url");
    }
}