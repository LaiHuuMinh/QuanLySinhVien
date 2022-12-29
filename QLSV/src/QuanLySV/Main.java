package QuanLySV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flat = true;

        QLSV qlsv = new QLSV();
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("1.Add student");
            System.out.println("2.Edit student by id");
            System.out.println("3.Delete student by id");
            System.out.println("4.Sort student by gpa");
            System.out.println("5.Sort student by name");
            System.out.println("6.Show student");
            System.out.println("7.Show student in file");
            System.out.println("0.Exit");
            System.out.println("--------------------------");

            String c = new Scanner(System.in).nextLine();

            switch (c){
                case "1":
                    qlsv.inputData();
                    break;
                case "2":
                    qlsv.editSV();
                    break;
                case "3":
                    qlsv.daleteSV();
                    break;
                case "4":
                    qlsv.sortSvGPA();
                    break;
                case "5":
                    qlsv.sortSvName();
                    break;
                case "6":
                    qlsv.display();
                    break;
                case "7":
                    qlsv.readFlie();
                    break;
                case "0":
                    flat = false;
                    break;
                default:
                    System.out.println("Nhap khong hop le");

            }
        }while (flat);

    }

}
