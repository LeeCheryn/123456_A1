//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matric: #240102
//Name: #Cheryn Lee Shueh Yin

package Assignment1;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class TestFindIssue {
    
    
    String directory = System.getProperty("user.dir");
    String filePath = directory + "/src/main/java/Assignment1";
    
    @Test
    public void testGetIssue1(){
       GetJavaFiles gjf = new GetJavaFiles();
       File[] testFiles = gjf.getJavaFiles(filePath);
       FindIssue fi = new FindIssue();
       int issue = fi.getIssue(testFiles);
       Assert.assertNotNull(issue);
    }
    
    @Test
    public void testGetIssue2(){
       GetJavaFiles gjf = new GetJavaFiles();
       File[] testFiles = gjf.getJavaFiles(filePath);
       FindIssue fi = new FindIssue();
       int issue = fi.getIssue(testFiles);
       Assert.assertEquals(3, issue);
    }
}
