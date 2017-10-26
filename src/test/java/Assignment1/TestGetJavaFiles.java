//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matric: #240102
//Name: #Cheryn Lee Shueh Yin

package Assignment1;

import java.io.File;
import junit.framework.Assert;
import org.junit.Test;

public class TestGetJavaFiles {
    
    String directory = System.getProperty("user.dir");
    String filePath = directory + "/src/test/java/Assignment1"; //use the test files in test packages as resources to test
    
    @Test
    public void TestGetJavaFiles1(){
        GetJavaFiles gjf = new GetJavaFiles();
        File[] numOfFiles = gjf.getJavaFiles(filePath);
        Assert.assertNotNull(numOfFiles);
    }
    
    @Test
    public void TestGetJavaFiles2(){
        GetJavaFiles gjf = new GetJavaFiles();
        File[] numOfFiles = gjf.getJavaFiles(filePath);
        int count=0;
        for(File file : numOfFiles)
            count++;
        Assert.assertEquals(2, count);
    }
}
