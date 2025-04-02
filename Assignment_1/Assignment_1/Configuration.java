import java.util.Scanner;
final class Configuration {
    private final String setting;
    
    public Configuration(String setting) {
        this.setting = setting;
    }
    
    public String getSetting() {
        return setting;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter configuration setting: ");
        String userSetting = sc.nextLine();
        Configuration config = new Configuration(userSetting);
        System.out.println("Stored Configuration: " + config.getSetting());
        sc.close();
    }
}
