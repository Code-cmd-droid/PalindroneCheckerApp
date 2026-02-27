public class PalindroneCheckerApp {
    public static void main(String[] args){
        String Input = "reviver";
        String Rev = "";
        for(int i = (Input.length()-1);i>=0;i--){
            Rev += Input.charAt(i);
        }
        if(Rev.equals(Input)){
            System.out.println("The String is a palindrome.");
        }else {
            System.out.println("The String is not a palindrome");
        }
    }
}
