package app.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marcin at 23.09.18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerErrorResponse {

    private int status;
    private String message;
    private long timestamp;
}
