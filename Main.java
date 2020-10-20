package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sac = new Scanner(System.in);
        String a = sac.nextLine();
        String[] allNumbers = a.split("\\+|\\*|-|/|' '");
        String d="";
        for (String letter:a.split("")){
            switch (letter){
                case "*":
                    d+="*";
                    break;
                case "-":
                    d+="-";
                    break;
                case "+":
                    d+="+";
                    break;
                case "/":
                    d+="/";
                    break;
            }
        }
        String[] deystv1 = d.split("");
        ArrayList<String> deystv=new ArrayList<>();
        for (String p : deystv1){deystv.add(p);}
        ArrayList<Integer> fc = new ArrayList<>();
        for (String ls : allNumbers){
            fc.add(Integer.parseInt(ls));
        }
       for (int i=0;i<deystv.size();i++){
           String q=deystv.get(i);
           int u;
           if (q.equals("*")||q.equals("/")){
               switch (q){
                   case "*":
                       u=fc.get(i)*fc.get(i+1);
                       fc.remove(i);
                       fc.set(i,u);
                       deystv.remove(i);
                       break;
                   case "/":
                       u=fc.get(i)/fc.get(i+1);
                       fc.remove(i);
                       fc.set(i,u);
                       deystv.remove(i);
               }
           }
       }
        for (int i=0;i<deystv.size();i++){
            String q=deystv.get(i);
            int u;
            if (q.equals("+")||q.equals("-")){
                switch (q){
                    case "-":
                        u=fc.get(i)-fc.get(i+1);
                        fc.remove(i);
                        fc.set(i,u);
                        deystv.remove(i);
                        break;
                    case "+":
                        u=fc.get(i)+fc.get(i+1);
                        fc.remove(i);
                        fc.set(i,u);
                        deystv.remove(i);
                }
            }
        }
        System.out.println(fc.get(0));
    }
}
