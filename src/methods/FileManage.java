package methods;

import quantities.CBGV;
import quantities.CanBo;

import java.io.*;
import java.util.ArrayList;

public class FileManage {
    private static final String PATH = "E:\\module2\\baitap_module2\\thuchanh_7\\src\\CanBoFile";

    public static void writeFile(ArrayList<CBGV> canBoList) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(canBoList);

        oos.close();
        fos.close();
    }
    public static ArrayList<CBGV> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);

        return (ArrayList<CBGV>) ois.readObject();
    }
}
