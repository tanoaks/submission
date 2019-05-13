import interfaces.Processor;
import mappings.Asset;
import mappings.FSKAsset;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {


    static Processor processor;
    public static final String TEST_DATA = "testData";

    public static void main(String[] args) {
        String baseFolder = TEST_DATA;
        try {
            //override user input by default testData
            if (args.length > 0)
                baseFolder = args[0];
            // parse file
            JsonParser parser = new JsonParser();
            List<Asset> list = parser.readJsonStream(baseFolder);
            //filter and group stream
            processor = new ListProcessor();
            Map<String, List<FSKAsset>> map = (Map<String, List<FSKAsset>>) processor.process(list);
            //produce output json
            JsonWriter jsonWriter = new JsonWriter();
            jsonWriter.toJson(map, baseFolder);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

}
