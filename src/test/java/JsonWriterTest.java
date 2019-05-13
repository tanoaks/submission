import mappings.FSKAsset;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class JsonWriterTest {
    Map<String, List<FSKAsset>> map;
    @Before
    public void setUp() throws Exception {
        map = new HashMap<>();
       List<FSKAsset> dummy= new ArrayList<>();

       dummy.add(new FSKAsset(1,"a",2000));
        map.put("a",dummy );

    }

    @After
    public void tearDown() throws Exception {


        Files.walk(new File(File.separator.concat("test").concat(File.separator)).toPath()).forEach(c->{
            try {
                if(!Files.isDirectory(c))
                    Files.deleteIfExists(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void toJson() throws IOException {
        JsonWriter jsonWriter = new JsonWriter();
        jsonWriter.toJson(map, "test");
        Assert.assertTrue(new File("/test/FSK.json").exists());
    }
}