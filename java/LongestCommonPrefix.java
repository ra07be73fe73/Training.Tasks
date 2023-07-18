public class LongestCommonPrefix {
    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length>1){
            int conta = 0;
            int maior = Integer.MAX_VALUE;
            String prefCom = "";
            int i = 0;
            int j = 0;
            /*
            for(int i = 0, j = 0; i<strs.length-1; j++){
                if(j<strs[i].length() && j<strs[i+1].length() && strs[i].charAt(j) == strs[i+1].charAt(j)) conta = conta + 1;
                else {
                    if(conta<maior){
                        maior = conta;

                    }
                    i++;
                    conta = 0;
                    j=0;
                }
            }*/
            while(i<strs.length-1){
                if(j<strs[i].length() && j<strs[i+1].length() && strs[i].charAt(j) == strs[i+1].charAt(j)) {
                    conta = conta + 1;
                    j++;
                }
                else {
                    if(conta<maior){
                        maior = conta;

                    }
                    i++;
                    conta = 0;
                    j=0;
                }
            }
            return prefCom = strs[0].substring(0,maior);
        }
        else return strs[0];
    }
}
