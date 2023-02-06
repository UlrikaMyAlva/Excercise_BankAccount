public class Bankaccount {


    private String name;
    private String adress;
    private double number;
    private double phone;

    private double account;


    public void deposit(int deposit) {
        account = account + deposit;
    }

    public void withdrawal (int withdrawal) {

        account = account - withdrawal;
    }



    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAdress() {return adress;}
    public void setAdress(String adress) {this.adress = adress;}

    public double getNumber() {return number;}
    public void setNumber(double number) {this.number = number;}

    public double getPhone() {return phone;}
    public void setPhone(double phone) {this.phone = phone;}


    public double getAccount() {return account;}
    public void setAccount(double account) {this.account = account;}



}
