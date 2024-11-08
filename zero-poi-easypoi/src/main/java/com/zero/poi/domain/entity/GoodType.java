package com.zero.poi.domain.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class GoodType {

    @Excel(name = "typeId",  width = 20,height = 8)
    private String typeId;

    @Excel(name = "typeName",  width = 20,height = 8)
    private String typeName;

}
