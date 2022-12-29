package QuanLySV;

import QuanLySV.FileService.FileService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> arrayList = new ArrayList<>();

    FileService fileService = new FileService();

    public void inputData(){
        SinhVien sinhVien = new SinhVien();
        sinhVien.input();
        arrayList.add(sinhVien);
        try {
            fileService.writeToFile(arrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFlie(){
        try {
            List<SinhVien> ls = fileService.readFromFile();
            ls.forEach(x -> System.out.println(x.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void editSV(){
        System.out.println("Nhap ma sinh can thao tac:");
        int idSV = new Scanner(System.in).nextInt();
        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).id == idSV){
                SinhVien sinhVien = new SinhVien();
                sinhVien.input();
                arrayList.set(i,sinhVien);
                System.out.println("Edit complete!!!");
            }

        }
    }
    public void daleteSV(){
        System.out.println("Nhap ma sinh can thao tac:");
        int idSV = new Scanner(System.in).nextInt();
        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).id == idSV){
                arrayList.remove(i);
                System.out.println("Delete complete!!!");
            }

        }
    }

    public void sortSvGPA(){

        Collections.sort(arrayList,(o1, o2) -> o1.Gpa - o2.Gpa);

    }
    public void sortSvName(){

        Collections.sort(arrayList,(o1, o2) -> o1.getName().compareTo(o2.getName()));

    }

    public void display(){
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).toString());
//        }
        arrayList.forEach(x -> System.out.println(x.toString()));
    }
}
