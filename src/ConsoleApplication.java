import javax.swing.*;
import java.io.File;

public class ConsoleApplication {
    private static final IParser Parser = new ParserBase();

    public static void main(String[] args) {
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        while (true)
            if (ret == JFileChooser.APPROVE_OPTION) {
                File file = fileopen.getSelectedFile();
                System.out.println(file.toString());
                Parser.Parse(file.toString());
                break;
            }
    }

}
