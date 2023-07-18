public class RomanToInt {
    public static void main(String[] args) {
        System.out.println("NHEEEE");
    }

    public static int romanToInt(String s){
        int i = s.length() - 1;
        int aux = 0;
        while(i >= 0){
            if(s.charAt(i)=='V') aux = aux + 5;
            else if (s.charAt(i)=='L') aux = aux + 50;
            else if (s.charAt(i)=='D') aux = aux + 500;
            else if (s.charAt(i) == 'I' && aux >= 5) aux = aux - 1;
            else if (s.charAt(i) == 'X' && aux >= 50) aux = aux - 10;
            else if (s.charAt(i) == 'C' && aux >= 500) aux = aux - 100;
            else if (s.charAt(i) == 'I') aux = aux + 1;
            else if (s.charAt(i) == 'X') aux = aux + 10;
            else if (s.charAt(i) == 'C') aux = aux + 100;
            else if (s.charAt(i) == 'M') aux = aux + 1000;
            i--;
        }
        return aux;
    }
}
