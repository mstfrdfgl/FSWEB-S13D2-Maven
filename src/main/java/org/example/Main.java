package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int num){
        int absNum=Math.abs(num);
        String stringAbsNum=String.valueOf(absNum);
        char[] numArr=stringAbsNum.toCharArray();
        char[] tempArr=new char[numArr.length];
        for(int i=0;i<numArr.length;i++){
            tempArr[i]=numArr[numArr.length-(i+1)];
        }
        String numStr=new String(numArr);
        String tempStr=new String(tempArr);
        int numInt=Integer.parseInt(numStr);
        int tempInt=Integer.parseInt(tempStr);
        return numInt == tempInt;
    }
    public static boolean isPerfectNumber(int num){
        if(num<0){
            return false;
        }
        int dividers=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                dividers+=i;
            }
        }
        return num==dividers;
    }
    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        String[] words={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String numStr=String.valueOf(num);
        char[] numChar=numStr.toCharArray();
        String[] numberWords=new String[numChar.length];
        for(int i=0;i<numberWords.length;i++){
            if(numChar[i]=='0'){
                numberWords[i]=words[0];
            }else if(numChar[i]=='1'){
                numberWords[i]=words[1];
            }else if(numChar[i]=='2'){
                numberWords[i]=words[2];
            }else if(numChar[i]=='3'){
                numberWords[i]=words[3];
            }else if(numChar[i]=='4'){
                numberWords[i]=words[4];
            }else if(numChar[i]=='5'){
                numberWords[i]=words[5];
            }else if(numChar[i]=='6'){
                numberWords[i]=words[6];
            }else if(numChar[i]=='7'){
                numberWords[i]=words[7];
            }else if(numChar[i]=='8'){
                numberWords[i]=words[8];
            }else if(numChar[i]=='9'){
                numberWords[i]=words[9];
            }
        }
        return String.join(" ",numberWords);
    }
}
