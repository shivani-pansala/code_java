import java.util.*;
import java.io.*;

class filem
{
    Scanner sc= new Scanner(System.in);
    String filename;
    File file;

    filem()
    {
        System.out.println("Enter File name" );
        filename=sc.nextLine();
        file=new File("D:\\Java\\"+filename);
    }
}
 class choice
 {
    choice()
    {
        System.out.println("1. Create_File");
        System.out.println("2. File_Name");
        System.out.println("3.File_Path");
        System.out.println("4.File_size");
        System.out.println("5. File_Read");
        System.out.println("6.File_Write");
        System.out.println("7.File_Rename");
        System.out.println("8.File_delete");
        System.out.println("9.File_Exit");
    }
 }
class filecreate extends filem
{
    filecreate()
    {
        try
        {
            if(file.createNewFile())
            {
                System.out.println("File is Created...");
            }
            else
            {
                System.out.println("File is Not Created...");
            }
        }
        catch(Exception e)
        {}
    }
}

class filename extends filem
{
    filename()
    {
        System.out.println("file name is"+file.getName());
    }
}
class filepath extends filem
{
    filepath()
    {
        System.out.println("File Path is "+file.getAbsolutePath());
    }
}
class filesize extends filem
{
  filesize()
  {
    System.out.println("File size is"+file.length());
  }
}
class filedelete extends filem
{
    filedelete()
    {
        System.out.println("File is deleted"+file.delete());
    }
}
class fileread extends filem
{
    fileread()
    {
        System.out.println("File reader ="+file.read());
    }
}
class Menu
{
    public static void main(String[] args) 
    {
        choice ch= new choice();

       while(true)
       {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Choice no=");
        int c=sc.nextInt();

        switch(c)
        {
            case  1:
              filecreate fc= new filecreate();
              break;

            case 2:
               filename fn= new filename();
               break;  

            case 3:
               filepath fp = new filepath();
               break;

            case 4:
              filesize fs= new filesize();
              break;

            case 5:
                filedelete fd=new filedelete();
                break;

            case 6:
                 System.out.println("hello...");
                 System.exit(0);
                 break;

             case 7:
                 fileread fr=new fileread();
                 break; 

            default:
                System.out.println("Invalid choice..");       

        }
       }        
    }
}