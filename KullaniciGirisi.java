import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, reset, newPassword;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("Java123")) {
            System.out.println("Giriş Yaptınız");
        } else if (password != "Java123"){
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz?");
            reset = inp.nextLine();

            if (reset.equals("evet")) {
                System.out.println("Yeni Şifreniz Eski Şifreniz İle Aynı Olmasın!");

                System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                newPassword = inp.nextLine();

                if (newPassword.equals("Java123")) {
                    System.out.println("Lütfen Eski Şifrenizden Farklı Bir Şifre Giriniz!");
                }else System.out.println("Yeni Şifreniz Oluşturuldu.");

            }
        }


    }
}
