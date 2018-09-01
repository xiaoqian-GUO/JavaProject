//CopyBytes
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

class CopyBytes{
    public static void main(String[] args) throws IOException {
        //字节流一般用于读写二进制数据
        
        // File file1=new File("G:\\JAVA\\in.txt");
        // File file2=new File("G:\\JAVA\\out.txt");

        // FileInputStream in=new FileInputStream(file1);
        // FileOutputStream out=new FileOutputStream(file2);

        // int c;

        // try {
        //     while((c=in.read())!=-1){
        //         out.write(c);
        //     }
        //     in.close();
        //     out.close();
        //     System.out.print("this is a test!");
            
        // } catch (Exception e) {
        //     System.out.print(e.getMessage());
        // }


        
        //字符流一般用于读写文本类数据
        /* FileReader in = new FileReader("G:\\JAVA\\in.txt");
        FileWriter out = new FileWriter("G:\\JAVA\\out.txt");

        int c;
        while((c=in.read())!=-1){
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("success!!!"); */

        //QuickSort:

        // int []test={1,12,6,4,9,24,34,22};
        // FileWriter fw=new FileWriter("G:\\JAVA\\out.txt");

        // Partition p = new Partition();
        // p.QuickSort(test,0,test.length-1);
        // for(int i=0;i<test.length;i++){
        //     System.out.println("test["+i+"]:"+test[i]);
        //     String temp=Integer.toString(test[i])+"\n";
        //     if(temp!=null){
        //         fw.write(temp);
        //     }
        // }
        // fw.close();
        // System.out.println("success!!!");

        //System.in

        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("please input:");
        // try {
        //     String s=br.readLine();
        //     while(!(s.equals("exit"))){
        //         System.out.println("read:"+s);
        //         s=br.readLine();
        //     }
        //     System.out.println("End of Inputting");
        //     br.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


        //get all files

        // File newFile=new File("G:\\HTML");
        // String[] lists=newFile.list();
        // System.out.println(lists[1]);



        //



    }
}