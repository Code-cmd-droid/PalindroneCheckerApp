public class PalindroneCheckerApp {
    public static void main(String[] args){
        String Input = "reviver";
        boolean isPalindrone = true;
        for(int i = 0; i < Input.length()/2; i++){
            if(Input.charAt(i) != Input.charAt(Input.length()-1-i)){
                isPalindrone = false;
                break;
            }

        }
        if(isPalindrone=false){
            System.out.println("The Given String is not a palindrome.");
        }else{
            System.out.println("The given string is a palindrome.");
        }
    }
}
