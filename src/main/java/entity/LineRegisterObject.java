package entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class LineRegisterObject {

    private String uid;
    private long expire;

    public LineRegisterObject() {
        this.expire = (new Date().getTime() + 900*1000);
    }
}
