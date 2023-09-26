package Coding_ll_23.String_Project;

public class StringProject {
private String myString;
public StringProject (String str) {
myString = str;
}
public String reversedcase(){
    String str = myString;
    String reverseString = "";
   for(int i = 0; i< str.length(); i++) {
    char c = str.charAt(i);
    if(Character.isUpperCase(c)){
        c = Character.toLowerCase(c);
    }
    else{
       c = Character.toUpperCase(c); 
    }
    reverseString += c;

   }
return reverseString;
}
public int characterCount(char c){
     String str = myString;
     int charcount = 0;

     for(int i = 0; i< str.length(); i++) {
        char ca = str.charAt(i);
        if (ca ==c){
            charcount +=1;
        }

    }
    return charcount;
}
public String reverseString(){
   String str = myString;
   String revstring = "";
    for(int i = str.length()-1; i>=0; i--) {
        char ca = str.charAt(i);
        char ne = ca;
        revstring +=ne;
   }
   return revstring;
}
public String eachWordOnALine(){
     String str = "";
     for(int i = 0; i< myString.length(); i++) {
        char ca = myString.charAt(i);
        if (ca == ' '){
            str+= "\n";
           continue;
        }
        str+=ca;
    }
    return str;
}
public int wordCount(){
    int numb=1;
    for(int i = 0; i< myString.length(); i++) {
        char ca = myString.charAt(i);
        if (ca == ' '){
            numb++;  
        }     
    }
    return numb;
}
public int characterCount(){
    int numb=1;
     for(int i = 0; i< myString.length(); i++) {
        char ca = myString.charAt(i);
        if( ca !=' '&& ca !='.'){
        numb++;  
        }    
    }   
     return numb;
}
public double avgWordLength(){
    double avgnumb=1;
    double words = 1.0;
    int numb = 0;
     for(int i = 0; i< myString.length(); i++) {
        char ca = myString.charAt(i);
        if( ca ==' '){
        words++; 
        continue; 
        }  
        numb++;   
    }  
    avgnumb = numb / words;
     return avgnumb;
}
public int vowelCount(){
    int numb = 0;
    for(int i = 0; i< myString.length(); i++) {
        char ca = myString.charAt(i);
        if( ca =='a'||ca =='e'||ca =='i'||ca =='o'|| ca =='u'||ca =='A'||ca =='E'||ca =='I'||ca =='U'){
        numb++;
    }  
    }
    return numb;
}
public int substrCount(char substr){
    int numb=0;
     for(int i = 0; i< myString.length(); i++) {
        char ca = myString.charAt(i);
        if( ca ==substr){
        numb++;  
        }    
    }   

    return numb;
}
public boolean isPalindrome(){
String str = myString;
   String revstring = "";
    for(int i = str.length()-1; i>=0; i--) {
        char ca = str.charAt(i);
        char ne = ca;
        revstring +=ne;
   }
   boolean Palindrome= revstring.equals(myString);
   return Palindrome;

}


public String toString() {
return myString;
}



}