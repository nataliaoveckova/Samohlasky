import java.util.Scanner;

public class New {
        public static void main(String[] args) {

            System.out.println("hello world");

            Scanner scanner = new Scanner(System.in);
            System.out.println("napis text a stlac enter");
            String out = scanner.next();

            System.out.println("vystup z klavesnice: " + out);

            int celkovypocet= 0;
            for (int x= 0; x < out.length(); x++){
                switch (out.charAt(x)){
                    case 'a':
                        System.out.println('a');
                        celkovypocet++;
                        break;
                    case 'e':
                        System.out.println('e');
                        celkovypocet++;
                        break;
                    case 'i':
                        System.out.println('i');
                        celkovypocet++;
                        break;
                    case 'o':
                        System.out.println('o');
                        celkovypocet++;
                        break;
                    case 'u':
                        System.out.println('u');
                        celkovypocet++;
                        break;
                }
            }
            System.out.println(celkovypocet);







        }


   /* @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }*/
    }


