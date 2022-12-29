package QuanLySV.FileService;

import QuanLySV.SinhVien;

import java.io.*;
import java.util.List;

public class FileService {

    public static void writeToFile(List<SinhVien> sinhViens) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("SinhVien.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sinhViens);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static List<SinhVien> readFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("SinhVien.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        return (List<SinhVien>) objectInputStream.readObject();
    }

}
