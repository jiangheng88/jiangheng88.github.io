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
        System.out.println("��ʼ����");
        List<Staff> list = staffDao.getList();
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet =wb.createSheet("staff");
        HSSFRow row = null;
     
           row = sheet.createRow(0);
    
           row.setHeight((short)(22.50*20));
           row.createCell(0).setCellValue("���");
           row.createCell(1).setCellValue("����");
           row.createCell(2).setCellValue("����");
           row.createCell(3).setCellValue("�Ա�");
           row.createCell(4).setCellValue("��λ");
           row.createCell(5).setCellValue("����");
           row.createCell(6).setCellValue("�绰");
           row.createCell(7).setCellValue("ѧ��");
           row.createCell(8).setCellValue("רҵ");
           row.createCell(9).setCellValue("������");
           row.createCell(10).setCellValue("��������");
           row.createCell(11).setCellValue("����");
           row.createCell(12).setCellValue("����");
           row.createCell(13).setCellValue("нˮ����");
          
           row.createCell(14).setCellValue("�Ƿ���ְ");
        
           
           for(int i = 0;i < list.size();i++){
               row = sheet.createRow(i+1);
               //ʵ����
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
             

           }         //Ĭ���и�
           sheet.setDefaultRowHeight((short)(16.5*25));        //�п�����Ӧ
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


