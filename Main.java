package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sac = new Scanner(System.in);
        String a = sac.nextLine();
        String[] allNumbers = a.split("\\+|\\*|-|/|' '");
        String d="";
        int sum=0;
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
           if (q.equals("*")){
               int u=fc.get(i)*fc.get(i+1);
               fc.remove(i);
               deystv.remove(i);
               fc.set(i, u);
           }
       }

        for (int i=0;i<deystv.size();i++){
            String q=deystv.get(i);
            if (q.equals("/")){
                int u=fc.get(i)/fc.get(i+1);
                fc.remove(i);
                deystv.remove(i);
                fc.set(i, u);
            }
        }
        for (int i=0;i<deystv.size();i++){
            String q=deystv.get(i);
            if (q.equals("-")){
                int u=fc.get(i)-fc.get(i+1);
                fc.remove(i);
                deystv.remove(i);
                fc.set(i, u);
            }
        }
        for (int ui : fc){
            sum+=ui;

        }
        System.out.println(sum);
    }
}
