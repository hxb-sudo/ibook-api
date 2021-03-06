package com.ibook.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.ibook.entity.Novel;
import com.ibook.entity.NovelNoveltype;
import com.ibook.entity.User;
import com.ibook.entity.UserNovel;
import com.ibook.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
@RestController
@RequestMapping("//novel")
public class NovelController {

    private final NovelService novelService;

    public NovelController(NovelService novelService) {
        this.novelService = novelService;
    }

    /**
     * @描述 获取全部小说的列表
     * */
    @RequestMapping("/novels")
    public R getList(){
        return R.ok(novelService.list());
    }


    /**
     * @描述 获取已经完结小说列表
     * */
    @RequestMapping(value = "/getOverNovels",method = RequestMethod.GET,produces = "application/json")
    public R getOverNovels(){
        return R.ok(novelService.getOverNovels());
    }


}
