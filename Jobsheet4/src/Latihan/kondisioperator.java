//created by 21343058_Muhammad Farel Fahlevi

package Latihan;

public class kondisioperator {
    public static void main(String[] args){
        String status ="";
        int grade = 50;

        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}