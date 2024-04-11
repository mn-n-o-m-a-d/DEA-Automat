package org.fogl.automat;


import org.fogl.FileReader;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TestAutomat {

    @Test
    public void checkAutomatTrue() {

        String testInput = "1+1=2";
        boolean trueIfEndPointReached = DEAAutomat.DEA(testInput);
        Assertions.assertTrue(trueIfEndPointReached);
    }

    @Test
    public void checkAutomatFalse() {

        String testInput = "1-1";
        boolean falseIfEndpointNotReached = DEAAutomat.DEA(testInput);
        Assertions.assertFalse(falseIfEndpointNotReached);
    }

    @Test
    public void checkAutomatA() {

        String testInput = "a*b=c";
        boolean falseIfEndpointNotReached = DEAAutomat.DEA(testInput);
        Assertions.assertFalse(falseIfEndpointNotReached);
    }

    @Test
    public void checkAutomatB() {

        String testInput = "(a*b=c)";
        boolean falseIfEndpointNotReached = DEAAutomat.DEA(testInput);
        Assertions.assertFalse(falseIfEndpointNotReached);
    }

    @Test
    public void readFile() throws IOException {

        Path path = Paths.get("src", "test", "resources", "testfile.txt");
        FileReader fileReader = new FileReader();
        fileReader.readFile(path);
        String[] testFile = fileReader.getAllLines();
        Assertions.assertTrue(DEAAutomat.DEA(testFile[0]));
        Assertions.assertFalse(DEAAutomat.DEA(testFile[1]));
    }
}
