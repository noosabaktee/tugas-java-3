/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suhu;

/**
 *
 * @author acer
 */
public class DemoKonversiSuhu {
    public static void main(String[] args){
        KonversiSuhu2 suhu = new KonversiSuhu2();
        System.out.println(suhu.celciusToFahrenheit(23));
        System.out.println(suhu.celciusToReamur(23));
        System.out.println(suhu.fahrenheitToReamur(50));
    }
}
