public class Praktikum {

    public static void main(String[] args) {
        String nameFamily = "Тимоти Шаламе";
        Account account = new Account(nameFamily);
        boolean canEmboss = account.checkNameToEmboss();
        System.out.println("Можно ли напечатать: " + canEmboss);
    }

}
