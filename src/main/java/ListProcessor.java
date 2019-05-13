import interfaces.Processor;
import mappings.Asset;
import mappings.FSKAsset;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListProcessor implements Processor<List<Asset>,Map<String, List<FSKAsset>>> {
    public static final String MOVIE = "Movie";
    @Override
    public Map<String, List<FSKAsset>> process(List<Asset> input) {
        {
            Predicate<Asset> filterMovies =
                    x -> MOVIE.equals(x.getObject_class());
            return input.stream().filter(filterMovies).collect(
                    Collectors.groupingBy(
                            x -> x.getFsk_level_list_facet()[0],
                            Collectors.mapping(
                                    e -> new FSKAsset(e.getAsset_id(), e.getTitle(), e.getProduction_year()),
                                    Collectors.toList())));
        }
    }
}
