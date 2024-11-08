package com.zero.poi.service;

import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import org.apache.poi.ss.usermodel.CellStyle;

public interface IExcelExportStylerService {

    CellStyle getHeaderStyle(short headerColor);

    CellStyle getTitleStyle(short color);

    CellStyle getStyles(boolean Parity, ExcelExportEntity entity);
}