import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.util.Arrays;
        import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        final int MAX = 20;
        int ileUmów = 0;
        String fileName = "daneSprzedaży.txt";
        File file = new File(fileName);
        //  file.createNewFile();
        UmowaSprzedaży tabelaUmów[] = new UmowaSprzedaży[MAX];

        try (Scanner scanFile = new Scanner(file)) {
            while(scanFile.hasNextLine()) {
                String linia = scanFile.nextLine();
                String d[] = linia.split(";");

                tabelaUmów[ileUmów] = new UmowaSprzedaży(d[0], d[1], Integer.parseInt(d[2]), Integer.parseInt(d[3]),
                        Integer.parseInt(d[4]), d[5], d[6], d[7], Integer.parseInt(d[8]));

                System.out.println(tabelaUmów[ileUmów]);
                ileUmów++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + fileName);
        }


    }
}
