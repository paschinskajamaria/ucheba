
package Project2;
import java.util.Scanner;
public class Main {
    static Contact[] contacts = new Contact[10];
    public static void main(String[] args) {
        contacts[0] = new Contact("1.", " Имя ", "Телефон");
        contacts[1] = new Contact("2.", " Имя ", "Телефон");
        contacts[2] = new Contact("3.", " Имя ", "Телефон");
        contacts[3] = new Contact("4.", " Имя ", "Телефон");
        contacts[4] = new Contact("5.", " Имя ", "Телефон");
        contacts[5] = new Contact("6.", " Имя ", "Телефон");
        contacts[6] = new Contact("7.", " Имя ", "Телефон");
        contacts[7] = new Contact("8.", " Имя ", "Телефон");
        contacts[8] = new Contact("9.", " Имя ", "Телефон");
        contacts[9] = new Contact("10.", " Имя ", "Телефон");
        Scanner sc = new Scanner(System.in);
        int f;
        do {
            System.out.println("Выберите пункт меню, 1-Новый контакт, 2-Редактировать контакт, 3-Удалить контакт, "
                    + "4-Выйти");
            int n = sc.nextInt();
            f = n;
            switch (n) {
                case 1:
                    Scanner csc = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Введите номер контакта от 1 до 10");
                    int a = sc1.nextInt();
                    System.out.println(" Ведите имя и номер телефона");
                    contacts[a - 1].name = csc.next();
                    contacts[a - 1].value = csc.next();

                    for (int i = 0; i < contacts.length; i++) {

                        System.out.println(contacts[i].number + contacts[i].name +  " " + contacts[i].value);
                        }

                    break;
                    case 2:
                        Scanner csc1 = new Scanner(System.in);
                        System.out.println("Выберите номер контакта для редактирования");
                        int b = csc1.nextInt();
                        System.out.println(" Ведите имя и номер телефона");
                        contacts[b - 1].name = csc1.next();
                        contacts[b - 1].value = csc1.next();

                        for (int i = 0; i < contacts.length; i++) {
                            System.out.println(contacts[i].number + contacts[i].name + " " + contacts[i].value);
                            }

                        break;
                        case 3:
                            Scanner csc2 = new Scanner(System.in);
                            System.out.println("Выберите номер контакта для удаления");
                            int c = csc2.nextInt();
                            contacts[c - 1].name = " Имя";
                            contacts[c - 1].value = "Телефон";
                            System.out.println(contacts[c - 1].number + contacts[c - 1].name + " " + contacts[c - 1].value);
                            for (int i = 0; i < contacts.length; i++)     {
                                    System.out.println(contacts[i].number + contacts[i].name + " " + contacts[i].value);
                            }
                            break;
                            case 4:
                                System.out.println("Выход");
                                break;
                                default:
                                    System.out.println("Не существует");
                                    break;
            }
        }
        while (f!=4);
    }
}
