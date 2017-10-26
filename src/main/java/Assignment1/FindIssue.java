//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matric: #240102
//Name: #Cheryn Lee Shueh Yin

package Assignment1;

import java.io.File;
import java.lang.reflect.Method;

public class FindIssue {
    
    private int issue;
    
    public int getIssue(File[] targetFiles){
        
        for (File file : targetFiles) 
        {
            String fileName = file.getName();
            int removeType = fileName.lastIndexOf(".");
            if (removeType > 0) {
                fileName = fileName.substring(0, removeType); //to remove ".java" from the file name
            }
            
            FindIssue f = new FindIssue();
            String packageName = f.getClass().getPackage().getName();
            
            Method mainMethod;
            try{
                Class name;

                if(!packageName.equals("")){
                    packageName = packageName.replace("/",".");
                    name = Class.forName(packageName+"."+fileName);
                }
                else 
                    name = Class.forName(fileName);
                
                mainMethod = name.getMethod("main", new Class[]{String[].class});
                if(mainMethod != null){
                    issue++;
                }
            }catch(ClassNotFoundException | NoSuchMethodException | SecurityException e){ 
            }  
        }
        
        return issue;
    }
}
