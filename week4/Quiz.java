package week4;

public class Quiz {
    private String[] questions= {
        "Ibu Kota negara malaysia adalah?",
        "Siapakah presiden pertama indonesia?",
        "Siapakah presiden pertama amerika serikat?",
        "Siapakah Rektor Universitas Dian Nuswantoro sekarang?",
        "Berapa Fakultas yang ada di Universitas Dian Nuswantoro?",
        "Siapakah Presiden ke-4 indonesia?",
        "Pulau paling luas di Indonesia adalah?",
        "tanggal berapa hari pertempuran 5 hari Semarang?",
        "Apa makanan khas dari Indonesia?",
        "Makanan khas semarang adalah?",
    };

    private String[][] options ={
        {"1.Kuala lumpur", "2.Jakarta", "3.Bangkok", "4.Singapura"},
        {"1.Soekarno", "2.Jokowi", "3.Megawati", "4.SBY"},
        {"1.George Washington", "2.Abraham Lincoln", "3.John F. Kennedy", "4.Donald Trump"},
        {"1.Dr. Achmad Wahid", "2.Dr. Ir. Bambang Setiaji", "3.Prof. Drs. Setia Adi", "4.Prof. Dr. Pulung Nurtantio Andono, S.T., M.Kom."},
        {"1.5", "2.6", "3.7", "4.8"},
        {"1.SBY", "2.Jokowi", "3.Megawati", "4.Gus Dur"},
        {"1.Jawa", "2.Sumatera", "3.Kalimantan", "4.Papua"},
        {"1.15 Oktober 1944", "2.6 Mei 1999", "3.1 Juli 1947", "4.15 Oktober 1945"},
        {"1.Nasi Goreng", "2.Pizza", "3.Sushi", "4.Burger"},
        {"1.Lumpia", "2.Bakso", "3.Sate", "4.Nasi Goreng"}
    };
    
    private int[] correctAnswer = {1, 1, 1, 4, 8, 4, 4, 4, 1, 1}; //untuk menentukan jawaban yang benar dari class options
    private int score = 0;

    public int getQuestionCount(){
        return questions.length; //untuk mengetahui panjang array yang ada dalam class questionsc
    }

    public void displayQuestion(int index){
        System.out.println("\nPertanyaan " + (index +1) + ": \n" + questions[index]);
        for (int j = 0; j < options[index].length; j++){
            System.out.println(options[index][j]);
        }
    }

    public void checkAnswer(int index, int userAnswer){
        if (userAnswer == correctAnswer[index]){
            System.out.println("Jawaban Benar!");
            score += 10;
        }
        else{
            System.out.println("Jawaban yang benar adalah : " + options[index][correctAnswer[index] - 1]);
        }
    }

    public int getScore(){
        return score;
    }
}
