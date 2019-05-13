import mappings.Asset;
import mappings.FSKAsset;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ListProcessorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void process() {

        List<Asset> list = new ArrayList<>();
        Asset a = new Asset();
        a.setTitle("a");
        a.setFsk_level_list_facet(new String[]{"qw"});
        a.setObject_class("Movie");
        a.setProduction_year(578);
        a.setAsset_id(565);
        list.add(a);
        ListProcessor processor = new ListProcessor();
        Map<String, List<FSKAsset>> map =  processor.process(list);
        Assert.assertEquals("a",map.get("qw").get(0).getTitle());
    }
}