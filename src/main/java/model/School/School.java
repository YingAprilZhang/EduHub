/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.Business;
import static model.Business.FAKER;
import model.Country.Country;
import model.Org.Organization;
import model.Role.Role;

/**
 *
 * @author aprilyz
 */
public class School extends Organization {
    public Principal principal;
    public Map<String, Student> username2student;
    public List<EduData> eduDataList;
    

    public static final Map<String, int[]> country2ScoreSetting = new HashMap<String, int[]>() {{
        put("Turkey2015",new int[]{54, 58, 58, 66, 56, 58});
        put("Turkey2016",new int[]{58, 62, 61, 70, 58, 62});
        put("Turkey2017",new int[]{65, 67, 66, 76, 63, 65});
        put("Turkey2018",new int[]{68, 69, 71, 79, 66, 71});
        put("Turkey2019",new int[]{72, 71, 75, 78, 70, 75});
        
        put("Togo2015", new int[]{37, 49, 44, 41, 46, 41});
        put("Togo2016", new int[]{39, 53, 49, 41, 51, 45});
        put("Togo2017", new int[]{41, 55, 55, 44, 52, 50});
        put("Togo2018", new int[]{47, 58, 58, 49, 55, 53});
        put("Togo2019", new int[]{49, 60, 62, 53, 57, 57});
        
        put("Chile2015", new int[]{69, 42, 53, 74, 41, 52});
        put("Chile2016", new int[]{72, 44, 55, 77, 40, 55});
        put("Chile2017", new int[]{68, 40, 54, 75, 36, 51});
        put("Chile2018", new int[]{64, 38, 52, 73, 32, 47});
        put("Chile2019", new int[]{61, 36, 50, 72, 30, 45});
          
    }};
    

    public School(Country country) {
        this.setCountry(country);
        this.username2student = new TreeMap<>();
        this.eduDataList = new ArrayList();
        initEduData();
    }

    public Student getStudentByName(String name) {
        Student c = username2student.get(name);
        if (c == null) {
            c = new Student();
            c.setName(name);
            c.setUsername(name);
            c.setPassword(name);
            username2student.put(name, c);
        }
        return c;
    }
    
    public void initEduData() {
        
        if (eduDataList.size() < 1) {
            for (int year=2015; year<2020; year++) { //每年15个男生和15个女生
                int[] avgScoreSetting = country2ScoreSetting.get(this.getCountry().getName() + String.valueOf(year));
                int MR = avgScoreSetting[0]; // eg. male reading
                int MM = avgScoreSetting[1];
                int MS = avgScoreSetting[2];
                int FR = avgScoreSetting[3];
                int FM = avgScoreSetting[4];
                int FS = avgScoreSetting[5];
                for (int i=0; i<15; i++) { // 男
                    
                     Student student = (Student) Business.getInstance().getUserAccountDirectory()
                            .createUserAccount(FAKER.name().username(),FAKER.name().username()
                                    , FAKER.name().firstName(), Role.RoleType.Student, this);
                     student.setGender(FAKER.options().option("Male"));
                     username2student.put(student.getUsername(), student);
                     EduData data = new EduData(year, student
                            , FAKER.number().randomDouble(0, MR-10, Math.max(MR+10, 100))
                            , FAKER.number().randomDouble(0, MM-10, Math.max(MM+10, 100))
                            , FAKER.number().randomDouble(0, MS-10, Math.max(MS+10, 100)));
                     eduDataList.add(data);
                }
                for (int i=0; i<15; i++) {  // 女
                    Student student = (Student) Business.getInstance().getUserAccountDirectory()
                            .createUserAccount(FAKER.name().username(),FAKER.name().username()
                                    , FAKER.name().firstName(), Role.RoleType.Student, this);
                    student.setGender(FAKER.options().option("Female"));
                    username2student.put(student.getUsername(), student);
                    EduData data = new EduData(year, student
                            , FAKER.number().randomDouble(0, FR-10, Math.max(FR+10, 100))
                            , FAKER.number().randomDouble(0, FM-10, Math.max(FM+10, 100))
                            , FAKER.number().randomDouble(0, FS-10, Math.max(FS+10, 100)));
                    eduDataList.add(data);
                }
            }
        }
    }
}
