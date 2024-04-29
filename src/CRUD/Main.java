/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

public class Main {
        public static void main(String[] args) {
        try{
                Form_Siswa form = new Form_Siswa();
                form.setVisible(true);
        }catch(Exception ex) {
                System.out.println(ex.toString());
        }
    }
}

