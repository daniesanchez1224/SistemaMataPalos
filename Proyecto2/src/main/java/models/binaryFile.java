
package models;
import java.io.*;


public class binaryFile {
    
    private void writebinari(){
        try{
        FileOutputStream fos=new FileOutputStream("Usser.bin");
        ObjectOutputStream read = new ObjectOutputStream(fos);
        }
        catch (FileNotFoundException e){
            e.printStackTrace(System.out);
            
        }
        
    }
    
}
