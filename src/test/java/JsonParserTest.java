import mappings.Asset;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class JsonParserTest {

    @Before
    public void setUp() throws Exception {
        Files.createDirectories(new File(File.separator.concat("test")).toPath());
        Files.createFile(new File(File.separator.concat("test").concat(File.separator).concat("assets.json")).toPath());
        BufferedWriter bufferedWriter =Files.newBufferedWriter(new File(File.separator.concat("test").concat(File.separator).concat("assets.json")).toPath());
        bufferedWriter.write("[{\n" +
                "        \"asset_id\": 3443586,\n" +
                "        \"userrating_average\": 4,\n" +
                "        \"orders_buy\": 0,\n" +
                "        \"poster_url\": \"http://@@STATIC_MAXDOME_URL@@/getAssetImage/objId:3443586/type:poster/width:__WIDTH__/height:__HEIGHT__/imageId:4155579.jpg\",\n" +
                "        \"timeframe_start\": \"2017-08-09T22:00:00Z\",\n" +
                "        \"production_year_max\": 2012,\n" +
                "        \"director_list_facet\": [\n" +
                "            \"John Cassar\"\n" +
                "        ],\n" +
                "        \"production_year_list_facet\": [\n" +
                "            \"2012\"\n" +
                "        ],\n" +
                "        \"title\": \"The Kennedys\",\n" +
                "        \"episode_number\": 0,\n" +
                "        \"media_usage_list\": [\n" +
                "            \"TVOD\",\n" +
                "            \"DTO\"\n" +
                "        ],\n" +
                "        \"production_year\": 2012,\n" +
                "        \"editorial_hint\": \"\",\n" +
                "        \"timeframe_end\": \"2019-12-18T23:00:00Z\",\n" +
                "        \"active_license_starttime\": \"2013-03-01T14:00:00Z\",\n" +
                "        \"marking_display_list\": [\n" +
                "            \"hd\"\n" +
                "        ],\n" +
                "        \"active_license_endtime\": \"2019-12-31T23:00:00Z\",\n" +
                "        \"language_list_facet\": [\n" +
                "            \"de\",\n" +
                "            \"en\"\n" +
                "        ],\n" +
                "        \"production_year_min\": 2012,\n" +
                "        \"description_short\": \"Die preisgekrönte und viel diskutierte Serie \\\"The Kennedys\\\" wirft einen Blick hinter die geheimen Türen des Weißen Hauses. Sie erzählt die historischen Geschichten der Jahre 1960 bis 1968, die mit der Kennedy-Ära verbunden sind.\",\n" +
                "        \"season_number\": 0,\n" +
                "        \"price_rent\": 0.99,\n" +
                "        \"child_id_list\": [\n" +
                "            \"3443582\"\n" +
                "        ],\n" +
                "        \"userrating_count_four_star\": 2409,\n" +
                "        \"orders_subscription\": 0,\n" +
                "        \"description_teaser\": \"\",\n" +
                "        \"orders_rent\": 0,\n" +
                "        \"fsk_level_list_facet\": [\n" +
                "            \"FSF12\"\n" +
                "        ],\n" +
                "        \"userrating_count_one_star\": 43,\n" +
                "        \"change_date\": \"2018-05-14T09:14:56Z\",\n" +
                "        \"copyright\": \"Studio Hamburg\",\n" +
                "        \"object_class\": \"Series\",\n" +
                "        \"channel_list_facet\": [\n" +
                "            \"serie\"\n" +
                "        ],\n" +
                "        \"cover_url\": \"http://@@STATIC_MAXDOME_URL@@/getAssetImage/objId:3443586/type:cover/width:__WIDTH__/height:__HEIGHT__/imageId:3565109.jpg\",\n" +
                "        \"trailer_object\": \"{\\\"videoTrailerMp4List\\\":[]}\",\n" +
                "        \"actor_list_facet\": [\n" +
                "            \"Greg Kinnear\",\n" +
                "            \"Barry Pepper\",\n" +
                "            \"Katie Holmes\",\n" +
                "            \"Tom Wilkinson\"\n" +
                "        ],\n" +
                "        \"userrating_count_five_star\": 1365,\n" +
                "        \"author_list_facet\": [\n" +
                "            \"Stephen Kronish\"\n" +
                "        ],\n" +
                "        \"videocontainer_format_list\": [\n" +
                "            \"asf\",\n" +
                "            \"piff\"\n" +
                "        ],\n" +
                "        \"id\": \"25912312\",\n" +
                "        \"description_long\": \"Die preisgekrönte und viel diskutierte Serie \\\"The Kennedys\\\" wirft einen Blick hinter die geheimen Türen des Weißen Hauses: Sie handelt von Heldentaten und Misserfolgen, Loyalität und Liebe, Neid und Untreue. Sie zeigt Menschen mit großen Fähigkeiten und großen Fehlern. Und sie erzählt die historischen Geschichten der Jahre 1960 bis 1968, die mit der Kennedy-Ära verbunden sind: Bay of Pigs, die Kuba-Krise, die Bürgerrechtsbewegung, Mafia-Verbindungen.\",\n" +
                "        \"marking_list\": [\n" +
                "            \"seasonAllHd\",\n" +
                "            \"hasDto\",\n" +
                "            \"couponUsable\",\n" +
                "            \"ov\",\n" +
                "            \"notNew\",\n" +
                "            \"hdPiff\",\n" +
                "            \"notHidden\",\n" +
                "            \"ovPiff\",\n" +
                "            \"seasonOffline\",\n" +
                "            \"stereo\",\n" +
                "            \"online\",\n" +
                "            \"hasPiff\",\n" +
                "            \"onlinePiff\",\n" +
                "            \"hd\",\n" +
                "            \"containsWithoutPackage\"\n" +
                "        ],\n" +
                "        \"price_buy\": 1.49,\n" +
                "        \"userrating_count_three_star\": 2412,\n" +
                "        \"generation\": 187,\n" +
                "        \"full_object\": \"{\\\"@class\\\":\\\"Series\\\",\\\"id\\\":3443586,\\\"eroticSpecifier\\\":0,\\\"green\\\":false,\\\"downloadAllowed\\\":false,\\\"seen\\\":false,\\\"remembered\\\":false,\\\"countryList\\\":[],\\\"iso2CountryList\\\":[],\\\"title\\\":\\\"The Kennedys\\\",\\\"descriptionLong\\\":\\\"Die preisgekrönte und viel diskutierte Serie \\\\\\\"The Kennedys\\\\\\\" wirft einen Blick hinter die geheimen Türen des Weißen Hauses: Sie handelt von Heldentaten und Misserfolgen, Loyalität und Liebe, Neid und Untreue. Sie zeigt Menschen mit großen Fähigkeiten und großen Fehlern. Und sie erzählt die historischen Geschichten der Jahre 1960 bis 1968, die mit der Kennedy-Ära verbunden sind: Bay of Pigs, die Kuba-Krise, die Bürgerrechtsbewegung, Mafia-Verbindungen.\\\",\\\"descriptionShort\\\":\\\"Die preisgekrönte und viel diskutierte Serie \\\\\\\"The Kennedys\\\\\\\" wirft einen Blick hinter die geheimen Türen des Weißen Hauses. Sie erzählt die historischen Geschichten der Jahre 1960 bis 1968, die mit der Kennedy-Ära verbunden sind.\\\",\\\"descriptionTeaser\\\":\\\"\\\",\\\"editorialHint\\\":\\\"\\\",\\\"productionYear\\\":2012,\\\"markingList\\\":[\\\"seasonAllHd\\\",\\\"hasDto\\\",\\\"couponUsable\\\",\\\"ov\\\",\\\"notNew\\\",\\\"hdPiff\\\",\\\"notHidden\\\",\\\"ovPiff\\\",\\\"seasonOffline\\\",\\\"stereo\\\",\\\"online\\\",\\\"hasPiff\\\",\\\"onlinePiff\\\",\\\"hd\\\",\\\"containsWithoutPackage\\\"],\\\"productPlacement\\\":false,\\\"videoContainerFormatList\\\":[\\\"asf\\\",\\\"piff\\\"],\\\"coverList\\\":[{\\\"id\\\":\\\"3565103\\\",\\\"url\\\":\\\"http://@@STATIC_MAXDOME_URL@@/getAssetImage/objId:3443586/type:coverBig/width:__WIDTH__/height:__HEIGHT__/imageId:3565103.jpg\\\",\\\"title\\\":\\\"The Kennedys\\\",\\\"usageType\\\":\\\"COVER_BIG\\\"},{\\\"id\\\":\\\"3565109\\\",\\\"url\\\":\\\"http://@@STATIC_MAXDOME_URL@@/getAssetImage/objId:3443586/type:cover/width:__WIDTH__/height:__HEIGHT__/imageId:3565109.jpg\\\",\\\"title\\\":\\\"The Kennedys\\\",\\\"usageType\\\":\\\"COVER\\\"},{\\\"id\\\":\\\"4155579\\\",\\\"url\\\":\\\"http://@@STATIC_MAXDOME_URL@@/getAssetImage/objId:3443586/type:poster/width:__WIDTH__/height:__HEIGHT__/imageId:4155579.jpg\\\",\\\"title\\\":\\\"The Kennedys\\\",\\\"usageType\\\":\\\"POSTER\\\"}],\\\"imageGalleryList\\\":[],\\\"genreList\\\":[{\\\"id\\\":\\\"pb_5\\\",\\\"value\\\":\\\"serie\\\",\\\"genreType\\\":\\\"Channelgenre\\\"}],\\\"tagList\\\":[{\\\"tagText\\\":\\\"usa\\\"},{\\\"tagText\\\":\\\"politik\\\"},{\\\"tagText\\\":\\\"kennedys\\\"},{\\\"tagText\\\":\\\"jfk\\\"},{\\\"tagText\\\":\\\"john f. kennedy\\\"},{\\\"tagText\\\":\\\"jackie kennedy\\\"},{\\\"tagText\\\":\\\"robert kennedy\\\"},{\\\"tagText\\\":\\\"kubakrise\\\"},{\\\"tagText\\\":\\\"attentat\\\"},{\\\"tagText\\\":\\\"präsident der vereinigten staaten von amerika\\\"},{\\\"tagText\\\":\\\"geschichte\\\"}],\\\"creditList\\\":[{\\\"id\\\":\\\"482514\\\",\\\"creditType\\\":\\\"actor\\\",\\\"value\\\":\\\"Barry Pepper\\\",\\\"biography\\\":\\\"\\\"},{\\\"id\\\":\\\"489343\\\",\\\"creditType\\\":\\\"actor\\\",\\\"value\\\":\\\"Greg Kinnear\\\",\\\"biography\\\":\\\"\\\"},{\\\"id\\\":\\\"493921\\\",\\\"creditType\\\":\\\"actor\\\",\\\"value\\\":\\\"Katie Holmes\\\",\\\"biography\\\":\\\"\\\"},{\\\"id\\\":\\\"505790\\\",\\\"creditType\\\":\\\"actor\\\",\\\"value\\\":\\\"Tom Wilkinson\\\",\\\"biography\\\":\\\"\\\"}],\\\"tvBroadcastList\\\":[],\\\"studioList\\\":[],\\\"copyright\\\":\\\"Studio Hamburg\\\",\\\"assetLicenseList\\\":[],\\\"mandatorPermissionList\\\":[],\\\"videoTrailerAsfList\\\":[],\\\"videoTrailerMp4List\\\":[],\\\"childIdList\\\":[3443582],\\\"statement\\\":\\\"\\\",\\\"award\\\":\\\"\\\",\\\"awardYear\\\":\\\"\\\",\\\"awardCategory\\\":\\\"\\\",\\\"linkExternal\\\":\\\"\\\",\\\"linkExternalType\\\":\\\"\\\",\\\"internalReview\\\":\\\"\\\",\\\"virtualVideoVersionList\\\":[]}\",\n" +
                "        \"language_piff_list_facet\": [\n" +
                "            \"de\",\n" +
                "            \"en\"\n" +
                "        ],\n" +
                "        \"object_type\": 3,\n" +
                "        \"cover_big_url\": \"http://@@STATIC_MAXDOME_URL@@/getAssetImage/objId:3443586/type:coverBig/width:__WIDTH__/height:__HEIGHT__/imageId:3565103.jpg\",\n" +
                "        \"tag_list_facet\": [\n" +
                "            \"usa\",\n" +
                "            \"präsident der vereinigten staaten von amerika\",\n" +
                "            \"robert kennedy\",\n" +
                "            \"jackie kennedy\",\n" +
                "            \"kennedys\",\n" +
                "            \"attentat\",\n" +
                "            \"john f. kennedy\",\n" +
                "            \"politik\",\n" +
                "            \"jfk\",\n" +
                "            \"kubakrise\",\n" +
                "            \"geschichte\"\n" +
                "        ],\n" +
                "        \"userrating_count_total\": 6331,\n" +
                "        \"country_list\": [\n" +
                "            \"USA\"\n" +
                "        ],\n" +
                "        \"userrating_count_two_star\": 102,\n" +
                "        \"_version_\": 1600431636752629800,\n" +
                "        \"erotic_specifier\": 0,\n" +
                "        \"timestamp\": \"2018-05-14T09:35:47.135Z\"\n" +
                "    }]");
        bufferedWriter.flush();

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
     //   Files.deleteIfExists(new File(File.separator.concat("test")).toPath());
    }

    @Test
    public void readJsonStream() throws IOException {
     JsonParser parser=   new JsonParser();
     List<Asset> list=parser.readJsonStream("test");
     Assert.assertEquals(list.get(0).getTitle(),"The Kennedys");

    }
}