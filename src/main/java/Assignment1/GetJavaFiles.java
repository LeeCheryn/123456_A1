//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matric: #240102
//Name: #Cheryn Lee Shueh Yin

package Assignment1;

import java.io.File;
import java.io.FilenameFilter;

public class GetJavaFiles {
    
    public File[] getJavaFiles(String filePath){
       
        File folder = new File(filePath);
        
        FilenameFilter javaFileFilter = new FilenameFilter()
        {    
            @Override
            public boolean accept(File directory, String name)
            {
                return (name.endsWith(".java"))&&(!name.equals("CountIssue.java")&&(!name.equals("GetJavaFiles.java"))&&(!name.equals("FindIssue.java")));
            }
        };
         
        File[] files = folder.listFiles(javaFileFilter);
        return files;
    }
}
