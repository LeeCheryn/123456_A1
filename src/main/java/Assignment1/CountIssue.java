//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matric: #240102
//Name: #Cheryn Lee Shueh Yin

package Assignment1;

import java.io.File;

public class CountIssue {
    
    public static void main(String[] args) {
       
        String directory = System.getProperty("user.dir");
        directory = directory.replace("\\", "/");
        
        String filePath = "", packageName = "";
        GetJavaFiles j = new GetJavaFiles();
       
        try {
            packageName = j.getClass().getPackage().getName(); //to retrieve package name of this class
            packageName = packageName.replace(".","/");
            filePath = directory+"/src/main/java/"+packageName+"/"; //for file that inside a package
            
        }catch (Exception e){
            filePath = directory+"/src/main/java"; //for file that inside default package
        }
        
        GetJavaFiles javaFiles = new GetJavaFiles();
        File[] targetFiles = javaFiles.getJavaFiles(filePath);
        
        FindIssue found = new FindIssue();
        int foundIssues = found.getIssue(targetFiles);
        
        System.out.println("Number of Java Files = " + targetFiles.length);
        System.out.println("Number of Issues = " + foundIssues);
    }
   
}


