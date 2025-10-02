import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

    public static void main(String[] args) {


        try{
            FileInputStream fis=new FileInputStream("obj.txt");

            ObjectInputStream ois=new ObjectInputStream(fis);

           Student student= (Student)ois.readObject();
           student.displayName();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());
        }
        catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
