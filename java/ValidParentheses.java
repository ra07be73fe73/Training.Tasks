import java.util.ArrayList;
import java.util.HashMap;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("WoW Servers Down");
        isValid("{[]()[()]}");
    }

    public static boolean isValid(String s){
        String copia = s;
        while(copia.contains("()") || copia.contains("[]") || copia.contains("{}")){
            copia = copia.replace("()","");
            copia = copia.replace("[]", "");
            copia = copia.replace("{}", "");
        }
        return copia.equals("");
    }
}
