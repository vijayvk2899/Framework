package utils;

import base.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility extends BaseClass {

    public PropertyUtility() throws IOException {
        prop=new Properties();
        File f= new File("D:\\Code\\test\\TestFramework1\\src\\test\\resources\\configuration\\Application.properties");
        FileInputStream fis=new FileInputStream(f);
        prop.load(fis);
    }
}
