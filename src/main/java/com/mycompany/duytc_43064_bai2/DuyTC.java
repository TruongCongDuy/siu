
package com.mycompany.duytc_43064_bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class DuyTC {
    ArrayList<nhanvien> nv=new ArrayList<>();
    public nhanvien nhanvienduy;
   Scanner sc=new Scanner(System.in);
    public DuyTC()
    {
        nhanvienduy=new nhanvien();
    }
    public String inputten() {
        System.out.print("\nNhap ten nhan vien: ");
        return sc.nextLine();
    }
    public String inputngaysinh() {
       System.out.print("\nNhap ngay sinh nhan vien: ");
        return sc.nextLine();
    }
    public String inputchucvu() {
       System.out.print("\nNhap chuc vu nhan vien: ");
        return sc.nextLine();
    }
     public String inputluongcoban() {
       System.out.print("\nNhap luong co ban cua nhan vien: ");
        return sc.nextLine();
    }
      public String inputhesoluong() {
       System.out.print("\nNhap he so luong cua nhan vien: ");
        return sc.nextLine();
    }
       public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    
    
    public void themmoi()
    {
        Scanner sc=new Scanner(System.in);
        nhanvien nhanvien=new nhanvien();
        System.out.print("\nNhap ma nv: ");
        nhanvien.manv=sc.nextInt();       
        nhanvien.tennv=inputten(); 
        nhanvien.ngaysinh=inputngaysinh();    
        nhanvien.chucvu=inputchucvu();
        nhanvien.luongcoban=inputluongcoban();
        nhanvien.hesoluong=inputhesoluong();
        nv.add(nhanvien);    
    }
      public void suathongtin(int manv) {
        boolean isExisted = false;
        int size = nv.size();
        for (int i = 0; i < size; i++) {
            if (nv.get(i).getmanv() == manv) {
                isExisted = true;
                nv.get(i).settennv(inputten());
                nv.get(i).setngaysinh(inputngaysinh());
                nv.get(i).setchucvu(inputchucvu());
                nv.get(i).setluongcoban(inputluongcoban());
                nv.get(i).sethesoluong(inputhesoluong());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", manv);
        }
    }
    public void delete(int manv) {
        nhanvien nhanv = null;
        int size = nv.size();
        for (int i = 0; i < size; i++) {
            if (nv.get(i).getmanv()== manv) {
                nhanv = nv.get(i);
                break;
            }
        }
        if (nhanv != null) {
            nv.remove(nhanv);
            
        } else {
            System.out.printf("id = %d not existed.\n", manv);
        }
    }
    
     public void hienthi() {
        for (nhanvien nhanvien1 : nv) {
            System.out.format("Ma nhan vien: %5d | ", nhanvien1.getmanv());
            System.out.format("Ten nhan vien:%5s | ", nhanvien1.gettennv());
            System.out.format("Ngay sinh:%5s | ", nhanvien1.getngaysinh());
            System.out.format("Chuc vu:%5s | ", nhanvien1.getchucvu());
            System.out.format("Luong co ban:%5s ", nhanvien1.getluongcoban());
             System.out.format("He so luong:%5s ", nhanvien1.gethesoluong());
             System.out.println("\n");
        }
    }
     public void timkiekm(int manv)
     {
         for(int i=0;i<nv.size();i++)
         {
             if(nv.get(i).manv==manv)
             {
                 System.out.format("Ma nhan vien: %5d | ", nv.get(i).getmanv());
                 System.out.format("Ten nhan vien:%5s | ", nv.get(i).gettennv());
                  System.out.format("Ngay sinh:%5s | ", nv.get(i).getngaysinh());
                 System.out.format("Chuc vu:%5s | ", nv.get(i).getchucvu());
                 System.out.format("Luong co ban:%5s ", nv.get(i).getluongcoban());
                  System.out.format("He so luong:%5s ", nv.get(i).gethesoluong());
             }
             else{
                 System.out.println("ko tim that");
             }
         }
     }
    
}
     
  
class nhanvien{
    int manv;
    String tennv;
    String ngaysinh;
    String chucvu;
    String luongcoban;
    String hesoluong;
    public int getmanv() {
        return manv;
    }
 
    public void setmanv(int manv) {
        this.manv = manv;
    }
 
    public String gettennv() {
        return tennv;
    }
 
    public void settennv(String tennv) {
        this.tennv = tennv;
    }
 
    public String getngaysinh(){
        return ngaysinh;
    }
 
    public void setngaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
 
    public String getchucvu() {
        return chucvu;
    }
 
    public void setchucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    public String getluongcoban() {
        return luongcoban;
    }
 
    public void setluongcoban(String luongcoban) {
        this.luongcoban = luongcoban;
    }
    
 
    public String gethesoluong() {
        return hesoluong;
    }
 
    public void sethesoluong(String hesoluong) {
        this.hesoluong = hesoluong;
    }
     public void display(){
        System.out.println("MaNV: " + this.getmanv() + ", họ tên nhân viên: " + this.gettennv() +
                ", ngay sinh: " + this.getngaysinh() + ", chuc vu: " + this.getchucvu() +
                ", luong co ban: " + this.getluongcoban() + ", he so luong: " + this.gethesoluong());
    }
}
