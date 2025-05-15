package yanghuixiang.controller;

import lombok.Data;
import org.noear.solon.validation.annotation.NotBlank;

@Data
public class BbbReq {


    /**
     * 名称
     */
    @NotBlank
    private String name;
}
