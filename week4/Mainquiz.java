package week4;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("=====================================");
        System.out.println("Selamat datang di quiz sederhana!");
        System.out.println("=====================================");

        for (int i = 0; i < quiz.getQuestionCount(); i++){
            quiz.displayQuestion(i); // untuk menampilkan berapa panjang array yang ada 

            System.out.print("Jawaban: ");
            int userAnswer = scanner.nextInt(); // ini inputan dari user
            quiz.checkAnswer(i, userAnswer); // untuk cek jawaban dari user maka akan memanggil index dan jawaban yang diinput user
        }

        System.out.println("=====================================");
        System.out.println("Skor anda saat ini adalah : " + quiz.getScore());
        // System.out.println("nilai anda sudah bagus !!!");

        //if else
        if(quiz.getScore() == 100){
            System.out.println("Nilai anda sudah bagus !!!");
        }else{
            System.out.println("Nilai anda kurang !!!");
        }
    }
}
