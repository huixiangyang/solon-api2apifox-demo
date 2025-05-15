package yanghuixiang.controller;

import org.noear.solon.annotation.*;
import org.noear.solon.validation.annotation.Validated;

@Mapping("test")
@Controller
public class TestController {

    @Get
    @Mapping("test")
    public  String test(){
        return "test";
    }

    @Post
    @Mapping("aaa")
    public  AaaRes aaa(@Body AaaReq req){
        return new AaaRes();
    }

    @Post
    @Mapping("bbb")
    public  BbbRes bbb(@Param @Validated BbbReq req){
        return new BbbRes();
    }


}
