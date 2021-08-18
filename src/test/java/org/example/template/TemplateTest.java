package org.example.template;

import org.junit.Test;

public class TemplateTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("making tea...");
        tea.prepareRecipe();

        System.out.println("making coffee...");
        coffeeWithHook.prepareRecipe();
    }

    public String convert(String s, int numRows) {
        int odd = numRows/2;
        int even = numRows - odd;
        int x = s.length()/(2*odd + even);

        String res = s.substring(0,x+1);
        int tempi = 0;
        for(int i = 1;i < 2*odd + even -1; i++){
            if(tempi%2 == 1 && i <tempi*3*x +x){//如果是odd数行1,3...且小于x
                int start = tempi*3*x;
                res += s.substring(start,start+x+1);
            }
            if(tempi%2 == 0 && i < ((tempi-1)*3*x+x)+x){//如果是even数行2,4...且小于x
                int start = ((tempi-1)*3*x+x);
                res += s.substring(start,start+2*x+1);
            }
            tempi++;
        }
        res += s.substring(tempi);
        return res;
    }

}
