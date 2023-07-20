import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidation {

        public static boolean isValidURL(String url) {                             
        String urlPattern = "^(http|https|ftp)://.*[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(\\?[a-zA-Z0-9=_-]+&[a-zA-Z0-9=_-]+){0,2}$";
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(url);

           if (matcher.matches()) {
            String query = url.substring(url.indexOf("?") + 1);
            String[] params = query.split(" & ");
            if (params.length <= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                
        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();
        scanner.close();

        if (isValidURL(url)) {                                    
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

   
}