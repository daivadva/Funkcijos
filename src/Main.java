public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        sayHi();
//    }
//
//    public static void sayHi() { // funkcija kuri nepriima kintamuju. void negrazinamos funkcijos
//        System.out.println("labas");
//        System.out.println("rytas");
//    }
//
//    public static void sayHiTo(String name) { //funkcija priima kintamuosius
//
//    }
//
//    //grazinama funkcija, atlieka skaiciavimus, paima sarasus ir pan.
//    public static double simPi() {
//    return (simPi());
//    }

//
//        System.out.println("Task 1");
//        sum(2, 3);
//
//        System.out.println("Task 2");
//        System.out.println(PISq());
//
//        System.out.println("Task 3");
//        System.out.println(multiply(5, 10));
//
//        System.out.println("Task 4");
//        int[] nums = {10, 15, 20};
//        printArray(nums);
//
//        System.out.println("Task 5");
//        System.out.println(rndNum(5, 10));

        System.out.println("Task 6");
        int[] numbersArr = generateRndIntArr(1, 10, 5);
        printArray(numbersArr);

        System.out.println("Task 7");
        int result = arrSum(numbersArr);
        System.out.println(result);

        System.out.println("Task 8");
        double result2 = arrAverage(numbersArr);
        System.out.println(result2);

        System.out.println("Task 9");
        rectangle(4, 7);

        System.out.println("Task 10");
        sentenceCount("Siandien labai grazi ir sauleta diena");

//        System.out.println("Task 11");
//        System.out.println(reverseString("Siandien labai grazi diena"));


    }


    // 1 Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
    public static void sum(int a, int b) {

        System.out.println(a + b);
    }

    // 2 Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

    public static double PISq() {
        double PISq = 9.8596;
        return (PISq);
    }
    // 3 Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.

    public static int multiply(int a, int b) {
        return a * b;
    }

    // 4 Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių. ??????????????
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }

//    // 5 Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.

    public static int rndNum(int min, int max) {
        return min + (int) Math.round(Math.random() * (max - min));
    }

    // 6 Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti. ??????????

    public static int[] generateRndIntArr(int min, int max, int length) {
        int[] randomArr = new int[length];
        for (int i = 0; i < length; i++) {
            randomArr[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return randomArr;
    }

    // 7 Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

    public static int arrSum(int[] numbersArr) {
        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            sum += numbersArr[i];
        }
        return sum;
    }

    // 8 Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
    public static double arrAverage(int[] numbersArr) {
        double sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            sum += numbersArr[i];
        }
        return sum / numbersArr.length;
    }

    // 9 Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.
    public static void rectangle(int rows, int collums) {
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < collums; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

        // 10 Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų. Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

        public static void sentenceCount (String sentence){
        String stringStentence = "" + sentence;
        int count = 0;
        int count2 = 0;
            for (int i = 0; i < stringStentence.length(); i++) {
                if (stringStentence.charAt(i) != ' ' ){
                    count++;
                }
                else{
                    count2++;
                }
            }
            System.out.println(sentence.length());
            System.out.println("Number of letters: " + count);
            System.out.println("Number of space: " + count2);
        }






//    // 11 Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.
//
//    public static String reverseString (String sentence2){
//        char ch[] = sentence2.toCharArray();
//        String reverse = "";
//        for (int i = ch.length-1; i >=0 ; i--) {
//            reverse+= ch[i];
//        }
//        return reverse;
//    }


        //   int[] random = new int[length];



}