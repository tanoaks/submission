import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mappings.FSKAsset;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonWriter {

    public static final String TEST_DATA = "testData";
    public static final String FSK_JSON = "FSK.json";

    public void toJson(Map<String, List<FSKAsset>> map,String baseFolder) throws IOException {
        Gson gson = new Gson();
        Type type = new TypeToken<HashMap<String, List<FSKAsset>>>() {
        }.getType();
        writeToFile(gson.toJson(map, type), baseFolder);
    }

    private void writeToFile(String json,String baseFolder) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newBufferedWriter(new File(File.separator.concat(baseFolder).concat(File.separator).concat(FSK_JSON)).toPath());
            bufferedWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }
}
