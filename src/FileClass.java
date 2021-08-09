import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.System.in;

public class FileClass {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(in);
        System.out.println("Enter file or directory name:");
        Path path = Paths.get(input.nextLine());

        if ( Files.exists(path)  ) {
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
            System.out.printf("%s an absolute path%n",path.isAbsolute());
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

         }
        if(Files.isDirectory(path)) {
            System.out.printf("%nDirectory contents:%n");
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    System.out.println(p);
                }

        }

        else
            System.out.printf("%s does not exist%n", path);


    }
}
