package unit2.lecturer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder        //to build your upcoming project as you like
public class Lecturer {

    int id;
    String name;
    String email;

}
