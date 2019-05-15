package cn.bzu.personalmanage.controller;




import org.apache.ibatis.annotations.Delete;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.bzu.personalmanage.dao.StaffDao;
import cn.bzu.personalmanage.entity.Staff;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

@RestController

public class ExcelController {
    @Autowired
    private StaffDao staffDao;
    @GetMapping(value = "/excel" )
    public void getExcel (HttpServletResponse response) throws Exception {
        System.out.println("开始报表");
        List<Staff> list = staffDao.getList();
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet =wb.createSheet("staff");
        HSSFRow row = null;
     
           row = sheet.createRow(0);
    
           row.setHeight((short)(22.50*20));
           row.createCell(0).setCellValue("编号");
           row.createCell(1).setCellValue("姓名");
           row.createCell(2).setCellValue("年龄");
           row.createCell(3).setCellValue("性别");
           row.createCell(4).setCellValue("岗位");
           row.createCell(5).setCellValue("部门");
           row.createCell(6).setCellValue("电话");
           row.createCell(7).setCellValue("学历");
           row.createCell(8).setCellValue("专业");
           row.createCell(9).setCellValue("出勤数");
           row.createCell(10).setCellValue("基本工资");
           row.createCell(11).setCellValue("奖金");
           row.createCell(12).setCellValue("补助");
           row.createCell(13).setCellValue("薪水总数");
          
           row.createCell(14).setCellValue("是否在职");
        
           
           for(int i = 0;i < list.size();i++){
               row = sheet.createRow(i+1);
               //实体类
               Staff staff = list.get(i);
               row.createCell(0).setCellValue(staff.getId());
               row.createCell(1).setCellValue(staff.getName());
               row.createCell(2).setCellValue(staff.getAge());
               row.createCell(3).setCellValue(staff.getSex());
               row.createCell(4).setCellValue(staff.getStation().getStationName());
               row.createCell(5).setCellValue(staff.getDepartment().getDpname());
               row.createCell(6).setCellValue(staff.getPhone());
               row.createCell(7).setCellValue(staff.getEducation());
               row.createCell(8).setCellValue(staff.getPrefession());
               row.createCell(9).setCellValue(staff.getSalary().getAttendance());
               row.createCell(10).setCellValue(staff.getSalary().getBaseSalary());
               row.createCell(11).setCellValue(staff.getSalary().getBonus());
               row.createCell(12).setCellValue(staff.getSalary().getAllowance());
               row.createCell(13).setCellValue(staff.getSalary().getSum());
              
               row.createCell(14).setCellValue(staff.getLeaveOffice().getState());
             

           }         //默认行高
           sheet.setDefaultRowHeight((short)(16.5*25));        //列宽自适应
           for(int i=0;i<=13;i++){
               sheet.autoSizeColumn(i);
           }
           
         response.setContentType("application/vnd.ms-excel;charset=utf-8");
           OutputStream os = response.getOutputStream();
           wb.write(os);
           os.flush();
           os.close();


    }  
}


