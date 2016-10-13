package z_test.test3serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person extends Animal implements Serializable {

    private static final long serialVersionUID = 8080347569127304440L;

    public String name;

    public int age;

    public String show() {
        StringBuffer sb = new StringBuffer();
        sb.append("[name:").append(name).append(",age:").append(age);
        sb.append(",type:").append(getType()).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        String url = "D://TestSerializable222Person.txt";
        try {
            Person person = new Person();
            person.age = 1;
            person.name = "2";
            System.out.println("11" + person.show());
            File file = new File(url);
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oop = new ObjectOutputStream(fout);
            oop.writeObject(person);
            oop.close();
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
