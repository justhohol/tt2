package z_test.test3serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestSerializable {

    /**
     * @title: main
     * @author
     * @description:
     * @date 2016-3-3 下午4:00:38
     * @param args
     * @throws
     */

    public static void main(String[] args) {
        // Father f = new Father("new f", "mew f");
        // f.跑();
        Son s = new Son("P", "P", "P");
        String url = "D://TestSerializable222.txt";
        try {
            File file = new File(url);
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(out);
            s.show();
            oout.writeObject(s);
            // Son obj = new Son("O", "O", "O");
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fin);
            // obj = (Son) in.readObject();
            // obj.show();
            System.out.println("=========================");
            Object o = in.readObject();
            System.out.println(o.toString());
            System.out.println("=========================");
            /*String className = "";
               Class.forName(className);
               Son SSS = Son.class.newInstance();
             */
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
