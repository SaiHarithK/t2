package com.example;

/**
 * Hello world!
 *
 */
 import java.io.File;
 import java.io.IOException;
 import com.google.common.collect.ImmutableList;
 import org.apache.commons.io.FileUtils;
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> list = ImmutableList.of("APple", "bannnana");
        System.out.println(list);
        
        File src = new File("source.txt");
        File dest = new File("destination.txt");
        
        try {
        	FileUtils.copyFile(src, dest);
        	
        	System.out.println("successs");
        }
        catch (IOException e) {
        	System.out.println(e.getMessage());
        }
    }
}
