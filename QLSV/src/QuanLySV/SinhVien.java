package QuanLySV;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable {
    int id;
    String name;
    int age;
    String address;
    int Gpa;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID:");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho ten :");
        this.name = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi:");
        this.address = scanner.nextLine();
        System.out.println("Nhap GPA:");
        this.Gpa = scanner.nextInt();
    }


    public void display(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", Gpa=" + Gpa +
                '}';
    }
}
