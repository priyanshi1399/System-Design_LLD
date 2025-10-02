import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial  {

    public static void main(String[] args) {

        try {
            //create object of student

            Student student = new Student("Priyanshi Singh", "priyanshi123@gmail.com", 24, "UttarPradesh");


            //write data to file
            FileOutputStream fos = new FileOutputStream("obj.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //how to serialize

            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("Object state is transferred to file Obj");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
