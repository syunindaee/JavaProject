import java.util.Scanner;
class Phone {

    public String phoneName;
    public int phoneNumber;

    public Phone(String phoneName, int phoneNumber) {
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;
    }

    public Phone() {

    }

    public String showClassPhone() {
        return phoneName + "의 번호는 " + phoneNumber + "입니다.";
    }
}

class iPhone extends Phone {

    public iPhone(String phoneName, int phoneNumber) {
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;
    }

    public String applePay() {
        return phoneName + "의 결제시스템은 애플페이입니다.";
    }
}

class galaxy extends Phone {

    public galaxy(String phoneName, int phoneNumber) {
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;
    }

    public String samsungPay() {
        return phoneName + "의 결제시스템은 삼성페이입니다.";
    }
}
class Tablet{

    public Boolean pen;

    public Tablet(){
        this.pen = pen;
    }

}
public class day01{
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("phoneName: ");
        String phoneName = a.next();

        System.out.print("phoneNumber: ");
        int phoneNumber = a.nextInt();

        Phone phone;

        if (phoneName.equals("iPhone")) {
            phone = new iPhone(phoneName, phoneNumber);
            System.out.println(phone.showClassPhone());
            System.out.println(((iPhone) phone).applePay());
        } else {
            phone = new galaxy(phoneName, phoneNumber);
            System.out.println(phone.showClassPhone());
            System.out.println(((galaxy) phone).samsungPay());
        }

        System.out.println("펜을 사용할 것입니까?");
        String ifUsingPen = a.next();

        Tablet pen;

        if (ifUsingPen.equals("yes")){
            pen = new Tablet();

        }

        if(phoneName.equals("iPhone")){
            System.out.println("연동 가능합니다.");
        }
        else
        {
            System.out.println("연동할 수 없습니다.");
        }

    }
}
