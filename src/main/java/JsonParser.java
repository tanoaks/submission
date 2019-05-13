import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import mappings.Asset;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public static final String ASSETS_JSON = "assets.json";
    Gson gson = new Gson();
    public List<Asset> readJsonStream(String baseFolder) throws IOException {
        InputStream in = Files.newInputStream(new File(File.separator.concat(baseFolder).concat(File.separator).concat(ASSETS_JSON)).toPath());
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        List<Asset> assets = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            Asset asset = gson.fromJson(reader, Asset.class);
            assets.add(asset);
        }
        reader.endArray();
        reader.close();
        return assets;
    }
}
