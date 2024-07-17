package Practice.Real.Life.Exercise;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{22,33,45,67,89,90};
    }
}
