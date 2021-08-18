package org.example.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("brewing the coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding milk...");
    }

    @Override
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (Exception e){
            System.out.println("IO error trying to read your answer");
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
