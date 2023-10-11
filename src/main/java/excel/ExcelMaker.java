package excel;

//import statements

import common.CalcTrackAndField;
import common.InputName;
import common.InputResult;
import common.SelectDiscipline;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelMaker {
    // private int id;
    private String name;

    private int result;
    private int score;
    private String decHep;

    private int total;

    static boolean saveExcel=true;

    public void excelMaker() {

        try {

            // Load the existing workbook if it exists, or create a new one
            XSSFWorkbook workbook;
            File file = new File("Decathlon/Heptathlon_event_data.xlsx");
            if (file.exists() && !saveExcel) {

                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                fis.close();

            } else {
                workbook = new XSSFWorkbook();
                saveExcel = false;
            }


            // Create a sheet in the workbook
            XSSFSheet sheet = workbook.getSheet("Employee Data");

            if (sheet == null) {
                // Create a new sheet only if it doesn't exist
                sheet = workbook.createSheet("Employee Data");

                // Add headers to the new sheet
                Row headerRow = sheet.createRow(0);

                headerRow.createCell(0).setCellValue("NAME");
                headerRow.createCell(1).setCellValue("Dec/Hep");
                headerRow.createCell(2).setCellValue("Result");
                headerRow.createCell(3).setCellValue("Score");
                headerRow.createCell(4).setCellValue("Total");
            }


            //  int id = InputName.getNumberOfNames()-1;
            name = SelectDiscipline.getKey(SelectDiscipline.getPlayerChoice());
            decHep = SelectDiscipline.getDisciplineSelection();
            result = InputResult.getResult();
            score = CalcTrackAndField.getScore();
            total = SelectDiscipline.getTotalResult();

            // This data needs to be written (Object[])
            Map<String, Object[]> data = new TreeMap<String, Object[]>();

            data.put("2", new Object[]{name, decHep, result, score, total});

            // Get the last row number in the existing sheet
            int lastRowNum = sheet.getLastRowNum();

            // Iterate over data and write to the sheet, starting from the next row
            Set<String> keyset = data.keySet();
            for (String key : keyset) {
                Row row = sheet.createRow(lastRowNum + 1);
                Object[] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    Cell cell = row.createCell(cellnum++);
                    if (obj instanceof String)
                        cell.setCellValue((String) obj);
                    else if (obj instanceof Integer)
                        cell.setCellValue((Integer) obj);
                }
                lastRowNum++;
            }

            // Write the workbook back to the file system
            FileOutputStream out = new FileOutputStream("Decathlon/Heptathlon_event_data.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("Decathlon/Heptathlon_event_data.xlsx written successfully on disk.");
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
