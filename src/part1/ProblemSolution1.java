package part1;

import java.util.*;

public class ProblemSolution1 {
    public String reverseWord(String word){
        String word2 = "";
        for(int i = word.length()-1; i>=0;i--){
            word2 += word.charAt(i);
        }
        return word2;
    }
    public void removeWhiteSpace(String word){
        String word2 = word.toLowerCase();
        word2=word2.replace(" ","");
        System.out.println(word2);
    }
    public void repeats(String word){
        int count  = 1;
        //Integer ar = new Integer();
       // ArrayList<Integer> ar = new ArrayList();
        for(int i = 0; i<word.length();i++){
            for(int j=i+1; j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    count += 1;
                   // ar.add(count);
                    System.out.println(count);
                }
            }

        }

        //return count;
    }
    public Map<Set<Character>, ArrayList<Integer>> repeated(String word){
        Map<Set<Character>, ArrayList<Integer>>repeat = new HashMap<>();
        Set<Character> letter=new HashSet<>();
        ArrayList<Integer>number = new ArrayList<>();
        int count  = 1;
        for(int i = 0; i<word.length();i++){
            for(int j=i+1; j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    letter.add(word.charAt(i));
                    count+=1;


                }
            }

        }
        number.add(count);
        repeat.put(letter,number);
//        for (Map.Entry m : repeat.entrySet()) {
//            System.out.println("letter " + m.getKey() + ", number = " + m.getValue());
//        }
        return repeat;
    }
    public void duplicateCharacters(String word){
        Map<Character,Integer> charCount=new HashMap<>();
        char[] letterAr = word.toCharArray();
        for(char c: letterAr){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }
        Set<Character>letters = charCount.keySet();
        for (Character ch:letters) {
            if(charCount.get(ch)>1){
                System.out.println(ch + " "+charCount.get(ch));
            }
        }
    }
    public String reverseRecursive(String word){
        if(word==null || word.length()<=1){
            return word;
        }else{
            return reverseWord(word.substring(1))+word.charAt(0);
        }
    }

    public void pyramid(int numberOfRows){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("What's your row length \n");
        //int numberOfRows = sc.nextInt();
        int rowCount = 1;
        for(int i = numberOfRows; i>=1; i--){
            //for the before empty space
            for(int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=rowCount;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount++;
        }

    }
    public int sumOfDigits(int n){
        if(n/10<10){
            return (n/10)+(n%10);
        }
        else{
            return sumOfDigits(n/10)+(n%10);
        }
    }
    public int secondLargest(){
       int[] ar = new int[]{1, 2, 5, 7,6,9};
        Arrays.sort(ar);
        return ar[ar.length-2];
    }
    public int secondLargestAlternativeSolution(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your array size? \n");
        int size = sc.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i<ar.length; i++){
            System.out.println("Enter number:\n");
            ar[i]= sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("The second largest number in the array is: "+ar[ar.length-2]);
        return ar[ar.length-2];
    }
    public void differentPyramidPattern(int rowNumber){
        int rowCount = 1;
        for(int i = rowNumber; i>=1;i--){
            for(int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            //this for loop prints the same digit as the row count from 1 till rowCount times
            for(int j = 1; j<=rowCount;j++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }

    public boolean isBinary(int number){
        int copyOfNumber = number;
        if(copyOfNumber/10 <10){
            if((copyOfNumber/10==1)||(copyOfNumber/10==0)||((copyOfNumber/10)/10 == 1 && ((copyOfNumber%10 == 0)||(copyOfNumber%10==1)))){
                System.out.println( " binary");
                return true;
            }else{
                System.out.println(" not binary");
                return false;
            }
        }else{
            return isBinary(copyOfNumber/10);
        }
    }
}
