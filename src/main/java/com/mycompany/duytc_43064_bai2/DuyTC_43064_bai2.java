
package com.mycompany.duytc_43064_bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class DuyTC_43064_bai2 {

    public static void main(String[] args) {
       DuyTC duy=new DuyTC();
       ArrayList<nhanvien> listEmployee = new ArrayList<nhanvien>();
       String choose = null;
        boolean exit = false;
         Scanner sc=new Scanner(System.in);
        
        int studentId;
 
   
        showMenu();
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                duy.themmoi();
                break;
            case "2":
                studentId = duy.inputId();
                duy.suathongtin(studentId);
                break;
            case "3":
                studentId = duy.inputId();
                duy.delete(studentId);
                break;
           
            case "4":
                duy.hienthi();
                break;
                case "5":
                    studentId = duy.inputId();
                duy.timkiekm(studentId);
                ;
                break;
            
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
          
            showMenu();
        }
    } 
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");   
        System.out.println("4. Show student.");
        System.out.println("5. Search student.");
        
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
       
    }

