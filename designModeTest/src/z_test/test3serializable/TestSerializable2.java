package z_test.test3serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSerializable2 {

    /**
     * @title: main
     * @author
     * @description:
     * @date 2016-3-3 下午4:00:38
     * @param args
     * @throws
     */

    public static void main(String[] args) {
        String url = "D://TestSerializable222Person.txt";
        try {
            Person person = new Person();
            person.age = 1;
            person.name = "666";
            System.out.println("11" + person.show());
            File file = new File(url);
            /*          FileOutputStream fout = new FileOutputStream(file);
                        ObjectOutputStream oop = new ObjectOutputStream(fout);
                        oop.writeObject(person);*/
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(fi);
            Person person2;
            person2 = (Person) oin.readObject();
            oin.close();
            System.out.println("22" + person2.show());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
