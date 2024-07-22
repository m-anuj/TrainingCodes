package Practice.Real.Life.Exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,5,4,77,6,8,9};
    }
}
