package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double soTien;
        int soThang;
        double tiLe;

        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so thang muon gui");
        soThang = sc.nextInt();
        System.out.println("Nhap so tien muon gui");
        soTien = sc.nextDouble();
        System.out.println("Nhap ti le lai");
        tiLe = sc.nextDouble();
        double tongTienLai = 0;

        for(int i=0; i< soThang; i++){
            tongTienLai += soTien*(tiLe/100)/12*soThang;
        }
        System.out.println("tong tien lai la: "+ tongTienLai);

    }
}
